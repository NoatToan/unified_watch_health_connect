package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkd0/k;", "Lgu/b;", "Lgu/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements gu.b, gu.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f104159a = o13.m.b(new k62.l(28));

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"kd0/k$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lgu/d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends gu.d>> {
    }

    @Override // gu.c
    public final void a(Context context, Intent intent) {
        com.garmin.android.apps.connectmobile.v1.f47374a.getClass();
        com.garmin.android.apps.connectmobile.v1.f(context, intent);
    }

    @Override // gu.c
    public final String b(long j8, String str) {
        return GCMSettingManager.h(j8, str);
    }

    @Override // gu.c
    public final List<gu.d> c() {
        try {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            List<gu.d> list = (List) GsonUtil.f47253b.fromJson(gh2.i.f77458c.a().f77477b.h("audio_prompts_workaround_device_list"), new a().getType());
            return list == null ? p13.j0.f134944a : list;
        } catch (Exception unused) {
            ((Logger) this.f104159a.getValue()).error("Error parsing remote config for audio prompts workaround device list.");
            return p13.j0.f134944a;
        }
    }

    @Override // gu.b
    public final lu.d d(long j8) {
        hu.a.f85684b.a().getClass();
        return hu.a.T(j8);
    }

    @Override // gu.b
    public final lu.c e(long j8) {
        hu.a.f85684b.a().getClass();
        return hu.a.R(j8);
    }

    @Override // gu.b
    public final String f(long j8, lu.a aVar) {
        hu.a aVarA = hu.a.f85684b.a();
        aVar.getClass();
        aVarA.getClass();
        return hu.a.Q(j8, aVar);
    }

    @Override // gu.b
    public final void g(long j8) {
        hu.a aVarA = hu.a.f85684b.a();
        aVarA.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new hu.c(j8, aVarA), null);
    }

    @Override // gu.b
    public final lu.b h(long j8, lu.a aVar) {
        hu.a aVarA = hu.a.f85684b.a();
        aVar.getClass();
        aVarA.getClass();
        return hu.a.P(j8, aVar);
    }

    @Override // gu.b
    public final void i(AudioPromptsSettingsActivity.b bVar) {
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        bVar.getClass();
        c2513a.getClass();
        oi2.a.C2513a.b(bVar);
    }

    @Override // gu.b
    public final void j(long j8, String str, lu.a aVar) {
        hu.a aVarA = hu.a.f85684b.a();
        str.getClass();
        aVar.getClass();
        aVarA.getClass();
        gu.c cVar = (gu.c) KoinJavaComponent.get$default(gu.c.class, null, null, 6, null);
        int i14 = hu.a.b.f85686a[aVar.ordinal()];
        if (i14 == 3) {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_power_alert_type), str);
            return;
        }
        if (i14 == 4) {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_pace_speed_alert_type), str);
        } else if (i14 != 5) {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_heart_rate_alert_type), str);
        } else {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_heart_rate_alert_type), str);
        }
    }

    @Override // gu.b
    public final lu.e k(long j8) {
        hu.a.f85684b.a().getClass();
        return hu.a.U(j8);
    }

    @Override // gu.b
    public final void l(long j8) {
        hu.a aVarA = hu.a.f85684b.a();
        aVarA.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new hu.b(aVarA, j8), null);
    }

    @Override // gu.b
    public final boolean m(long j8, lu.a aVar) {
        hu.a aVarA = hu.a.f85684b.a();
        aVar.getClass();
        aVarA.getClass();
        return hu.a.V(j8, aVar);
    }

    @Override // gu.b
    public final void n(long j8, boolean z14, lu.a aVar) {
        hu.a aVarA = hu.a.f85684b.a();
        aVar.getClass();
        aVarA.getClass();
        hu.a.X(j8, z14, aVar);
    }

    @Override // gu.b
    public final lu.a o(String str) {
        hu.a.f85684b.a().getClass();
        if (str == null) {
            return lu.a.HEART_RATE;
        }
        try {
            return lu.a.valueOf(str);
        } catch (IllegalArgumentException unused) {
            String strJ = androidx.room.a0.j("getAudioPromptsAlertType: audioPromptsAlertTypeEnumName[", str, "] isn't defined in ", lu.a.class.getSimpleName());
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "AudioPromptsBizManager", strJ);
            return lu.a.HEART_RATE;
        }
    }

    @Override // gu.b
    public final void p(long j8, String str, lu.a aVar) {
        hu.a aVarA = hu.a.f85684b.a();
        str.getClass();
        aVar.getClass();
        aVarA.getClass();
        gu.c cVar = (gu.c) KoinJavaComponent.get$default(gu.c.class, null, null, 6, null);
        int i14 = hu.a.b.f85686a[aVar.ordinal()];
        if (i14 == 3) {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_power_frequency), str);
            return;
        }
        if (i14 == 4) {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_pace_speed_frequency), str);
        } else if (i14 != 5) {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_heart_rate_frequency), str);
        } else {
            cVar.r(j8, hu.a.S(R.string.key_audio_prompt_heart_rate_frequency), str);
        }
    }

    @Override // gu.b
    public final void q(AudioPromptsSettingsActivity.b bVar) {
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        bVar.getClass();
        c2513a.getClass();
        oi2.a.C2513a.c(bVar);
    }

    @Override // gu.c
    public final void r(long j8, String str, String str2) {
        str2.getClass();
        GCMSettingManager.C(j8, str, str2);
    }

    @Override // gu.b
    public final String s(ArrayList<String> arrayList) {
        hu.a.f85684b.a().getClass();
        return hu.a.O(arrayList);
    }
}
