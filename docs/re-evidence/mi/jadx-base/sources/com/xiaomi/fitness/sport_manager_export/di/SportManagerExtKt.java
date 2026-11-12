package com.xiaomi.fitness.sport_manager_export.di;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IGym;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u001f\u0010\u0000\u001a\u00020\u000b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0003\u0010\r\"\u001f\u0010\u0000\u001a\u00020\u000f*\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0003\u0010\u0011\"\u001f\u0010\u0000\u001a\u00020\u0013*\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0003\u0010\u0015\"\u001f\u0010\u0000\u001a\u00020\u0017*\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0003\u0010\u0019\"\u001f\u0010\u001b\u001a\u00020\u0017*\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"instance", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState$Companion;", "getInstance", "(Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState$Companion;)Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteState;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData$Companion;", "(Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData$Companion;)Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "instance$delegate$1", "Lcom/xiaomi/fitness/sport_manager_export/listener/IGym;", "Lcom/xiaomi/fitness/sport_manager_export/listener/IGym$Companion;", "(Lcom/xiaomi/fitness/sport_manager_export/listener/IGym$Companion;)Lcom/xiaomi/fitness/sport_manager_export/listener/IGym;", "instance$delegate$2", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISCMRepository;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISCMRepository$Companion;", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ISCMRepository$Companion;)Lcom/xiaomi/fitness/sport_manager_export/listener/ISCMRepository;", "instance$delegate$3", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportManagerPreference;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportManagerPreference$Companion;", "(Lcom/xiaomi/fitness/sport_manager_export/listener/ISportManagerPreference$Companion;)Lcom/xiaomi/fitness/sport_manager_export/listener/ISportManagerPreference;", "instance$delegate$4", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer$Companion;", "(Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer$Companion;)Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;", "instance$delegate$5", "launchInstance", "getLaunchInstance", "launchInstance$delegate", "sport-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportManagerExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uqn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vqn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportManagerExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wqn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportManagerExtKt.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$3 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xqn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportManagerExtKt.instance_delegate$lambda$3();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$4 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yqn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportManagerExtKt.instance_delegate$lambda$4();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$5 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zqn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportManagerExtKt.instance_delegate$lambda$5();
        }
    });

    @NotNull
    private static final Lazy launchInstance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: arn
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportManagerExtKt.launchInstance_delegate$lambda$6();
        }
    });

    @NotNull
    public static final ISportRemoteState getInstance(@NotNull ISportRemoteState.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ISportRemoteState) instance$delegate.getValue();
    }

    @NotNull
    public static final IMusicPlayer getLaunchInstance(@NotNull IMusicPlayer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IMusicPlayer) launchInstance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISportRemoteState instance_delegate$lambda$0() {
        return ((SportManagerEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportManagerEntryPoint.class)).getSportStateCaller();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISportRemoteData instance_delegate$lambda$1() {
        return ((SportManagerEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportManagerEntryPoint.class)).getSportDataCaller();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IGym instance_delegate$lambda$2() {
        return ((GymEntryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), GymEntryPoint.class)).getGym();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISCMRepository instance_delegate$lambda$3() {
        return ((RepositoryPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), RepositoryPoint.class)).getScmRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ISportManagerPreference instance_delegate$lambda$4() {
        return ((SportManagerPreferencePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportManagerPreferencePoint.class)).getPFPoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IMusicPlayer instance_delegate$lambda$5() {
        return ((SportMusicPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportMusicPoint.class)).getMusicPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IMusicPlayer launchInstance_delegate$lambda$6() {
        return ((SportMusicPoint2) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SportMusicPoint2.class)).getMusicPlayer();
    }

    @NotNull
    public static final ISportRemoteData getInstance(@NotNull ISportRemoteData.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ISportRemoteData) instance$delegate$1.getValue();
    }

    @NotNull
    public static final IGym getInstance(@NotNull IGym.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IGym) instance$delegate$2.getValue();
    }

    @NotNull
    public static final ISCMRepository getInstance(@NotNull ISCMRepository.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ISCMRepository) instance$delegate$3.getValue();
    }

    @NotNull
    public static final ISportManagerPreference getInstance(@NotNull ISportManagerPreference.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ISportManagerPreference) instance$delegate$4.getValue();
    }

    @NotNull
    public static final IMusicPlayer getInstance(@NotNull IMusicPlayer.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (IMusicPlayer) instance$delegate$5.getValue();
    }
}
