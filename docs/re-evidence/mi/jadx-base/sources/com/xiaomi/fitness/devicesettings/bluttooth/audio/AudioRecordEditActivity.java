package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEditActivity;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.CustomEditText;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.SpeakerRenameDialog;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.av6;
import defpackage.dd6;
import defpackage.eui;
import defpackage.fli;
import defpackage.jni;
import defpackage.l2j;
import defpackage.ld6;
import defpackage.s8p;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000f\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001KB\u0007¢\u0006\u0004\bJ\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010)J\u0019\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010\u0006J\u0019\u00101\u001a\u00020\u0004*\u00020\u00132\u0006\u00100\u001a\u00020\r¢\u0006\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020&098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020&098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010@\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditVM;", "Lld6;", "", "setListener", "()V", "updateDB", "initHeadView", "back", "", "isChanged", "()Z", "", "getNewContent", "()Ljava/lang/String;", "showTitleDialog", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;", "talkBean", "Landroid/widget/TextView;", "textView", "showRenameDialog", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TalkBean;Landroid/widget/TextView;)V", "showSaveDialog", "initData", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;", "editText", "updateFocus", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;)V", "", "index", "value", "refreshEditText", "(IILcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;)V", BroadcastsKt.SILENT_PUSHING_CANCEL, "recovery", "updateCancelStatus", "updateRecoveryStatus", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditVM$OperationAction;", "data", "addHistoryData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditVM$OperationAction;)V", "addHistoryBackData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "name", "text", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Ldd6;", "mTitleBinding", "Ldd6;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "meetingBean", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/MeetingBean;", "Ljava/util/LinkedList;", "history", "Ljava/util/LinkedList;", "historyBack", "", "textViewList", "Ljava/util/List;", "flag", "Z", "getFlag", "setFlag", "(Z)V", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioRecordEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioRecordEditActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,526:1\n1863#2:527\n1863#2,2:528\n1864#2:530\n1863#2:531\n1863#2,2:532\n1864#2:534\n1872#2,2:535\n1872#2,3:537\n1874#2:540\n1755#2,3:541\n*S KotlinDebug\n*F\n+ 1 AudioRecordEditActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditActivity\n*L\n85#1:527\n86#1:528,2\n85#1:530\n153#1:531\n154#1:532,2\n153#1:534\n271#1:535,2\n286#1:537,3\n271#1:540\n500#1:541,3\n*E\n"})
public final class AudioRecordEditActivity extends BaseBindingActivity<AudioRecordEditVM, ld6> {

    @NotNull
    private static final String TAG = "AudiRecord_Edit";
    private boolean flag;
    private dd6 mTitleBinding;

    @Nullable
    private MeetingBean meetingBean;

    @NotNull
    private final LinkedList<AudioRecordEditVM.OperationAction> history = new LinkedList<>();

    @NotNull
    private final LinkedList<AudioRecordEditVM.OperationAction> historyBack = new LinkedList<>();

    @NotNull
    private final List<TextView> textViewList = new ArrayList();

