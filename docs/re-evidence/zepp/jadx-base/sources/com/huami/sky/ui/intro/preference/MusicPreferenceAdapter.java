package com.huami.sky.ui.intro.preference;

import android.content.Context;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.analytic.SkyPreferenceEventKt;
import com.huami.sky.ui.databinding.SkyItemPreferenceBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.intro.preference.MusicPreferenceAdapter;
import com.huami.sky.ui.play.control.IPlayback;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sky.ui.view.SkyPlayView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u0006R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u001d\u0010'\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b%\u0010&¨\u0006-"}, d2 = {"Lcom/huami/sky/ui/intro/preference/MusicPreferenceAdapter;", "Lcom/huami/sky/ui/intro/preference/SelectedAdapter;", "Lorg/koin/core/component/KoinComponent;", "", "currentPosition", "playState", "", "m", "Lcom/huami/sky/ui/intro/preference/SelectedViewHolder;", "holder", GoogleApiAvailabilityLight.b, "", "isVisible", z.j, "position", "l", hl.k, "isNeedUpdatePlayState", "f", "Landroid/view/ViewGroup;", "parent", "viewType", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMyCreateViewHolder", "onSelectBindViewHolder", "stopAndReleasePlay", "h", "Z", "Lcom/huami/sky/ui/play/control/IPlayback;", "i", "Lkotlin/Lazy;", "e", "()Lcom/huami/sky/ui/play/control/IPlayback;", "playerControl", LogUtil.I, "currentPlayPosition", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", GoogleApiAvailabilityLight.a, "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onFocusChangeListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class MusicPreferenceAdapter extends SelectedAdapter implements KoinComponent {

    @NotNull
    private static final String l = "MusicPreference";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isNeedUpdatePlayState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy playerControl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int currentPlayPosition;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy onFocusChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/media/AudioManager$OnAudioFocusChangeListener;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AudioManager.OnAudioFocusChangeListener> {

        /* JADX INFO: renamed from: com.huami.sky.ui.intro.preference.MusicPreferenceAdapter$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0556a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0556a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "OnAudioFocusChange: " + this.a;
            }
        }

        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(MusicPreferenceAdapter musicPreferenceAdapter, int i) {
            HMLog.info(MusicPreferenceAdapter.l, new C0556a(i));
            if (i == -1) {
                musicPreferenceAdapter.m(musicPreferenceAdapter.currentPlayPosition, 2);
                musicPreferenceAdapter.e().stop();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AudioManager.OnAudioFocusChangeListener invoke() {
            final MusicPreferenceAdapter musicPreferenceAdapter = MusicPreferenceAdapter.this;
            return new AudioManager.OnAudioFocusChangeListener() { // from class: com.huami.sky.ui.intro.preference.a
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    MusicPreferenceAdapter.a.c(musicPreferenceAdapter, i);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ SelectEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SelectEntity selectEntity) {
            super(0);
            this.a = selectEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isNeedUpdatePlayState playState: " + this.a.getPlayState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SelectedViewHolder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SelectedViewHolder selectedViewHolder) {
            super(0);
            this.a = selectedViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.getBinding().playAnim.cancelAnimation();
            this.a.getBinding().playAnim.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stopAndReleasePlay";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updatePlayState: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get music duration: " + MusicPreferenceAdapter.this.e().getDuration();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicPreferenceAdapter(@NotNull Context context) {
        super(context);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playerControl = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IPlayback>() { // from class: com.huami.sky.ui.intro.preference.MusicPreferenceAdapter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.ui.play.control.IPlayback, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IPlayback invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IPlayback.class), qualifier, objArr);
            }
        });
        this.currentPlayPosition = -1;
        this.onFocusChangeListener = LazyKt__LazyJVMKt.lazy(new a());
        e().setCallback(new IPlayback.ICallback() { // from class: com.huami.sky.ui.intro.preference.MusicPreferenceAdapter.1

            /* JADX INFO: renamed from: com.huami.sky.ui.intro.preference.MusicPreferenceAdapter$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onPlayEnd";
                }
            }

            /* JADX INFO: renamed from: com.huami.sky.ui.intro.preference.MusicPreferenceAdapter$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onPlayError";
                }
            }

            /* JADX INFO: renamed from: com.huami.sky.ui.intro.preference.MusicPreferenceAdapter$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public static final c a = new c();

                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onPlayStart";
                }
            }

            @Override // com.huami.sky.ui.play.control.IPlayback.ICallback
            public void onPlayEnd() {
                MusicPreferenceAdapter musicPreferenceAdapter = MusicPreferenceAdapter.this;
                musicPreferenceAdapter.m(musicPreferenceAdapter.currentPlayPosition, 2);
                HMLog.info(MusicPreferenceAdapter.l, a.a);
            }

            @Override // com.huami.sky.ui.play.control.IPlayback.ICallback
            public void onPlayError() {
                MusicPreferenceAdapter musicPreferenceAdapter = MusicPreferenceAdapter.this;
                musicPreferenceAdapter.m(musicPreferenceAdapter.currentPlayPosition, 3);
                HMLog.info(MusicPreferenceAdapter.l, b.a);
            }

            @Override // com.huami.sky.ui.play.control.IPlayback.ICallback
            public void onPlayStart() {
                HMLog.info(MusicPreferenceAdapter.l, c.a);
                MusicPreferenceAdapter.this.e().requestAudioFocus(MusicPreferenceAdapter.this.d());
                MusicPreferenceAdapter musicPreferenceAdapter = MusicPreferenceAdapter.this;
                musicPreferenceAdapter.m(musicPreferenceAdapter.currentPlayPosition, 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioManager.OnAudioFocusChangeListener d() {
        return (AudioManager.OnAudioFocusChangeListener) this.onFocusChangeListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPlayback e() {
        return (IPlayback) this.playerControl.getValue();
    }

    private final void f(int position, boolean isNeedUpdatePlayState) {
        this.isNeedUpdatePlayState = isNeedUpdatePlayState;
        notifyItemChanged(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SelectedViewHolder selectedViewHolder, MusicPreferenceAdapter musicPreferenceAdapter, View view) {
        int adapterPosition = selectedViewHolder.getAdapterPosition() - musicPreferenceAdapter.getHeadCount();
        SelectEntity selectEntity = musicPreferenceAdapter.getDataLists().get(adapterPosition);
        selectEntity.setSelected(!selectEntity.isSelected());
        musicPreferenceAdapter.f(selectedViewHolder.getAdapterPosition(), false);
        if (selectEntity.isSelected()) {
            if (selectEntity.getPreferenceItem().getMusicUrl().length() == 0) {
                musicPreferenceAdapter.l(adapterPosition);
            } else {
                int i = 0;
                for (Object obj : musicPreferenceAdapter.getDataLists()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    SelectEntity selectEntity2 = (SelectEntity) obj;
                    if ((selectEntity2.getPreferenceItem().getMusicUrl().length() == 0) && selectEntity2.isSelected()) {
                        selectEntity2.setSelected(false);
                        musicPreferenceAdapter.notifyItemChanged(i + musicPreferenceAdapter.getHeadCount(), Boolean.FALSE);
                    }
                    i = i2;
                }
            }
        }
        Function3<String, Integer, Boolean, Unit> itemClick = musicPreferenceAdapter.getItemClick();
        if (itemClick == null) {
            return;
        }
        itemClick.invoke(musicPreferenceAdapter.getQuestionTag(), Integer.valueOf(adapterPosition), Boolean.valueOf(musicPreferenceAdapter.getDataLists().get(adapterPosition).isSelected()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MusicPreferenceAdapter musicPreferenceAdapter, SelectedViewHolder selectedViewHolder, View view) {
        musicPreferenceAdapter.currentPlayPosition = selectedViewHolder.getAdapterPosition() - musicPreferenceAdapter.getHeadCount();
        SelectEntity selectEntity = musicPreferenceAdapter.getDataLists().get(musicPreferenceAdapter.currentPlayPosition);
        int playState = selectEntity.getPlayState();
        if (playState == 1) {
            musicPreferenceAdapter.m(musicPreferenceAdapter.currentPlayPosition, 2);
            musicPreferenceAdapter.e().stop();
        } else if (playState == 2 || playState == 3) {
            SkyPreferenceEventKt.recordPreferencePlayEvent(musicPreferenceAdapter.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), String.valueOf(selectEntity.getPreferenceItem().getId()));
            if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
                musicPreferenceAdapter.m(musicPreferenceAdapter.currentPlayPosition, 3);
                return;
            }
            musicPreferenceAdapter.m(musicPreferenceAdapter.currentPlayPosition, 0);
            musicPreferenceAdapter.k(musicPreferenceAdapter.currentPlayPosition);
            musicPreferenceAdapter.e().play(selectEntity.getPreferenceItem().getMusicUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SelectedViewHolder selectedViewHolder, MusicPreferenceAdapter musicPreferenceAdapter, View view) {
        String descriptionUrl = musicPreferenceAdapter.getDataLists().get(selectedViewHolder.getAdapterPosition() - musicPreferenceAdapter.getHeadCount()).getPreferenceItem().getDescriptionUrl();
        if (descriptionUrl == null) {
            return;
        }
        WebViewService webViewService = SkyServiceHelperKt.getWebViewService();
        WebItem webItem = new WebItem(descriptionUrl);
        webItem.webTheme = "THEME_DARK";
        Unit unit = Unit.INSTANCE;
        webViewService.launch(webItem);
    }

    private final void j(SelectedViewHolder holder, boolean isVisible) {
        if (!isVisible) {
            SkyExtKt.setAlphaAnimation$default(holder.getBinding().playAnim, 1.0f, 0.0f, 0L, new c(holder), 4, null);
            return;
        }
        holder.getBinding().playAnim.setVisibility(0);
        SkyExtKt.setAlphaAnimation$default(holder.getBinding().playAnim, 0.0f, 1.0f, 0L, null, 12, null);
        holder.getBinding().playAnim.setAnimationFromUrl(getDataLists().get(this.currentPlayPosition).getPreferenceItem().getAnimationUrl());
        holder.getBinding().playAnim.playAnimation();
    }

    private final void k(int currentPosition) {
        int i = 0;
        for (Object obj : getDataLists()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SelectEntity selectEntity = (SelectEntity) obj;
            if (i != currentPosition && selectEntity.getPlayState() != 2) {
                selectEntity.setPlayState(2);
                f(i + getHeadCount(), true);
            }
            i = i2;
        }
    }

    private final void l(int position) {
        int i = 0;
        for (Object obj : getDataLists()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SelectEntity selectEntity = (SelectEntity) obj;
            if (i != position && selectEntity.isSelected()) {
                selectEntity.setSelected(false);
                f(i + getHeadCount(), false);
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int currentPosition, @SkyPlayView.PlayState int playState) {
        HMLog.info(l, new e(playState));
        getDataLists().get(currentPosition).setPlayState(playState);
        f(currentPosition + getHeadCount(), true);
    }

    private final void n(@SkyPlayView.PlayState int playState, SelectedViewHolder holder) {
        if (playState != 1) {
            if (playState != 2) {
                return;
            }
            j(holder, false);
        } else {
            HMLog.info(l, new f());
            holder.getBinding().playView.startWithTime(e().getDuration());
            j(holder, true);
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.sky.ui.intro.preference.SelectedAdapter
    @NotNull
    public RecyclerView.ViewHolder onMyCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        final SelectedViewHolder selectedViewHolder = new SelectedViewHolder(SkyItemPreferenceBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false), false);
        selectedViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ja5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicPreferenceAdapter.g(selectedViewHolder, this, view);
            }
        });
        selectedViewHolder.getBinding().playView.setOnClickListener(new View.OnClickListener() { // from class: ia5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicPreferenceAdapter.h(this.a, selectedViewHolder, view);
            }
        });
        selectedViewHolder.getBinding().desc.setOnClickListener(new View.OnClickListener() { // from class: ka5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicPreferenceAdapter.i(selectedViewHolder, this, view);
            }
        });
        return selectedViewHolder;
    }

    @Override // com.huami.sky.ui.intro.preference.SelectedAdapter
    public void onSelectBindViewHolder(@NotNull SelectedViewHolder holder, int position) {
        SelectEntity selectEntity = getDataLists().get(position - getHeadCount());
        if (selectEntity.getPreferenceItem().getMusicUrl().length() == 0) {
            holder.getBinding().playView.setVisibility(8);
        } else {
            holder.getBinding().playView.setVisibility(0);
        }
        if (!this.isNeedUpdatePlayState) {
            holder.bind(selectEntity);
            return;
        }
        holder.getBinding().playView.updateViewByPlayState(selectEntity.getPlayState());
        HMLog.info(l, new b(selectEntity));
        n(selectEntity.getPlayState(), holder);
    }

    public final void stopAndReleasePlay() {
        HMLog.info(l, d.a);
        e().stop();
        e().release();
        e().abandonAudioFocus(d());
    }
}
