package com.huami.moving.ui.sport.detail.segment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportDetailSegmentParser;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.moving.R;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.adapter.STItemAdapter;
import com.huami.moving.ui.event.EventSegmentSave;
import com.huami.moving.ui.event.SegmentCancelEditEvent;
import com.huami.moving.ui.event.SegmentEditItemSaveEvent;
import com.huami.moving.ui.event.SegmentEditSaveEvent;
import com.huami.moving.ui.sport.detail.segment.SportDetailSegmentEditActivity;
import com.huami.moving.ui.sport.detail.segment.dialog.SportDetailSegmentManager;
import com.huami.moving.ui.sport.detail.segment.dialog.StrengthTrainEditResult;
import com.huami.moving.ui.sport.detail.segment.search.STActionSearchActivity;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.moving.utils.StrengthStatisticUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001NB\u0007¢\u0006\u0004\bL\u0010MJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u00020\u0004H\u0014R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010)R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010=R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010C\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0016\u0010E\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u00103R$\u0010K\u001a\u0010\u0012\f\u0012\n H*\u0004\u0018\u00010G0G0F8\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentEditActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/moving/ui/adapter/STItemAdapter$DeleteListener;", "Lcom/huami/moving/ui/adapter/STItemAdapter$NameClickListener;", "", "initTitle", z.j, hl.k, "initView", "initData", "showLoadingDialog", "hideProgressDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/huami/moving/ui/event/EventSegmentSave;", "saveEvent", "onEventMainThread", "doDelete", "", "position", "doNameClick", "Lcom/huami/moving/ui/event/SegmentEditItemSaveEvent;", "segmentEditItemSaveEvent", "Lcom/huami/moving/ui/event/SegmentCancelEditEvent;", "cancelEditEvent", "onDestroy", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "a", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "", "b", "Z", TdmillHmFragment.ARG_IS_METRIC, "", "c", "J", "trackId", GoogleApiAvailabilityLight.a, LogUtil.I, "deviceSource", "e", "sportType", "Landroidx/recyclerview/widget/RecyclerView;", "f", "Landroidx/recyclerview/widget/RecyclerView;", "rvStrengthTraining", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "tvEditAdd", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "h", "Lcom/huami/mifit/sportlib/model/ParsedSportDetailData;", "trackData", "i", "mSegmentType", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "Ljava/util/List;", "mSegmentDataList", "Lcom/huami/moving/ui/adapter/STItemAdapter;", "Lcom/huami/moving/ui/adapter/STItemAdapter;", "mSTItemAdapter", "l", "intentPosition", "m", "tvTitleName", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.b, "Landroidx/activity/result/ActivityResultLauncher;", "requestDataLauncher", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailSegmentEditActivity extends AppCompatActivity implements STItemAdapter.DeleteListener, STItemAdapter.NameClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String o = SportDetailSegmentEditActivity.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private RecyclerView rvStrengthTraining;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TextView tvEditAdd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ParsedSportDetailData trackData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mSegmentType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private List<SportSegmentData> mSegmentDataList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private STItemAdapter mSTItemAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int intentPosition;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private TextView tvTitleName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long trackId = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int deviceSource = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int sportType = 1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SuppressLint({"NotifyDataSetChanged"})
    @NotNull
    private final ActivityResultLauncher<Intent> requestDataLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: r97
        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            SportDetailSegmentEditActivity.l(this.a, (ActivityResult) obj);
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/moving/ui/sport/detail/segment/SportDetailSegmentEditActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trackId", "", "sportType", "source", "segmentType", "", "startMe", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, long trackId, int sportType, int source, int segmentType) {
            Intent intent = new Intent(context, (Class<?>) SportDetailSegmentEditActivity.class);
            intent.putExtra("trackId", trackId);
            intent.putExtra("sportType", sportType);
            intent.putExtra("deviceSource", source);
            intent.putExtra("segment_type", segmentType);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SportDetailSegmentEditActivity sportDetailSegmentEditActivity, View view) {
        STItemAdapter sTItemAdapter = sportDetailSegmentEditActivity.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter);
        if (sTItemAdapter.getCurrentList().size() >= 100) {
            IconToast.showError(sportDetailSegmentEditActivity, sportDetailSegmentEditActivity.getString(R.string.segment_action_add_limit_exceeded));
            return;
        }
        STItemAdapter sTItemAdapter2 = sportDetailSegmentEditActivity.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter2);
        sTItemAdapter2.addItem();
        STItemAdapter sTItemAdapter3 = sportDetailSegmentEditActivity.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter3);
        sportDetailSegmentEditActivity.mSegmentDataList = sTItemAdapter3.getCurrentList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SportDetailSegmentEditActivity sportDetailSegmentEditActivity, View view) {
        sportDetailSegmentEditActivity.j();
    }

    private final void hideProgressDialog() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null || loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SportDetailSegmentEditActivity sportDetailSegmentEditActivity, View view, int i) {
        sportDetailSegmentEditActivity.showLoadingDialog();
        Trackrecord trackRecordById = TrackRecordManager.getInstance().getTrackRecordById(sportDetailSegmentEditActivity.trackId, sportDetailSegmentEditActivity.deviceSource);
        Trackdata trackData = TrackRecordManager.getInstance().getTrackData(sportDetailSegmentEditActivity.trackId, sportDetailSegmentEditActivity.deviceSource);
        if (trackData == null || trackRecordById == null) {
            sportDetailSegmentEditActivity.finish();
            return;
        }
        SportDetailSegmentManager.getInstance().renewLap(sportDetailSegmentEditActivity.mSegmentDataList, trackData);
        trackRecordById.setStrengthTrainingGroup(StrengthStatisticUtil.INSTANCE.formatSegment2JsonString(sportDetailSegmentEditActivity.mSegmentDataList));
        SportDetailSegmentManager.getInstance().postDetailDataSync(trackData, trackRecordById, true);
    }

    private final void initData() {
        if (!SportDeviceUtils.isSupportSTUpgradeCategory(this.deviceSource)) {
            TextView textView = this.tvTitleName;
            Objects.requireNonNull(textView);
            textView.setText(R.string.segment_number);
        }
        ParsedSportDetailData trackData = TrackDataManager.getInstance().getTrackData(this.trackId, this.deviceSource, this.sportType);
        this.trackData = trackData;
        if (trackData != null) {
            int i = this.mSegmentType;
            if (i == 0) {
                this.mSegmentDataList = trackData.getManualSegmentDataList();
            } else if (i == 5) {
                this.mSegmentDataList = trackData.getFuseSegmentDataList();
            } else if (i == 6) {
                this.mSegmentDataList = trackData.getTrainSegmentDataList();
            }
        }
        RecyclerView recyclerView = this.rvStrengthTraining;
        Objects.requireNonNull(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<SportSegmentData> list = this.mSegmentDataList;
        if (list != null) {
            this.mSTItemAdapter = new STItemAdapter(this, list, this.deviceSource);
        }
        STItemAdapter sTItemAdapter = this.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter);
        sTItemAdapter.setDeleteListener(this);
        STItemAdapter sTItemAdapter2 = this.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter2);
        sTItemAdapter2.setNameClickListener(this);
        RecyclerView recyclerView2 = this.rvStrengthTraining;
        Objects.requireNonNull(recyclerView2);
        STItemAdapter sTItemAdapter3 = this.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter3);
        recyclerView2.setAdapter(sTItemAdapter3);
        TextView textView2 = this.tvEditAdd;
        Objects.requireNonNull(textView2);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: q97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailSegmentEditActivity.g(this.a, view);
            }
        });
    }

    private final void initTitle() {
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.activity_edit_title_bar);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: p97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailSegmentEditActivity.h(this.a, view);
            }
        });
        rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: s97
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                SportDetailSegmentEditActivity.i(this.a, view, i);
            }
        });
    }

    private final void initView() {
        this.isMetric = RunnerData.getRunner().isMetric();
        this.trackId = getIntent().getLongExtra("trackId", -1L);
        this.deviceSource = getIntent().getIntExtra("deviceSource", DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue());
        this.sportType = getIntent().getIntExtra("sportType", 52);
        this.mSegmentType = getIntent().getIntExtra("segment_type", 0);
        this.rvStrengthTraining = (RecyclerView) findViewById(R.id.rv_strength_training);
        this.tvEditAdd = (TextView) findViewById(R.id.tv_edit_add);
        this.tvTitleName = (TextView) findViewById(R.id.tv_name);
    }

    private final void j() {
        EventBus.getDefault().post(new SegmentCancelEditEvent());
        finish();
    }

    private final void k() {
        EventBus.getDefault().post(new SegmentEditSaveEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SportDetailSegmentEditActivity sportDetailSegmentEditActivity, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Integer numValueOf = data == null ? null : Integer.valueOf(data.getIntExtra("actionType", 0));
            STItemAdapter sTItemAdapter = sportDetailSegmentEditActivity.mSTItemAdapter;
            Objects.requireNonNull(sTItemAdapter);
            List<SportSegmentData> currentList = sTItemAdapter.getCurrentList();
            sportDetailSegmentEditActivity.mSegmentDataList = currentList;
            currentList.get(sportDetailSegmentEditActivity.intentPosition).setStrengthTrainType(numValueOf.intValue());
            STItemAdapter sTItemAdapter2 = sportDetailSegmentEditActivity.mSTItemAdapter;
            Objects.requireNonNull(sTItemAdapter2);
            sTItemAdapter2.setModifyList(sportDetailSegmentEditActivity.mSegmentDataList);
            STItemAdapter sTItemAdapter3 = sportDetailSegmentEditActivity.mSTItemAdapter;
            Objects.requireNonNull(sTItemAdapter3);
            sTItemAdapter3.notifyDataSetChanged();
        }
    }

    private final void showLoadingDialog() {
        if (this.loadingDialog == null) {
            this.loadingDialog = LoadingDialog.showDialog(this);
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.setMessage(getString(R.string.running_end_save));
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setCancelable(false);
        }
        LoadingDialog loadingDialog3 = this.loadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.moving.ui.adapter.STItemAdapter.DeleteListener
    public void doDelete() {
        STItemAdapter sTItemAdapter = this.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter);
        this.mSegmentDataList = sTItemAdapter.getCurrentList();
    }

    @Override // com.huami.moving.ui.adapter.STItemAdapter.NameClickListener
    public void doNameClick(int position) {
        this.intentPosition = position;
        this.requestDataLauncher.launch(new Intent(this, (Class<?>) STActionSearchActivity.class));
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        j();
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_edit);
        initTitle();
        initView();
        initData();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventSegmentSave saveEvent) {
        if (saveEvent.isSaveSuccess()) {
            Toast.makeText(this, getString(R.string.sport_detail_save_toast), 0).show();
            finish();
        } else {
            Toast.makeText(this, getString(R.string.alarm_save_failed), 0).show();
        }
        hideProgressDialog();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void onEventMainThread(@NotNull SegmentEditItemSaveEvent segmentEditItemSaveEvent) {
        int modifyType = segmentEditItemSaveEvent.getModifyType();
        StrengthTrainEditResult editResult = segmentEditItemSaveEvent.getEditResult();
        if (editResult == null) {
            return;
        }
        int currentPosition = editResult.getCurrentPosition();
        int resultCount = editResult.getResultCount();
        int resultWeight = editResult.getResultWeight();
        int resultUnit = editResult.getResultUnit();
        STItemAdapter sTItemAdapter = this.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter);
        List<SportSegmentData> currentList = sTItemAdapter.getCurrentList();
        this.mSegmentDataList = currentList;
        if (currentList.size() >= currentPosition) {
            if (modifyType == 0) {
                this.mSegmentDataList.get(currentPosition).setCount(resultCount);
            } else {
                this.mSegmentDataList.get(currentPosition).setWeight(resultWeight);
                this.mSegmentDataList.get(currentPosition).setUnit(resultUnit);
            }
        }
        STItemAdapter sTItemAdapter2 = this.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter2);
        sTItemAdapter2.setModifyList(this.mSegmentDataList);
        STItemAdapter sTItemAdapter3 = this.mSTItemAdapter;
        Objects.requireNonNull(sTItemAdapter3);
        sTItemAdapter3.notifyDataSetChanged();
    }

    public final void onEventMainThread(@NotNull SegmentCancelEditEvent cancelEditEvent) {
        Trackdata trackData = TrackRecordManager.getInstance().getTrackData(this.trackId, this.deviceSource);
        if (this.trackData != null) {
            String lap = trackData.getLap();
            if (lap == null || lap.length() == 0) {
                return;
            }
            List<List<SportSegmentData>> listInitSegmentData = SportDetailSegmentParser.INSTANCE.initSegmentData(trackData.getLap());
            int i = this.mSegmentType;
            if (i == 0) {
                this.trackData.setManualSegmentDataList(listInitSegmentData.get(1));
            } else if (i == 5) {
                this.trackData.setFuseSegmentDataList(listInitSegmentData.get(5));
            } else {
                if (i != 6) {
                    return;
                }
                this.trackData.setTrainSegmentDataList(listInitSegmentData.get(6));
            }
        }
    }
}
