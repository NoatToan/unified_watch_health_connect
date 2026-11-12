package com.facebook.gamingservices;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/facebook/gamingservices/GamingContext;", "", "", "component1", "contextID", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getContextID", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GamingContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 5;
    private static GamingContext c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String contextID;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/gamingservices/GamingContext$Companion;", "", "Lcom/facebook/gamingservices/GamingContext;", "getCurrentGamingContext", "ctx", "", "setCurrentGamingContext", "", "DEFAULT_TIMEOUT", LogUtil.I, "currentContext", "Lcom/facebook/gamingservices/GamingContext;", "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final GamingContext getCurrentGamingContext() {
            JSONObject graphObject;
            String string;
            if (!CloudGameLoginHandler.isRunningInCloud()) {
                return GamingContext.c;
            }
            GraphResponse graphResponseExecuteAndWait = DaemonRequest.executeAndWait(FacebookSdk.getApplicationContext(), null, SDKMessageEnum.CONTEXT_GET_ID, 5);
            if (graphResponseExecuteAndWait == null || (graphObject = graphResponseExecuteAndWait.getGraphObject()) == null || (string = graphObject.getString("id")) == null) {
                return null;
            }
            return new GamingContext(string);
        }

        @JvmStatic
        public final void setCurrentGamingContext(@NotNull GamingContext ctx) {
            if (CloudGameLoginHandler.isRunningInCloud()) {
                return;
            }
            GamingContext.c = ctx;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GamingContext(@NotNull String str) {
        this.contextID = str;
    }

    public static /* synthetic */ GamingContext copy$default(GamingContext gamingContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gamingContext.contextID;
        }
        return gamingContext.copy(str);
    }

    @JvmStatic
    @Nullable
    public static final GamingContext getCurrentGamingContext() {
        return INSTANCE.getCurrentGamingContext();
    }

    @JvmStatic
    public static final void setCurrentGamingContext(@NotNull GamingContext gamingContext) {
        INSTANCE.setCurrentGamingContext(gamingContext);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContextID() {
        return this.contextID;
    }

    @NotNull
    public final GamingContext copy(@NotNull String contextID) {
        return new GamingContext(contextID);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof GamingContext) && Intrinsics.areEqual(this.contextID, ((GamingContext) other).contextID);
        }
        return true;
    }

    @NotNull
    public final String getContextID() {
        return this.contextID;
    }

    public int hashCode() {
        String str = this.contextID;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "GamingContext(contextID=" + this.contextID + ")";
    }
}
