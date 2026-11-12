package com.huami.phone_call.sms;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.phone_call.sms.PhoneCallEditReplyMsgFragment;
import com.huami.phone_call.sms.base.BaseNavFragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.android.parcel.Parcelize;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0014\u0010\u000e\u001a\u00020\u0002*\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00106R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010<¨\u0006B"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallEditReplyMsgFragment;", "Lcom/huami/phone_call/sms/base/BaseNavFragment;", "", "t", "r", "initView", "w", "", hl.k, "()Ljava/lang/Boolean;", "x", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "enable", SOAP.XMLNS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onBackPressed", "", "tag", "Lcom/huami/phone_call/sms/PhoneCallReplyMsgViewModel;", "b", "Lkotlin/Lazy;", z.j, "()Lcom/huami/phone_call/sms/PhoneCallReplyMsgViewModel;", "viewModel", "Lcom/huami/phone_call/sms/DeviceStatus;", "c", "h", "()Lcom/huami/phone_call/sms/DeviceStatus;", "deviceStatus", GoogleApiAvailabilityLight.a, "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "titleBar", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "limitTv", "Landroid/widget/EditText;", "f", "Landroid/widget/EditText;", "contentEt", "Lcom/huami/phone_call/sms/PhoneCallEditReplyMsgFragment$Companion$ParcelableReplyMsg;", "g", "Lcom/huami/phone_call/sms/PhoneCallEditReplyMsgFragment$Companion$ParcelableReplyMsg;", "msg", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loading", "i", "Z", "isDeviceEnable", "Landroid/view/inputmethod/InputMethodManager;", "()Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "<init>", "()V", "Companion", "a", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallEditReplyMsgFragment extends BaseNavFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String j = "PhoneCallEditReplyMsgFragment";

    @NotNull
    private static final String k = "arg_reply_msg";
    private static final int l = 140;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RainbowTitleBar titleBar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextView limitTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private EditText contentEt;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Companion.ParcelableReplyMsg msg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loading;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isDeviceEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallEditReplyMsgFragment$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "msg", "", "initArguments", "", "ARG_REPLY_MSG", "Ljava/lang/String;", "", "MAX_SIZE", LogUtil.I, "TAG", "<init>", "()V", "ParcelableReplyMsg", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void initArguments(@NotNull Bundle bundle, @NotNull ReplyMsg msg) {
            bundle.putParcelable(PhoneCallEditReplyMsgFragment.k, new ParcelableReplyMsg(msg));
        }

        @Parcelize
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallEditReplyMsgFragment$Companion$ParcelableReplyMsg;", "Landroid/os/Parcelable;", "", "a", "", "b", "id", "content", "c", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", LogUtil.I, "f", "()I", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "msg", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
        public static final /* data */ class ParcelableReplyMsg implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ParcelableReplyMsg> CREATOR = new Creator();

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            private final int id;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            private final String content;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public static final class Creator implements Parcelable.Creator<ParcelableReplyMsg> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ParcelableReplyMsg createFromParcel(@NotNull Parcel parcel) {
                    return new ParcelableReplyMsg(parcel.readInt(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ParcelableReplyMsg[] newArray(int i) {
                    return new ParcelableReplyMsg[i];
                }
            }

            public ParcelableReplyMsg(int i, @NotNull String str) {
                this.id = i;
                this.content = str;
            }

            public static /* synthetic */ ParcelableReplyMsg d(ParcelableReplyMsg parcelableReplyMsg, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = parcelableReplyMsg.id;
                }
                if ((i2 & 2) != 0) {
                    str = parcelableReplyMsg.content;
                }
                return parcelableReplyMsg.c(i, str);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            @NotNull
            public final ParcelableReplyMsg c(int id, @NotNull String content) {
                return new ParcelableReplyMsg(id, content);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final String e() {
                return this.content;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ParcelableReplyMsg)) {
                    return false;
                }
                ParcelableReplyMsg parcelableReplyMsg = (ParcelableReplyMsg) other;
                return this.id == parcelableReplyMsg.id && Intrinsics.areEqual(this.content, parcelableReplyMsg.content);
            }

            public final int f() {
                return this.id;
            }

            public int hashCode() {
                return (this.id * 31) + this.content.hashCode();
            }

            @NotNull
            public String toString() {
                return "ParcelableReplyMsg(id=" + this.id + ", content=" + this.content + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                parcel.writeInt(this.id);
                parcel.writeString(this.content);
            }

            public ParcelableReplyMsg(@NotNull ReplyMsg replyMsg) {
                this(replyMsg.getId(), replyMsg.getContent());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u001e\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"com/huami/phone_call/sms/PhoneCallEditReplyMsgFragment$a", "Landroid/text/InputFilter;", "", "source", "", "start", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "a", "Ljava/util/regex/Pattern;", "pattern", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements InputFilter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Pattern pattern = Pattern.compile("[\\n|\\r]");

        @Override // android.text.InputFilter
        @Nullable
        public CharSequence filter(@NotNull CharSequence source, int start, int end, @NotNull Spanned dest, int dstart, int dend) {
            if (!this.pattern.matcher(source).find()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (start < end) {
                int i = start;
                while (true) {
                    int i2 = start + 1;
                    if (this.pattern.matcher(String.valueOf(source.charAt(start))).matches()) {
                        if (start != i) {
                            spannableStringBuilder.append(source.subSequence(i, start));
                        }
                        i = i2;
                    }
                    if (i2 >= end) {
                        break;
                    }
                    start = i2;
                }
                start = i;
            }
            if (start < end) {
                spannableStringBuilder.append(source.subSequence(start, end));
            }
            return spannableStringBuilder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "enable", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            PhoneCallEditReplyMsgFragment.this.isDeviceEnable = z;
            PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment = PhoneCallEditReplyMsgFragment.this;
            RainbowTitleBar rainbowTitleBar = phoneCallEditReplyMsgFragment.titleBar;
            if (rainbowTitleBar == null) {
                rainbowTitleBar = null;
            }
            phoneCallEditReplyMsgFragment.s(rainbowTitleBar, PhoneCallEditReplyMsgFragment.this.p() && PhoneCallEditReplyMsgFragment.this.isDeviceEnable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Content length(" + this.a.length() + ") is large than max length(140)!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneCallEditReplyMsgFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phone_call.sms.PhoneCallEditReplyMsgFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PhoneCallReplyMsgViewModel>() { // from class: com.huami.phone_call.sms.PhoneCallEditReplyMsgFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phone_call.sms.PhoneCallReplyMsgViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PhoneCallReplyMsgViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PhoneCallReplyMsgViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceStatus = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<DeviceStatus>() { // from class: com.huami.phone_call.sms.PhoneCallEditReplyMsgFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.phone_call.sms.DeviceStatus, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceStatus getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceStatus.class), objArr2, objArr3);
            }
        });
        this.isDeviceEnable = true;
    }

    private final DeviceStatus h() {
        return (DeviceStatus) this.deviceStatus.getValue();
    }

    private final InputMethodManager i() {
        Object systemService = requireActivity().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            return (InputMethodManager) systemService;
        }
        return null;
    }

    private final void initView() {
        String strE;
        View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) contentView.findViewById(R.id.title_bar);
        this.titleBar = rainbowTitleBar;
        if (rainbowTitleBar == null) {
            rainbowTitleBar = null;
        }
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: iw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneCallEditReplyMsgFragment.m(this.a, view);
            }
        });
        RainbowTitleBar rainbowTitleBar2 = this.titleBar;
        if (rainbowTitleBar2 == null) {
            rainbowTitleBar2 = null;
        }
        rainbowTitleBar2.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: lw5
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                PhoneCallEditReplyMsgFragment.n(this.a, view, i);
            }
        });
        RainbowTitleBar rainbowTitleBar3 = this.titleBar;
        if (rainbowTitleBar3 == null) {
            rainbowTitleBar3 = null;
        }
        s(rainbowTitleBar3, false);
        this.contentEt = (EditText) contentView.findViewById(R.id.et_content);
        this.limitTv = (TextView) contentView.findViewById(R.id.tv_limit);
        contentView.setOnClickListener(new View.OnClickListener() { // from class: jw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneCallEditReplyMsgFragment.o(this.a, view);
            }
        });
        EditText editText = this.contentEt;
        if (editText == null) {
            editText = null;
        }
        editText.addTextChangedListener(new TextWatcher() { // from class: com.huami.phone_call.sms.PhoneCallEditReplyMsgFragment$initView$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                this.a.x();
                PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment = this.a;
                RainbowTitleBar rainbowTitleBar4 = phoneCallEditReplyMsgFragment.titleBar;
                if (rainbowTitleBar4 == null) {
                    rainbowTitleBar4 = null;
                }
                phoneCallEditReplyMsgFragment.s(rainbowTitleBar4, this.a.p() && this.a.isDeviceEnable);
            }
        });
        EditText editText2 = this.contentEt;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setFilters(new InputFilter[]{new a(), new ByteLengthInputFilter(140, null, 2, null)});
        Companion.ParcelableReplyMsg parcelableReplyMsg = this.msg;
        if (parcelableReplyMsg == null) {
            strE = null;
        } else {
            strE = parcelableReplyMsg.e();
            if (strE.length() > 140) {
                HMLog.warn$default(j, null, new c(strE), 2, null);
                strE = strE.substring(0, 140);
            }
        }
        if (strE == null || strE.length() == 0) {
            x();
        } else {
            EditText editText3 = this.contentEt;
            if (editText3 == null) {
                editText3 = null;
            }
            editText3.setText(strE);
            EditText editText4 = this.contentEt;
            if (editText4 == null) {
                editText4 = null;
            }
            editText4.setSelection(strE.length());
        }
        EditText editText5 = this.contentEt;
        (editText5 != null ? editText5 : null).post(new Runnable() { // from class: mw5
            @Override // java.lang.Runnable
            public final void run() {
                PhoneCallEditReplyMsgFragment.l(this.a);
            }
        });
        h().initStatusFragment(R.id.device_status_content, getChildFragmentManager(), new b());
    }

    private final PhoneCallReplyMsgViewModel j() {
        return (PhoneCallReplyMsgViewModel) this.viewModel.getValue();
    }

    private final Boolean k() {
        InputMethodManager inputMethodManagerI = i();
        if (inputMethodManagerI == null) {
            return null;
        }
        EditText editText = this.contentEt;
        return Boolean.valueOf(inputMethodManagerI.hideSoftInputFromWindow((editText != null ? editText : null).getWindowToken(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment) {
        phoneCallEditReplyMsgFragment.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment, View view) {
        phoneCallEditReplyMsgFragment.k();
        phoneCallEditReplyMsgFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment, View view, int i) {
        phoneCallEditReplyMsgFragment.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment, View view) {
        phoneCallEditReplyMsgFragment.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        EditText editText = this.contentEt;
        if (editText == null) {
            editText = null;
        }
        String string = editText.getText().toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        String string2 = StringsKt__StringsKt.trim(string).toString();
        Companion.ParcelableReplyMsg parcelableReplyMsg = this.msg;
        String strE = parcelableReplyMsg != null ? parcelableReplyMsg.e() : null;
        return (string2.length() > 0) && (strE == null || !Intrinsics.areEqual(strE, string2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(final PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment, Boolean bool) {
        LoadingDialog loadingDialog = phoneCallEditReplyMsgFragment.loading;
        if (loadingDialog == null) {
            return;
        }
        if (bool.booleanValue()) {
            loadingDialog.setSuccess(phoneCallEditReplyMsgFragment.getString(R.string.save_success), new LoadingDialog.OnAnimEndListener() { // from class: com.huami.phone_call.sms.PhoneCallEditReplyMsgFragment$onCreate$2$1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@Nullable LoadingDialog dialog) {
                    this.a.getBackPressedCallback().setEnabled(false);
                    this.a.requireActivity().onBackPressed();
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@Nullable LoadingDialog dialog) {
                }
            });
        } else {
            loadingDialog.setFailed(phoneCallEditReplyMsgFragment.getString(R.string.save_failed));
        }
    }

    private final void r() {
        LoadingDialog loadingDialog = new LoadingDialog(requireContext());
        loadingDialog.setCancelable(false);
        loadingDialog.setMessage(getString(R.string.saving));
        Unit unit = Unit.INSTANCE;
        this.loading = loadingDialog;
        loadingDialog.show();
        k();
        EditText editText = this.contentEt;
        if (editText == null) {
            editText = null;
        }
        String string = editText.getText().toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        String string2 = StringsKt__StringsKt.trim(string).toString();
        Companion.ParcelableReplyMsg parcelableReplyMsg = this.msg;
        j().addOrUpdate(new ReplyMsg(parcelableReplyMsg == null ? (int) (System.currentTimeMillis() / ((long) 1000)) : parcelableReplyMsg.f(), string2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(RainbowTitleBar rainbowTitleBar, boolean z) {
        rainbowTitleBar.setMenuEnable(0, z);
    }

    private final void t() {
        new AlertDialogFragment.Builder(requireContext()).setMessage(R.string.discard_tips).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: hw5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PhoneCallEditReplyMsgFragment.u(dialogInterface, i);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: gw5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PhoneCallEditReplyMsgFragment.v(this.a, dialogInterface, i);
            }
        }).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(PhoneCallEditReplyMsgFragment phoneCallEditReplyMsgFragment, DialogInterface dialogInterface, int i) {
        phoneCallEditReplyMsgFragment.getBackPressedCallback().setEnabled(false);
        phoneCallEditReplyMsgFragment.requireActivity().onBackPressed();
    }

    private final void w() {
        EditText editText = this.contentEt;
        if (editText == null) {
            editText = null;
        }
        editText.requestFocus();
        InputMethodManager inputMethodManagerI = i();
        if (inputMethodManagerI == null) {
            return;
        }
        EditText editText2 = this.contentEt;
        inputMethodManagerI.showSoftInput(editText2 != null ? editText2 : null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        EditText editText = this.contentEt;
        if (editText == null) {
            editText = null;
        }
        String string = editText.getText().toString();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        int length = string.getBytes(charset).length;
        int i = length > 140 ? 0 : 140 - length;
        TextView textView = this.limitTv;
        (textView != null ? textView : null).setText(String.valueOf(i));
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment
    public boolean onBackPressed() {
        if (!p()) {
            return super.onBackPressed();
        }
        t();
        return true;
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.msg = (Companion.ParcelableReplyMsg) arguments.getParcelable(k);
        }
        j().getResultLiveData().observe(this, new Observer() { // from class: kw5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneCallEditReplyMsgFragment.q(this.a, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = getContentView();
        if (contentView != null) {
            return contentView;
        }
        View viewInflate = inflater.inflate(R.layout.fragment_phone_call_reply_msg_edit, container, false);
        setContentView(viewInflate);
        initView();
        return viewInflate;
    }

    @Override // com.huami.phone_call.sms.base.BaseNavFragment
    @NotNull
    public String tag() {
        return j;
    }
}
