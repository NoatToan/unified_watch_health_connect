package com.xiaomi.hm.health.lab.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.activity.BehaviorsActivity;
import com.xiaomi.hm.health.lab.adapter.BehaviorsAdapter;
import com.xiaomi.hm.health.lab.adapter.RecycleViewItemDecoration;
import com.xiaomi.hm.health.lab.fragment.BehaviorGuidePopupFragment;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingDeviceTool;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.xiaomi.hm.health.lab.utils.LabKeeper;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import com.xiaomi.hm.health.lab.utils.TaggingFileUtils;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.LazyList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorsActivity extends BaseTitleActivity {
    private static final String B = "BehaviorsActivity";
    private static final int C = 3;
    public static String KEY_IS_GT3 = "GT3";
    private LoadingDialog A;
    private RecyclerView x;
    private LabAction y;
    private boolean z = false;

    public class a extends IHMSimpleHttpResponseHandler {
        public a() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody(), "utf-8"));
                    if (jSONObject.has(Property.PROPERTY_BEHAVIOR_TAGS_COUNT)) {
                        BehaviorTaggingTools.setSpfByJsonData(BehaviorsActivity.this, new JSONObject(jSONObject.getString(Property.PROPERTY_BEHAVIOR_TAGS_COUNT)));
                        BehaviorsActivity.this.J();
                    }
                } catch (UnsupportedEncodingException | JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean B(View view) {
        M();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(View view, BehaviorTagEnity behaviorTagEnity, int i) {
        behaviorTagEnity.setUserId(LabCallbackInit.getInitCallBack().getUserId());
        behaviorTagEnity.setVersionCode(HMAppConfig.getVersionCode());
        behaviorTagEnity.setProtocolVersion(1);
        behaviorTagEnity.setLabActionId(SystemClock.elapsedRealtime());
        Intent intent = new Intent();
        if (behaviorTagEnity.getBehaviorKey().equals(BehaviorTaggingTools.SWIM)) {
            intent.setClass(this, BehaviorTaggingSwimmingActivity.class);
            intent.putExtra(KEY_IS_GT3, this.z);
        } else {
            intent.setClass(this, PreBehaviorTaggingActivity.class);
            intent.putExtra(LabActionDao.TABLENAME, behaviorTagEnity);
            intent.putExtra("IS_CUSTOM", BehaviorTaggingTools.CUSTOMIZE.equals(behaviorTagEnity.getBehaviorKey()));
        }
        startActivity(intent);
        String behaviorKey = behaviorTagEnity.getBehaviorKey();
        if (TextUtils.isEmpty(behaviorKey)) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_HEHAVIORS_LAB_OPERATE).setValue(behaviorKey.substring(0, 1).toUpperCase() + behaviorKey.substring(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(View view) {
        BehaviorsAdapter behaviorsAdapter = new BehaviorsAdapter(this, x(), view.getHeight());
        this.x.setAdapter(behaviorsAdapter);
        behaviorsAdapter.setOnItemClickListener(new BehaviorsAdapter.OnItemClickListener() { // from class: zu
            @Override // com.xiaomi.hm.health.lab.adapter.BehaviorsAdapter.OnItemClickListener
            public final void onBehaviorItemClick(View view2, BehaviorTagEnity behaviorTagEnity, int i) {
                this.a.C(view2, behaviorTagEnity, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(DialogInterface dialogInterface, int i) {
        new BehaviorTaggingWebApi().behaviorTaggingDataUpload(this, this.y);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(EditText editText, DialogInterface dialogInterface, int i) {
        try {
            LabKeeper.saveTimeOffset(Integer.parseInt(editText.getText().toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H() {
        return "labs 文件后台上传";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I(File file) {
        return "labs 文件后台上传文件" + file.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_HEHAVIORS_VIEWNUM));
        final View viewFindViewById = findViewById(R.id.rcv_behaviors);
        if (viewFindViewById != null) {
            viewFindViewById.post(new Runnable() { // from class: av
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.D(viewFindViewById);
                }
            });
        }
    }

    private void K() {
        new BehaviorGuidePopupFragment().show(getSupportFragmentManager(), "Behavior-Guide");
    }

    private void L() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.last_tagging_crash).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: uu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.E(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void M() {
        final EditText editText = new EditText(this);
        editText.setInputType(4098);
        editText.setText(String.valueOf(LabKeeper.getTimeOffset()));
        new AlertDialog.Builder(this).setTitle(R.string.time_offset).setCancelable(false).setView(editText).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: tu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BehaviorsActivity.F(editText, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: vu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BehaviorsActivity.G(dialogInterface, i);
            }
        }).create().show();
    }

    private void N() {
        final File labPath;
        HMLog.info(B, new Function0() { // from class: cv
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BehaviorsActivity.H();
            }
        });
        if (NetUtil.isWifiConnected(this)) {
            LazyList<LabAction> lazyListListLazy = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.UploadStatus.notIn(3, 21, -2, -1), LabActionDao.Properties.UserId.eq(LabCallbackInit.getInitCallBack().getUserId())).listLazy();
            if (lazyListListLazy.size() > 0) {
                for (LabAction labAction : lazyListListLazy) {
                    if (!TextUtils.isEmpty(labAction.getZipFileName()) && (labPath = FileUtils.getLabPath(labAction.getZipFileName())) != null && labPath.exists()) {
                        HMLog.info(B, new Function0() { // from class: bv
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public final Object getA() {
                                return BehaviorsActivity.I(labPath);
                            }
                        });
                        new BehaviorTaggingWebApi().behaviorTaggingDataUpload(this, labAction);
                    }
                }
            }
        }
    }

    private void initTitle() {
        UIHelper.setUnifyTitleStyle(this, getString(R.string.action_mark), null);
        setRightTitle(getString(R.string.history));
        getRightTitle().setTextColor(ContextCompat.getColor(this, R.color.s1));
        getRightTitle().setBackground(null);
        getRightTitle().setOnClickListener(new View.OnClickListener() { // from class: xu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.z(view);
            }
        });
        if (LabCallbackInit.getInitCallBack().showHelpNote()) {
            getLeft2().setImageResource(R.drawable.ic_behavior_hint);
            getLeft2().setOnClickListener(new View.OnClickListener() { // from class: wu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.A(view);
                }
            });
        }
        if (LabCallbackInit.getInitCallBack().supportTagTimeOffset()) {
            getRightTitle().setOnLongClickListener(new View.OnLongClickListener() { // from class: yu
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.a.B(view);
                }
            });
        }
    }

    private void initView() {
        BehaviorTaggingTools.initActionNameMap();
        initTitle();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_behaviors);
        this.x = recyclerView;
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
            GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 3, 1, false);
            gridLayoutManager.setAutoMeasureEnabled(true);
            this.x.setLayoutManager(gridLayoutManager);
            this.x.addItemDecoration(new RecycleViewItemDecoration(this, R.drawable.divider_line_px1));
            this.x.setHasFixedSize(true);
            new BehaviorTaggingWebApi().getBehaviorCount(new a());
        }
    }

    private void showLoginDialog(int i) {
        if (this.A == null) {
            this.A = LoadingDialog.showDialog(this, getString(i));
        }
        this.A.setCancelable(false);
        this.A.setMessage(getString(i));
        this.A.show();
    }

    private void updateStatus(LabAction labAction, int i) {
        labAction.setUploadStatus(Integer.valueOf(i));
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().insertOrReplace(labAction);
    }

    private void w() throws Throwable {
        LazyList<LabAction> lazyListListLazy = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.UploadStatus.eq(-1), LabActionDao.Properties.UserId.eq(LabCallbackInit.getInitCallBack().getUserId())).listLazy();
        if (lazyListListLazy.size() > 0) {
            LabAction labAction = lazyListListLazy.get(0);
            this.y = labAction;
            File fileZipFileByLabAction = TaggingFileUtils.zipFileByLabAction(labAction);
            if (this.y == null || fileZipFileByLabAction == null || !fileZipFileByLabAction.exists()) {
                return;
            }
            this.y.setUploadStatus(0);
            TaggingFileUtils.updateLabAction(this.y);
            L();
        }
    }

    private List<BehaviorTagEnity> x() {
        ArrayList arrayList = new ArrayList(Arrays.asList(BehaviorTaggingTools.BEHAVIOR_TAG_ENITIES));
        if (LabCallbackInit.getInitCallBack().isSupportEarbudSleep()) {
            arrayList.add(arrayList.size() - 1, new BehaviorTagEnity(R.string.action_earbud_sleep, R.drawable.ic_sleep, R.drawable.ic_sleep_big, BehaviorTaggingTools.EARBUD_SLEEP, false, false));
        }
        if (BehaviorTaggingDeviceTool.isBehaviorTaggingShowSwimmingItem()) {
            arrayList.add(arrayList.size() - 1, new BehaviorTagEnity(R.string.action_swim, R.drawable.ic_swim, R.drawable.ic_swim_big, BehaviorTaggingTools.SWIM, false, false));
        }
        if (BehaviorTaggingDeviceTool.isBehaviorTaggingShowNmeaItem()) {
            arrayList.add(arrayList.size() - 1, new BehaviorTagEnity(R.string.action_nmea, R.drawable.ic_nmea, R.drawable.ic_nmea_big, BehaviorTaggingTools.NMEA, false, false));
        }
        if (BehaviorTaggingDeviceTool.isBehaviorTaggingShowTemperatureItem()) {
            arrayList.add(arrayList.size() - 1, new BehaviorTagEnity(R.string.action_temperature, R.drawable.ic_temperature, R.drawable.ic_temperature_big, "temperature", false, false));
        }
        if (BehaviorTaggingDeviceTool.isBehaviorSupportHeadsetSleep()) {
            arrayList.add(arrayList.size() - 1, new BehaviorTagEnity(R.string.action_headset_sleep, R.drawable.ic_sleep, R.drawable.ic_sleep_big, BehaviorTaggingTools.HEADSET_SLEEP, false, false));
        }
        for (int i = 0; i < arrayList.size() % 3; i++) {
            arrayList.add(arrayList.size(), null);
        }
        return arrayList;
    }

    private void y() {
        if (LabKeeper.getGuideRollOut() || !LabCallbackInit.getInitCallBack().showHelpNote()) {
            return;
        }
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(View view) {
        Intent intent = new Intent();
        intent.setClass(this, BehaviorTagsHistoryActivity.class);
        startActivity(intent);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_HEHAVIORS_LAB_OPERATE).setValue("History"));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_behaviors);
        this.z = getIntent().getBooleanExtra(KEY_IS_GT3, false);
        EventBus.getDefault().register(this);
        initView();
        w();
        N();
        y();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEventMainThread(LabAction labAction) {
        Integer uploadStatus = labAction.getUploadStatus();
        boolean z = false;
        if (this.y != null && labAction.getLabActionId().longValue() == this.y.getLabActionId().longValue()) {
            z = true;
        }
        int iIntValue = uploadStatus.intValue();
        if (iIntValue == 1) {
            if (z) {
                showLoginDialog(R.string.lab_uploading);
                return;
            }
            return;
        }
        if (iIntValue == 2) {
            updateStatus(labAction, 2);
            if (z) {
                this.A.setFailed(getString(R.string.lab_upload_fail));
                return;
            }
            return;
        }
        if (iIntValue == 3) {
            updateStatus(labAction, 3);
            if (z) {
                this.A.setSuccess(getString(R.string.lab_upload_success));
                return;
            }
            return;
        }
        if (iIntValue == 5) {
            if (z) {
                this.A.setFailed(getString(R.string.lab_upload_fail));
            }
        } else {
            if (iIntValue != 21) {
                return;
            }
            updateStatus(labAction, 21);
            if (z) {
                this.A.setFailed(getString(R.string.lab_upload_fail));
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        J();
        super.onResume();
    }
}
