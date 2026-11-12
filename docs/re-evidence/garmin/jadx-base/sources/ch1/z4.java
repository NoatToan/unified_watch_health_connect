package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class z4 extends m3<UserSettingsDTO, Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27514f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27515e;

    public z4(Context context) {
        super(context);
        this.f27515e = false;
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // ch1.a5
    public final Object s(Object obj) {
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
        int i14 = -1;
        if (this.f27515e) {
            wi1.j jVar = userSettingsDTO.f43524b;
            if (jVar != null) {
                i14 = jVar.f185550m;
            }
        } else {
            wi1.j jVar2 = userSettingsDTO.f43524b;
            if (jVar2 != null) {
                i14 = jVar2.f185549l;
            }
        }
        return Integer.valueOf(i14);
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.user_settings_vo2;
    }

    @Override // ch1.a5
    public final String u() {
        return b(this.f27515e ? R.string.lbl_cycling_vo2_max : R.string.lbl_vo2_max_running);
    }

    @Override // ch1.a5
    public final xg1.c v(Object obj) {
        return new a0.h(19, this, (UserSettingsDTO) obj);
    }

    @Override // ch1.a5
    public final xg1.r<Integer> w() {
        return new y4(this);
    }

    @Override // ch1.a5
    public final void x(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj2;
        int iIntValue = num != null ? num.intValue() : -1;
        if (this.f27515e) {
            userSettingsDTO.e1(iIntValue);
            f12.l.f68084a.getClass();
            f12.l.a.a().c0(iIntValue);
        } else {
            userSettingsDTO.h1(iIntValue);
            f12.l.f68084a.getClass();
            f12.l.a.a().I3(iIntValue);
        }
    }

    @Override // ch1.m3
    public final /* bridge */ /* synthetic */ Integer y() {
        return -1;
    }

    public z4(Context context, boolean z14) {
        super(context);
        this.f27515e = z14;
    }
}
