package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioListPhoneFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEntity;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordPhoneViewModel;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.av6;
import defpackage.eui;
import defpackage.l2j;
import defpackage.mf6;
import defpackage.wzi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b=\u0010\u0010J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001d\u0010\u0010J\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0010J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0010J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110%¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110(¢\u0006\u0004\b*\u0010+R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioListPhoneFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordPhoneViewModel;", "Lmf6;", "", "clickType", "position", "", "clickListener", "(ILjava/lang/Integer;)V", "", "touch", BroadcastsKt.SILENT_PUSHING_PROGRESS, "seekBarTouchListener", "(ZLjava/lang/Integer;)V", "showDeleteDialog", "()V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "data", "showShareDialog", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lmf6;)V", "setListener", "refreshData", "visible", "onVisibilityChanged", "(Z)V", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "", "getRecordData", "()Ljava/util/List;", "", "datas", "updateRecordData", "(Ljava/util/List;)V", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter;", "phoneListAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter;", "", "intentRecordTime", "J", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "deleteDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "index", "I", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioListPhoneFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioListPhoneFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioListPhoneFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,449:1\n256#2,2:450\n256#2,2:460\n1#3:452\n360#4,7:453\n360#4,7:462\n*S KotlinDebug\n*F\n+ 1 AudioListPhoneFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioListPhoneFragment\n*L\n63#1:450,2\n126#1:460,2\n225#1:453,7\n156#1:462,7\n*E\n"})
public final class AudioListPhoneFragment extends BaseBindingFragment<AudioRecordPhoneViewModel, mf6> {

    @Nullable
    private CommonDialog<DialogParams> deleteDialog;
    private long intentRecordTime;

    @Nullable
    private PhoneListAdapter phoneListAdapter;

    @NotNull
    private List<AudioRecordEntity> dataList = new ArrayList();
    private int index = -1;

