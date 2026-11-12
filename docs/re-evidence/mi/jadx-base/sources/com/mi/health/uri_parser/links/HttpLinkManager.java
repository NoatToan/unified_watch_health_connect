package com.mi.health.uri_parser.links;

import android.content.Context;
import android.net.Uri;
import com.mi.health.uri_parser.ILinkHandler;
import com.mi.health.uri_parser.links.HttpLinkManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.hzi;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mi/health/uri_parser/links/HttpLinkManager;", "", "<init>", "()V", "mLinkHandler", "Ljava/util/ArrayList;", "Lcom/mi/health/uri_parser/ILinkHandler;", "handleLink", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "from", "", "addLinkHandler", "linkHandler", "removeLinkHandler", "Companion", "uri-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpLinkManager {

    @NotNull
    private static final String TAG = "HttpLinkManager";

    @NotNull
    private final ArrayList<ILinkHandler> mLinkHandler = new ArrayList<>();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<HttpLinkManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: ygc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HttpLinkManager.instance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mi/health/uri_parser/links/HttpLinkManager$Companion;", "", "<init>", "()V", "instance", "Lcom/mi/health/uri_parser/links/HttpLinkManager;", "getInstance", "()Lcom/mi/health/uri_parser/links/HttpLinkManager;", "instance$delegate", "Lkotlin/Lazy;", "TAG", "", "uri-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HttpLinkManager getInstance() {
            return (HttpLinkManager) HttpLinkManager.instance$delegate.getValue();
        }
    }

    private HttpLinkManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpLinkManager instance_delegate$lambda$0() {
        return new HttpLinkManager();
    }

    public final void addLinkHandler(@NotNull ILinkHandler linkHandler) {
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.mLinkHandler.add(linkHandler);
    }

    public final void handleLink(@NotNull Context context, @NotNull Uri uri, int from) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Logger.d(TAG, "handleLink() called with: context = " + context + ", uri = " + uri + ", from = " + from);
        Iterator<ILinkHandler> it = this.mLinkHandler.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        boolean z = false;
        while (it.hasNext()) {
            ILinkHandler next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ILinkHandler iLinkHandler = next;
            boolean zHandleUri = iLinkHandler.handleUri(context, uri, from);
            Logger.i(TAG, "handleLink: " + iLinkHandler + ", result = " + zHandleUri);
            z = zHandleUri;
            if (zHandleUri) {
                break;
            }
        }
        if (z) {
            return;
        }
        ToastUtil.showShortToast(hzi.f20624a);
    }

    public final void removeLinkHandler(@NotNull ILinkHandler linkHandler) {
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.mLinkHandler.remove(linkHandler);
    }
}
