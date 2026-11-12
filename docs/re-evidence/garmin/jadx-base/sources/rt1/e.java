package rt1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.a f154520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.r f154521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f154522d;

    public /* synthetic */ e(f.a aVar, ww1.r rVar, f fVar, int i14) {
        this.f154519a = i14;
        this.f154520b = aVar;
        this.f154521c = rVar;
        this.f154522d = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x013d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        vt1.o oVar;
        String strE;
        vt1.o oVar2;
        String f187847b;
        String str2;
        String strG;
        DateTime f187848c;
        boolean zR;
        Object objQ;
        DateTime dateTimeNow;
        String str3;
        r rVar;
        String str4;
        int i14 = this.f154519a;
        f fVar = this.f154522d;
        ww1.r rVar2 = this.f154521c;
        f.a aVar = this.f154520b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = f.a.f154525c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(50003704, new e(aVar, rVar2, fVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = f.a.f154525c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    aVar.getClass();
                    boolean z14 = rVar2 instanceof ww1.m;
                    String str5 = null;
                    if (z14 && (str4 = ((ww1.m) rVar2).f187829d) != null) {
                        x0 x0Var = x0.f105818a;
                        String string = context.getString(R.string.coach_name);
                        string.getClass();
                        strE = String.format(string, Arrays.copyOf(new Object[]{str4}, 1));
                    } else if (!(rVar2 instanceof ww1.n) || (oVar2 = ((ww1.n) rVar2).f187838e) == null) {
                        if (!(rVar2 instanceof ww1.p) || (oVar = ((ww1.p) rVar2).f187850e) == null) {
                            str = null;
                        } else {
                            strE = oVar.e(context);
                        }
                        if (z14 || (rVar = ((ww1.m) rVar2).f187830e) == null || str == null) {
                            f187847b = rVar2.getF187847b();
                        } else {
                            String string2 = context.getString(rVar.f154562c);
                            string2.getClass();
                            x0 x0Var2 = x0.f105818a;
                            String string3 = context.getString(R.string.plan_with_coach_title);
                            string3.getClass();
                            f187847b = String.format(string3, Arrays.copyOf(new Object[]{string2, str}, 2));
                        }
                        String str6 = f187847b;
                        str2 = NumberFormat.getIntegerInstance().format(Integer.valueOf(rVar2.getF187852g()));
                        if (z14 || ((ww1.m) rVar2).f187828c) {
                            strG = e5.g(str2, StringUtils.SPACE, context.getString(R.string.common_weeks_label));
                        } else {
                            strG = context.getString(R.string.lbl_atp_plan_not_completed);
                            strG.getClass();
                        }
                        String str7 = strG;
                        f187848c = rVar2.getF187848c();
                        if (f187848c != null) {
                            j0 j0Var = j0.f23099a;
                            dateTimeNow = DateTime.now();
                            j0Var.getClass();
                            if (j0.H(f187848c, dateTimeNow)) {
                                str3 = "MMMM d";
                            } else {
                                str3 = "MMMM d, yyyy";
                            }
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3, Locale.getDefault());
                            x0 x0Var3 = x0.f105818a;
                            String string4 = context.getString(R.string.lbl_completed_date);
                            string4.getClass();
                            str5 = String.format(string4, Arrays.copyOf(new Object[]{simpleDateFormat.format(f187848c.toDate())}, 1));
                        }
                        String str8 = str5;
                        u4.d dVar = rVar2.getF187851f().f4362e;
                        zR = mVar2.r(fVar) | mVar2.B(rVar2);
                        objQ = mVar2.q();
                        if (zR) {
                            objQ = new rk0.f(10, fVar, rVar2);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new rk0.f(10, fVar, rVar2);
                                mVar2.K(objQ);
                            }
                        }
                        ku1.n.a(null, dVar, str, str6, str7, str8, (e23.a) objQ, mVar2, 0);
                    } else {
                        strE = oVar2.e(context);
                    }
                    str = strE;
                    if (z14) {
                        f187847b = rVar2.getF187847b();
                    } else {
                        f187847b = rVar2.getF187847b();
                    }
                    String str9 = f187847b;
                    str2 = NumberFormat.getIntegerInstance().format(Integer.valueOf(rVar2.getF187852g()));
                    if (z14) {
                        strG = e5.g(str2, StringUtils.SPACE, context.getString(R.string.common_weeks_label));
                    } else {
                        strG = e5.g(str2, StringUtils.SPACE, context.getString(R.string.common_weeks_label));
                    }
                    String str10 = strG;
                    f187848c = rVar2.getF187848c();
                    if (f187848c != null) {
                        j0 j0Var2 = j0.f23099a;
                        dateTimeNow = DateTime.now();
                        j0Var2.getClass();
                        if (j0.H(f187848c, dateTimeNow)) {
                            str3 = "MMMM d";
                        } else {
                            str3 = "MMMM d, yyyy";
                        }
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3, Locale.getDefault());
                        x0 x0Var4 = x0.f105818a;
                        String string5 = context.getString(R.string.lbl_completed_date);
                        string5.getClass();
                        str5 = String.format(string5, Arrays.copyOf(new Object[]{simpleDateFormat2.format(f187848c.toDate())}, 1));
                    }
                    String str11 = str5;
                    u4.d dVar2 = rVar2.getF187851f().f4362e;
                    zR = mVar2.r(fVar) | mVar2.B(rVar2);
                    objQ = mVar2.q();
                    if (zR) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new rk0.f(10, fVar, rVar2);
                            mVar2.K(objQ);
                        }
                    } else {
                        objQ = new rk0.f(10, fVar, rVar2);
                        mVar2.K(objQ);
                    }
                    ku1.n.a(null, dVar2, str, str9, str10, str11, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
