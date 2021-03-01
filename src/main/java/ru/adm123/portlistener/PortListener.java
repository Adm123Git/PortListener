package ru.adm123.portlistener;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 *
 * Просто сервлет, ловящий запросы и выводящий пойманное в консоль
 *
 * @author Dmitry Ushakov at 21.02.21
 *
 */
@WebServlet("")
public class PortListener extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(request.getReader().lines().collect(Collectors.joining(System.lineSeparator())));
    }

}
