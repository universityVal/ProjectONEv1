package android.dev.alex.projectonev1.api;

import android.dev.alex.projectonev1.model.Group;
import android.dev.alex.projectonev1.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL="192.168.1.1/1/1"; // Адреса ку треба замінти на адресу сервера має бути так 192.168.2.1/"назва проекту"/

    @GET("login")
    Call<User> getUsers(); // метод який для отримання користувачів це змінюється в залежності які є методи  на сервері і під
                            // них пишеться, для запиту має бути так 192.168.2.1/"назва проекту"/"НАШ МЕТОД" і має бути в
    @GET("mark")                                                               // в @get("НАШ МЕТОД") or @post("НАШ МЕТОД")
    Call<List<Group>> getGroup();
}