    public static final /* synthetic */ mf6 access$getMBinding(AudioListPhoneFragment audioListPhoneFragment) {
        return audioListPhoneFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AudioRecordPhoneViewModel access$getMViewModel(AudioListPhoneFragment audioListPhoneFragment) {
        return (AudioRecordPhoneViewModel) audioListPhoneFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void clickListener(int clickType, Integer position) throws IOException {
        List<AsrResultItem> contentList;
        Object next;
        if (position != null) {
            int iIntValue = position.intValue();
            this.index = iIntValue;
            AudioRecordEntity audioRecordEntity = this.dataList.get(iIntValue);
            if (clickType == 1) {
                if (audioRecordEntity.getStatus() != 1) {
                    if (audioRecordEntity.getStatus() == 2) {
                        ToastUtil.INSTANCE.showToast(wzi.i0);
                        return;
                    } else {
                        ToastUtil.INSTANCE.showToast(wzi.D0);
                        return;
                    }
                }
                this.intentRecordTime = audioRecordEntity.getTimestamp();
                AudioTransFragment.Companion companion = AudioTransFragment.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                companion.start(contextRequireContext, this.intentRecordTime);
                return;
            }
            if (clickType == 2) {
                showDeleteDialog();
                return;
            }
            if (clickType == 3) {
                if (audioRecordEntity.getStatus() != 1 || (contentList = audioRecordEntity.getContentList()) == null || contentList.isEmpty()) {
                    ((AudioRecordPhoneViewModel) getMViewModel()).shared(audioRecordEntity, true);
                    return;
                } else {
                    showShareDialog(audioRecordEntity);
                    return;
                }
            }
            if (clickType == 4) {
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
                    return;
                } else if (audioRecordEntity.getStatus() == 2) {
                    ToastUtil.INSTANCE.showToast(wzi.i0);
                    return;
                } else {
                    ((AudioRecordPhoneViewModel) getMViewModel()).postTransTask(audioRecordEntity, Integer.valueOf(audioRecordEntity.getFormat()));
                    return;
                }
            }
            if (clickType != 5) {
                return;
            }
            int audioPlayStatus = audioRecordEntity.getAudioPlayStatus();
            if (audioPlayStatus == 0) {
                Iterator<T> it = this.dataList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((AudioRecordEntity) next).getAudioPlayStatus() == 0);
                AudioRecordEntity audioRecordEntity2 = (AudioRecordEntity) next;
                if (audioRecordEntity2 != null) {
                    int iIndexOf = this.dataList.indexOf(audioRecordEntity2);
                    AudioRecordEntity audioRecordEntityCopy = audioRecordEntity2.copy((511 & 1) != 0 ? audioRecordEntity2.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity2.title : null, (511 & 4) != 0 ? audioRecordEntity2.newTitle : null, (511 & 8) != 0 ? audioRecordEntity2.did : null, (511 & 16) != 0 ? audioRecordEntity2.duration : 0L, (511 & 32) != 0 ? audioRecordEntity2.status : 0, (511 & 64) != 0 ? audioRecordEntity2.format : 0, (511 & 128) != 0 ? audioRecordEntity2.fdsName : null, (511 & 256) != 0 ? audioRecordEntity2.contentList : null);
                    audioRecordEntityCopy.setAudioPlayStatus(0);
                    audioRecordEntityCopy.setAudioPlayCurrentTimes(audioRecordEntity.getAudioPlayCurrentTimes());
                    audioRecordEntityCopy.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
                    this.dataList.set(iIndexOf, audioRecordEntityCopy);
                }
                int iIndexOf2 = this.dataList.indexOf(audioRecordEntity);
                AudioRecordEntity audioRecordEntityCopy2 = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
                audioRecordEntityCopy2.setAudioPlayStatus(1);
                audioRecordEntityCopy2.setAudioPlayCurrentTimes(0L);
                audioRecordEntityCopy2.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
                this.dataList.set(iIndexOf2, audioRecordEntityCopy2);
                ((AudioRecordPhoneViewModel) getMViewModel()).initMediaSource(audioRecordEntity, Integer.valueOf(audioRecordEntity.getFormat()));
                ((AudioRecordPhoneViewModel) getMViewModel()).play();
            } else if (audioPlayStatus == 1) {
                int iIndexOf3 = this.dataList.indexOf(audioRecordEntity);
                AudioRecordEntity audioRecordEntityCopy3 = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
                audioRecordEntityCopy3.setAudioPlayStatus(2);
                audioRecordEntityCopy3.setAudioPlayCurrentTimes(audioRecordEntity.getAudioPlayCurrentTimes());
                audioRecordEntityCopy3.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
                this.dataList.set(iIndexOf3, audioRecordEntityCopy3);
                ((AudioRecordPhoneViewModel) getMViewModel()).pause();
            } else if (audioPlayStatus == 2) {
                int iIndexOf4 = this.dataList.indexOf(audioRecordEntity);
                AudioRecordEntity audioRecordEntityCopy4 = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
                audioRecordEntityCopy4.setAudioPlayStatus(1);
                audioRecordEntityCopy4.setAudioPlayCurrentTimes(audioRecordEntity.getAudioPlayCurrentTimes());
                audioRecordEntityCopy4.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
                this.dataList.set(iIndexOf4, audioRecordEntityCopy4);
                ((AudioRecordPhoneViewModel) getMViewModel()).play();
            }
            PhoneListAdapter phoneListAdapter = this.phoneListAdapter;
            if (phoneListAdapter != null) {
                phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this.dataList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void seekBarTouchListener(boolean touch, Integer progress) {
        Object next;
        ((AudioRecordPhoneViewModel) getMViewModel()).setTouchSeekBar(touch);
        if (progress == null || touch) {
            return;
        }
        ((AudioRecordPhoneViewModel) getMViewModel()).seekTo(progress.intValue());
        Iterator<T> it = this.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioRecordEntity) next).getTimestamp() != ((AudioRecordPhoneViewModel) getMViewModel()).getCurrentAudioStartTime());
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) next;
        int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends AudioRecordEntity>) ((List<? extends Object>) this.dataList), audioRecordEntity);
        if (audioRecordEntity == null) {
            return;
        }
        AudioRecordEntity audioRecordEntityCopy = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
        audioRecordEntityCopy.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
        audioRecordEntityCopy.setAudioPlayCurrentTimes(progress.intValue());
        audioRecordEntityCopy.setAudioPlayStatus(audioRecordEntity.getAudioPlayStatus());
        this.dataList.set(iIndexOf, audioRecordEntityCopy);
        PhoneListAdapter phoneListAdapter = this.phoneListAdapter;
        if (phoneListAdapter != null) {
            phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this.dataList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$10(AudioListPhoneFragment this$0, Boolean bool) {
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioRecordEntity) next).getTimestamp() != ((AudioRecordPhoneViewModel) this$0.getMViewModel()).getCurrentAudioStartTime());
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) next;
        int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends AudioRecordEntity>) ((List<? extends Object>) this$0.dataList), audioRecordEntity);
        if (audioRecordEntity == null) {
            return Unit.INSTANCE;
        }
        AudioRecordEntity audioRecordEntityCopy = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
        audioRecordEntityCopy.setAudioPlayCurrentTimes(audioRecordEntity.getAudioPlayCurrentTimes());
        audioRecordEntityCopy.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
        audioRecordEntityCopy.setAudioPlayStatus(bool.booleanValue() ? 1 : 2);
        this$0.dataList.set(iIndexOf, audioRecordEntityCopy);
        PhoneListAdapter phoneListAdapter = this$0.phoneListAdapter;
        if (phoneListAdapter != null) {
            phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this$0.dataList));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$11(AudioListPhoneFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dataList.clear();
        List<AudioRecordEntity> list2 = this$0.dataList;
        Intrinsics.checkNotNull(list);
        list2.addAll(list);
        PhoneListAdapter phoneListAdapter = this$0.phoneListAdapter;
        if (phoneListAdapter != null) {
            phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this$0.dataList));
        }
        this$0.getMBinding().D.smoothScrollToPosition(0);
        ((AudioRecordPhoneViewModel) this$0.getMViewModel()).getStatus(list);
        LinearLayout emptyView = this$0.getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        emptyView.setVisibility(list.isEmpty() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$14(AudioListPhoneFragment this$0, AudioRecordPhoneViewModel.RecordTransStatus recordTransStatus) {
        Object next;
        int iIndexOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.phoneListAdapter == null) {
            return Unit.INSTANCE;
        }
        Iterator<T> it = this$0.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioRecordEntity) next).getTimestamp() != recordTransStatus.getTime());
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) next;
        if (audioRecordEntity != null && (iIndexOf = this$0.dataList.indexOf(audioRecordEntity)) >= 0) {
            AudioRecordEntity audioRecordEntity2 = new AudioRecordEntity(audioRecordEntity.getTimestamp(), audioRecordEntity.getTitle(), audioRecordEntity.getNewTitle(), audioRecordEntity.getDid(), audioRecordEntity.getDuration(), recordTransStatus.getStatus(), 0, recordTransStatus.getObjName(), recordTransStatus.getContentList(), 64, null);
            audioRecordEntity2.setAudioPlayStatus(audioRecordEntity.getAudioPlayStatus());
            audioRecordEntity2.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
            audioRecordEntity2.setAudioPlayCurrentTimes(audioRecordEntity.getAudioPlayCurrentTimes());
            ((AudioRecordPhoneViewModel) this$0.getMViewModel()).updateStatusDB(audioRecordEntity2);
            this$0.dataList.set(iIndexOf, audioRecordEntity2);
            Logger.i(BaseFragment.TAG, "MobilePhoneStorageFragment item=" + audioRecordEntity);
            PhoneListAdapter phoneListAdapter = this$0.phoneListAdapter;
            if (phoneListAdapter != null) {
                phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this$0.dataList));
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$16(AudioListPhoneFragment this$0, AudioRecordEntity audioRecordEntity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<AudioRecordEntity> it = this$0.dataList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getTimestamp() == audioRecordEntity.getTimestamp()) {
                break;
            }
            i++;
        }
        if (i > -1) {
            AudioRecordEntity audioRecordEntity2 = this$0.dataList.get(i);
            if (audioRecordEntity2 != null) {
                audioRecordEntity2.setContentList(audioRecordEntity.getContentList());
            }
            if (audioRecordEntity2 != null) {
                audioRecordEntity2.setNewTitle(audioRecordEntity.getNewTitle());
            }
            PhoneListAdapter phoneListAdapter = this$0.phoneListAdapter;
            if (phoneListAdapter != null) {
                phoneListAdapter.notifyItemChanged(i);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$17(AudioListPhoneFragment this$0, AudioRecordPhoneViewModel.LoadingStatus loadingStatus) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (loadingStatus.isLoading()) {
            this$0.showLoading(wzi.A0, false);
        } else {
            AudioRecordPhoneViewModel audioRecordPhoneViewModel = (AudioRecordPhoneViewModel) this$0.getMViewModel();
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            audioRecordPhoneViewModel.shared(contextRequireContext, loadingStatus.getFilePath());
            this$0.dismissDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$18(AudioListPhoneFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AudioRecordPhoneViewModel) this$0.getMViewModel()).loadPhoneRecordList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$4(AudioListPhoneFragment this$0, Long l) {
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioRecordEntity) next).getTimestamp() != ((AudioRecordPhoneViewModel) this$0.getMViewModel()).getCurrentAudioStartTime());
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) next;
        int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends AudioRecordEntity>) ((List<? extends Object>) this$0.dataList), audioRecordEntity);
        if (audioRecordEntity == null) {
            return Unit.INSTANCE;
        }
        AudioRecordEntity audioRecordEntityCopy = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
        audioRecordEntityCopy.setAudioTotalTimes(l.longValue());
        audioRecordEntityCopy.setAudioPlayCurrentTimes(audioRecordEntity.getAudioPlayCurrentTimes());
        audioRecordEntityCopy.setAudioPlayStatus(audioRecordEntity.getAudioPlayStatus());
        this$0.dataList.set(iIndexOf, audioRecordEntityCopy);
        PhoneListAdapter phoneListAdapter = this$0.phoneListAdapter;
        if (phoneListAdapter != null) {
            phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this$0.dataList));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$7(AudioListPhoneFragment this$0, Long l) {
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((AudioRecordEntity) next).getTimestamp() != ((AudioRecordPhoneViewModel) this$0.getMViewModel()).getCurrentAudioStartTime());
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) next;
        int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends AudioRecordEntity>) ((List<? extends Object>) this$0.dataList), audioRecordEntity);
        if (audioRecordEntity == null) {
            return Unit.INSTANCE;
        }
        AudioRecordEntity audioRecordEntityCopy = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
        audioRecordEntityCopy.setAudioPlayCurrentTimes(l.longValue());
        audioRecordEntityCopy.setAudioTotalTimes(audioRecordEntity.getAudioTotalTimes());
        audioRecordEntityCopy.setAudioPlayStatus(audioRecordEntity.getAudioPlayStatus());
        this$0.dataList.set(iIndexOf, audioRecordEntityCopy);
        PhoneListAdapter phoneListAdapter = this$0.phoneListAdapter;
        if (phoneListAdapter != null) {
            phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this$0.dataList));
        }
        return Unit.INSTANCE;
    }

    private final void showDeleteDialog() {
        CommonDialog<DialogParams> commonDialog = this.deleteDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (this.deleteDialog == null) {
                this.deleteDialog = new CommonDialog.c("record_delete_dialog").setDialogTitle(wzi.l0).setDialogDescription(wzi.m0).setNegativeText(wzi.e).setPositiveText(wzi.O6).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioListPhoneFragment.showDeleteDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -2) {
                            if (dialog != null) {
                                dialog.dismiss();
                                return;
                            }
                            return;
                        }
                        if (which == -1 && AudioListPhoneFragment.this.index < AudioListPhoneFragment.this.dataList.size()) {
                            AudioRecordEntity audioRecordEntity = (AudioRecordEntity) AudioListPhoneFragment.this.dataList.get(AudioListPhoneFragment.this.index);
                            AudioListPhoneFragment.access$getMViewModel(AudioListPhoneFragment.this).deleteRecordFile(audioRecordEntity);
                            AudioListPhoneFragment.this.dataList.remove(audioRecordEntity);
                            PhoneListAdapter phoneListAdapter = AudioListPhoneFragment.this.phoneListAdapter;
                            if (phoneListAdapter != null) {
                                phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(AudioListPhoneFragment.this.dataList));
                            }
                            if (audioRecordEntity.getTimestamp() == AudioListPhoneFragment.access$getMViewModel(AudioListPhoneFragment.this).getCurrentAudioStartTime()) {
                                AudioListPhoneFragment.access$getMViewModel(AudioListPhoneFragment.this).stop();
                            }
                            FragmentActivity mActivity = AudioListPhoneFragment.this.getMActivity();
                            if (mActivity != null && (mActivity instanceof AudioRecordListActivity)) {
                                ((AudioRecordListActivity) mActivity).refreshWatchList(audioRecordEntity.getTitle());
                            }
                            LinearLayout emptyView = AudioListPhoneFragment.access$getMBinding(AudioListPhoneFragment.this).A;
                            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
                            emptyView.setVisibility(AudioListPhoneFragment.this.dataList.isEmpty() ? 0 : 8);
                        }
                    }
                });
            }
            CommonDialog<DialogParams> commonDialog2 = this.deleteDialog;
            if (commonDialog2 != null) {
                commonDialog2.show(getChildFragmentManager(), "delete");
            }
        }
    }

    private final void showShareDialog(final AudioRecordEntity data) {
        String[] strArr = {getString(wzi.s0), getString(wzi.F0)};
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 2;
        CommonDialog commonDialogCreate = new CommonDialog.c("record_share_dialog").setDialogTitle(wzi.r0).setNegativeText(wzi.e).setDialogTheme(l2j.c).setCanceledOnTouchOutside(true).setCancelable(true).setItems(strArr).setItemsCheckedIndex(intRef.element).setPositiveText(wzi.O6).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioListPhoneFragment.showShareDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws IOException {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else if (which != -1) {
                    intRef.element = which;
                } else if (intRef.element == 2) {
                    ToastUtil.showToast(this.getString(wzi.B0));
                } else {
                    AudioListPhoneFragment.access$getMViewModel(this).shared(data, intRef.element == 0);
                }
            }
        });
        commonDialogCreate.show(getChildFragmentManager(), "share");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull mf6 mf6Var) {
        Intrinsics.checkNotNullParameter(mf6Var, "<this>");
        setActionBarDisplayable(false);
        ConstraintLayout headView = mf6Var.B;
        Intrinsics.checkNotNullExpressionValue(headView, "headView");
        headView.setVisibility(8);
        RecyclerView recyclerView = mf6Var.D;
        recyclerView.addItemDecoration(new LinearItemSpace(ExtUtilsKt.getDp(12), false, false, 6, null));
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PhoneListAdapter phoneListAdapter = new PhoneListAdapter(context, this.dataList, null, 4, null);
        phoneListAdapter.setClickListener(new AudioListPhoneFragment$bindView$1$1$1(this));
        phoneListAdapter.setSeekBarListener(new AudioListPhoneFragment$bindView$1$1$2(this));
        this.phoneListAdapter = phoneListAdapter;
        recyclerView.setAdapter(phoneListAdapter);
        recyclerView.setItemAnimator(null);
        ((AudioRecordPhoneViewModel) getMViewModel()).loadPhoneRecordList();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.N;
    }

    @NotNull
    public final List<AudioRecordEntity> getRecordData() {
        return this.dataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((AudioRecordPhoneViewModel) getMViewModel()).getStatusChanged().removeObservers(this);
        AudioTransManager.INSTANCE.getInstance().removeTransResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.intentRecordTime != 0) {
            ((AudioRecordPhoneViewModel) getMViewModel()).loadSingleData(this.intentRecordTime);
            this.intentRecordTime = 0L;
        }
        ((AudioRecordPhoneViewModel) getMViewModel()).requestTransResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ((AudioRecordPhoneViewModel) getMViewModel()).stopRequest();
        ((AudioRecordPhoneViewModel) getMViewModel()).pause();
        Iterator<AudioRecordEntity> it = this.dataList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getAudioPlayStatus() == 1) {
                break;
            } else {
                i++;
            }
        }
        if (i > -1) {
            this.dataList.get(i).setAudioPlayStatus(2);
            PhoneListAdapter phoneListAdapter = this.phoneListAdapter;
            if (phoneListAdapter != null) {
                phoneListAdapter.notifyItemChanged(i);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment
    public void onVisibilityChanged(boolean visible) {
        Object next;
        super.onVisibilityChanged(visible);
        if (getFragmentManager() == null) {
            Logger.i(BaseFragment.TAG, "MobilePhoneStorageFragment detached");
            return;
        }
        if (visible) {
            ((AudioRecordPhoneViewModel) getMViewModel()).loadPhoneRecordList();
            return;
        }
        if (((AudioRecordPhoneViewModel) getMViewModel()).isPlaying()) {
            ((AudioRecordPhoneViewModel) getMViewModel()).pause();
            Iterator<T> it = this.dataList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AudioRecordEntity) next).getTimestamp() != ((AudioRecordPhoneViewModel) getMViewModel()).getCurrentAudioStartTime());
            AudioRecordEntity audioRecordEntity = (AudioRecordEntity) next;
            int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends AudioRecordEntity>) ((List<? extends Object>) this.dataList), audioRecordEntity);
            if (audioRecordEntity == null) {
                return;
            }
            AudioRecordEntity audioRecordEntityCopy = audioRecordEntity.copy((511 & 1) != 0 ? audioRecordEntity.timestamp : 0L, (511 & 2) != 0 ? audioRecordEntity.title : null, (511 & 4) != 0 ? audioRecordEntity.newTitle : null, (511 & 8) != 0 ? audioRecordEntity.did : null, (511 & 16) != 0 ? audioRecordEntity.duration : 0L, (511 & 32) != 0 ? audioRecordEntity.status : 0, (511 & 64) != 0 ? audioRecordEntity.format : 0, (511 & 128) != 0 ? audioRecordEntity.fdsName : null, (511 & 256) != 0 ? audioRecordEntity.contentList : null);
            audioRecordEntityCopy.setAudioPlayStatus(0);
            this.dataList.set(iIndexOf, audioRecordEntityCopy);
            PhoneListAdapter phoneListAdapter = this.phoneListAdapter;
            if (phoneListAdapter != null) {
                phoneListAdapter.submitList(CollectionsKt___CollectionsKt.toList(this.dataList));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshData() {
        ((AudioRecordPhoneViewModel) getMViewModel()).loadPhoneRecordList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((AudioRecordPhoneViewModel) getMViewModel()).getDurationTime().observe(this, new AudioListPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xm1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListPhoneFragment.setListener$lambda$4(this.f39254a, (Long) obj);
            }
        }));
        ((AudioRecordPhoneViewModel) getMViewModel()).getCurrentPositionTime().observe(this, new AudioListPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ym1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListPhoneFragment.setListener$lambda$7(this.f40314a, (Long) obj);
            }
        }));
        ((AudioRecordPhoneViewModel) getMViewModel()).getAudioStatusChanged().observe(this, new AudioListPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zm1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListPhoneFragment.setListener$lambda$10(this.f41447a, (Boolean) obj);
            }
        }));
        ((AudioRecordPhoneViewModel) getMViewModel()).getDataList().observe(this, new AudioListPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: an1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListPhoneFragment.setListener$lambda$11(this.f1226a, (List) obj);
            }
        }));
        ((AudioRecordPhoneViewModel) getMViewModel()).getStatusChanged().observeForever(new AudioListPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListPhoneFragment.setListener$lambda$14(this.f4382a, (AudioRecordPhoneViewModel.RecordTransStatus) obj);
            }
        }));
        ((AudioRecordPhoneViewModel) getMViewModel()).getSingleDataChanged().observe(this, new AudioListPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListPhoneFragment.setListener$lambda$16(this.f5564a, (AudioRecordEntity) obj);
            }
        }));
        ((AudioRecordPhoneViewModel) getMViewModel()).getLoadingChanged().observe(this, new AudioListPhoneFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListPhoneFragment.setListener$lambda$17(this.f15709a, (AudioRecordPhoneViewModel.LoadingStatus) obj);
            }
        }));
        LiveDataBus.INSTANCE.get().with(AudioRecordPhoneViewModel.REFRESH_DATA_NOTIFY).observe(this, new Observer() { // from class: en1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AudioListPhoneFragment.setListener$lambda$18(this.f16831a, obj);
            }
        });
    }

    public final void updateRecordData(@NotNull List<AudioRecordEntity> datas) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        this.dataList.clear();
        this.dataList.addAll(datas);
    }
}
