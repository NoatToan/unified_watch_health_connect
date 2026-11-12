package mx1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import i3.e5;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmx1/i;", "", "", Action.KEY_ATTRIBUTE, "", Constants.ScionAnalytics.PARAM_LABEL, "baseDurationInSeconds", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum i {
    WARM_UP_CARDIO("warm_up", R.string.lbl_warm_up_cardio, 300),
    MUSCLE_ACTIVATION("muscle_activation", R.string.lbl_muscle_activation, 300),
    COOLDOWN("cooldown", R.string.workout_step_type_cooldown, 300),
    PRIMARY_LIFT("primary_lift", R.string.lbl_primary_lift, 1200),
    ACCESSORY_LIFT("accessory_lift", R.string.lbl_accessory_lift, 300);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121448c;

    i(String str, int i14, int i15) {
        this.f121446a = str;
        this.f121447b = i14;
        this.f121448c = i15;
    }

    public static dy1.h a(i iVar, l22.b bVar, int i14, boolean z14, int i15) {
        int i16 = (i15 & 2) != 0 ? 1 : i14;
        boolean z15 = (i15 & 4) == 0;
        boolean z16 = (i15 & 8) != 0 ? true : z14;
        boolean z17 = (i15 & 16) != 0;
        i iVar2 = ACCESSORY_LIFT;
        boolean z18 = iVar == iVar2;
        int i17 = iVar.f121447b;
        bVar.getClass();
        int i18 = iVar.f121448c * i16;
        String strA = bVar.a(R.string.common_minutes_abbreviation_label, String.valueOf(i18 / 60));
        i iVar3 = PRIMARY_LIFT;
        String string = x.k(iVar3, iVar2).contains(iVar) ? bVar.getString(i17) : "";
        String str = iVar.f121446a;
        String string2 = bVar.getString(i17);
        boolean z19 = iVar == iVar3;
        if (string.length() != 0) {
            strA = e5.g(strA, " • ", string);
        }
        return new dy1.h(str, null, z19, z15, z17, z16, z18, string2, strA, i18, 2, null);
    }
}
