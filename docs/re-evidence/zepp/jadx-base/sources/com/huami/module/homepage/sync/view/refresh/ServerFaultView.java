package com.huami.module.homepage.sync.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import com.huami.http.serverfault.handler.HomeFaultHandler;
import com.huami.module.homepage.R;
import com.huami.module.homepage.databinding.HomepageServerFaultViewBinding;
import com.huami.module.homepage.sync.view.refresh.ServerFaultView;
import com.huami.module.ktx.ViewExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huami/module/homepage/sync/view/refresh/ServerFaultView;", "Landroid/widget/RelativeLayout;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "setServerListener", "Lcom/huami/module/homepage/databinding/HomepageServerFaultViewBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageServerFaultViewBinding;", "binding", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class ServerFaultView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageServerFaultViewBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "HomeFaultHandler---> " + this.a;
        }
    }

    @JvmOverloads
    public ServerFaultView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ServerFaultView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ServerFaultView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ServerFaultView serverFaultView, View view) {
        serverFaultView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ServerFaultView serverFaultView, Boolean bool) {
        HMLog.info("HomePage", new a(bool));
        serverFaultView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public final void setServerListener(@NotNull LifecycleOwner owner) {
        HomeFaultHandler.INSTANCE.getShouldShowTip().observe(owner, new Observer() { // from class: zn6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ServerFaultView.d(this.a, (Boolean) obj);
            }
        });
    }

    @JvmOverloads
    public ServerFaultView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HomepageServerFaultViewBinding homepageServerFaultViewBindingInflate = HomepageServerFaultViewBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = homepageServerFaultViewBindingInflate;
        ViewExtKt.setShape(homepageServerFaultViewBindingInflate.getRoot(), 6.0f, Integer.valueOf(ViewExtKt.loadColor(this, R.color.s38)));
        homepageServerFaultViewBindingInflate.homepageServiceClose.setOnClickListener(new View.OnClickListener() { // from class: yn6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ServerFaultView.c(this.a, view);
            }
        });
    }
}
