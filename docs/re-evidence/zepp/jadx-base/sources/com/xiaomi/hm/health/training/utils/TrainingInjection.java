package com.xiaomi.hm.health.training.utils;

import android.app.Application;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.ViewModel;
import com.danikula.videocache.HttpProxyCacheServer;
import com.danikula.videocache.file.FileNameGenerator;
import com.danikula.videocache.file.Md5FileNameGenerator;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.UserData;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.training.api.CloudTrainingDataSource;
import com.xiaomi.hm.health.training.api.TrainingDataSource;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.helper.Delayer;
import com.xiaomi.hm.health.training.helper.HandlerDelayer;
import com.xiaomi.hm.health.training.navigation.TrainingNavigationController;
import com.xiaomi.hm.health.training.repository.FeaturedCoursePlayRepo;
import com.xiaomi.hm.health.training.ui.viewmodel.ActionOrYogaTrainingListViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseDetailViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseListViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCoursePartnerViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCoursePayViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCoursePlayViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.MainViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.StatusTrainingViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.TrainingKnowledgeListViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.TrainingViewModelFactory;
import com.xiaomi.hm.health.training.utils.RealTimeHrHandler;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingInjection {
    private static final String f = "TrainingInjection";
    private static volatile TrainingInjection g;
    private Application a;
    private TrainingDataSource b;
    private TrainingViewModelFactory c;
    private TrainingNavigationController d;
    private HttpProxyCacheServer e;

    public class a implements FileNameGenerator {
        public Md5FileNameGenerator a = new Md5FileNameGenerator();

        public a() {
        }

        @Override // com.danikula.videocache.file.FileNameGenerator
        public String generate(String str) {
            int iIndexOf = str.indexOf("?");
            if (iIndexOf >= 0) {
                str = str.substring(0, iIndexOf);
            }
            return this.a.generate(str);
        }
    }

    private TrainingInjection() {
    }

    private Provider<String> A() {
        return new Provider() { // from class: hw7
            @Override // javax.inject.Provider
            public final Object get() {
                return TrainingInjection.y();
            }
        };
    }

    private Provider<User> B() {
        return new Provider() { // from class: iw7
            @Override // javax.inject.Provider
            public final Object get() {
                return TrainingInjection.z();
            }
        };
    }

    public static TrainingInjection get() {
        if (g == null) {
            synchronized (TrainingInjection.class) {
                if (g == null) {
                    g = new TrainingInjection();
                }
            }
        }
        return g;
    }

    private Application m() {
        return this.a;
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>> n() {
        HashMap map = new HashMap(1);
        map.put(MainViewModel.class, new Provider() { // from class: tw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.p();
            }
        });
        map.put(StatusTrainingViewModel.class, new Provider() { // from class: qw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.q();
            }
        });
        map.put(FeaturedCourseDetailViewModel.class, new Provider() { // from class: pw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.r();
            }
        });
        map.put(FeaturedCourseListViewModel.class, new Provider() { // from class: mw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.s();
            }
        });
        map.put(ActionOrYogaTrainingListViewModel.class, new Provider() { // from class: sw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.t();
            }
        });
        map.put(TrainingKnowledgeListViewModel.class, new Provider() { // from class: nw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.u();
            }
        });
        map.put(FeaturedCoursePayViewModel.class, new Provider() { // from class: ow7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.v();
            }
        });
        map.put(FeaturedCoursePlayViewModel.class, new Provider() { // from class: lw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.w();
            }
        });
        map.put(FeaturedCoursePartnerViewModel.class, new Provider() { // from class: rw7
            @Override // javax.inject.Provider
            public final Object get() {
                return this.a.x();
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object o() {
        return "创建HttpProxyCacheServer失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel p() {
        return new MainViewModel(getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel q() {
        return new StatusTrainingViewModel(getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel r() {
        return new FeaturedCourseDetailViewModel(getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel s() {
        return new FeaturedCourseListViewModel(getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel t() {
        return new ActionOrYogaTrainingListViewModel(m(), getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel u() {
        return new TrainingKnowledgeListViewModel(getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel v() {
        return new FeaturedCoursePayViewModel(getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel w() {
        return new FeaturedCoursePlayViewModel(new FeaturedCoursePlayRepo(getDataSource(), provideRealTimeHrHandler().get()), provideDelayer().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewModel x() {
        return new FeaturedCoursePartnerViewModel(getDataSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y() {
        return LocWeatherManager.getInstance().getLocationAddressCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ User z() {
        UserData userData = UserData.get();
        return new User.Builder().setUid(userData.getUid()).setGender(userData.getGender() == 1).setAge(userData.getAge()).setBoundHrDevice(DeviceCenter.getInstance().hasBoundBandHrDevice()).build();
    }

    public TrainingDataSource getDataSource() {
        if (this.b == null) {
            this.b = new CloudTrainingDataSource(m(), B(), A());
        }
        return this.b;
    }

    @Nullable
    public HttpProxyCacheServer getFeaturedCourseCacheServer() {
        if (this.e == null) {
            try {
                this.e = new HttpProxyCacheServer.Builder(m()).cacheDirectory(FileUtils.getTrainingDir()).maxCacheSize(2147483648L).fileNameGenerator(new a()).build();
            } catch (Exception e) {
                Loggers.getLogger().e(f, e, new Supplier() { // from class: gw7
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return TrainingInjection.o();
                    }
                });
            }
        }
        return this.e;
    }

    public TrainingNavigationController getNavigationController() {
        if (this.d == null) {
            this.d = new TrainingNavigationController();
        }
        return this.d;
    }

    public TrainingViewModelFactory getViewModelFactory() {
        if (this.c == null) {
            this.c = new TrainingViewModelFactory(n());
        }
        return this.c;
    }

    public void init(Application application) {
        this.a = application;
    }

    public Provider<Delayer> provideDelayer() {
        return new Provider() { // from class: jw7
            @Override // javax.inject.Provider
            public final Object get() {
                return new HandlerDelayer();
            }
        };
    }

    public Provider<RealTimeHrHandler> provideRealTimeHrHandler() {
        return new Provider() { // from class: kw7
            @Override // javax.inject.Provider
            public final Object get() {
                return new RealTimeHrHandler();
            }
        };
    }
}
