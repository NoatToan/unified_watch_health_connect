package com.garmin.android.apps.connectmobile.leaderboard.model;

import am.x0;
import c22.c3;
import c22.d3;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f38307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f38308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f38309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f38310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f38311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f38312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f38313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f38314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s f38315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f38316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f38317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s[] f38318n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f38320b;

    static {
        x0 x0Var = x0.f4331t;
        s sVar = new s("WALKING_DISTANCE", 0, 0, x0Var.f4360c);
        f38307c = sVar;
        s sVar2 = new s("RUNNING_DISTANCE", 1, 1, x0.f4308n.f4360c);
        f38308d = sVar2;
        x0 x0Var2 = x0.f4312o;
        s sVar3 = new s("CYCLING_DISTANCE", 2, 2, x0Var2.f4360c);
        f38309e = sVar3;
        s sVar4 = new s("SWIMMING_DISTANCE", 3, 3, x0.f4324r.f4360c);
        f38310f = sVar4;
        s sVar5 = new s("WELLNESS_STEPS_COUNT", 4, 4, x0.B.f4360c);
        f38311g = sVar5;
        s sVar6 = new s("WELLNESS_STEPS_DISTANCE", 5, 5, x0Var.f4360c);
        f38312h = sVar6;
        d3.a aVar = d3.f23029a;
        aVar.getClass();
        s sVar7 = new s("CALORIES_BURNED", 6, 6, c22.i.b(R.string.lbl_calories));
        f38313i = sVar7;
        s sVar8 = new s("TEAM_STEPS_AVERAGE", 7, 9, null);
        f38314j = sVar8;
        aVar.getClass();
        s sVar9 = new s("WELLNESS_PUSHES_COUNT", 8, 10, c22.i.b(R.string.lbl_pushes));
        f38315k = sVar9;
        aVar.getClass();
        s sVar10 = new s("PUSHING_DISTANCE", 9, 11, c22.i.b(R.string.activity_type_parasports));
        f38316l = sVar10;
        s sVar11 = new s("PUSH_CYCLING_DISTANCE", 10, 2, x0Var2.f4360c);
        f38317m = sVar11;
        f38318n = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11};
    }

    private s(String str, int i14, int i15, c3 c3Var) {
        super(str, i14);
        this.f38319a = i15;
        this.f38320b = c3Var;
    }

    public static int a(s sVar) {
        switch (sVar.ordinal()) {
            case 1:
                return R.string.social_running_challenge;
            case 2:
                return R.string.social_cycling_challenge;
            case 3:
                return R.string.social_swimming_challenge;
            case 4:
                return R.string.social_steps_challenge;
            case 5:
                return R.string.social_walking_challenge;
            case 6:
                return R.string.social_calories_challenge;
            case 7:
            default:
                return R.string.challenge_title;
            case 8:
                return R.string.lbl_pushes_challenge;
            case 9:
                return R.string.lbl_parasports_challenge;
            case 10:
                return R.string.social_cycling_challenge;
        }
    }

    public static s b(int i14) {
        s sVar = f38309e;
        if (i14 == sVar.f38319a) {
            return ((bv.g) KoinJavaComponent.get(bv.g.class)).c() ? f38317m : sVar;
        }
        for (s sVar2 : values()) {
            if (sVar2.f38319a == i14) {
                return sVar2;
            }
        }
        return null;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f38318n.clone();
    }
}
