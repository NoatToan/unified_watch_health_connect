package vt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvt1/a;", "", "", "displayResID", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    AMY(R.string.atp_coach_amy),
    JEFF(R.string.atp_coach_jeff),
    GREG(R.string.atp_coach_greg);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3360a f180073b = new C3360a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180078a;

    a(int i14) {
        this.f180078a = i14;
    }

    public final String a(Context context) {
        context.getClass();
        String string = context.getString(this.f180078a);
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: vt1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvt1/a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3360a {
        public /* synthetic */ C3360a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(int i14) {
            Context contextB = ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b();
            switch (i14) {
                case 9:
                case 10:
                case 11:
                case 18:
                    String string = contextB.getString(R.string.plan_with_coach_title, n.FIVE_K.a(contextB), contextB.getString(R.string.coach_name, a.AMY.a(contextB)));
                    string.getClass();
                    return string;
                case 12:
                case 13:
                case 14:
                    String string2 = contextB.getString(R.string.plan_with_coach_title, n.FIVE_K.a(contextB), contextB.getString(R.string.coach_name, a.JEFF.a(contextB)));
                    string2.getClass();
                    return string2;
                case 15:
                case 16:
                case 17:
                    String string3 = contextB.getString(R.string.plan_with_coach_title, n.FIVE_K.a(contextB), contextB.getString(R.string.coach_name, a.GREG.a(contextB)));
                    string3.getClass();
                    return string3;
                default:
                    switch (i14) {
                        case 100:
                        case 105:
                            String string4 = contextB.getString(R.string.plan_with_coach_title, n.TEN_K.a(contextB), contextB.getString(R.string.coach_name, a.AMY.a(contextB)));
                            string4.getClass();
                            return string4;
                        case 101:
                        case 102:
                            String string5 = contextB.getString(R.string.plan_with_coach_title, n.TEN_K.a(contextB), contextB.getString(R.string.coach_name, a.JEFF.a(contextB)));
                            string5.getClass();
                            return string5;
                        case 103:
                        case 104:
                            String string6 = contextB.getString(R.string.plan_with_coach_title, n.TEN_K.a(contextB), contextB.getString(R.string.coach_name, a.GREG.a(contextB)));
                            string6.getClass();
                            return string6;
                        default:
                            switch (i14) {
                                case 200:
                                case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                                    String string7 = contextB.getString(R.string.plan_with_coach_title, n.HALF_MARATHON.a(contextB), contextB.getString(R.string.coach_name, a.AMY.a(contextB)));
                                    string7.getClass();
                                    return string7;
                                case 201:
                                case 202:
                                    String string8 = contextB.getString(R.string.plan_with_coach_title, n.HALF_MARATHON.a(contextB), contextB.getString(R.string.coach_name, a.JEFF.a(contextB)));
                                    string8.getClass();
                                    return string8;
                                case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                                case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                                    String string9 = contextB.getString(R.string.plan_with_coach_title, n.HALF_MARATHON.a(contextB), contextB.getString(R.string.coach_name, a.GREG.a(contextB)));
                                    string9.getClass();
                                    return string9;
                                default:
                                    return "";
                            }
                    }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0015  */
        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:8:0x000e  */
        public static String b(int i14, Context context) {
            context.getClass();
            switch (i14) {
                case 9:
                case 10:
                case 11:
                case 18:
                    return a.AMY.a(context);
                case 12:
                case 13:
                case 14:
                    return a.JEFF.a(context);
                case 15:
                case 16:
                case 17:
                    return a.GREG.a(context);
                default:
                    switch (i14) {
                        case 100:
                        case 105:
                            return a.AMY.a(context);
                        case 101:
                        case 102:
                            return a.JEFF.a(context);
                        case 103:
                        case 104:
                            return a.GREG.a(context);
                        default:
                            switch (i14) {
                                case 200:
                                case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
                                    return a.AMY.a(context);
                                case 201:
                                case 202:
                                    return a.JEFF.a(context);
                                case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
                                case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
                                    return a.GREG.a(context);
                                default:
                                    return null;
                            }
                    }
            }
        }

        private C3360a() {
        }
    }
}
