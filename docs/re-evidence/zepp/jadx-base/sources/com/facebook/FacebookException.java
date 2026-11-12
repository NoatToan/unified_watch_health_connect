package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0012B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\bB+\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0010B\u0013\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "<init>", "()V", "message", "(Ljava/lang/String;)V", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class FacebookException extends RuntimeException {
    public static final long serialVersionUID = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Constants.ENABLED, "", "onCompleted", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements FeatureManager.Callback {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.facebook.internal.FeatureManager.Callback
        public final void onCompleted(boolean z) {
            if (z) {
                try {
                    ErrorReportHandler.save(this.a);
                } catch (Exception unused) {
                }
            }
        }
    }

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        return message != null ? message : "";
    }

    public FacebookException(@Nullable String str) {
        super(str);
        Random random = new Random();
        if (str == null || !FacebookSdk.isInitialized() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new a(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FacebookException(@Nullable String str, @NotNull Object... objArr) {
        String str2;
        if (str != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } else {
            str2 = null;
        }
        this(str2);
    }

    public FacebookException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookException(@Nullable Throwable th) {
        super(th);
    }
}