    private final void addHistoryBackData(AudioRecordEditVM.OperationAction data) {
        Logger.i(TAG, "addHistoryBackData " + data);
        if (this.historyBack.size() > 3) {
            this.historyBack.removeLast();
        } else {
            this.historyBack.push(data);
        }
        updateRecoveryStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addHistoryData(AudioRecordEditVM.OperationAction data) {
        LinkedList<AudioRecordEditVM.OperationAction> linkedList = this.history;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator<T> it = linkedList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(data.getContent(), ((AudioRecordEditVM.OperationAction) it.next()).getContent())) {
                    Logger.i(TAG, "addHistoryData stop because already exit");
                    return;
                }
            }
        }
        Logger.i(TAG, "addHistoryData " + data);
        if (this.history.size() > 4) {
            this.history.removeLast();
        } else {
            this.history.push(data);
        }
        updateCancelStatus();
    }

    private final void back() {
        if (isChanged()) {
            showSaveDialog();
        } else {
            finish();
        }
    }

    private final void cancel() {
        CustomEditText editText;
        List<TalkBean> talkList;
        TalkBean talkBean;
        List<MessageBean> msgList;
        MessageBean messageBean;
        Logger.i(TAG, BroadcastsKt.SILENT_PUSHING_CANCEL);
        if (this.history.size() < 2) {
            return;
        }
        AudioRecordEditVM.OperationAction operationActionPop = this.history.pop();
        Intrinsics.checkNotNullExpressionValue(operationActionPop, "pop(...)");
        addHistoryBackData(operationActionPop);
        if (this.history.isEmpty()) {
            return;
        }
        this.flag = true;
        AudioRecordEditVM.OperationAction operationActionPeek = this.history.peek();
        Logger.i(TAG, "cancel show data " + operationActionPeek);
        if (operationActionPeek != null && (editText = operationActionPeek.getEditText()) != null) {
            String content = operationActionPeek.getContent();
            int length = content.length() - editText.length();
            editText.setText(operationActionPeek.getContent());
            editText.requestFocus();
            editText.setSelection(operationActionPeek.getEnd());
            int index = operationActionPeek.getIndex();
            Object tag = editText.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) tag).intValue();
            Logger.i(TAG, "cancel update list talkBean index= " + iIntValue + ",magIndex=" + index);
            MeetingBean meetingBean = this.meetingBean;
            if (meetingBean != null && (talkList = meetingBean.getTalkList()) != null && (talkBean = talkList.get(iIntValue)) != null && (msgList = talkBean.getMsgList()) != null && (messageBean = msgList.get(operationActionPeek.getIndex())) != null) {
                messageBean.setContent(content);
            }
            refreshEditText(index, length, editText);
        }
        this.flag = false;
        updateCancelStatus();
    }

    private final String getNewContent() {
        List<TalkBean> talkList;
        StringBuilder sb = new StringBuilder();
        MeetingBean meetingBean = this.meetingBean;
        sb.append(meetingBean != null ? meetingBean.getTitle() : null);
        MeetingBean meetingBean2 = this.meetingBean;
        if (meetingBean2 != null && (talkList = meetingBean2.getTalkList()) != null) {
            Iterator<T> it = talkList.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((TalkBean) it.next()).getMsgList().iterator();
                while (it2.hasNext()) {
                    sb.append(((MessageBean) it2.next()).getContent());
                }
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        String title;
        List<TalkBean> talkList;
        AudioRecordEditVM audioRecordEditVM = (AudioRecordEditVM) getMViewModel();
        MeetingBean meetingBean = this.meetingBean;
        if (meetingBean == null || (title = meetingBean.getTitle()) == null) {
            title = "";
        }
        audioRecordEditVM.setOldContent(title);
        MeetingBean meetingBean2 = this.meetingBean;
        if (meetingBean2 == null || (talkList = meetingBean2.getTalkList()) == null) {
            return;
        }
        int i = 0;
        for (Object obj : talkList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final TalkBean talkBean = (TalkBean) obj;
            final TextView textView = new TextView(this);
            text(textView, talkBean.getUserName());
            textView.setTextColor(Color.parseColor("#888888"));
            textView.setTextAppearance(l2j.f24571b);
            textView.setOnClickListener(new View.OnClickListener() { // from class: tn1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioRecordEditActivity.initData$lambda$19$lambda$16$lambda$15(this.f34863a, talkBean, textView, view);
                }
            });
            this.textViewList.add(textView);
            getMBinding().A.addView(textView);
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            final int size = talkBean.getMsgList().size();
            int i3 = 0;
            int length = 0;
            for (Object obj2 : talkBean.getMsgList()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String content = ((MessageBean) obj2).getContent();
                AudioRecordEditVM.EditAction editAction = new AudioRecordEditVM.EditAction(i3, content, length, i3 == size + (-1) ? content.length() + length : (content.length() + length) - 1);
                length += content.length();
                arrayList.add(editAction);
                Logger.i(TAG, "msgList EditAction=" + editAction);
                sb.append(content);
                i3 = i4;
            }
            AudioRecordEditVM audioRecordEditVM2 = (AudioRecordEditVM) getMViewModel();
            audioRecordEditVM2.setOldContent(audioRecordEditVM2.getOldContent() + ((Object) sb));
            final CustomEditText customEditText = new CustomEditText(this, null, 0, 6, null);
            customEditText.setText(sb);
            s8p.m(customEditText, ExtUtilsKt.getDimension(fli.f17899a));
            customEditText.setData(arrayList);
            customEditText.setTag(Integer.valueOf(i));
            customEditText.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEditActivity$initData$1$editText$1$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    Object next;
                    if (this.this$0.getFlag()) {
                        return;
                    }
                    Logger.i("AudiRecord_Edit", "beforeTextChanged start=" + start + ",after=" + after + ",count=" + count + ",text=" + ((Object) s));
                    List<AudioRecordEditVM.EditAction> list = customEditText.getList();
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            AudioRecordEditVM.EditAction editAction2 = (AudioRecordEditVM.EditAction) next;
                            int cursorStart = editAction2.getCursorStart();
                            if (start <= editAction2.getCursorEnd() && cursorStart <= start) {
                                break;
                            }
                        }
                        AudioRecordEditVM.EditAction editAction3 = (AudioRecordEditVM.EditAction) next;
                        if (editAction3 == null) {
                            return;
                        }
                        this.this$0.addHistoryData(new AudioRecordEditVM.OperationAction(editAction3.getIndex(), start, start + count, String.valueOf(s), customEditText));
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    Object next;
                    String string;
                    if (this.this$0.getFlag()) {
                        return;
                    }
                    Logger.i("AudiRecord_Edit", "onTextChanged start=" + start + ",before=" + before + ",count=" + count + ",text=" + ((Object) s));
                    List<AudioRecordEditVM.EditAction> list = customEditText.getList();
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            AudioRecordEditVM.EditAction editAction2 = (AudioRecordEditVM.EditAction) next;
                            int cursorStart = editAction2.getCursorStart();
                            if (start <= editAction2.getCursorEnd() && cursorStart <= start) {
                                break;
                            }
                        }
                        AudioRecordEditVM.EditAction editAction3 = (AudioRecordEditVM.EditAction) next;
                        if (editAction3 == null) {
                            return;
                        }
                        int index = editAction3.getIndex();
                        int i5 = count - before;
                        int cursorEnd = (index == size + (-1) ? editAction3.getCursorEnd() - editAction3.getCursorStart() : (editAction3.getCursorEnd() - editAction3.getCursorStart()) + 1) + i5;
                        Logger.i("AudiRecord_Edit", "data changed dataIndex " + index + " newLength=" + cursorEnd + "," + editAction3);
                        int cursorStart2 = editAction3.getCursorStart() + cursorEnd;
                        if (cursorStart2 > (s != null ? s.length() : 0)) {
                            return;
                        }
                        String str = "";
                        if (cursorEnd > 0 && s != null && (string = s.subSequence(editAction3.getCursorStart(), cursorStart2).toString()) != null) {
                            str = string;
                        }
                        Logger.i("AudiRecord_Edit", "new value=" + str);
                        editAction3.setContent(str);
                        talkBean.getMsgList().get(index).setContent(str);
                        this.this$0.addHistoryData(new AudioRecordEditVM.OperationAction(index, start, start + count, String.valueOf(s), customEditText));
                        this.this$0.refreshEditText(index, i5, customEditText);
                        if (s == null || s.length() != 0) {
                            return;
                        }
                        this.this$0.updateFocus(customEditText);
                    }
                }
            });
            getMBinding().A.addView(customEditText);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$19$lambda$16$lambda$15(AudioRecordEditActivity this$0, TalkBean talkBean, TextView this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(talkBean, "$talkBean");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.showRenameDialog(talkBean, this_apply);
    }

    private final void initHeadView() {
        String newTitle;
        if (this.meetingBean == null) {
            return;
        }
        TextView textView = getMBinding().C;
        MeetingBean meetingBean = this.meetingBean;
        if (meetingBean == null || (newTitle = meetingBean.getNewTitle()) == null) {
            newTitle = "";
        }
        textView.setText(UtilsKt.simpleRecordFileName(newTitle));
        textView.setOnClickListener(new View.OnClickListener() { // from class: xn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordEditActivity.initHeadView$lambda$7$lambda$6(this.f39274a, view);
            }
        });
        MeetingBean meetingBean2 = this.meetingBean;
        if (meetingBean2 != null) {
            long time = meetingBean2.getTime();
            if (RecordTimeUtilKt.isInValidTime(time)) {
                TextView timeView = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(timeView, "timeView");
                ViewExtKt.gone(timeView);
            } else {
                TextView timeView2 = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(timeView2, "timeView");
                ViewExtKt.visible(timeView2);
                getMBinding().B.setText(TimeUtils.INSTANCE.getNewDateString(time));
            }
        }
        dd6 dd6Var = null;
        dd6 dd6VarA0 = dd6.A0(ExtUtilsKt.getInflater(this), null, false);
        this.mTitleBinding = dd6VarA0;
        if (dd6VarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
        } else {
            dd6Var = dd6VarA0;
        }
        View root = dd6Var.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        setEndView(root);
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, jni.A, null, new View.OnClickListener() { // from class: yn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordEditActivity.initHeadView$lambda$9(this.f40340a, view);
            }
        }, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHeadView$lambda$7$lambda$6(AudioRecordEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showTitleDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHeadView$lambda$9(AudioRecordEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.back();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isChanged() {
        return !Intrinsics.areEqual(((AudioRecordEditVM) getMViewModel()).getOldContent(), getNewContent());
    }

    private final void recovery() {
        CustomEditText editText;
        List<TalkBean> talkList;
        TalkBean talkBean;
        List<MessageBean> msgList;
        MessageBean messageBean;
        Logger.i(TAG, "recovery from " + this.historyBack.size());
        if (this.historyBack.isEmpty()) {
            return;
        }
        this.flag = true;
        AudioRecordEditVM.OperationAction operationActionPop = this.historyBack.pop();
        Intrinsics.checkNotNullExpressionValue(operationActionPop, "pop(...)");
        addHistoryData(operationActionPop);
        AudioRecordEditVM.OperationAction operationActionPeek = this.history.peek();
        Logger.i(TAG, "recovery show data " + operationActionPeek);
        if (operationActionPeek != null && (editText = operationActionPeek.getEditText()) != null) {
            int length = operationActionPeek.getContent().length() - editText.length();
            editText.setText(operationActionPeek.getContent());
            editText.requestFocus();
            editText.setSelection(operationActionPeek.getEnd());
            Object tag = editText.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) tag).intValue();
            Logger.i(TAG, "recovery update list talkBean index= " + iIntValue + ",magIndex=" + operationActionPeek.getIndex());
            MeetingBean meetingBean = this.meetingBean;
            if (meetingBean != null && (talkList = meetingBean.getTalkList()) != null && (talkBean = talkList.get(iIntValue)) != null && (msgList = talkBean.getMsgList()) != null && (messageBean = msgList.get(operationActionPeek.getIndex())) != null) {
                messageBean.setContent(operationActionPeek.getContent());
            }
            refreshEditText(operationActionPeek.getIndex(), length, editText);
        }
        this.flag = false;
        updateRecoveryStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshEditText(int index, int value, CustomEditText editText) {
        List<AudioRecordEditVM.EditAction> list = editText.getList();
        List<AudioRecordEditVM.EditAction> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = index; i < size; i++) {
            AudioRecordEditVM.EditAction editAction = list.get(i);
            if (i != index) {
                editAction.setCursorStart(editAction.getCursorStart() + value);
            }
            editAction.setCursorEnd(editAction.getCursorEnd() + value);
            Logger.i(TAG, "refreshEditText " + editAction);
        }
    }

    private final void setListener() {
        dd6 dd6Var = this.mTitleBinding;
        dd6 dd6Var2 = null;
        if (dd6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
            dd6Var = null;
        }
        dd6Var.A.setOnClickListener(new View.OnClickListener() { // from class: un1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordEditActivity.setListener$lambda$0(this.f35942a, view);
            }
        });
        dd6 dd6Var3 = this.mTitleBinding;
        if (dd6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
            dd6Var3 = null;
        }
        dd6Var3.B.setOnClickListener(new View.OnClickListener() { // from class: vn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordEditActivity.setListener$lambda$1(this.f37050a, view);
            }
        });
        dd6 dd6Var4 = this.mTitleBinding;
        if (dd6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
        } else {
            dd6Var2 = dd6Var4;
        }
        dd6Var2.C.setOnClickListener(new View.OnClickListener() { // from class: wn1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioRecordEditActivity.setListener$lambda$2(this.f38155a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(AudioRecordEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(AudioRecordEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.recovery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(AudioRecordEditActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateDB();
        this$0.setResult(-1);
        this$0.finish();
    }

    private final void showRenameDialog(final TalkBean talkBean, final TextView textView) {
        final String userName = talkBean.getUserName();
        final SpeakerRenameDialog speakerRenameDialogCreate = SpeakerRenameDialog.INSTANCE.defaultBuilder("rename_speaker").setDialogTitle(wzi.p0).setPositiveText(wzi.O6).setNegativeText(wzi.e).setSpeakerName(userName).create();
        speakerRenameDialogCreate.setShowRename(true);
        speakerRenameDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEditActivity$showRenameDialog$1$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                List<TalkBean> talkList;
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    String nameText = speakerRenameDialogCreate.getNameText();
                    if (StringsKt__StringsKt.isBlank(nameText) || nameText.length() == 0) {
                        ToastUtil.INSTANCE.showToast(wzi.n0);
                        return;
                    }
                    if (!speakerRenameDialogCreate.isReplaceAll()) {
                        talkBean.setUserName(nameText);
                        this.text(textView, nameText);
                        return;
                    }
                    List<TextView> list = this.textViewList;
                    String str = userName;
                    AudioRecordEditActivity audioRecordEditActivity = this;
                    for (TextView textView2 : list) {
                        if (Intrinsics.areEqual(textView2.getText().toString(), str + ":")) {
                            audioRecordEditActivity.text(textView2, nameText);
                        }
                    }
                    MeetingBean meetingBean = this.meetingBean;
                    if (meetingBean == null || (talkList = meetingBean.getTalkList()) == null) {
                        return;
                    }
                    String str2 = userName;
                    for (TalkBean talkBean2 : talkList) {
                        if (Intrinsics.areEqual(talkBean2.getUserName(), str2)) {
                            talkBean2.setUserName(nameText);
                        }
                    }
                }
            }
        });
        speakerRenameDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showSaveDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("save_changes").setDialogDescription(wzi.y0).setPositiveText(wzi.N6).setNegativeText(wzi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEditActivity$showSaveDialog$1$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    this.this$0.updateDB();
                    this.this$0.setResult(-1);
                }
                this.this$0.finish();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showTitleDialog() {
        String newTitle;
        SpeakerRenameDialog.Builder negativeText = SpeakerRenameDialog.INSTANCE.defaultBuilder("rename_speaker").setDialogTitle(wzi.q0).setPositiveText(wzi.O6).setNegativeText(wzi.e);
        MeetingBean meetingBean = this.meetingBean;
        if (meetingBean == null || (newTitle = meetingBean.getNewTitle()) == null) {
            newTitle = "";
        }
        final SpeakerRenameDialog speakerRenameDialogCreate = negativeText.setSpeakerName(UtilsKt.simpleRecordFileName(newTitle)).create();
        speakerRenameDialogCreate.setShowRename(false);
        speakerRenameDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEditActivity$showTitleDialog$1$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    String nameText = speakerRenameDialogCreate.getNameText();
                    if (StringsKt__StringsKt.isBlank(nameText) || nameText.length() == 0) {
                        ToastUtil.INSTANCE.showToast(wzi.n0);
                        return;
                    }
                    MeetingBean meetingBean2 = this.meetingBean;
                    if (Intrinsics.areEqual(meetingBean2 != null ? meetingBean2.getNewTitle() : null, nameText)) {
                        return;
                    }
                    this.getMBinding().C.setText(nameText);
                    MeetingBean meetingBean3 = this.meetingBean;
                    if (meetingBean3 != null) {
                        meetingBean3.setNewTitle(nameText);
                    }
                }
            }
        });
        speakerRenameDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void updateCancelStatus() {
        dd6 dd6Var = null;
        if (this.history.size() > 1) {
            dd6 dd6Var2 = this.mTitleBinding;
            if (dd6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
                dd6Var2 = null;
            }
            dd6Var2.A.setEnabled(true);
            dd6 dd6Var3 = this.mTitleBinding;
            if (dd6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
            } else {
                dd6Var = dd6Var3;
            }
            dd6Var.A.setImageResource(jni.q);
            return;
        }
        dd6 dd6Var4 = this.mTitleBinding;
        if (dd6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
            dd6Var4 = null;
        }
        dd6Var4.A.setEnabled(false);
        dd6 dd6Var5 = this.mTitleBinding;
        if (dd6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
        } else {
            dd6Var = dd6Var5;
        }
        dd6Var.A.setImageResource(jni.f22951r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDB() {
        MeetingBean meetingBean = this.meetingBean;
        if (meetingBean != null) {
            AudioRecordEntity audioRecordEntity = new AudioRecordEntity(meetingBean.getTime(), meetingBean.getTitle(), meetingBean.getNewTitle(), meetingBean.getAddress(), 0L, meetingBean.getStatus(), 0, meetingBean.getFdsName(), null, 336, null);
            ArrayList arrayList = new ArrayList();
            for (TalkBean talkBean : meetingBean.getTalkList()) {
                for (MessageBean messageBean : talkBean.getMsgList()) {
                    arrayList.add(new AsrResultItem(talkBean.getSpeakerId(), messageBean.getStart_time(), talkBean.getUserName(), messageBean.getEnd_time(), messageBean.getContent()));
                }
            }
            audioRecordEntity.setContentList(arrayList);
            AnyExtKt.io$default(null, new AudioRecordEditActivity$updateDB$1$2(audioRecordEntity, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFocus(CustomEditText editText) {
        int iIndexOfChild = getMBinding().A.indexOfChild(editText);
        if (iIndexOfChild > 1) {
            View childAt = getMBinding().A.getChildAt(iIndexOfChild - 1);
            if (childAt instanceof CustomEditText) {
                CustomEditText customEditText = (CustomEditText) childAt;
                customEditText.requestFocus();
                Editable text = customEditText.getText();
                customEditText.setSelection(text != null ? text.length() : 0);
            }
        }
    }

    private final void updateRecoveryStatus() {
        dd6 dd6Var = null;
        if (this.historyBack.isEmpty()) {
            dd6 dd6Var2 = this.mTitleBinding;
            if (dd6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
                dd6Var2 = null;
            }
            dd6Var2.B.setEnabled(false);
            dd6 dd6Var3 = this.mTitleBinding;
            if (dd6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
            } else {
                dd6Var = dd6Var3;
            }
            dd6Var.B.setImageResource(jni.t);
            return;
        }
        dd6 dd6Var4 = this.mTitleBinding;
        if (dd6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
            dd6Var4 = null;
        }
        dd6Var4.B.setEnabled(true);
        dd6 dd6Var5 = this.mTitleBinding;
        if (dd6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBinding");
        } else {
            dd6Var = dd6Var5;
        }
        dd6Var.B.setImageResource(jni.s);
    }

    public final boolean getFlag() {
        return this.flag;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        back();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("");
        this.meetingBean = MeettingDataManager.INSTANCE.get();
        initHeadView();
        setListener();
        initData();
    }

    public final void setFlag(boolean z) {
        this.flag = z;
    }

    public final void text(@NotNull TextView textView, @NotNull String name) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        textView.setText(name + ":");
    }
}
