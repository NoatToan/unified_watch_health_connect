package com.huami.watchfacesstore.ui.store.list;

import android.content.Context;
import android.content.Intent;
import androidx.p008lifecycle.Observer;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/CategoryListActivity;", "Lcom/huami/watchfacesstore/ui/store/list/AbstractListActivity;", "", "initView", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "dataList", "setUiData", "", "needRegisterPurchase", "", "position", "onListItemClick", "onLoadMore", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CategoryListActivity extends AbstractListActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String n = "CategoryListActivity";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/CategoryListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "pageMode", "categoryId", "", "actionStart", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void actionStart$default(Companion companion, Context context, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i2 = -1;
            }
            companion.actionStart(context, i, i2);
        }

        @JvmStatic
        @JvmOverloads
        public final void actionStart(@NotNull Context context, int i) {
            actionStart$default(this, context, i, 0, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void actionStart(@NotNull Context context, int pageMode, int categoryId) {
            Intent intent = new Intent(context, (Class<?>) CategoryListActivity.class);
            intent.putExtra(AbstractListActivity.LIST_ID, categoryId);
            intent.putExtra(AbstractListActivity.PAGE_MODE, pageMode);
            intent.putExtra("checkNetwork", true);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void actionStart(@NotNull Context context, int i) {
        INSTANCE.actionStart(context, i);
    }

    @JvmStatic
    @JvmOverloads
    public static final void actionStart(@NotNull Context context, int i, int i2) {
        INSTANCE.actionStart(context, i, i2);
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity, com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        Integer numValueOf;
        super.initView();
        int pageMode = getPageMode();
        if (pageMode != 3) {
            numValueOf = pageMode != 4 ? null : Integer.valueOf(R.string.wf_manager_item_collect_title);
        } else {
            numValueOf = Integer.valueOf(R.string.wf_home_item_new_title);
        }
        if (numValueOf != null) {
            getMBinding().commonTitleBar.setTitleText(numValueOf.intValue());
        }
        getListViewModel().getCategoryTitleLiveData().observe(this, new Observer<T>() { // from class: com.huami.watchfacesstore.ui.store.list.CategoryListActivity$initView$$inlined$observeWithNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                    return;
                }
                this.a.getMBinding().commonTitleBar.setTitleText((String) t);
            }
        });
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity
    public boolean needRegisterPurchase() {
        return true;
    }

    @Override // com.huami.watchfacesstore.ui.store.list.AbstractListActivity
    public void onListItemClick(int position) {
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, this, 0, getDataLists().get(position).getId(), null, "category", 8, null);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public void onLoadMore() {
        if (getPageMode() == 3 || getPageMode() == 9) {
            getMBinding().rlList.setNoMore(true);
        } else {
            getListViewModel().getDataLists(getPageMode(), getId());
        }
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
