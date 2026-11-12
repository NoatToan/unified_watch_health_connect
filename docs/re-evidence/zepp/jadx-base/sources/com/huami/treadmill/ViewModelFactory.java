package com.huami.treadmill;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.treadmill.helper.DataLocator;
import com.huami.treadmill.ui.kings.DiligentKingsViewModel;
import com.huami.treadmill.ui.kings.SpeedKingsViewModel;
import com.huami.treadmill.ui.line.TdmillLineViewModel;
import com.huami.treadmill.ui.linedetail.LineDetailViewModel;
import com.huami.treadmill.ui.record.RecordViewModel;
import com.huami.treadmill.ui.running.LineRunningViewModel;
import com.huami.treadmill.ui.running.LineStartupViewModel;
import com.huami.treadmill.ui.running.RunningViewModel;
import com.huami.treadmill.ui.running.StartupViewModel;
import com.huami.treadmill.ui.setting.PauseViewModel;
import com.huami.treadmill.ui.setting.VariableSpeedViewModel;
import com.huami.treadmill.ui.tdmillhome.TdmillHmViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/treadmill/ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lcom/huami/treadmill/helper/DataLocator;", "a", "Lcom/huami/treadmill/helper/DataLocator;", "dataLocator", "<init>", "(Lcom/huami/treadmill/helper/DataLocator;)V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile ViewModelFactory b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DataLocator dataLocator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/treadmill/ViewModelFactory$Companion;", "", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "Lcom/huami/treadmill/ViewModelFactory;", "getInstance", "", "destroyInstance", "INSTANCE", "Lcom/huami/treadmill/ViewModelFactory;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public final void destroyInstance() {
            ViewModelFactory.b = null;
        }

        @NotNull
        public final ViewModelFactory getInstance(@NotNull Application application) {
            ViewModelFactory viewModelFactory;
            ViewModelFactory viewModelFactory2 = ViewModelFactory.b;
            if (viewModelFactory2 != null) {
                return viewModelFactory2;
            }
            synchronized (ViewModelFactory.class) {
                viewModelFactory = ViewModelFactory.b;
                if (viewModelFactory == null) {
                    viewModelFactory = new ViewModelFactory(DataLocator.INSTANCE.instance(application), null);
                    Companion companion = ViewModelFactory.INSTANCE;
                    ViewModelFactory.b = viewModelFactory;
                }
            }
            return viewModelFactory;
        }
    }

    private ViewModelFactory(DataLocator dataLocator) {
        this.dataLocator = dataLocator;
    }

    public /* synthetic */ ViewModelFactory(DataLocator dataLocator, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataLocator);
    }

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(TdmillHmViewModel.class)) {
            return new TdmillHmViewModel(this.dataLocator.getRepository(true));
        }
        if (modelClass.isAssignableFrom(TdmillLineViewModel.class)) {
            return new TdmillLineViewModel(this.dataLocator.getRepository(true));
        }
        if (modelClass.isAssignableFrom(RecordViewModel.class)) {
            return new RecordViewModel();
        }
        if (modelClass.isAssignableFrom(LineDetailViewModel.class)) {
            return new LineDetailViewModel(this.dataLocator.getRepository(false));
        }
        if (modelClass.isAssignableFrom(DiligentKingsViewModel.class)) {
            return new DiligentKingsViewModel(this.dataLocator.getRepository(true));
        }
        if (modelClass.isAssignableFrom(SpeedKingsViewModel.class)) {
            return new SpeedKingsViewModel(this.dataLocator.getRepository(true));
        }
        if (modelClass.isAssignableFrom(VariableSpeedViewModel.class)) {
            return new VariableSpeedViewModel();
        }
        if (modelClass.isAssignableFrom(PauseViewModel.class)) {
            return new PauseViewModel();
        }
        if (modelClass.isAssignableFrom(StartupViewModel.class)) {
            return new StartupViewModel();
        }
        if (modelClass.isAssignableFrom(LineStartupViewModel.class)) {
            return new LineStartupViewModel(this.dataLocator.getRepository(false));
        }
        if (modelClass.isAssignableFrom(RunningViewModel.class)) {
            return new RunningViewModel();
        }
        if (modelClass.isAssignableFrom(LineRunningViewModel.class)) {
            return new LineRunningViewModel(this.dataLocator.getRepository(false));
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown ViewModel class: ", modelClass.getName()));
    }
}
