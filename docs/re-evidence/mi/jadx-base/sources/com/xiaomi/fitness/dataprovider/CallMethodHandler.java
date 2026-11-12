package com.xiaomi.fitness.dataprovider;

import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.log.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/dataprovider/CallMethodHandler;", "", "mMethod", "Ljava/lang/reflect/Method;", Constants.KEY_RECHARGE_VALUES, "", "", "regex", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/String;Ljava/lang/String;)V", "mValues", "[Ljava/lang/String;", "mPattern", "Ljava/util/regex/Pattern;", "isMatch", "", "methodName", "onHandle", "Landroid/os/Bundle;", "target", "arg", "extras", "Companion", "data-provider-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CallMethodHandler {

    @NotNull
    private static final String TAG = "CallMethodHandler";

    @NotNull
    private final Method mMethod;

    @Nullable
    private Pattern mPattern;

    @Nullable
    private final String[] mValues;

    @NotNull
    private final String regex;

    public CallMethodHandler(@NotNull Method mMethod, @NotNull String[] values, @NotNull String regex) {
        Intrinsics.checkNotNullParameter(mMethod, "mMethod");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.mMethod = mMethod;
        this.regex = regex;
        String[] strArr = (values.length == 0) ^ true ? (String[]) Arrays.copyOf(values, values.length, String[].class) : null;
        this.mValues = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
        mMethod.setAccessible(true);
    }

    public final boolean isMatch(@NotNull String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        String[] strArr = this.mValues;
        if (strArr != null && Arrays.binarySearch(strArr, methodName) >= 0) {
            return true;
        }
        if (!TextUtils.isEmpty(this.regex)) {
            this.mPattern = Pattern.compile(this.regex);
        }
        Pattern pattern = this.mPattern;
        if (pattern == null) {
            return false;
        }
        Intrinsics.checkNotNull(pattern);
        return pattern.matcher(methodName).find();
    }

    @NotNull
    public final Bundle onHandle(@NotNull Object target, @NotNull String methodName, @Nullable String arg, @Nullable Bundle extras) throws DataProviderException {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        if (extras == null) {
            try {
                extras = new Bundle();
            } catch (IllegalAccessException unused) {
                Logger.d(TAG, "fail access method");
                throw new UnsupportedOperationException(methodName);
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof DataProviderException) {
                    DataProviderException dataProviderException = (DataProviderException) e.getCause();
                    Intrinsics.checkNotNull(dataProviderException);
                    throw dataProviderException;
                }
                Logger.d(TAG, "fail invocation method " + methodName);
                throw new UnsupportedOperationException(methodName);
            }
        }
        if (arg == null) {
            arg = "";
        }
        Object objInvoke = this.mMethod.invoke(target, methodName, arg, extras);
        return objInvoke instanceof Bundle ? (Bundle) objInvoke : Bundle.EMPTY;
    }
}
