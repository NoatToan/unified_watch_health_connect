package o2;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j;
import androidx.core.view.m1;
import androidx.core.view.z;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import com.garmin.android.apps.connectmobile.courses.presentation.chart.CourseFullscreenChartActivity;
import j20.x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.io.input.UnsynchronizedByteArrayInputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.function.ToBooleanBiFunction;
import p005kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements z, oa.b.a, Rule.RPattern, AbstractByteArrayOutputStream.InputStreamConstructor, Functions.FailableConsumer, ToBooleanBiFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128622a;

    public /* synthetic */ c(int i14) {
        this.f128622a = i14;
    }

    public static double b(double d14, double d15, double d16, double d17) {
        return ((d14 - d15) * d16) + d17;
    }

    public static String c(char c14, String str, String str2) {
        return str + str2 + c14;
    }

    public static String d(char c14, List list, StringBuilder sb3) {
        sb3.append(list);
        sb3.append(c14);
        return sb3.toString();
    }

    public static String e(int i14, String str, String str2, String str3, String str4) {
        return str + i14 + str2 + str3 + str4;
    }

    public static /* synthetic */ void f() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void g(int i14, String str) {
        throw new IllegalStateException((str + i14).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(int i14, String str, Object obj) {
        throw new IllegalArgumentException((str + obj + ((char) i14)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(int i14, String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i14)).toString());
    }

    public static /* synthetic */ void j(Object obj, Object obj2, Object obj3) {
        throw new AssertionError("Thread " + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(Object obj, Object obj2, Object obj3, Object obj4, String str) throws IOException {
        throw new IOException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new ns2.d(str);
    }

    public static void n(String str, String str2, String str3, StringBuilder sb3, List list) {
        sb3.append(list);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
    }

    public static /* synthetic */ void o(StringBuilder sb3, Object obj, Object obj2) {
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalStateException(sb3.toString().toString());
    }

    public static /* synthetic */ void p(Throwable th3) {
        throw new RuntimeException(th3);
    }

    public static /* synthetic */ void q() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void r(int i14, String str) throws IOException {
        throw new IOException(str + i14);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void t(StringBuilder sb3, Object obj, Object obj2) {
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalStateException(sb3.toString());
    }

    public static /* synthetic */ void u(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public Bitmap a(int i14, byte[] bArr) throws ImageDecoderException {
        try {
            return ha.b.a(i14, bArr);
        } catch (ParserException e4) {
            throw new ImageDecoderException(j.e(bArr.length, i14, ", input length = ", ")", new StringBuilder("Could not decode image data with BitmapFactory. (data.length = ")), e4);
        } catch (IOException e14) {
            throw new ImageDecoderException(e14);
        }
    }

    @Override // org.apache.commons.lang3.Functions.FailableConsumer
    public void accept(Object obj) {
        Functions.rethrow((Throwable) obj);
    }

    @Override // org.apache.commons.lang3.function.ToBooleanBiFunction
    public boolean applyAsBoolean(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        CharSequence charSequence2 = (CharSequence) obj2;
        switch (this.f128622a) {
            case 28:
                return StringUtils.contains(charSequence, charSequence2);
            default:
                return StringUtils.containsIgnoreCase(charSequence, charSequence2);
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream.InputStreamConstructor
    public InputStream construct(byte[] bArr, int i14, int i15) {
        switch (this.f128622a) {
            case 25:
                return new ByteArrayInputStream(bArr, i14, i15);
            default:
                return new UnsynchronizedByteArrayInputStream(bArr, i14, i15);
        }
    }

    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
    public boolean isMatch(CharSequence charSequence) {
        switch (this.f128622a) {
            case 22:
                return Rule.lambda$pattern$5(charSequence);
            default:
                return Rule.lambda$static$0(charSequence);
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        switch (this.f128622a) {
            case 1:
                CourseFullscreenChartActivity.a aVar = CourseFullscreenChartActivity.f33012a;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(130);
                eVarI.getClass();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = eVarI.f25190a;
                marginLayoutParams.rightMargin = eVarI.f25192c;
                view2.setLayoutParams(marginLayoutParams);
                return m1Var;
            default:
                CourseFullscreenChartActivity.a aVar2 = CourseFullscreenChartActivity.f33012a;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(130);
                eVarI2.getClass();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.leftMargin = eVarI2.f25190a;
                marginLayoutParams2.rightMargin = eVarI2.f25192c;
                view2.setLayoutParams(marginLayoutParams2);
                return m1Var;
        }
    }
}
