package defpackage;

import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class y08 implements prf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlarmSettingItem f39642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<AlarmSettingItem> f39643b;

    public y08(boolean z, AlarmSettingItem alarmSettingItem) {
        this.f39643b = null;
        this.f39642a = alarmSettingItem;
    }

    public AlarmSettingItem a() {
        return this.f39642a;
    }

    public List<AlarmSettingItem> b() {
        return this.f39643b;
    }

    public y08(List<AlarmSettingItem> list) {
        this.f39642a = null;
        this.f39643b = list;
    }
}
