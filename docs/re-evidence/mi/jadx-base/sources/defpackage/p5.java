package defpackage;

import android.text.TextUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.text.ParseException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¨\u0006\t"}, d2 = {"Lp5;", "", "", PluginDeviceInfo.FMODEL, "text", "", "expression", "<init>", "(Ljava/lang/String;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class p5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f30005b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String[] f30006a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lp5$a;", "", "", "INDEX_3", "I", "INDEX_4", "INDEX_5", "SIZE_5", "SIZE_6", "SIZE_7", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public p5(@NotNull String expression) throws ParseException {
        Intrinsics.checkNotNullParameter(expression, "expression");
        String[] strArr = {"", "", "", "", "", "", ""};
        this.f30006a = strArr;
        if (TextUtils.isEmpty(expression)) {
            throw new IllegalArgumentException("空表达式");
        }
        Object[] array = StringsKt__StringsKt.split$default((CharSequence) expression, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr2 = (String[]) array;
        if (strArr2.length < 5) {
            throw new ParseException(expression, 0);
        }
        if (strArr2.length == 5) {
            System.arraycopy(strArr2, 0, strArr, 1, 5);
            return;
        }
        if (strArr2.length != 6) {
            if (strArr2.length != 7) {
                throw new ParseException(expression, 7);
            }
            System.arraycopy(strArr2, 0, strArr, 0, 7);
        } else if (Pattern.compile("(.*)\\d{4}$").matcher(strArr2[5]).matches()) {
            System.arraycopy(strArr2, 0, strArr, 1, 6);
        } else {
            System.arraycopy(strArr2, 0, strArr, 0, 6);
        }
    }

    @Nullable
    public final String a() {
        if (a(this.f30006a[5])) {
            return this.f30006a[5];
        }
        return null;
    }

    public final boolean a(String text) {
        if (TextUtils.isEmpty(text)) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char cCharAt = text.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != ',') {
                return false;
            }
        }
        return true;
    }
}
