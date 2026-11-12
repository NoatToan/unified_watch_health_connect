package ot;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lot/p;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Lot/x;)V", "a", "b", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f133646m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f133647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f133648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f133649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f133650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f133651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f133652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f133653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f133654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o13.p<Float, Float> f133655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f133656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f133657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f133658l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lot/p$a;", "", "", "startFrame", "durationFrames", "<init>", "(FF)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f133659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f133660b;

        public a(float f14, float f15) {
            this.f133659a = f14;
            this.f133660b = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f133659a, aVar.f133659a) == 0 && Float.compare(this.f133660b, aVar.f133660b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f133660b) + (Float.hashCode(this.f133659a) * 31);
        }

        public final String toString() {
            return am.j.l("Chip(startFrame=", this.f133659a, ", durationFrames=", this.f133660b, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Float.valueOf(((Marker) t7).startFrame), Float.valueOf(((Marker) t14).startFrame));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.AnnualReportPlayable$adjustGarminLogo$1", f = "AnnualReportPlayable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f133661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f133662b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageView imageView, p pVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f133661a = imageView;
            this.f133662b = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f133661a, this.f133662b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ImageView imageView = this.f133661a;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                j20.x.l("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return null;
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            float f14 = this.f133662b.f133657k;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) (56 * f14);
            ((ViewGroup.MarginLayoutParams) bVar).width = (int) (32 * f14);
            ((ViewGroup.MarginLayoutParams) bVar).height = (int) (94 * f14);
            imageView.setLayoutParams(bVar);
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public p(Context context, x xVar) {
        context.getClass();
        xVar.getClass();
        this.f133647a = xVar;
        this.f133648b = o13.m.b(new oe.j(11, this, context));
        this.f133649c = 1.0f;
        this.f133650d = new ArrayList();
        this.f133651e = new ArrayList();
        this.f133653g = 1.0f;
        Float fValueOf = Float.valueOf(0.0f);
        this.f133655i = new o13.p<>(fValueOf, fValueOf);
        this.f133658l = "images";
    }

    public final void a(LottieDrawable lottieDrawable, List<? extends Marker> list) {
        LottieComposition composition;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        List listN0 = h0.N0(list, new c());
        if (lottieDrawable == null || (composition = lottieDrawable.getComposition()) == null) {
            return;
        }
        Marker marker = (Marker) h0.b0(listN0);
        float fMin = marker.startFrame;
        float fMax = marker.durationFrames + fMin;
        Iterator it = listN0.iterator();
        float f14 = 0.0f;
        int i14 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f133651e;
            if (!zHasNext) {
                float f15 = this.f133652f - f14;
                this.f133653g = composition.getProgressForFrame(f15);
                lottieDrawable.setMaxFrame(MathKt.c(((a) h0.b0(arrayList)).f133659a - 1));
                float f16 = this.f133653g;
                StringBuilder sbI = e0.i("addSkipMarker skipTotalFrame = ", f14, ", remainTotalFrames = ", f15, ",  remainMaxProgress = ");
                sbI.append(f16);
                String string = sbI.toString();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "AnnualReportPlayable", string);
                return;
            }
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            Marker marker2 = (Marker) next;
            String strN = fb1.c.n("marker name = ", marker2.getName());
            i2.a aVar2 = i2.f36769a;
            List list2 = listN0;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "AnnualReportPlayable", strN);
            if (marker2.startFrame > fMax) {
                i2.a.b(a2Var2, "AnnualReportPlayable", "markerStartFrame = " + fMin + ", continuallyMarkerEndFrame = " + fMax);
                float f17 = fMax - fMin;
                arrayList.add(new a(fMin, f17));
                f14 += f17;
                fMin = marker2.startFrame;
                fMax = marker.startFrame + marker.durationFrames;
            }
            fMin = Math.min(fMin, marker2.startFrame);
            fMax = Math.max(fMax, marker2.startFrame + marker2.durationFrames);
            if (i14 == list2.size() - 1) {
                i2.a.b(a2Var2, "AnnualReportPlayable", "markerStartFrame last = " + fMin + ", continuallyMarkerEndFrame = " + fMax);
                float f18 = fMax - fMin;
                f14 += f18;
                arrayList.add(new a(fMin, f18));
            }
            i14 = i15;
            listN0 = list2;
            it = it;
        }
    }

    public final void b(Context context) {
        DisplayMetrics displayMetrics;
        ImageView imageView = this.f133647a.f133701d;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f133657k = this.f133655i.f128594a.floatValue() / 375.0f;
        x53.c cVar = s0.f129406a;
        ge1.b.T(o53.c0.a(u53.o.f168762a), null, null, new d(imageView, this, null), 3);
        float f14 = displayMetrics.widthPixels;
        float f15 = this.f133657k;
        float f16 = 48.0f - (((f14 / f15) - 330.0f) / 2);
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        this.f133656j = f16;
        String str = "With canvaScale " + f15 + ", logo width adjusted as 48.0 and take an additional offset of " + f16;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayable", str);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01cf A[LOOP:2: B:65:0x01c9->B:67:0x01cf, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final JsonObject c(StringBuilder sb3, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        JsonObject jsonObject;
        JsonObject asJsonObject;
        ArrayList arrayList;
        Iterator<JsonElement> it;
        Object next;
        String asString;
        JsonObject jsonObject2 = (JsonObject) new Gson().fromJson(sb3.toString(), JsonObject.class);
        jsonObject2.getClass();
        pt.i iVar = pt.i.f140571a;
        float asFloat = jsonObject2.get("w").getAsFloat();
        float asFloat2 = jsonObject2.get("h").getAsFloat();
        float fIntValue = pVar.f128594a.intValue();
        float fIntValue2 = pVar.f128595b.intValue();
        float fIntValue3 = pVar2.f128594a.intValue();
        float fIntValue4 = pVar2.f128595b.intValue();
        float f14 = asFloat / asFloat2;
        float f15 = fIntValue3 / fIntValue4;
        o13.p pVar3 = f14 > fIntValue / fIntValue2 ? new o13.p(Float.valueOf(fIntValue2 * f14), Float.valueOf(fIntValue2)) : new o13.p(Float.valueOf(fIntValue), Float.valueOf(fIntValue / f14));
        o13.p pVar4 = f14 > f15 ? new o13.p(Float.valueOf(fIntValue3), Float.valueOf(fIntValue3 / f14)) : new o13.p(Float.valueOf(f14 * fIntValue4), Float.valueOf(fIntValue4));
        float fFloatValue = ((Number) pVar4.f128594a).floatValue();
        float fFloatValue2 = ((Number) pVar4.f128595b).floatValue();
        float fFloatValue3 = ((Number) pVar3.f128594a).floatValue();
        float fFloatValue4 = ((Number) pVar3.f128595b).floatValue();
        float f16 = fFloatValue / fFloatValue3;
        float f17 = 100 * f16;
        o13.p pVar5 = new o13.p(Float.valueOf(f17), Float.valueOf(f17));
        float f18 = 2;
        o13.p pVar6 = new o13.p(Float.valueOf(asFloat / f18), Float.valueOf((asFloat2 / f18) + (((((fFloatValue2 / f18) + i14) - (fIntValue2 / f18)) / fFloatValue4) * asFloat2)));
        JsonElement jsonElement = jsonObject2.get("layers");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            ArrayList arrayList2 = new ArrayList();
            for (JsonElement jsonElement2 : jsonArray) {
                if (jsonElement2 instanceof JsonObject) {
                    arrayList2.add(jsonElement2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                JsonElement jsonElement3 = ((JsonObject) next).get("nm");
                if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null && asString.equals("Contents_Root")) {
                    break;
                }
            }
            jsonObject = (JsonObject) next;
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            int iC = MathKt.c(((Number) pVar5.f128594a).floatValue());
            int iC2 = MathKt.c(((Number) pVar5.f128595b).floatValue());
            JsonElement jsonElement4 = jsonObject.get("ks");
            JsonObject jsonObject3 = jsonElement4 instanceof JsonObject ? (JsonObject) jsonElement4 : null;
            if (jsonObject3 != null) {
                JsonElement jsonElement5 = jsonObject3.get("s");
                JsonObject jsonObject4 = jsonElement5 instanceof JsonObject ? (JsonObject) jsonElement5 : null;
                if (jsonObject4 != null) {
                    JsonElement jsonElement6 = jsonObject4.get(JWKParameterNames.OCT_KEY_VALUE);
                    JsonArray jsonArray2 = (jsonElement6 == null || !(jsonElement6 instanceof JsonArray)) ? null : (JsonArray) jsonElement6;
                    if (jsonArray2 != null) {
                        if ((jsonArray2 instanceof Collection) && ((Collection) jsonArray2).isEmpty()) {
                            JsonArray jsonArray3 = new JsonArray();
                            JsonArray jsonArrayDeepCopy = jsonArray2.deepCopy();
                            jsonArrayDeepCopy.getClass();
                            arrayList = new ArrayList(p13.y.r(jsonArrayDeepCopy, 10));
                            it = jsonArrayDeepCopy.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(it.next().getAsInt()));
                            }
                            jsonArray3.add(Integer.valueOf(iC));
                            jsonArray3.add(Integer.valueOf(iC2));
                            jsonObject4.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray3);
                        } else {
                            Iterator<JsonElement> it4 = jsonArray2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    JsonArray jsonArray4 = new JsonArray();
                                    JsonArray jsonArrayDeepCopy2 = jsonArray2.deepCopy();
                                    jsonArrayDeepCopy2.getClass();
                                    arrayList = new ArrayList(p13.y.r(jsonArrayDeepCopy2, 10));
                                    it = jsonArrayDeepCopy2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(it.next().getAsInt()));
                                    }
                                    jsonArray4.add(Integer.valueOf(iC));
                                    jsonArray4.add(Integer.valueOf(iC2));
                                    jsonObject4.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray4);
                                } else if (!(it4.next() instanceof JsonPrimitive)) {
                                }
                            }
                        }
                    }
                }
            }
            float fFloatValue5 = ((Number) pVar6.f128594a).floatValue();
            float fFloatValue6 = ((Number) pVar6.f128595b).floatValue();
            JsonElement jsonElement7 = jsonObject.get("ks");
            JsonObject jsonObject5 = jsonElement7 instanceof JsonObject ? (JsonObject) jsonElement7 : null;
            if (jsonObject5 != null && (asJsonObject = jsonObject5.get("p").getAsJsonObject()) != null && asJsonObject.get(JWKParameterNames.OCT_KEY_VALUE).getAsJsonArray() != null) {
                JsonArray jsonArray5 = new JsonArray();
                jsonArray5.add(Float.valueOf(fFloatValue5));
                jsonArray5.add(Float.valueOf(fFloatValue6));
                jsonArray5.add((Number) 0);
                asJsonObject.add(JWKParameterNames.OCT_KEY_VALUE, jsonArray5);
            }
        } else {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "LottieUtils", "Can not find Contents_Parent layer");
        }
        w wVar = new w(f16, pVar4);
        this.f133655i = wVar.f133697b;
        this.f133649c = wVar.f133696a;
        return jsonObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringBuilder d(Context context) throws IOException {
        bu.h cVar;
        bu.g gVar = (bu.g) this;
        bu.f.f21180a.getClass();
        if (gVar instanceof b0) {
            cVar = bu.h.d.f21188a;
        } else {
            n nVarF = bu.f.f(gVar);
            if (nVarF == null) {
                return new StringBuilder("");
            }
            cVar = new bu.h.c(nVarF);
        }
        File file = new File(context.getFilesDir(), bu.f.h(cVar, "main.json").toString());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), d53.c.f57666b), 8192);
        try {
            String strE = lg.d.E(bufferedReader);
            bufferedReader.close();
            return new StringBuilder(strE);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                jg.b.l(bufferedReader, th3);
                throw th4;
            }
        }
    }

    public final LottieComposition e() {
        return (LottieComposition) this.f133648b.getValue();
    }

    /* JADX INFO: renamed from: f */
    public abstract String getF133671n();

    /* JADX INFO: renamed from: g, reason: from getter */
    public String getF133672o() {
        return this.f133658l;
    }

    public abstract LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14);

    public abstract void i(Context context, LottieDrawable lottieDrawable);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lot/p$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FUN_FACT_MARKER_NAME", "", "ORIGINAL_LOGO_TOP_PADDING", "I", "ORIGINAL_LOGO_LEFT_PADDING", "ORIGINAL_LOGO_WIDTH", "ORIGINAL_LOGO_HEIGHT", "", "LOTTIE_CANVA_WIDTH", "F", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
