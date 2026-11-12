package defpackage;

import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.homeroom.model.Room;

/* JADX INFO: loaded from: classes5.dex */
public interface hqc {
    Home getHomeByDid(String str);

    String getI18N(String str);

    Room getRoomByDid(String str);

    String getSpecInstance(String str);
}
