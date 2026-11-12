package com.huami.message.viewmodel;

import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.message.api.WebConst;
import com.huami.message.repo.MessageCountRepo;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.message.vo.UnreadMessageVo;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.Pair;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b}\u0010~J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u0017\u0010\u001a\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010!R\"\u00103\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R<\u0010=\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 6*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R<\u0010A\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 6*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R<\u0010E\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 6*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R<\u0010I\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 6*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R<\u0010N\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020J 6*\n\u0012\u0004\u0012\u00020J\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u00108\u001a\u0004\bL\u0010:\"\u0004\bM\u0010<R<\u0010R\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 6*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u00108\u001a\u0004\bP\u0010:\"\u0004\bQ\u0010<R\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010!R\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010!R\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010!R(\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110Z0\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010!R\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010!R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010!R<\u0010d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 6*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u00108\u001a\u0004\bb\u0010:\"\u0004\bc\u0010<R<\u0010h\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 6*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u00108\u001a\u0004\bf\u0010:\"\u0004\bg\u0010<R<\u0010l\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 6*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u00108\u001a\u0004\bj\u0010:\"\u0004\bk\u0010<R<\u0010p\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 6*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u00108\u001a\u0004\bn\u0010:\"\u0004\bo\u0010<R<\u0010t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 6*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u00108\u001a\u0004\br\u0010:\"\u0004\bs\u0010<R<\u0010x\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 6*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u00108\u001a\u0004\bv\u0010:\"\u0004\bw\u0010<R<\u0010|\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 6*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010505048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u00108\u001a\u0004\bz\u0010:\"\u0004\b{\u0010<¨\u0006\u007f"}, d2 = {"Lcom/huami/message/viewmodel/MessageCountViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/MutableLiveData;", "", "trigger", "", b.r, "loadAll", "loadUserMessage", "loadUserNotice", "loadPraise", "loadComment", "loadMessageCntVo", "markAll", "markUserMessage", "", WebConst.QueryParam.MESSAGE_ID, "", "count", "markChatMessage", "", "enterTime", "markPraiseFavCollect", "markCommentReply", "markNotice", "markNoticeMidong", "updateNotificationCountAsRead", "(Ljava/lang/Long;)V", "Lcom/huami/message/repo/MessageCountRepo;", "a", "Lcom/huami/message/repo/MessageCountRepo;", CommonLanguageSettingFragment.KEY_REPO, "b", "Landroidx/lifecycle/MutableLiveData;", "allLoadTrigger", "c", "messageLoadTrigger", GoogleApiAvailabilityLight.a, "praiseLoadTrigger", "e", "commentLoadTrigger", "f", "messageCntVoTrigger", "g", "noticeLoadTrigger", "h", "Z", "getFirstSelectMark", "()Z", "setFirstSelectMark", "(Z)V", "firstSelectMark", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "kotlin.jvm.PlatformType", "i", "Landroidx/lifecycle/LiveData;", "getAllResult", "()Landroidx/lifecycle/LiveData;", "setAllResult", "(Landroidx/lifecycle/LiveData;)V", "allResult", z.j, "getUserMsgResult", "setUserMsgResult", "userMsgResult", hl.k, "getPraiseResult", "setPraiseResult", "praiseResult", "l", "getCommentResult", "setCommentResult", "commentResult", "Lcom/huami/message/vo/UnreadMessageVo;", "m", "getMessageCntVoResult", "setMessageCntVoResult", "messageCntVoResult", GoogleApiAvailabilityLight.b, "getUserNoticeResult", "setUserNoticeResult", "userNoticeResult", "o", "allUpdateTrigger", "msgUpdateTrigger", DTransferConstants.SEARCH_KEY, "praiseUpdateTrigger", "r", "commentUpdateTrigger", "Lkotlin/Pair;", SOAP.XMLNS, "chatMsgUpdateTrigger", "t", "noticeUpdateTrigger", "u", "noticeUpdateTriggerMidong", "v", "getAllUpdateResult", "setAllUpdateResult", "allUpdateResult", "w", "getUserMsgUpdateResult", "setUserMsgUpdateResult", "userMsgUpdateResult", "x", "getChatMsgUpdateResult", "setChatMsgUpdateResult", "chatMsgUpdateResult", "y", "getPraiseUpdateResult", "setPraiseUpdateResult", "praiseUpdateResult", "z", "getCommentUpdateResult", "setCommentUpdateResult", "commentUpdateResult", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getNoticeUpdateResult", "setNoticeUpdateResult", "noticeUpdateResult", "B", "getNoticeUpdateResultMidong", "setNoticeUpdateResultMidong", "noticeUpdateResultMidong", "<init>", "(Lcom/huami/message/repo/MessageCountRepo;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class MessageCountViewModel extends ViewModel {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Boolean>> noticeUpdateResult;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Boolean>> noticeUpdateResultMidong;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MessageCountRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> allLoadTrigger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> messageLoadTrigger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> praiseLoadTrigger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> commentLoadTrigger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> messageCntVoTrigger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> noticeLoadTrigger;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean firstSelectMark;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Integer>> allResult;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Integer>> userMsgResult;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Integer>> praiseResult;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Integer>> commentResult;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<UnreadMessageVo>> messageCntVoResult;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Integer>> userNoticeResult;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> allUpdateTrigger;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> msgUpdateTrigger;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> praiseUpdateTrigger;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> commentUpdateTrigger;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<String, Integer>> chatMsgUpdateTrigger;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> noticeUpdateTrigger;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> noticeUpdateTriggerMidong;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Boolean>> allUpdateResult;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Boolean>> userMsgUpdateResult;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Boolean>> chatMsgUpdateResult;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Boolean>> praiseUpdateResult;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Boolean>> commentUpdateResult;

    public MessageCountViewModel(@NotNull MessageCountRepo messageCountRepo) {
        this.repo = messageCountRepo;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.allLoadTrigger = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.messageLoadTrigger = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.praiseLoadTrigger = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.commentLoadTrigger = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.messageCntVoTrigger = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        this.noticeLoadTrigger = mutableLiveData6;
        this.allResult = Transformations.switchMap(mutableLiveData, new Function() { // from class: e15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.q(this.a, (Boolean) obj);
            }
        });
        this.userMsgResult = Transformations.switchMap(mutableLiveData2, new Function() { // from class: v05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.A(this.a, (Boolean) obj);
            }
        });
        this.praiseResult = Transformations.switchMap(mutableLiveData3, new Function() { // from class: c15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.y(this.a, (Boolean) obj);
            }
        });
        this.commentResult = Transformations.switchMap(mutableLiveData4, new Function() { // from class: z05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.t(this.a, (Boolean) obj);
            }
        });
        this.messageCntVoResult = Transformations.switchMap(mutableLiveData5, new Function() { // from class: d15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.v(this.a, (Boolean) obj);
            }
        });
        this.userNoticeResult = Transformations.switchMap(mutableLiveData6, new Function() { // from class: f15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.C(this.a, (Boolean) obj);
            }
        });
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        this.allUpdateTrigger = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.msgUpdateTrigger = mutableLiveData8;
        MutableLiveData<Long> mutableLiveData9 = new MutableLiveData<>();
        this.praiseUpdateTrigger = mutableLiveData9;
        MutableLiveData<Long> mutableLiveData10 = new MutableLiveData<>();
        this.commentUpdateTrigger = mutableLiveData10;
        MutableLiveData<Pair<String, Integer>> mutableLiveData11 = new MutableLiveData<>();
        this.chatMsgUpdateTrigger = mutableLiveData11;
        MutableLiveData<Long> mutableLiveData12 = new MutableLiveData<>();
        this.noticeUpdateTrigger = mutableLiveData12;
        MutableLiveData<Long> mutableLiveData13 = new MutableLiveData<>();
        this.noticeUpdateTriggerMidong = mutableLiveData13;
        this.allUpdateResult = Transformations.switchMap(mutableLiveData7, new Function() { // from class: b15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.r(this.a, (Boolean) obj);
            }
        });
        this.userMsgUpdateResult = Transformations.switchMap(mutableLiveData8, new Function() { // from class: a15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.B(this.a, (Boolean) obj);
            }
        });
        this.chatMsgUpdateResult = Transformations.switchMap(mutableLiveData11, new Function() { // from class: y05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.s(this.a, (Pair) obj);
            }
        });
        this.praiseUpdateResult = Transformations.switchMap(mutableLiveData9, new Function() { // from class: g15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.z(this.a, (Long) obj);
            }
        });
        this.commentUpdateResult = Transformations.switchMap(mutableLiveData10, new Function() { // from class: h15
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.u(this.a, (Long) obj);
            }
        });
        this.noticeUpdateResult = Transformations.switchMap(mutableLiveData12, new Function() { // from class: x05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.w(this.a, (Long) obj);
            }
        });
        this.noticeUpdateResultMidong = Transformations.switchMap(mutableLiveData13, new Function() { // from class: w05
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return MessageCountViewModel.x(this.a, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData A(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.loadUnreadUserMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData B(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.updateUserMessageCountAsRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData C(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.loadUnreadNotificationMessageCount();
    }

    private final void p(MutableLiveData<Boolean> trigger) {
        if (trigger.getValue() == null) {
            trigger.setValue(Boolean.FALSE);
        } else {
            trigger.setValue(Boolean.valueOf(!trigger.getValue().booleanValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData q(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.loadAllUnreadMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData r(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.updateAllMessageCountAsRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData s(MessageCountViewModel messageCountViewModel, Pair pair) {
        return messageCountViewModel.repo.updateChatMessageCountAsRead((String) pair.getFirst(), ((Number) pair.getSecond()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData t(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.loadUnreadCommentCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData u(MessageCountViewModel messageCountViewModel, Long l) {
        return messageCountViewModel.repo.updateCommentCountAsRead(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData v(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.loadUnreadMessageCountVo(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData w(MessageCountViewModel messageCountViewModel, Long l) {
        return messageCountViewModel.repo.updateNotificationCountAsRead(l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData x(MessageCountViewModel messageCountViewModel, Long l) {
        return messageCountViewModel.repo.updateNotificationCountAsMidongRead(l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData y(MessageCountViewModel messageCountViewModel, Boolean bool) {
        return messageCountViewModel.repo.loadUnreadPraiseFavFollowCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData z(MessageCountViewModel messageCountViewModel, Long l) {
        return messageCountViewModel.repo.updatePraiseFavFollowCountAsRead(l);
    }

    @NotNull
    public final LiveData<Resource<Integer>> getAllResult() {
        return this.allResult;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getAllUpdateResult() {
        return this.allUpdateResult;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getChatMsgUpdateResult() {
        return this.chatMsgUpdateResult;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getCommentResult() {
        return this.commentResult;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getCommentUpdateResult() {
        return this.commentUpdateResult;
    }

    public final boolean getFirstSelectMark() {
        return this.firstSelectMark;
    }

    @NotNull
    public final LiveData<Resource<UnreadMessageVo>> getMessageCntVoResult() {
        return this.messageCntVoResult;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getNoticeUpdateResult() {
        return this.noticeUpdateResult;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getNoticeUpdateResultMidong() {
        return this.noticeUpdateResultMidong;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getPraiseResult() {
        return this.praiseResult;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getPraiseUpdateResult() {
        return this.praiseUpdateResult;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getUserMsgResult() {
        return this.userMsgResult;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getUserMsgUpdateResult() {
        return this.userMsgUpdateResult;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getUserNoticeResult() {
        return this.userNoticeResult;
    }

    public final void loadAll() {
        p(this.allLoadTrigger);
    }

    public final void loadComment() {
        p(this.commentLoadTrigger);
    }

    public final void loadMessageCntVo() {
        p(this.messageCntVoTrigger);
    }

    public final void loadPraise() {
        p(this.praiseLoadTrigger);
    }

    public final void loadUserMessage() {
        p(this.messageLoadTrigger);
    }

    public final void loadUserNotice() {
        p(this.noticeLoadTrigger);
    }

    public final void markAll() {
        p(this.allUpdateTrigger);
    }

    public final void markChatMessage(@NotNull String messageId, int count) {
        this.chatMsgUpdateTrigger.setValue(new Pair<>(messageId, Integer.valueOf(count)));
    }

    public final void markCommentReply(long enterTime) {
        this.commentUpdateTrigger.setValue(Long.valueOf(enterTime));
    }

    public final void markNotice(long enterTime) {
        this.noticeUpdateTrigger.setValue(Long.valueOf(enterTime));
    }

    public final void markNoticeMidong(long enterTime) {
        this.noticeUpdateTriggerMidong.setValue(Long.valueOf(enterTime));
    }

    public final void markPraiseFavCollect(long enterTime) {
        this.praiseUpdateTrigger.setValue(Long.valueOf(enterTime));
    }

    public final void markUserMessage() {
        p(this.msgUpdateTrigger);
    }

    public final void setAllResult(@NotNull LiveData<Resource<Integer>> liveData) {
        this.allResult = liveData;
    }

    public final void setAllUpdateResult(@NotNull LiveData<Resource<Boolean>> liveData) {
        this.allUpdateResult = liveData;
    }

    public final void setChatMsgUpdateResult(@NotNull LiveData<Resource<Boolean>> liveData) {
        this.chatMsgUpdateResult = liveData;
    }

    public final void setCommentResult(@NotNull LiveData<Resource<Integer>> liveData) {
        this.commentResult = liveData;
    }

    public final void setCommentUpdateResult(@NotNull LiveData<Resource<Boolean>> liveData) {
        this.commentUpdateResult = liveData;
    }

    public final void setFirstSelectMark(boolean z) {
        this.firstSelectMark = z;
    }

    public final void setMessageCntVoResult(@NotNull LiveData<Resource<UnreadMessageVo>> liveData) {
        this.messageCntVoResult = liveData;
    }

    public final void setNoticeUpdateResult(@NotNull LiveData<Resource<Boolean>> liveData) {
        this.noticeUpdateResult = liveData;
    }

    public final void setNoticeUpdateResultMidong(@NotNull LiveData<Resource<Boolean>> liveData) {
        this.noticeUpdateResultMidong = liveData;
    }

    public final void setPraiseResult(@NotNull LiveData<Resource<Integer>> liveData) {
        this.praiseResult = liveData;
    }

    public final void setPraiseUpdateResult(@NotNull LiveData<Resource<Boolean>> liveData) {
        this.praiseUpdateResult = liveData;
    }

    public final void setUserMsgResult(@NotNull LiveData<Resource<Integer>> liveData) {
        this.userMsgResult = liveData;
    }

    public final void setUserMsgUpdateResult(@NotNull LiveData<Resource<Boolean>> liveData) {
        this.userMsgUpdateResult = liveData;
    }

    public final void setUserNoticeResult(@NotNull LiveData<Resource<Integer>> liveData) {
        this.userNoticeResult = liveData;
    }

    public final void updateNotificationCountAsRead(@Nullable Long enterTime) {
        this.repo.updateNotificationCountAsRead(enterTime);
    }
}
