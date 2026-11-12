package com.huami.treadmill.ui.record;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.treadmill.R;
import com.huami.treadmill.broadcast.NetworkReceiver;
import com.huami.treadmill.data.TdTrackrecord;
import com.huami.treadmill.eventbus.StatisticsRefreshEvent;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyBoltTrackRecord;
import com.huami.treadmill.ui.component.RecyclerItemDecoration;
import com.huami.treadmill.ui.record.RecordActivity;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.treadmill.util.DensityUtils;
import com.huami.treadmill.util.NetWorkHelper;
import com.huami.view.basetitle.BaseTitleActivity;
import com.tencent.open.SocialConstants;
import de.greenrobot.event.EventBus;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\b018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102¨\u00066"}, d2 = {"Lcom/huami/treadmill/ui/record/RecordActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "t", SOAP.XMLNS, "u", "initRecyclerView", "Lcom/huami/treadmill/data/TdTrackrecord;", "tdRecord", "", "dis", "C", "msg", "F", "", "colorRes", "B", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/huami/treadmill/ui/record/RecordViewModel;", "x", "Lcom/huami/treadmill/ui/record/RecordViewModel;", "viewModel", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "y", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "deleteDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "z", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/treadmill/ui/record/TdRecordAdapter;", "Lcom/huami/treadmill/ui/record/TdRecordAdapter;", "tdLineAdapter", "", "Z", TdmillHmFragment.ARG_IS_OVERSEA, TdmillHmFragment.ARG_IS_METRIC, "Lcom/huami/treadmill/broadcast/NetworkReceiver;", LogUtil.D, "Lcom/huami/treadmill/broadcast/NetworkReceiver;", SocialConstants.PARAM_RECEIVER, "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "E", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "builder", "", "Ljava/util/List;", "uploadTrackRecords", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class RecordActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private TdRecordAdapter tdLineAdapter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isOversea;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private NetworkReceiver receiver;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment.Builder builder;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final List<TdTrackrecord> uploadTrackRecords = new ArrayList();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private RecordViewModel viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment deleteDialog;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            int i = 0;
            if (!NetWorkHelper.INSTANCE.getInstance().isOnline(RecordActivity.this)) {
                Toast toastMakeText = Toast.makeText(RecordActivity.this, "", 0);
                toastMakeText.setText(R.string.td_network_is_online);
                toastMakeText.show();
                return;
            }
            RecordActivity.this.uploadTrackRecords.clear();
            int childCount = ((RecyclerView) RecordActivity.this.findViewById(R.id.recycler_view)).getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i2 = i + 1;
                    View childAt = ((RecyclerView) RecordActivity.this.findViewById(R.id.recycler_view)).getChildAt(i);
                    if (((CheckBox) childAt.findViewById(R.id.td_checkbox)).isChecked() && (childAt.getTag() instanceof TdTrackrecord)) {
                        List list = RecordActivity.this.uploadTrackRecords;
                        Object tag = childAt.getTag();
                        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.treadmill.data.TdTrackrecord");
                        list.add((TdTrackrecord) tag);
                    }
                    if (i2 >= childCount) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            if (!RecordActivity.this.uploadTrackRecords.isEmpty()) {
                RecordActivity recordActivity = RecordActivity.this;
                recordActivity.F(recordActivity.getString(R.string.td_uploading));
                RecordViewModel recordViewModel = RecordActivity.this.viewModel;
                Objects.requireNonNull(recordViewModel);
                List list2 = RecordActivity.this.uploadTrackRecords;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((TdTrackrecord) it2.next()).getTrackrecord());
                }
                recordViewModel.uploadBoltRecord(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
            }
        }
    }

    private final void A() {
        IntentFilter intentFilter = new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        NetworkReceiver networkReceiver = new NetworkReceiver();
        this.receiver = networkReceiver;
        registerReceiver(networkReceiver, intentFilter);
    }

    private final void B(@ColorRes int colorRes) {
        setBaseTitleColor(ContextCompat.getColor(this, 17170444), ContextCompat.getColor(this, 17170444), ContextCompat.getColor(this, colorRes));
    }

    private final void C(final TdTrackrecord tdRecord, String dis) {
        AlertDialogFragment alertDialogFragment;
        AlertDialogFragment.Builder message;
        AlertDialogFragment.Builder negativeButton;
        boolean z = false;
        if (this.deleteDialog == null) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
            this.builder = builder;
            AlertDialogFragment.Builder cancelable = builder.setCancelable(true);
            AlertDialogFragment alertDialogFragmentCreate = null;
            if (cancelable != null && (message = cancelable.setMessage(getString(R.string.td_delete_record_title, new Object[]{dis}))) != null && (negativeButton = message.setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: k96
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RecordActivity.D(dialogInterface, i);
                }
            })) != null) {
                alertDialogFragmentCreate = negativeButton.create();
            }
            this.deleteDialog = alertDialogFragmentCreate;
        }
        AlertDialogFragment.Builder builder2 = this.builder;
        if (builder2 != null) {
            builder2.setMessage(getString(R.string.td_delete_record_title, new Object[]{dis}));
            builder2.setPositiveButton(getString(R.string.td_delete), new DialogInterface.OnClickListener() { // from class: j96
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    RecordActivity.E(tdRecord, this, dialogInterface, i);
                }
            });
        }
        AlertDialogFragment alertDialogFragment2 = this.deleteDialog;
        if (alertDialogFragment2 != null && !alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (!z || (alertDialogFragment = this.deleteDialog) == null) {
            return;
        }
        alertDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(TdTrackrecord tdTrackrecord, RecordActivity recordActivity, DialogInterface dialogInterface, int i) {
        ProxyBoltTrackRecord.INSTANCE.getInstance().deleteBoltTrackRecord(tdTrackrecord.getTrackrecord().getTrackid().longValue(), tdTrackrecord.getTrackrecord().getSource().intValue());
        dialogInterface.dismiss();
        TdRecordAdapter tdRecordAdapter = recordActivity.tdLineAdapter;
        Objects.requireNonNull(tdRecordAdapter);
        tdRecordAdapter.removeDeleteData(tdTrackrecord);
        EventBus.getDefault().post(new StatisticsRefreshEvent(StatisticsRefreshEvent.SECTION_NUM_REFRESH));
        Toast toastMakeText = Toast.makeText(recordActivity, "", 0);
        toastMakeText.setText(R.string.td_delete_success);
        toastMakeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = this.mLoadingDialog;
        if (loadingDialog2 == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this);
        } else if (loadingDialog2 != null) {
            loadingDialog2.show();
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 != null) {
            loadingDialog3.setCancelable(false);
        }
        if (TextUtils.isEmpty(msg) || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.setMessage(msg);
    }

    private final void initRecyclerView() {
        RecordViewModel recordViewModel = this.viewModel;
        Objects.requireNonNull(recordViewModel);
        TdRecordAdapter tdRecordAdapter = new TdRecordAdapter(recordViewModel);
        this.tdLineAdapter = tdRecordAdapter;
        Objects.requireNonNull(tdRecordAdapter);
        tdRecordAdapter.setMetric(this.isMetric);
        int i = R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) findViewById(i);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(i);
        TdRecordAdapter tdRecordAdapter2 = this.tdLineAdapter;
        Objects.requireNonNull(tdRecordAdapter2);
        recyclerView2.setAdapter(tdRecordAdapter2);
        ((RecyclerView) findViewById(i)).setNestedScrollingEnabled(false);
        ((RecyclerView) findViewById(i)).addItemDecoration(new RecyclerItemDecoration(this, 0, DensityUtils.INSTANCE.dip2px(this, 1.0f), ContextCompat.getColor(this, R.color.cl_fbfbfb)));
        TdRecordAdapter tdRecordAdapter3 = this.tdLineAdapter;
        Objects.requireNonNull(tdRecordAdapter3);
        tdRecordAdapter3.onLongClickItem(new View.OnLongClickListener() { // from class: m96
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return RecordActivity.y(this.a, view);
            }
        });
        TdRecordAdapter tdRecordAdapter4 = this.tdLineAdapter;
        Objects.requireNonNull(tdRecordAdapter4);
        tdRecordAdapter4.onClickItemListener(new View.OnClickListener() { // from class: l96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordActivity.z(this.a, view);
            }
        });
        RecordViewModel recordViewModel2 = this.viewModel;
        Objects.requireNonNull(recordViewModel2);
        recordViewModel2.m3408getRecords();
    }

    private final void s() {
        ViewExtKt.smartClick$default(getRightTitle(), 0L, new a(), 1, null);
    }

    private final void t() {
        Intent intent = getIntent();
        this.isOversea = intent.getBooleanExtra(TdmillHmFragment.ARG_IS_OVERSEA, false);
        this.isMetric = intent.getBooleanExtra(TdmillHmFragment.ARG_IS_METRIC, false);
    }

    private final void u() {
        RecordViewModel recordViewModel = this.viewModel;
        Objects.requireNonNull(recordViewModel);
        recordViewModel.getRecords().observe(this, new Observer() { // from class: p96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecordActivity.v(this.a, (List) obj);
            }
        });
        RecordViewModel recordViewModel2 = this.viewModel;
        Objects.requireNonNull(recordViewModel2);
        recordViewModel2.getUploadStatus().observe(this, new Observer() { // from class: n96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecordActivity.w(this.a, (Boolean) obj);
            }
        });
        RecordViewModel recordViewModel3 = this.viewModel;
        Objects.requireNonNull(recordViewModel3);
        recordViewModel3.getSelectNum().observe(this, new Observer() { // from class: o96
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RecordActivity.x(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(RecordActivity recordActivity, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator<T>() { // from class: com.huami.treadmill.ui.record.RecordActivity$initObserve$lambda-2$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(((TdTrackrecord) t2).getTrackrecord().getTrackid(), ((TdTrackrecord) t).getTrackrecord().getTrackid());
                }
            });
        }
        TdRecordAdapter tdRecordAdapter = recordActivity.tdLineAdapter;
        Objects.requireNonNull(tdRecordAdapter);
        tdRecordAdapter.setData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(RecordActivity recordActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        LoadingDialog loadingDialog = recordActivity.mLoadingDialog;
        if (loadingDialog != null) {
            loadingDialog.hide();
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            Toast toastMakeText = Toast.makeText(recordActivity, "", 0);
            toastMakeText.setText(R.string.td_upload_fail);
            toastMakeText.show();
            RecordViewModel recordViewModel = recordActivity.viewModel;
            Objects.requireNonNull(recordViewModel);
            recordViewModel.m3408getRecords();
            return;
        }
        TdRecordAdapter tdRecordAdapter = recordActivity.tdLineAdapter;
        Objects.requireNonNull(tdRecordAdapter);
        tdRecordAdapter.removeUploadedData(recordActivity.uploadTrackRecords);
        RecordViewModel recordViewModel2 = recordActivity.viewModel;
        Objects.requireNonNull(recordViewModel2);
        recordViewModel2.setSelectNum(0);
        EventBus.getDefault().post(new StatisticsRefreshEvent(StatisticsRefreshEvent.SECTION_TREADMILL_RECORD_INFO));
        Toast toastMakeText2 = Toast.makeText(recordActivity, "", 0);
        toastMakeText2.setText(R.string.td_upload_success);
        toastMakeText2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(RecordActivity recordActivity, Integer num) {
        if (num.intValue() > 0) {
            recordActivity.getRightTitle().setClickable(true);
            recordActivity.B(R.color.cl_ff5353);
        } else {
            recordActivity.getRightTitle().setClickable(false);
            recordActivity.B(R.color.cl_b2b2b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(RecordActivity recordActivity, View view) {
        if (!(view.getTag() instanceof TdTrackrecord)) {
            return false;
        }
        String string = ((TextView) view.findViewById(R.id.td_run_dis)).getText().toString();
        Object tag = view.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.treadmill.data.TdTrackrecord");
        recordActivity.C((TdTrackrecord) tag, string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(RecordActivity recordActivity, View view) {
        Object tag = view.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.treadmill.data.TdTrackrecord");
        TdTrackrecord tdTrackrecord = (TdTrackrecord) tag;
        ProxyBoltTrackRecord.INSTANCE.getInstance().gotoDetailSport(tdTrackrecord.getTrackrecord().getTrackid().longValue(), tdTrackrecord.getTrackrecord().getSource().intValue(), recordActivity);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseTitleActivity.STYLE style = BaseTitleActivity.STYLE.BACK_AND_TITLE_COMMIT;
        int i = R.color.s38;
        setStyle(style, ContextCompat.getColor(this, i), getString(R.string.td_uploading_title), true);
        setContentView(R.layout.activity_record);
        setRightTitle(getString(R.string.td_upload));
        getRightTitle().setTextSize(15.0f);
        int i2 = R.color.s1;
        setBaseTitleColor(ContextCompat.getColor(this, i2), ContextCompat.getColor(this, i2), ContextCompat.getColor(this, R.color.cl_ff5353));
        setLeftImageRes(R.drawable.ic_arrow_back_20_2x, i2);
        setTitleBarBackgroundColor(ContextCompat.getColor(this, i));
        getRightTitle().setBackgroundResource(R.drawable.transparent_shape);
        this.viewModel = (RecordViewModel) AppCompatActivityExtKt.obtainViewModel(this, RecordViewModel.class);
        t();
        u();
        initRecyclerView();
        s();
        A();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        super.onDestroy();
        NetworkReceiver networkReceiver = this.receiver;
        if (networkReceiver != null) {
            unregisterReceiver(networkReceiver);
        }
    }
}
