package ot;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lot/b0;", "Lot/l;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Lot/x;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b0 extends l implements bu.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f133572r = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
    }

    public abstract boolean A();

    public String B(Context context) {
        context.getClass();
        return "";
    }

    public String C(Context context) {
        context.getClass();
        return "";
    }

    public String D(Context context) {
        context.getClass();
        return "";
    }

    public String E(Context context) {
        return "";
    }

    public String F(Context context) {
        return "";
    }

    public String G(Context context) {
        return "";
    }

    public abstract int H();

    public abstract String I(Context context);

    public String J(Context context) {
        context.getClass();
        return "";
    }

    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        Object next;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonArray asJsonArray;
        JsonElement jsonElement5;
        JsonObject asJsonObject;
        JsonElement jsonElement6;
        JsonObject jsonObjectC = c(d(context), pVar, pVar2, i14);
        b(context);
        pt.i iVar = pt.i.f140571a;
        tt.m mVarJ = j();
        Integer[] numArr = {Integer.valueOf(mVarJ.f166329d), Integer.valueOf(mVarJ.f166328c)};
        iVar.getClass();
        JsonObject jsonObjectM = pt.i.m(jsonObjectC, "Title_Circle");
        int i15 = 0;
        JsonArray asJsonArray2 = (jsonObjectM == null || (jsonElement4 = jsonObjectM.get("shapes")) == null || (asJsonArray = jsonElement4.getAsJsonArray()) == null || (jsonElement5 = asJsonArray.get(0)) == null || (asJsonObject = jsonElement5.getAsJsonObject()) == null || (jsonElement6 = asJsonObject.get("it")) == null) ? null : jsonElement6.getAsJsonArray();
        if (asJsonArray2 != null) {
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement7 : asJsonArray2) {
                if (jsonElement7 instanceof JsonObject) {
                    arrayList.add(jsonElement7);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                jsonElement3 = ((JsonObject) next).get("nm");
            } while (!p005kotlin.jvm.internal.s.g(jsonElement3 != null ? jsonElement3.getAsString() : null, "Fill 1"));
            jsonObject = (JsonObject) next;
        } else {
            jsonObject = null;
        }
        JsonObject asJsonObject2 = (jsonObject == null || (jsonElement2 = jsonObject.get("c")) == null) ? null : jsonElement2.getAsJsonObject();
        JsonArray asJsonArray3 = (asJsonObject2 == null || (jsonElement = asJsonObject2.get(JWKParameterNames.OCT_KEY_VALUE)) == null) ? null : jsonElement.getAsJsonArray();
        if (asJsonArray3 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (JsonElement jsonElement8 : asJsonArray3) {
                if (jsonElement8 instanceof JsonObject) {
                    arrayList2.add(jsonElement8);
                }
            }
            for (Object obj : arrayList2) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                int iIntValue = numArr[i15].intValue();
                JsonArray jsonArray = new JsonArray(4);
                jsonArray.add(Float.valueOf(((iIntValue >> 16) & 255) / 255.0f));
                jsonArray.add(Float.valueOf(((iIntValue >> 8) & 255) / 255.0f));
                jsonArray.add(Float.valueOf((iIntValue & 255) / 255.0f));
                jsonArray.add(Float.valueOf(((iIntValue >> 24) & 255) / 255.0f));
                ((JsonObject) obj).add("s", jsonArray);
                i15 = i16;
            }
        }
        String string = context.getString(H());
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        pt.i.g(context, jsonObjectC, "Text_Topic", upperCase);
        pt.i iVar2 = pt.i.f140571a;
        float f14 = this.f133656j;
        String string2 = context.getString(H());
        string2.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        pt.i.b(iVar2, context, jsonObjectC, f14, upperCase2);
        pt.h.i(context, jsonObjectC, I(context), J(context), 322.0f - this.f133656j, 18.0f);
        String strT = t(context);
        if (strT != null) {
            pt.i.z(jsonObjectC, "intro_layer_name", strT, oe2.f.O(context));
            pt.i.f(jsonObjectC, this.f133656j);
        } else {
            pt.i.v(jsonObjectC, "intro_layer_name");
        }
        String strS = s(context);
        if (strS != null) {
            pt.i.z(jsonObjectC, "funfact_layer_name", strS, oe2.f.T(context));
        } else {
            pt.i.v(jsonObjectC, "funfact_layer_name");
        }
        pt.n nVar = pt.n.f140581a;
        String string3 = context.getString(w());
        string3.getClass();
        Typeface typefaceS = oe2.f.S(context);
        nVar.getClass();
        pt.n.e(jsonObjectC, string3, typefaceS);
        List<Number> listV = v();
        if (listV != null) {
            pt.n.d(context, jsonObjectC, listV, new a0(this, context, 0));
            pt.n.b(listV, jsonObjectC);
            pt.n.a(jsonObjectC, oe2.f.T(context));
        }
        if (y()) {
            String strB = B(context);
            if (strB.length() > 0) {
                pt.i.z(jsonObjectC, "Stats_1_Date", strB, oe2.f.T(context));
            } else {
                pt.i.v(jsonObjectC, "Stats_1_Date");
                pt.i.A(jsonObjectC, "Stats_1_Value", 21.0f);
                pt.i.A(jsonObjectC, "Stats_1_Description", 21.0f);
            }
            pt.i.z(jsonObjectC, "Stats_1_Value", D(context), oe2.f.T(context));
            pt.i.z(jsonObjectC, "Stats_1_Description", C(context), oe2.f.T(context));
        } else {
            pt.i.v(jsonObjectC, "Divider_1", "Stats_1_Date", "Stats_1_Value", "Stats_1_Description");
        }
        if (z()) {
            String strE = E(context);
            if (strE.length() > 0) {
                pt.i.z(jsonObjectC, "Stats_2_Date", strE, oe2.f.T(context));
            } else {
                pt.i.v(jsonObjectC, "Stats_2_Date");
                pt.i.A(jsonObjectC, "Stats_2_Value", 21.0f);
                pt.i.A(jsonObjectC, "Stats_2_Description", 21.0f);
            }
            pt.i.z(jsonObjectC, "Stats_2_Value", G(context), oe2.f.T(context));
            pt.i.z(jsonObjectC, "Stats_2_Description", F(context), oe2.f.T(context));
        } else {
            pt.i.v(jsonObjectC, "Divider_2", "Stats_2_Date", "Stats_2_Value", "Stats_2_Description");
        }
        String string4 = jsonObjectC.toString();
        string4.getClass();
        byte[] bytes = string4.getBytes(d53.c.f57666b);
        bytes.getClass();
        return LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), null).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        Object next;
        if (lottieDrawable != null) {
            pt.i iVar = pt.i.f140571a;
            tt.m mVarJ = j();
            iVar.getClass();
            mVarJ.getClass();
            Integer[] numArr = mVarJ.f166326a;
            int iIntValue = ((Number) p13.u.E(numArr)).intValue();
            int iIntValue2 = ((Number) p13.u.Q(numArr)).intValue();
            Integer[] numArr2 = {Integer.valueOf(iIntValue), Integer.valueOf(Color.argb((((iIntValue >> 24) & 255) + ((iIntValue2 >> 24) & 255)) / 2, (((iIntValue >> 16) & 255) + ((iIntValue2 >> 16) & 255)) / 2, (((iIntValue >> 8) & 255) + ((iIntValue2 >> 8) & 255)) / 2, ((iIntValue & 255) + (iIntValue2 & 255)) / 2)), Integer.valueOf(iIntValue2)};
            KeyPath keyPath = new KeyPath("Light BG", "Rectangle 1", "Gradient Fill 1");
            Integer[] numArr3 = LottieProperty.GRADIENT_COLOR;
            lottieDrawable.addValueCallback(keyPath, numArr3, new pt.j(numArr2));
            lottieDrawable.addValueCallback(new KeyPath("Dark BG", "Rectangle 1", "Gradient Fill 1"), numArr3, new pt.k(mVarJ));
            lottieDrawable.addValueCallback(new KeyPath("Title_bg", "Shape 1", "Stroke 1"), LottieProperty.STROKE_COLOR, new pt.l(mVarJ));
        }
        pt.i iVar2 = pt.i.f140571a;
        String string = context.getString(H());
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar2.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        if (A()) {
            Iterator it = this.f133650d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((Marker) next).getName(), "Funfact"));
            Marker marker = (Marker) next;
            if (marker != null) {
                a(lottieDrawable, p13.w.c(marker));
            }
        }
        List<Number> listV = v();
        if (listV != null) {
            pt.n nVar = pt.n.f140581a;
            Integer numValueOf = Integer.valueOf(context.getColor(u()));
            a0 a0Var = new a0(this, context, 1);
            nVar.getClass();
            pt.n.c(context, numValueOf, lottieDrawable, listV, a0Var);
        }
        p(context, lottieDrawable, u0.e(new o13.p("image_0", "title_icon.png"), new o13.p("image_1", "bg_icon.png")));
    }

    @Override // ot.l
    public Map<String, String> l() {
        return u0.e(new o13.p("image_0", "sharing_bg.png"), new o13.p("image_1", "title_icon.png"));
    }

    @Override // ot.l
    public final Object m(Context context, yt.o oVar) throws Throwable {
        Context context2;
        TextPaint textPaintS;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonObject asJsonObject;
        JsonElement jsonElement4;
        LottieDrawable lottieDrawable = new LottieDrawable();
        JsonObject jsonObjectK = k(context, this, "sharing.json");
        if (jsonObjectK != null) {
            context2 = context;
            pt.h.i(context2, jsonObjectK, I(context), J(context), 230.0f, 12.0f);
            List<Number> listV = v();
            if (listV != null) {
                pt.u.f140605a.getClass();
                pt.u.c(listV, jsonObjectK);
                tt.m mVarJ = j();
                mVarJ.getClass();
                int i14 = mVarJ.f166330e;
                pt.i.f140571a.getClass();
                JsonObject jsonObjectM = pt.i.m(jsonObjectK, "Month");
                if (jsonObjectM != null) {
                    pt.i.c(jsonObjectM, Color.valueOf(i14));
                }
                JsonObject jsonObjectM2 = pt.i.m(jsonObjectK, "Highlight_count_value");
                if (jsonObjectM2 != null) {
                    pt.i.c(jsonObjectM2, Color.valueOf(i14));
                }
            }
            String strS = s(context2);
            if (strS != null) {
                pt.u uVar = pt.u.f140605a;
                Typeface typefaceT = oe2.f.T(context2);
                uVar.getClass();
                pt.i.f140571a.getClass();
                JsonObject jsonObjectM3 = pt.i.m(jsonObjectK, "funfact_layer_name");
                if (jsonObjectM3 != null && (textPaintS = pt.i.s(jsonObjectM3, typefaceT)) != null) {
                    pt.h.f140570a.getClass();
                    pt.v vVarG = pt.h.g(strS, 230.0f, textPaintS);
                    pt.i.x(jsonObjectM3, vVarG.f140606a);
                    int i15 = vVarG.f140607b;
                    if (i15 > 1) {
                        float f14 = (i15 - 1) * 17.0f;
                        JsonObject jsonObjectM4 = pt.i.m(jsonObjectK, "Chart_Root");
                        JsonObject asJsonObject2 = (jsonObjectM4 == null || (jsonElement3 = jsonObjectM4.get("ks")) == null || (asJsonObject = jsonElement3.getAsJsonObject()) == null || (jsonElement4 = asJsonObject.get("p")) == null) ? null : jsonElement4.getAsJsonObject();
                        JsonArray asJsonArray = (asJsonObject2 == null || (jsonElement2 = asJsonObject2.get(JWKParameterNames.OCT_KEY_VALUE)) == null) ? null : jsonElement2.getAsJsonArray();
                        float asFloat = (asJsonArray == null || (jsonElement = asJsonArray.get(1)) == null) ? 0.0f : jsonElement.getAsFloat();
                        if (asJsonArray != null) {
                            asJsonArray.set(1, new JsonPrimitive(Float.valueOf(asFloat + f14)));
                        }
                        if (asJsonObject2 != null) {
                            asJsonObject2.add(JWKParameterNames.OCT_KEY_VALUE, asJsonArray);
                        }
                    }
                }
            } else {
                pt.i.f140571a.getClass();
                pt.i.v(jsonObjectK, "funfact_layer_name");
                Unit unit = Unit.INSTANCE;
            }
            String strD = D(context2);
            if (!g22.n.d(strD)) {
                strD = null;
            }
            if (strD != null) {
                pt.i.y(jsonObjectK, "Data_Most", strD);
            } else {
                pt.i.f140571a.getClass();
                pt.i.v(jsonObjectK, "Data_Most");
                Unit unit2 = Unit.INSTANCE;
            }
            String strC = C(context2);
            String strB = B(context2);
            x0 x0Var = x0.f105818a;
            String string = context2.getString(R.string.value_dot_value);
            string.getClass();
            pt.i.y(jsonObjectK, "Text_Most", String.format(string, Arrays.copyOf(new Object[]{strC, strB}, 2)));
        } else {
            context2 = context;
        }
        q(context2, jsonObjectK, lottieDrawable);
        List<Number> listV2 = v();
        if (listV2 != null) {
            pt.u.f140605a.getClass();
            pt.u.b(lottieDrawable, listV2);
            Iterator<T> it = listV2.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            Number number = (Number) it.next();
            int iIntValue = number != null ? number.intValue() : 0;
            while (it.hasNext()) {
                Number number2 = (Number) it.next();
                int iIntValue2 = number2 != null ? number2.intValue() : 0;
                if (iIntValue < iIntValue2) {
                    iIntValue = iIntValue2;
                }
            }
            String strR = r(Integer.valueOf(iIntValue), context2);
            pt.i.f140571a.getClass();
            pt.i.d(lottieDrawable, "Highlight_count_value", strR);
            pt.u uVar2 = pt.u.f140605a;
            tt.m mVarJ2 = j();
            uVar2.getClass();
            mVarJ2.getClass();
            Iterator it3 = pt.u.a().keySet().iterator();
            while (it3.hasNext()) {
                lottieDrawable.addValueCallback(new KeyPath((String) it3.next(), "Shape 1", "Stroke 1"), LottieProperty.STROKE_COLOR, new pt.s(mVarJ2));
            }
        }
        pt.i iVar = pt.i.f140571a;
        String string2 = context2.getString(H());
        string2.getClass();
        String upperCase = string2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        Object objO = o(context2, p13.w.c(new l.a(this, lottieDrawable, x())), oVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    public abstract String r(Number number, Context context);

    public abstract String s(Context context);

    public abstract String t(Context context);

    public abstract int u();

    public abstract List<Number> v();

    public abstract int w();

    public abstract String x();

    public boolean y() {
        return this instanceof t;
    }

    public boolean z() {
        return this instanceof y;
    }
}
