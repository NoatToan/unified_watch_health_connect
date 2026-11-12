package com.huami.watchfacesstore.ui.store.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.Publisher;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/PublisherWatchListActivity;", "Lcom/huami/watchfacesstore/ui/store/list/AbstractListActivity;", "", "initView", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "dataList", "setUiData", "", "position", "onListItemClick", "onLoadMore", "Landroid/view/View;", GoogleApiAvailabilityLight.b, "Lkotlin/Lazy;", "i", "()Landroid/view/View;", "publisherHeader", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
public final class PublisherWatchListActivity extends AbstractListActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String o = "PublisherListActivity";

    @NotNull
    private static final String p = "publisher_name";

    @NotNull
    private static final String q = "publisher_icon";

    @NotNull
    private static final String r = "publisher_desc";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy publisherHeader = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/PublisherWatchListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/watchfacesstore/bean/Publisher;", "publisherInfo", "", "actionStart", "", "PUBLISHER_DESC", "Ljava/lang/String;", "PUBLISHER_ICON", "PUBLISHER_NAME", "TAG", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void actionStart(@NotNull Context context, @NotNull Publisher publisherInfo) {
            Intent intent = new Intent(context, (Class<?>) PublisherWatchListActivity.class);
            intent.putExtra(AbstractListActivity.PAGE_MODE, 8);
            intent.putExtra(AbstractListActivity.LIST_ID, publisherInfo.getId());
            intent.putExtra(PublisherWatchListActivity.p, publisherInfo.getName());
            intent.putExtra(PublisherWatchListActivity.q, publisherInfo.getIcon());
            intent.putExtra(PublisherWatchListActivity.r, publisherInfo.getDescription());
            intent.putExtra("checkNetwork", true);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<View> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final View getA() {
            Intent intent = PublisherWatchListActivity.this.getIntent();
            String stringExtra = intent == null ? null : intent.getStringExtra(PublisherWatchListActivity.q);
            Intent intent2 = PublisherWatchListActivity.this.getIntent();
            String stringExtra2 = intent2 == null ? null : intent2.getStringExtra(PublisherWatchListActivity.r);
            View viewInflate = LayoutInflater.from(PublisherWatchListActivity.this).inflate(R.layout.wf_layout_header_publisher, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.rightMargin = ExtensionsKt.getDp(10);
            layoutParams.bottomMargin = ExtensionsKt.getDp(15);
            Unit unit = Unit.INSTANCE;
            viewInflate.setLayoutParams(layoutParams);
            ExtensionsKt.loadUrl((ImageView) viewInflate.findViewById(R.id.icon_publisher), stringExtra);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_publisher_intro);
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            textView.setText(stringExtra2);
            return viewInflate;
        }
    }

    @JvmStatic
    public static final void actionStart(@NotNull Context context, @NotNull Publisher publisher) {
        INSTANCE.actionStart(context, publisher);
    }

    private final View i() {
        return (View) this.publisherHeader.getValue();
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity, com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        String stringExtra;
        super.initView();
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(p)) != null) {
            getMBinding().commonTitleBar.setTitleText(stringExtra);
        }
        getMBinding().rlList.addHeaderView(i());
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity
    public void onListItemClick(int position) {
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, this, 0, getDataLists().get(position - 1).getId(), null, null, 24, null);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public void onLoadMore() {
        loadData();
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity
    public void setUiData(@NotNull List<WatchData> dataList) {
        if (dataList.isEmpty()) {
            getMBinding().rlList.setNoMore(true);
            return;
        }
        getDataLists().addAll(dataList);
        getListAdapter().addAll(dataList);
        getMBinding().rlList.loadMoreComplete();
    }
}
