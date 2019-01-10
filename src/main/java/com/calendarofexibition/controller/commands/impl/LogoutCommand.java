package com.calendarofexibition.controller.commands.impl;

import com.calendarofexibition.controller.commands.Command;
import com.calendarofexibition.util.PagesManager;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutCommand implements Command {

    private final static Logger LOGGER = Logger.getLogger(LogoutCommand.class);

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().invalidate();
        LOGGER.info(this.getClass().getSimpleName() + " executed");
        return PagesManager.getProperty("path.page.index");
    }
}
