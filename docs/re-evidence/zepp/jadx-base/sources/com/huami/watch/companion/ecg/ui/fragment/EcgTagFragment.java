package com.huami.watch.companion.ecg.ui.fragment;

import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.arch.EcgTagViewModel;
import com.huami.watch.companion.ecg.media.ExoMediaPlayHelper;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import com.huami.watch.companion.ecg.ui.activity.EcgAddTagActivity;
import com.huami.watch.companion.ecg.ui.fragment.EcgTagFragment;
import com.huami.watch.companion.ecg.util.EcgUtils;
import com.huami.watch.companion.ecg.view.voice.DrawCenterTextView;
import com.huami.watch.companion.ecg.view.voice.SpeakButton;
import com.huami.watch.companion.ecg.view.voice.SpeakingPopup;
import com.huami.watch.ui.dialog.AlertDialog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R+\u0010*\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010.R\u001d\u00104\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/fragment/EcgTagFragment;", "Landroidx/fragment/app/Fragment;", "", "chartTime", "", "v", "initView", "initViewModel", "", "path", "x", DTransferConstants.SEARCH_KEY, "Lcom/huami/ecg/core/db/entity/EcgTag;", "tag", "w", "r", hl.k, "t", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStop", "Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper;", "a", "Lkotlin/Lazy;", "h", "()Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper;", "mRecorderHelper", "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", "g", "()Ljava/lang/String;", SOAP.XMLNS, "(Ljava/lang/String;)V", "mFilePath", "Lcom/huami/watch/companion/ecg/view/voice/SpeakingPopup;", "c", "i", "()Lcom/huami/watch/companion/ecg/view/voice/SpeakingPopup;", "mSpeakPopup", "Lcom/huami/watch/companion/ecg/arch/EcgTagViewModel;", GoogleApiAvailabilityLight.a, z.j, "()Lcom/huami/watch/companion/ecg/arch/EcgTagViewModel;", "mViewModel", "Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "e", "Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "mPlayer", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgTagFragment extends Fragment {

    @NotNull
    private static final String g = "Ecg-TagFragment";

    @NotNull
    private static final String h = "ecg_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRecorderHelper = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mFilePath = Delegates.INSTANCE.notNull();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSpeakPopup = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ExoMediaPlayHelper mPlayer;
    public static final /* synthetic */ KProperty<Object>[] f = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcgTagFragment.class, "mFilePath", "getMFilePath()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/fragment/EcgTagFragment$Companion;", "", "", "id", "Lcom/huami/watch/companion/ecg/ui/fragment/EcgTagFragment;", "newInstance", "", "ARGS_ID", "Ljava/lang/String;", "TAG", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EcgTagFragment newInstance(long id) {
            EcgTagFragment ecgTagFragment = new EcgTagFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ecg_id", id);
            Unit unit = Unit.INSTANCE;
            ecgTagFragment.setArguments(bundle);
            return ecgTagFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MediaRecorderHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaRecorderHelper invoke() {
            return new MediaRecorderHelper(EcgTagFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/view/voice/SpeakingPopup;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SpeakingPopup> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpeakingPopup invoke() {
            return new SpeakingPopup(EcgTagFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "play", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (!z) {
                View view = EcgTagFragment.this.getView();
                ((ImageView) (view != null ? view.findViewById(R.id.voice_play) : null)).setImageResource(R.drawable.ic_voice_3);
                return;
            }
            Drawable drawable = ContextCompat.getDrawable(EcgTagFragment.this.requireContext(), R.drawable.voice_play_bg);
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            View view2 = EcgTagFragment.this.getView();
            ((ImageView) (view2 != null ? view2.findViewById(R.id.voice_play) : null)).setImageDrawable(animationDrawable);
            animationDrawable.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "duration", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Long, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            View view = EcgTagFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.tv_duration);
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil(j / 1000.0d));
            sb.append('\"');
            ((TextView) viewFindViewById).setText(sb.toString());
        }
    }

    public EcgTagFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.watch.companion.ecg.ui.fragment.EcgTagFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EcgTagViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.companion.ecg.ui.fragment.EcgTagFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return ((ViewModelStoreOwner) function0.invoke()).getViewModelStore();
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        return (String) this.mFilePath.getValue(this, f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaRecorderHelper h() {
        return (MediaRecorderHelper) this.mRecorderHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpeakingPopup i() {
        return (SpeakingPopup) this.mSpeakPopup.getValue();
    }

    private final void initView() {
        View view = getView();
        ((DrawCenterTextView) (view == null ? null : view.findViewById(R.id.ecg_chart_btn_add_tag))).setOnClickListener(new View.OnClickListener() { // from class: mh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EcgTagFragment.l(this.a, view2);
            }
        });
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.tv_ecg_string_tag))).setOnClickListener(new View.OnClickListener() { // from class: kh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                EcgTagFragment.m(this.a, view3);
            }
        });
        View view3 = getView();
        ((RelativeLayout) (view3 == null ? null : view3.findViewById(R.id.ecg_chart_voice_view))).setOnClickListener(new View.OnClickListener() { // from class: nh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) throws Exception {
                EcgTagFragment.n(this.a, view4);
            }
        });
        View view4 = getView();
        ((ImageView) (view4 != null ? view4.findViewById(R.id.btn_delete) : null)).setOnClickListener(new View.OnClickListener() { // from class: lh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                EcgTagFragment.o(this.a, view5);
            }
        });
    }

    private final void initViewModel() {
        Bundle arguments = getArguments();
        long j = arguments != null ? arguments.getLong("ecg_id", 0L) : 0L;
        v(j);
        j().setEcgId(j);
        j().getEcgTagLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: oh1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgTagFragment.p(this.a, (EcgTag) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgTagViewModel j() {
        return (EcgTagViewModel) this.mViewModel.getValue();
    }

    private final void k() {
        EcgTag value = j().getEcgTagLiveData().getValue();
        if (value == null) {
            return;
        }
        EcgAddTagActivity.INSTANCE.start(this, value.getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(EcgTagFragment ecgTagFragment, View view) {
        ecgTagFragment.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(EcgTagFragment ecgTagFragment, View view) {
        ecgTagFragment.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(EcgTagFragment ecgTagFragment, View view) throws Exception {
        ecgTagFragment.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EcgTagFragment ecgTagFragment, View view) {
        ecgTagFragment.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EcgTagFragment ecgTagFragment, EcgTag ecgTag) {
        EcgTagValue value;
        ecgTagFragment.w(ecgTag);
        if (ecgTag == null || (value = ecgTag.getValue()) == null) {
            return;
        }
        ecgTagFragment.x(value.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String());
    }

    private final void q() {
        View view = getView();
        ((SpeakButton) (view == null ? null : view.findViewById(R.id.ecg_chart_tv_press_to_record))).setStateListener(new SpeakButton.StateListener() { // from class: com.huami.watch.companion.ecg.ui.fragment.EcgTagFragment$initVoice$1
            @Override // com.huami.watch.companion.ecg.view.voice.SpeakButton.StateListener
            public void onCancel() {
                this.a.i().dismissPopup();
                this.a.h().cancel();
            }

            @Override // com.huami.watch.companion.ecg.view.voice.SpeakButton.StateListener
            public void onFinish() {
                this.a.i().dismissPopup();
                this.a.h().stopAndRelease(true);
            }

            @Override // com.huami.watch.companion.ecg.view.voice.SpeakButton.StateListener
            public void onScroll(boolean cancel) {
                this.a.i().changeState(cancel);
            }

            @Override // com.huami.watch.companion.ecg.view.voice.SpeakButton.StateListener
            public void onStart() {
                this.a.h().startRecord(this.a.g());
                SpeakingPopup speakingPopupI = this.a.i();
                View view2 = this.a.getView();
                speakingPopupI.showAsPopupWindow(view2 == null ? null : view2.findViewById(R.id.ecg_chart_tv_press_to_record));
            }
        });
        h().setOnMediaRecordChangeListener(new EcgTagFragment$initVoice$2(this));
    }

    private final void r() throws Exception {
        EcgTagValue value;
        String str;
        EcgTag value2 = j().getEcgTagLiveData().getValue();
        if (value2 == null || (value = value2.getValue()) == null || (str = value.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String()) == null) {
            return;
        }
        if (str.length() > 0) {
            ExoMediaPlayHelper exoMediaPlayHelper = this.mPlayer;
            if (exoMediaPlayHelper != null) {
                exoMediaPlayHelper.setUrl(requireContext(), str, null);
            }
            ExoMediaPlayHelper exoMediaPlayHelper2 = this.mPlayer;
            if (exoMediaPlayHelper2 == null) {
                return;
            }
            exoMediaPlayHelper2.play(new c());
        }
    }

    private final void s(String str) {
        this.mFilePath.setValue(this, f[0], str);
    }

    private final void t() {
        AlertDialog.setMessage(getString(R.string.dialog_msg_delete_voice)).setNegativeBtn(getString(R.string.btn_cancel)).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: jh1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EcgTagFragment.u(this.a, dialogInterface, i);
            }
        }).show(getActivity(), "Tag Voice Delete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EcgTagFragment ecgTagFragment, DialogInterface dialogInterface, int i) {
        ecgTagFragment.j().deleteVoiceTag();
    }

    private final void v(long chartTime) {
        s(new File(requireContext().getExternalFilesDir(Environment.DIRECTORY_MUSIC), chartTime + "_ecg.aac").getAbsolutePath());
    }

    private final void w(EcgTag tag) {
        boolean z = false;
        boolean z2 = tag != null && (tag.hasStringTags() || tag.hasCustomTag());
        if (tag != null && tag.hasVoiceTag()) {
            z = true;
        }
        EcgUtils ecgUtils = EcgUtils.INSTANCE;
        View view = getView();
        ecgUtils.gone(view == null ? null : view.findViewById(R.id.tv_ecg_string_tag), Boolean.valueOf(!z2));
        View view2 = getView();
        ecgUtils.gone(view2 == null ? null : view2.findViewById(R.id.ecg_chart_btn_add_tag), Boolean.valueOf(z2));
        View view3 = getView();
        ecgUtils.gone(view3 == null ? null : view3.findViewById(R.id.ecg_chart_tv_press_to_record), Boolean.valueOf(z));
        View view4 = getView();
        ecgUtils.gone(view4 == null ? null : view4.findViewById(R.id.ecg_chart_voice_view), Boolean.valueOf(!z));
        View view5 = getView();
        ((TextView) (view5 != null ? view5.findViewById(R.id.tv_ecg_string_tag) : null)).setText(ecgUtils.toReadableString(tag, requireContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x(String path) {
        int i = 1;
        boolean z = false;
        Object[] objArr = 0;
        if (path == null || path.length() == 0) {
            View view = getView();
            ((ImageView) (view == null ? null : view.findViewById(R.id.voice_play))).setVisibility(4);
            View view2 = getView();
            ((ProgressBar) (view2 != null ? view2.findViewById(R.id.voice_loading) : null)).setVisibility(0);
            return;
        }
        View view3 = getView();
        ((ImageView) (view3 == null ? null : view3.findViewById(R.id.voice_play))).setVisibility(0);
        View view4 = getView();
        ((ProgressBar) (view4 == null ? null : view4.findViewById(R.id.voice_loading))).setVisibility(8);
        ExoMediaPlayHelper exoMediaPlayHelper = new ExoMediaPlayHelper(z, i, objArr == true ? 1 : 0);
        this.mPlayer = exoMediaPlayHelper;
        exoMediaPlayHelper.setUrl(requireContext(), path, new d());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ecg_tag, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ExoMediaPlayHelper exoMediaPlayHelper = this.mPlayer;
        if (exoMediaPlayHelper == null) {
            return;
        }
        exoMediaPlayHelper.stop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initViewModel();
        q();
    }
}
