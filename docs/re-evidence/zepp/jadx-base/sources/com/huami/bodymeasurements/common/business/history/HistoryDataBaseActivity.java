package com.huami.bodymeasurements.common.business.history;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bodymeasurements.common.R;
import com.huami.bodymeasurements.common.business.adapter.BaseRecyclerAdapter;
import com.huami.bodymeasurements.common.business.adapter.MyViewHolder;
import com.huami.bodymeasurements.common.business.history.HistoryDataBaseActivity;
import com.huami.bodymeasurements.common.ext.ViewExKt;
import com.huami.bodymeasurements.common.utils.GlobalTitleStyleKt;
import com.huami.bodymeasurements.common.utils.NetUtils;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bodymeasurements/common/business/history/HistoryDataBaseActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "o", GoogleApiAvailabilityLight.b, "Lcom/huami/bodymeasurements/common/business/history/HistoryDataItem;", "item", com.google.android.exoplayer2.text.ttml.b.r, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "data", "setData", "deleteItem", "Lcom/huami/bodymeasurements/common/business/history/HistoryDataBaseActivity$a;", "x", "Lcom/huami/bodymeasurements/common/business/history/HistoryDataBaseActivity$a;", "historyAdapter", "<init>", "()V", "a", "common_release"}, k = 1, mv = {1, 5, 1})
public class HistoryDataBaseActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final a historyAdapter = new a(new b(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nj\u0002`\u000b¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R)\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nj\u0002`\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"com/huami/bodymeasurements/common/business/history/HistoryDataBaseActivity$a", "Lcom/huami/bodymeasurements/common/business/adapter/BaseRecyclerAdapter;", "Lcom/huami/bodymeasurements/common/business/history/HistoryDataItem;", "Lcom/huami/bodymeasurements/common/business/adapter/MyViewHolder;", "holder", "item", "", "position", "", "c", "Lkotlin/Function1;", "Lcom/huami/bodymeasurements/common/business/history/DeleteRecord;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "deleteRecord", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends BaseRecyclerAdapter<HistoryDataItem> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<HistoryDataItem, Unit> deleteRecord;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super HistoryDataItem, Unit> function1) {
            super(R.layout.bm_common_item_history_data);
            this.deleteRecord = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(HistoryDataItem historyDataItem, a aVar, View view) {
            if (!historyDataItem.getDelete()) {
                return true;
            }
            aVar.b().invoke(historyDataItem);
            return true;
        }

        @NotNull
        public final Function1<HistoryDataItem, Unit> b() {
            return this.deleteRecord;
        }

        @Override // com.huami.bodymeasurements.common.business.adapter.BaseRecyclerAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull MyViewHolder holder, @NotNull final HistoryDataItem item, int position) {
            ((TextView) holder.getView(R.id.data)).setText(item.getValueStr());
            TextView textView = (TextView) holder.getView(R.id.time);
            textView.setText(TimeFormatUtils.INSTANCE.formatTimeYMDHHmm(textView.getContext(), item.getTimeStamp()));
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huami.bodymeasurements.common.business.history.a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return HistoryDataBaseActivity.a.d(item, this, view);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<HistoryDataItem, Unit> {
        public b(HistoryDataBaseActivity historyDataBaseActivity) {
            super(1, historyDataBaseActivity, HistoryDataBaseActivity.class, "showDeleteConfirmDialog", "showDeleteConfirmDialog(Lcom/huami/bodymeasurements/common/business/history/HistoryDataItem;)V", 0);
        }

        public final void a(@NotNull HistoryDataItem historyDataItem) {
            ((HistoryDataBaseActivity) this.receiver).p(historyDataItem);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HistoryDataItem historyDataItem) {
            a(historyDataItem);
            return Unit.INSTANCE;
        }
    }

    private final void n() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.history_rcv);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setAdapter(this.historyAdapter);
    }

    private final void o() {
        GlobalTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.bm_common_history_data), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(final HistoryDataItem item) {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.bm_common_delete_record_confirm)).setCancelable(false).setNegativeButton(getString(R.string.bm_common_delete), new DialogInterface.OnClickListener() { // from class: s04
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HistoryDataBaseActivity.q(this.a, item, dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: t04
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HistoryDataBaseActivity.r(dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "Delete Record");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HistoryDataBaseActivity historyDataBaseActivity, HistoryDataItem historyDataItem, DialogInterface dialogInterface, int i) {
        if (NetUtils.INSTANCE.isNetworkConnected(historyDataBaseActivity)) {
            historyDataBaseActivity.deleteItem(historyDataItem);
        } else {
            CustomToast.showShort(historyDataBaseActivity, R.string.bm_common_no_net);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public void deleteItem(@NotNull HistoryDataItem item) {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bm_common_activity_history_data_base);
        o();
        n();
    }

    public final void setData(@NotNull List<HistoryDataItem> data) {
        if (data.isEmpty()) {
            ViewExKt.setVisible((RecyclerView) findViewById(R.id.history_rcv), false);
            ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.no_data_tv), true);
        } else {
            ViewExKt.setVisible((RecyclerView) findViewById(R.id.history_rcv), true);
            ViewExKt.setVisible((TypefaceTextView) findViewById(R.id.no_data_tv), false);
            this.historyAdapter.update(data);
        }
    }
}
