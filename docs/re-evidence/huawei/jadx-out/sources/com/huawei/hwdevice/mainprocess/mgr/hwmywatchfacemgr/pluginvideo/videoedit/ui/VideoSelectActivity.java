package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.VideoChoosePicUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.VideoEditActivity;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.adapter.VideoSelectAdapter;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.LayoutHelper;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.MediaBean;
import com.huawei.hwdevicemgr.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.callback.ViewOnClickListener;
import defpackage.qrs;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes38.dex */
public class VideoSelectActivity extends BaseActivity implements MediaQueryHelper.GetMediaInfoListener, VideoSelectAdapter.OnItemClickListener, View.OnClickListener {
    private static final String TAG = "VideoSelectActivity";
    private static final String TAG_RELEASE = "DEVMGR_VideoSelectActivity";
    private ActivityResultLauncher<Intent> mActivityResultLauncherCamera;
    private ImageView mCancelSelect;
    private TextView mGoTakeVideoView;
    private LinearLayout mNoResView;
    private RecyclerView mRecyclerView;
    private List<MediaBean> mVideoInfoList;
    private MediaQueryHelper mVideoQueryHelper;
    private VideoSelectAdapter mVideoSelectAdapter;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Environment.setApplication(getApplication());
        LayoutHelper.init(getApplication());
        setContentView(R.layout.watchface_activity_video_select_layout);
        initView();
        initTitle();
        initData();
        initEvent();
        registerActivityResultCamera();
    }

    private void initTitle() {
        ViewGroup.LayoutParams layoutParams = findViewById(R.id.layout_action_bar).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, qrs.s(this), 0, 0);
        }
    }

    private void initView() {
        this.mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.mNoResView = (LinearLayout) findViewById(R.id.no_res_parent);
        this.mCancelSelect = (ImageView) findViewById(R.id.cancel_select);
    }

    private void initData() {
        this.mVideoQueryHelper = new MediaQueryHelper(this);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        this.mVideoInfoList = new ArrayList();
        VideoSelectAdapter videoSelectAdapter = new VideoSelectAdapter(this, this.mVideoInfoList);
        this.mVideoSelectAdapter = videoSelectAdapter;
        this.mRecyclerView.setAdapter(videoSelectAdapter);
        this.mVideoQueryHelper.getAllVideoInfo("video/mp4", this);
    }

    private void initEvent() {
        this.mCancelSelect.setOnClickListener(this);
        this.mVideoSelectAdapter.setOnItemClickListener(this);
    }

    private void changePageVisibility(boolean z) {
        if (z) {
            this.mNoResView.setVisibility(0);
            this.mRecyclerView.setVisibility(8);
        } else {
            this.mNoResView.setVisibility(8);
            this.mRecyclerView.setVisibility(0);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper.GetMediaInfoListener
    public void onResult(List<MediaBean> list) {
        if (ArrayUtils.isEmpty(list)) {
            LogUtil.b(TAG, "onResult  videoInfoList is empty");
            changePageVisibility(true);
            if (this.mGoTakeVideoView == null) {
                TextView textView = (TextView) this.mNoResView.findViewById(R.id.text_view_goto_video);
                this.mGoTakeVideoView = textView;
                textView.setOnClickListener(this);
                return;
            }
            return;
        }
        changePageVisibility(false);
        this.mVideoInfoList = list;
        this.mVideoSelectAdapter.setData(list);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.adapter.VideoSelectAdapter.OnItemClickListener
    public void onItemClick(MediaBean mediaBean) {
        if (mediaBean == null) {
            LogUtil.d(TAG, "onItemClick mediaBean is null");
        } else if (ViewOnClickListener.isSeriesClick()) {
            LogUtil.b(TAG, "onItemClick isSeriesClick ");
        } else {
            VideoEditActivity.startVideoEditActivity(this, mediaBean.getPath());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.text_view_goto_video) {
            if (PermissionUtil.b(BaseApplication.getContext(), PermissionUtil.c(PermissionUtil.PermissionType.CAMERA_IMAGE))) {
                VideoChoosePicUtil.goCamera(this, this.mActivityResultLauncherCamera);
                return;
            } else {
                checkPermission();
                return;
            }
        }
        if (view.getId() == R.id.cancel_select) {
            finish();
        }
    }

    private void checkPermission() {
        PermissionUtil.d(this, PermissionUtil.PermissionType.CAMERA_IMAGE, new CustomPermissionAction(this) { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.VideoSelectActivity.1
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.b(VideoSelectActivity.TAG, "onClick storage permission onGranted");
                VideoSelectActivity videoSelectActivity = VideoSelectActivity.this;
                VideoChoosePicUtil.goCamera(videoSelectActivity, videoSelectActivity.mActivityResultLauncherCamera);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.b(VideoSelectActivity.TAG, "onClick storage permission onDenied");
                super.onDenied(str);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.b(VideoSelectActivity.TAG, "onClick storage permission onForeverDenied");
                qrs.b(VideoSelectActivity.this, permissionType);
            }
        });
    }

    private void registerActivityResultCamera() {
        LogUtil.b(TAG, "registerActivityResultCamera entry");
        this.mActivityResultLauncherCamera = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.VideoSelectActivity$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.f$0.m1454x44d4ed1f((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$registerActivityResultCamera$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-ui-VideoSelectActivity, reason: not valid java name */
    /* synthetic */ void m1454x44d4ed1f(ActivityResult activityResult) {
        if (activityResult == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "registerForActivityResult onActivityResult result is null");
            return;
        }
        int resultCode = activityResult.getResultCode();
        LogUtil.b(TAG, "registerActivityResultBt camera back, ResultCode is ", Integer.valueOf(resultCode));
        if (resultCode != -1) {
            return;
        }
        LogUtil.b(TAG, "registerActivityResultCamera camera back");
        String fileSavedPath = new VideoChoosePicUtil(Environment.getApplicationContext()).getFileSavedPath();
        if (!TextUtils.isEmpty(fileSavedPath) && fileSavedPath.length() > 0) {
            VideoEditActivity.startVideoEditActivity(this, fileSavedPath);
        } else {
            LogUtil.d(TAG, "registerActivityResultCamera video file path is empty");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        MediaQueryHelper mediaQueryHelper = this.mVideoQueryHelper;
        if (mediaQueryHelper != null) {
            mediaQueryHelper.onDestroy();
        }
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
