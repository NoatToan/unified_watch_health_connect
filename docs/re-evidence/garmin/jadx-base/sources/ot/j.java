package ot;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.JsonObject;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lot/j;", "Lot/l;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/f;", "activitySummaryData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/f;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends l implements bu.g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f133606w = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tt.f f133607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f133608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public tt.h f133609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public tt.h f133610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public tt.h f133611v;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, tt.f fVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133607r = fVar;
        this.f133608s = "ActivitySummaryChapter";
    }

    public static x0 r(tt.h hVar) {
        to.o activityType;
        return z0.l(x0.f4346x, (hVar == null || (activityType = hVar.getActivityType()) == null) ? null : activityType.j());
    }

    public static void s(Context context, LottieDrawable lottieDrawable, tt.h hVar, int i14) {
        List listAsList;
        ArrayList arrayList;
        if (hVar != null) {
            x0 x0VarR = r(hVar);
            bu.f.f21180a.getClass();
            File[] fileArrListFiles = new File(context.getFilesDir(), "annual_report_remote_resource_local_file/activity_series/".concat(cu.a.a(x0VarR))).listFiles(new bu.b());
            if (fileArrListFiles != null) {
                listAsList = Arrays.asList(p13.u.X(fileArrListFiles));
                listAsList.getClass();
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                arrayList = new ArrayList();
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(((File) it.next()).getPath());
                    bitmapDecodeFile.getClass();
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, 84, 84, true);
                    if (bitmapCreateScaledBitmap != null) {
                        arrayList.add(bitmapCreateScaledBitmap);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            for (int i15 = 0; i15 < 60; i15++) {
                Bitmap bitmap = (Bitmap) arrayList.get(i15 % arrayList.size());
                if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) != null) {
                    lottieDrawable.updateBitmap("image_" + ((60 * i14) + i15), bitmap);
                }
            }
        }
    }

    public static void t(Context context, JsonObject jsonObject, tt.h hVar, String str, String str2, String str3, String str4) {
        if (hVar != null) {
            pt.i.z(jsonObject, str2, dh.b.A(context, r(hVar).f4360c), oe2.f.T(context));
            l3.f23124b.getClass();
            String str5 = l3.f23131i.format(hVar.getCount());
            str5.getClass();
            pt.i.y(jsonObject, str3, str5);
            return;
        }
        JsonObject jsonObjectM = pt.i.m(jsonObject, str);
        if (jsonObjectM != null) {
            pt.i.w(jsonObjectM);
        }
        JsonObject jsonObjectM2 = pt.i.m(jsonObject, str2);
        if (jsonObjectM2 != null) {
            pt.i.w(jsonObjectM2);
        }
        JsonObject jsonObjectM3 = pt.i.m(jsonObject, str3);
        if (jsonObjectM3 != null) {
            pt.i.w(jsonObjectM3);
        }
        JsonObject jsonObjectM4 = pt.i.m(jsonObject, str4);
        if (jsonObjectM4 != null) {
            pt.i.w(jsonObjectM4);
        }
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133587s() {
        return this.f133608s;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/activity_summary";
    }

    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        List<Integer> listB;
        TextPaint textPaintS;
        List<tt.h> listC;
        List<tt.h> listC2;
        List<tt.h> listC3;
        List<tt.h> listC4;
        tt.f fVar = this.f133607r;
        this.f133609t = (fVar == null || (listC4 = fVar.c()) == null) ? null : (tt.h) h0.d0(listC4);
        this.f133610u = (fVar == null || (listC3 = fVar.c()) == null) ? null : (tt.h) h0.e0(1, listC3);
        this.f133611v = (fVar == null || (listC2 = fVar.c()) == null) ? null : (tt.h) h0.e0(2, listC2);
        JsonObject jsonObjectC = c(d(context), pVar, pVar2, i14);
        b(context);
        String string = context.getString(R.string.lbl_activity_summary);
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        pt.i.g(context, jsonObjectC, "Text_Topic", upperCase);
        pt.i iVar = pt.i.f140571a;
        float f14 = this.f133656j;
        String string2 = context.getString(R.string.lbl_activity_summary);
        string2.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        pt.i.b(iVar, context, jsonObjectC, f14, upperCase2);
        String string3 = context.getString(R.string.annual_report_activity_summary_intro_text);
        string3.getClass();
        pt.i.z(jsonObjectC, "intro_layer_name", string3, oe2.f.Q(context));
        pt.i.f(jsonObjectC, this.f133656j);
        tt.h hVar = (fVar == null || (listC = fVar.c()) == null) ? null : (tt.h) h0.d0(listC);
        if (hVar != null) {
            String strA = dh.b.A(context, r(hVar).f4360c);
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            String string4 = context.getString(R.string.annual_report_activity_summary_activity_view_title);
            string4.getClass();
            String str = String.format(string4, Arrays.copyOf(new Object[]{strA}, 1));
            pt.a aVar = pt.a.f140560a;
            Typeface typefaceS = oe2.f.S(context);
            aVar.getClass();
            pt.a.a(jsonObjectC, "Top_1", str, typefaceS);
            pt.a.a(jsonObjectC, "Top_2", str, oe2.f.S(context));
            pt.a.a(jsonObjectC, "Top_3", str, oe2.f.S(context));
            Typeface typefaceS2 = oe2.f.S(context);
            JsonObject jsonObjectM = pt.i.m(jsonObjectC, "Top_Activities_Title");
            if (jsonObjectM != null && (textPaintS = pt.i.s(jsonObjectM, typefaceS2)) != null) {
                pt.h.f140570a.getClass();
                pt.i.x(jsonObjectM, pt.h.g(str, 330.0f, textPaintS).f140606a);
            }
        }
        t(context, jsonObjectC, this.f133609t, "Activity_1st", "Text_Ranking_1", "Data_Ranking_1", "#1");
        t(context, jsonObjectC, this.f133610u, "Activity_2nd", "Text_Ranking_2", "Data_Ranking_2", "#2");
        t(context, jsonObjectC, this.f133611v, "Activity_3rd", "Text_Ranking_3", "Data_Ranking_3", "#3");
        pt.n nVar = pt.n.f140581a;
        String string5 = context.getString(R.string.annual_report_activity_summary_month_chart_title);
        string5.getClass();
        Typeface typefaceS3 = oe2.f.S(context);
        nVar.getClass();
        pt.n.e(jsonObjectC, string5, typefaceS3);
        if (fVar != null && (listB = fVar.b()) != null) {
            pt.n.b(listB, jsonObjectC);
        }
        pt.n.a(jsonObjectC, oe2.f.T(context));
        u(context, jsonObjectC, 322.0f - this.f133656j, 18.0f);
        String string6 = jsonObjectC.toString();
        string6.getClass();
        byte[] bytes = string6.getBytes(d53.c.f57666b);
        bytes.getClass();
        return LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), null).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        List<Integer> listB;
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.lbl_activity_summary);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        tt.h hVar = this.f133609t;
        x0 x0VarR = r(hVar);
        s(context, lottieDrawable, hVar, 0);
        Drawable drawableA = j.a.a(context, x0VarR.f4361d);
        Bitmap bitmapB = drawableA != null ? d7.b.b(drawableA, 193, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 4) : null;
        if (bitmapB != null) {
            if ((lottieDrawable != null ? lottieDrawable.getComposition() : null) != null) {
                lottieDrawable.updateBitmap("image_180", bitmapB);
            }
        }
        s(context, lottieDrawable, this.f133610u, 1);
        s(context, lottieDrawable, this.f133611v, 2);
        tt.f fVar = this.f133607r;
        if (fVar == null || (listB = fVar.b()) == null) {
            return;
        }
        pt.n nVar = pt.n.f140581a;
        Integer numValueOf = Integer.valueOf(context.getColor(R.color.gcm_annual_report_activity_summary_month_bar));
        oe2.g gVar = new oe2.g(19);
        nVar.getClass();
        pt.n.c(context, numValueOf, lottieDrawable, listB, gVar);
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.ACTIVITY_SUMMARY;
    }

    @Override // ot.l
    public final Map<String, String> l() {
        return t0.b(new o13.p("image_0", "sharing_bg.png"));
    }

    @Override // ot.l
    public final Object m(Context context, yt.o oVar) throws Throwable {
        Context context2;
        Bitmap bitmapB;
        List<Integer> listB;
        List<Integer> listB2;
        LottieDrawable lottieDrawable = new LottieDrawable();
        JsonObject jsonObjectK = k(context, this, "sharing.json");
        tt.f fVar = this.f133607r;
        if (jsonObjectK != null) {
            if (fVar != null && (listB2 = fVar.b()) != null) {
                pt.u.f140605a.getClass();
                pt.u.c(listB2, jsonObjectK);
            }
            u(context, jsonObjectK, 230.0f, 12.0f);
            context2 = context;
            t(context2, jsonObjectK, this.f133609t, "Activity_1st", "Text_Ranking_1", "Data_Ranking_1", "#1");
        } else {
            context2 = context;
        }
        q(context2, jsonObjectK, lottieDrawable);
        x0 x0VarR = r(this.f133609t);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(context2.getColor(R.color.gcm_system_static_white), PorterDuff.Mode.SRC_IN));
        int i14 = x0VarR.f4361d;
        Drawable drawableA = j.a.a(context2, i14);
        if (drawableA == null || (bitmapB = d7.b.b(drawableA, 192, 192, 4)) == null) {
            bitmapB = null;
        } else {
            new Canvas(bitmapB).drawBitmap(bitmapB, 0.0f, 0.0f, paint);
        }
        if (bitmapB != null && lottieDrawable.getComposition() != null) {
            lottieDrawable.updateBitmap("image_1", bitmapB);
        }
        Drawable drawableA2 = j.a.a(context2, i14);
        Bitmap bitmapB2 = drawableA2 != null ? d7.b.b(drawableA2, SyslogConstants.LOG_LOCAL3, SyslogConstants.LOG_LOCAL3, 4) : null;
        if (bitmapB2 != null && lottieDrawable.getComposition() != null) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapB2, SyslogConstants.LOG_LOCAL3, SyslogConstants.LOG_LOCAL3, true);
            bitmapCreateScaledBitmap.getClass();
            lottieDrawable.updateBitmap("image_2", bitmapCreateScaledBitmap);
        }
        if (fVar != null && (listB = fVar.b()) != null) {
            pt.u.f140605a.getClass();
            pt.u.b(lottieDrawable, listB);
            Iterator<T> it = listB.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            int iIntValue = ((Number) it.next()).intValue();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                if (iIntValue < iIntValue2) {
                    iIntValue = iIntValue2;
                }
            }
            l3.f23124b.getClass();
            String str = l3.f23131i.format(Integer.valueOf(iIntValue));
            pt.i iVar = pt.i.f140571a;
            str.getClass();
            iVar.getClass();
            pt.i.d(lottieDrawable, "Highlight_count_value", str);
        }
        pt.i iVar2 = pt.i.f140571a;
        String string = context2.getString(R.string.lbl_activity_summary);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar2.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        Object objO = o(context2, p13.w.c(new l.a(this, lottieDrawable, "ActivitySummaryChapter")), oVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133607r == null || e() == null) ? false : true;
    }

    public final void u(Context context, JsonObject jsonObject, float f14, float f15) {
        Integer activityCount;
        tt.f fVar = this.f133607r;
        if (fVar == null || (activityCount = fVar.getActivityCount()) == null) {
            return;
        }
        int iIntValue = activityCount.intValue();
        l3.f23124b.getClass();
        String str = l3.f23131i.format(Integer.valueOf(iIntValue));
        str.getClass();
        String string = context.getString(R.string.annual_report_activity_summary_total_activity_unit);
        string.getClass();
        pt.h.i(context, jsonObject, str, string, f14, f15);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0007¨\u0006$"}, d2 = {"Lot/j$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "", "ACTIVITY_ANIMATION_FRAME_COUNT", "I", "ACTIVITY_CHAPTER_IMAGE_SIZE", "ACTIVITY_CHAPTER_IMAGE_BG_WIDTH", "ACTIVITY_CHAPTER_IMAGE_BG_HEIGHT", "ACTIVITY_SHARE_BG_SIZE", "ACTIVITY_SHARE_ACTIVITY_IMAGE_SIZE", "SUMMARY_SHARE_IMAGE_FILE_NAME", "SUMMARY_ACTIVITY_NAME_LAYER_1", "SUMMARY_ACTIVITY_NAME_LAYER_2", "SUMMARY_ACTIVITY_NAME_LAYER_3", "SUMMARY_ACTIVITY_COUNT_LAYER_1", "SUMMARY_ACTIVITY_COUNT_LAYER_2", "SUMMARY_ACTIVITY_COUNT_LAYER_3", "SUMMARY_ACTIVITY_VIEW_LAYER_1", "SUMMARY_ACTIVITY_VIEW_LAYER_2", "SUMMARY_ACTIVITY_VIEW_LAYER_3", "SUMMARY_ACTIVITY_VIEW_PARENT_1", "SUMMARY_ACTIVITY_VIEW_PARENT_2", "SUMMARY_ACTIVITY_VIEW_PARENT_3", "SUMMARY_ACTIVITY_ORDER_NUMBER_LAYER_1", "SUMMARY_ACTIVITY_ORDER_NUMBER_LAYER_2", "SUMMARY_ACTIVITY_ORDER_NUMBER_LAYER_3", "ACTIVITY_ANIMATION_IMAGE_PREFIX", "TOP_ACTIVITY_MAIN_BG_IMAGE_ID", "TOP_ACTIVITY_SHARE_BG_IMAGE_ID", "TOP_ACTIVITY_SHARE_IMAGE_ID", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
