package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicListBean;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.MusicUtils;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import defpackage.eui;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.xc6;
import defpackage.yh6;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00017B\u0007¢\u0006\u0004\b6\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u0006J)\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\u0006R\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListViewModel;", "Lyh6;", "", "showOrHidenEmpty", "()V", "gotoAccessPermission", "loadMusicList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicListBean;", "it", "handlerDataList", "(Ljava/util/List;)V", "", "isShow", "showOrHidenEndView", "(Z)V", "realPush", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Lyh6;)V", "loadData", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onSaveBtnClick", "onVisible", "supportType", "I", "pageType", "Landroid/widget/TextView;", "selectNameView", "Landroid/widget/TextView;", "selectDescView", "selectCheckView", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListAdapter;", "musicListAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListAdapter;", "dataList", "Ljava/util/List;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMusicListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1863#2,2:289\n774#2:291\n865#2,2:292\n774#2:294\n865#2,2:295\n1863#2,2:297\n*S KotlinDebug\n*F\n+ 1 MusicListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListFragment\n*L\n269#1:289,2\n284#1:291\n284#1:292,2\n120#1:294\n120#1:295,2\n133#1:297,2\n*E\n"})
public final class MusicListFragment extends BaseBindingFragment<MusicListViewModel, yh6> {
    private static final int sKeySearch = 100;

    @NotNull
    public static final String sPageType = "sType";
    public static final int sRequestCodeSubList = 100;
    private static final int sRequestReadPermission = 200;

    @NotNull
    public static final String sSupportMusicType = "sSupportMusicType";
    public static final int sTypeAlbum = 2;
    public static final int sTypeAll = 0;
    public static final int sTypeArtist = 1;

    @NotNull
    private List<MusicListBean> dataList = new ArrayList();

