package com.facebook.internal;

import android.content.Intent;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.huami.moving.ui.utils.SportAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0003\u0015\u0014\u0016B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl;", "Lcom/facebook/CallbackManager;", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl$Callback;", "callback", "", "registerCallback", "unregisterCallback", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "", "a", "Ljava/util/Map;", "callbacks", "<init>", "()V", "Companion", "Callback", "RequestCodeOffset", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CallbackManagerImpl implements CallbackManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Integer, Callback> b = new HashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<Integer, Callback> callbacks = new HashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$Callback;", "", "", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        boolean onActivityResult(int resultCode, @Nullable Intent data);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$Companion;", "", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl$Callback;", "a", "resultCode", "Landroid/content/Intent;", "data", "", "b", "callback", "", "registerStaticCallback", "", "staticCallbacks", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final synchronized Callback a(int requestCode) {
            return (Callback) CallbackManagerImpl.b.get(Integer.valueOf(requestCode));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean b(int requestCode, int resultCode, Intent data) {
            Callback callbackA = a(requestCode);
            if (callbackA != null) {
                return callbackA.onActivityResult(resultCode, data);
            }
            return false;
        }

        @JvmStatic
        public final synchronized void registerStaticCallback(int requestCode, @NotNull Callback callback) {
            if (CallbackManagerImpl.b.containsKey(Integer.valueOf(requestCode))) {
                return;
            }
            CallbackManagerImpl.b.put(Integer.valueOf(requestCode), callback);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;", "", "", "toRequestCode", "offset", LogUtil.I, "<init>", "(Ljava/lang/String;II)V", "Login", SportAnalytics.Params.VALUE_SHARE, "Message", "Like", "GameRequest", "AppGroupCreate", "AppGroupJoin", "AppInvite", "DeviceShare", "GamingFriendFinder", "GamingGroupIntegration", "Referral", "GamingContextCreate", "GamingContextSwitch", "GamingContextChoose", "TournamentShareDialog", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15);

        private final int offset;

        RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int toRequestCode() {
            return FacebookSdk.getCallbackRequestCodeOffset() + this.offset;
        }
    }

    @JvmStatic
    private static final synchronized Callback a(int i) {
        return INSTANCE.a(i);
    }

    @JvmStatic
    private static final boolean b(int i, int i2, Intent intent) {
        return INSTANCE.b(i, i2, intent);
    }

    @JvmStatic
    public static final synchronized void registerStaticCallback(int i, @NotNull Callback callback) {
        INSTANCE.registerStaticCallback(i, callback);
    }

    @Override // com.facebook.CallbackManager
    public boolean onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Callback callback = this.callbacks.get(Integer.valueOf(requestCode));
        return callback != null ? callback.onActivityResult(resultCode, data) : INSTANCE.b(requestCode, resultCode, data);
    }

    public final void registerCallback(int requestCode, @NotNull Callback callback) {
        this.callbacks.put(Integer.valueOf(requestCode), callback);
    }

    public final void unregisterCallback(int requestCode) {
        this.callbacks.remove(Integer.valueOf(requestCode));
    }
}
