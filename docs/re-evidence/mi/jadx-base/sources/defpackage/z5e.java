package defpackage;

import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.sport.model.weather.WeatherRequest;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class z5e {
    public static void a(LaunchSportViewModel launchSportViewModel, RouteRepository routeRepository) {
        launchSportViewModel.routeRepository = routeRepository;
    }

    public static void b(LaunchSportViewModel launchSportViewModel, DeviceContact deviceContact) {
        launchSportViewModel.sync = deviceContact;
    }

    public static void c(LaunchSportViewModel launchSportViewModel, WeatherRequest weatherRequest) {
        launchSportViewModel.weatherRequest = weatherRequest;
    }
}