    @NotNull
    private final Handler mHandler = new MusicListFragment$mHandler$1(this, Looper.getMainLooper());
    private MusicListAdapter musicListAdapter;
    private int pageType;
    private TextView selectCheckView;
    private TextView selectDescView;
    private TextView selectNameView;
    private int supportType;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MusicListViewModel access$getMViewModel(MusicListFragment musicListFragment) {
        return (MusicListViewModel) musicListFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(MusicListFragment this$0, boolean z, MusicListBean bean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "bean");
        if (z) {
            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) MusicSubListActivity.class);
            intent.putExtra(MusicSubListActivity.sTitle, bean.getName());
            intent.putExtra(MusicSubListActivity.sList, bean.getMusicList());
            this$0.startActivityForResult(intent, 100);
        } else {
            List<MusicListBean> list = this$0.dataList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MusicListBean) obj).getIsSelect()) {
                    arrayList.add(obj);
                }
            }
            TextView textView = this$0.selectCheckView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectCheckView");
                textView = null;
            }
            textView.setSelected(arrayList.size() == this$0.dataList.size());
            this$0.showOrHidenEndView(!arrayList.isEmpty());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(MusicListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.selectCheckView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectCheckView");
            textView = null;
        }
        TextView textView3 = this$0.selectCheckView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectCheckView");
            textView3 = null;
        }
        textView.setSelected(!textView3.isSelected());
        for (MusicListBean musicListBean : this$0.dataList) {
            TextView textView4 = this$0.selectCheckView;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectCheckView");
                textView4 = null;
            }
            musicListBean.setSelect(textView4.isSelected());
        }
        MusicListAdapter musicListAdapter = this$0.musicListAdapter;
        if (musicListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicListAdapter");
            musicListAdapter = null;
        }
        musicListAdapter.notifyDataSetChanged();
        TextView textView5 = this$0.selectCheckView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectCheckView");
        } else {
            textView2 = textView5;
        }
        this$0.showOrHidenEndView(textView2.isSelected());
    }

    private final void gotoAccessPermission() {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.parse("package:" + requireActivity().getPackageName()));
        startActivityForResult(intent, 200);
    }

    private final void handlerDataList(List<MusicListBean> it) {
        this.dataList.clear();
        this.dataList.addAll(it);
        MusicListAdapter musicListAdapter = this.musicListAdapter;
        TextView textView = null;
        if (musicListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicListAdapter");
            musicListAdapter = null;
        }
        musicListAdapter.notifyDataSetChanged();
        if (this.dataList.isEmpty()) {
            getMBinding().H.setText(getString(wzi.p6, MusicUtils.INSTANCE.parseType(this.supportType, false)));
            getMBinding().C.setVisibility(0);
            getMBinding().A.setVisibility(8);
        } else {
            TextView textView2 = this.selectDescView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectDescView");
            } else {
                textView = textView2;
            }
            textView.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.o, this.dataList.size(), Integer.valueOf(this.dataList.size())));
            getMBinding().C.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$8(final MusicListFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: ibg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicListFragment.loadData$lambda$8$lambda$5(this.f20971a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: jbg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicListFragment.loadData$lambda$8$lambda$7(this.f22618a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$8$lambda$5(MusicListFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.loadMusicList();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$8$lambda$7(final MusicListFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, fragmentActivityRequireActivity, null, null, null, new Function0() { // from class: kbg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicListFragment.loadData$lambda$8$lambda$7$lambda$6(this.f23684a);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$8$lambda$7$lambda$6(MusicListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PermissionsUtil.showSettingDialog$default(permissionsUtil, fragmentActivityRequireActivity, "android.permission.READ_EXTERNAL_STORAGE", true, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadMusicList() {
        showLoading();
        MusicListViewModel musicListViewModel = (MusicListViewModel) getMViewModel();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        musicListViewModel.loadMusicList(fragmentActivityRequireActivity, this.pageType, this.supportType, new Function1() { // from class: obg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicListFragment.loadMusicList$lambda$9(this.f28970a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMusicList$lambda$9(MusicListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialogForce();
        this$0.handlerDataList(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$12(MusicListFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoAccessPermission();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$13(MusicListFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSaveBtnClick$lambda$14(MusicListFragment this$0, DialogInterface dialogInterface) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        DeviceSettingsPreference.INSTANCE.setHasShowPushMusicDialog(true);
        this$0.realPush();
        return Unit.INSTANCE;
    }

    private final void realPush() throws RemoteException {
        ArrayList<MusicBean> arrayList = new ArrayList<>();
        for (MusicListBean musicListBean : this.dataList) {
            if (musicListBean.getIsSelect()) {
                arrayList.addAll(musicListBean.getMusicList());
            }
        }
        xc6.b("onSaveBtnClick startPush " + arrayList.size());
        MusicPushServiceContact.INSTANCE.startPush(arrayList);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
            mActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOrHidenEmpty() {
        if (this.dataList.isEmpty()) {
            getMBinding().C.setVisibility(0);
            getMBinding().E.setVisibility(8);
            getMBinding().getRoot().findViewById(zqi.Q7).setVisibility(8);
            getMBinding().B.setVisibility(8);
            return;
        }
        TextView textView = this.selectDescView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectDescView");
            textView = null;
        }
        textView.setText(getResources().getQuantityString(qyi.o, this.dataList.size(), Integer.valueOf(this.dataList.size())));
        getMBinding().E.setVisibility(0);
        getMBinding().getRoot().findViewById(zqi.Q7).setVisibility(0);
        getMBinding().B.setVisibility(0);
        getMBinding().C.setVisibility(8);
    }

    private final void showOrHidenEndView(boolean isShow) {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ((MusicPushActivity) mActivity).showOrHidenEndView(isShow);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull yh6 yh6Var) {
        Intrinsics.checkNotNullParameter(yh6Var, "<this>");
        setActionBarDisplayable(false);
        yh6Var.E.setLayoutManager(new LinearLayoutManager(requireActivity()));
        this.dataList.clear();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        MusicListAdapter musicListAdapter = new MusicListAdapter(fragmentActivityRequireActivity, this.dataList, new Function2() { // from class: lbg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MusicListFragment.bindView$lambda$2(this.f24861a, ((Boolean) obj).booleanValue(), (MusicListBean) obj2);
            }
        });
        this.musicListAdapter = musicListAdapter;
        yh6Var.E.setAdapter(musicListAdapter);
        this.selectNameView = (TextView) getRootView().findViewById(zqi.C5);
        this.selectDescView = (TextView) getRootView().findViewById(zqi.d1);
        TextView textView = (TextView) getRootView().findViewById(zqi.v0);
        this.selectCheckView = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectCheckView");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: mbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicListFragment.bindView$lambda$4(this.f25974a, view);
            }
        });
        yh6Var.F.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListFragment.bindView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                MusicListFragment.this.mHandler.removeMessages(100);
                Message messageObtainMessage = MusicListFragment.this.mHandler.obtainMessage(100, String.valueOf(s));
                Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                MusicListFragment.this.mHandler.sendMessageDelayed(messageObtainMessage, 300L);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }
        });
        if (this.pageType == 0) {
            yh6Var.A.setVisibility(0);
        } else {
            yh6Var.A.setVisibility(8);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.s0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        PermissionExtKt.permission$default(this, Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE", (String) null, new Function1() { // from class: pbg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicListFragment.loadData$lambda$8(this.f30203a, (PermissionBuilder) obj);
            }
        }, 2, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        FragmentActivity mActivity;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            if (resultCode != -1 || (mActivity = getMActivity()) == null) {
                return;
            }
            mActivity.setResult(-1);
            mActivity.finish();
            return;
        }
        if (requestCode == 200 && Build.VERSION.SDK_INT >= 30) {
            if (Environment.isExternalStorageManager()) {
                loadMusicList();
                return;
            }
            String string = getString(wzi.mf);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int i = wzi.common_allow;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            UtilsKt.showMsgDialog(null, string, i, parentFragmentManager, wzi.common_cancel, new Function1() { // from class: gbg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicListFragment.onActivityResult$lambda$12(this.f18806a, (DialogInterface) obj);
                }
            }, new Function1() { // from class: hbg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicListFragment.onActivityResult$lambda$13(this.f19906a, (DialogInterface) obj);
                }
            });
        }
    }

    public final void onSaveBtnClick() {
        if (DeviceSettingsPreference.INSTANCE.getHasShowPushMusicDialog()) {
            realPush();
            return;
        }
        String string = getString(wzi.A5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i = wzi.common_known;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog$default(null, string, i, parentFragmentManager, 0, new Function1() { // from class: nbg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicListFragment.onSaveBtnClick$lambda$14(this.f27753a, (DialogInterface) obj);
            }
        }, null, 80, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        boolean z;
        super.onVisible();
        List<MusicListBean> list = this.dataList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MusicListBean) obj).getIsSelect()) {
                arrayList.add(obj);
            }
        }
        if (this.pageType == 0) {
            z = arrayList.isEmpty() ^ true;
        }
        showOrHidenEndView(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.supportType = args.getInt(sSupportMusicType, 1);
            this.pageType = args.getInt("sType", 0);
        }
    }
}
