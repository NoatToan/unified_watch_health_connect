package com.xiaomi.hm.health.databases.model;

import com.xiaomi.hm.health.databases.model.circle.CirclePost;
import com.xiaomi.hm.health.databases.model.circle.CirclePostDao;
import com.xiaomi.hm.health.databases.model.circle.RecomendedUser;
import com.xiaomi.hm.health.databases.model.circle.RecomendedUserDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudio;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudioDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionContentDao;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideoDao;
import com.xiaomi.hm.health.databases.model.trainning.BgMusic;
import com.xiaomi.hm.health.databases.model.trainning.BgMusicDao;
import com.xiaomi.hm.health.databases.model.trainning.Coach;
import com.xiaomi.hm.health.databases.model.trainning.CoachDao;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneActionDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItemDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetailDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRateDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItemDao;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecordDao;
import java.util.Map;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class DaoSession extends AbstractDaoSession {
    private final DaoConfig A;
    private final CirclePostDao A0;
    private final DaoConfig B;
    private final FwDwonSuccessInfoDao B0;
    private final DaoConfig C;
    private final ManualDataDao C0;
    private final DaoConfig D;
    private final AlarmDao D0;
    private final DaoConfig E;
    private final ActivetrackDao E0;
    private final DaoConfig F;
    private final TrackdeathbookDao F0;
    private final DaoConfig G;
    private final ActivetrackhrDao G0;
    private final DaoConfig H;
    private final ReminderDao H0;
    private final DaoConfig I;
    private final AdEntityDao I0;
    private final DaoConfig J;
    private final WeightInfosDao J0;
    private final DaoConfig K;
    private final DeviceDao K0;
    private final DaoConfig L;
    private final TrackdataDao L0;
    private final DaoConfig M;
    private final PushDao M0;
    private final DaoConfig N;
    private final MedalDao N0;
    private final DaoConfig O;
    private final DismissAdvDao O0;
    private final DaoConfig P;
    private final ShoesDataDao P0;
    private final DaoConfig Q;
    private final UserInfosDao Q0;
    private final DaoConfig R;
    private final CompareModelDao R0;
    private final DaoConfig S;
    private final WeightGoalsDao S0;
    private final DaoConfig T;
    private final TrackstatisticsDao T0;
    private final DaoConfig U;
    private final ShoesPartnersDao U0;
    private final DaoConfig V;
    private final FbtEteResultDao V0;
    private final DaoConfig W;
    private final TrainingDetailDao W0;
    private final DaoConfig X;
    private final CoachDao X0;
    private final DaoConfig Y;
    private final TrainingCourseItemDao Y0;
    private final DaoConfig Z;
    private final TrainingCourseDao Z0;
    private final DaoConfig a0;
    private final TrainingItemDao a1;
    private final DaoConfig b0;
    private final ActionVideoDao b1;
    private final DaoConfig c0;
    private final ActionContentDao c1;
    private final DaoConfig d0;
    private final TrainingRecordDao d1;
    private final DaoConfig e;
    private final DaoConfig e0;
    private final BgMusicDao e1;
    private final DaoConfig f;
    private final DaoConfig f0;
    private final HaveDoneActionDao f1;
    private final DaoConfig g;
    private final DaoConfig g0;
    private final ActionAudioDao g1;
    private final DaoConfig h;
    private final DaoConfig h0;
    private final TrainingHeartRateDao h1;
    private final DaoConfig i;
    private final DaoConfig i0;
    private final ConfigDao i1;
    private final DaoConfig j;
    private final DaoConfig j0;
    private final NormandyDataDao j1;
    private final DaoConfig k;
    private final DaoConfig k0;
    private final MyShoesDao k1;
    private final DaoConfig l;
    private final DaoConfig l0;
    private final FbtThaResultDao l1;
    private final DaoConfig m;
    private final DaoConfig m0;
    private final ActivetrackDistanceDao m1;
    private final DaoConfig n;
    private final DateDataDao n0;
    private final ActiveMiPlusShoesDao n1;
    private final DaoConfig o;
    private final HmPropertyDao o0;
    private final AtrialFibrillationDataItemDao o1;
    private final DaoConfig p;
    private final NewCaloriesDao p0;
    private final DetailDao p1;
    private final DaoConfig q;
    private final SensorDataDao q0;
    private final FriendMessageDao q1;
    private final DaoConfig r;
    private final RunconfigDao r0;
    private final HeartRateDao r1;
    private final DaoConfig s;
    private final FriendDao s0;
    private final EarbudDateDataDao s1;
    private final DaoConfig t;
    private final ActivetrackStepDao t0;
    private final EarbudMusicInfoDao t1;
    private final DaoConfig u;
    private final LaunchEntityDao u0;
    private final WatchSkinDao u1;
    private final DaoConfig v;
    private final TrackrecordDao v0;
    private final UserScaleInfoDao v1;
    private final DaoConfig w;
    private final TrackhrDao w0;
    private final DaoConfig x;
    private final ActivetrackBarDao x0;
    private final DaoConfig y;
    private final LabActionDao y0;
    private final DaoConfig z;
    private final RecomendedUserDao z0;

    public DaoSession(Database database, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(database);
        DaoConfig daoConfigM4494clone = map.get(DateDataDao.class).clone();
        this.e = daoConfigM4494clone;
        daoConfigM4494clone.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone2 = map.get(HmPropertyDao.class).clone();
        this.f = daoConfigM4494clone2;
        daoConfigM4494clone2.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone3 = map.get(NewCaloriesDao.class).clone();
        this.g = daoConfigM4494clone3;
        daoConfigM4494clone3.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone4 = map.get(SensorDataDao.class).clone();
        this.h = daoConfigM4494clone4;
        daoConfigM4494clone4.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone5 = map.get(RunconfigDao.class).clone();
        this.i = daoConfigM4494clone5;
        daoConfigM4494clone5.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone6 = map.get(FriendDao.class).clone();
        this.j = daoConfigM4494clone6;
        daoConfigM4494clone6.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone7 = map.get(ActivetrackStepDao.class).clone();
        this.k = daoConfigM4494clone7;
        daoConfigM4494clone7.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone8 = map.get(LaunchEntityDao.class).clone();
        this.l = daoConfigM4494clone8;
        daoConfigM4494clone8.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone9 = map.get(TrackrecordDao.class).clone();
        this.m = daoConfigM4494clone9;
        daoConfigM4494clone9.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone10 = map.get(TrackhrDao.class).clone();
        this.n = daoConfigM4494clone10;
        daoConfigM4494clone10.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone11 = map.get(ActivetrackBarDao.class).clone();
        this.o = daoConfigM4494clone11;
        daoConfigM4494clone11.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone12 = map.get(LabActionDao.class).clone();
        this.p = daoConfigM4494clone12;
        daoConfigM4494clone12.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone13 = map.get(RecomendedUserDao.class).clone();
        this.q = daoConfigM4494clone13;
        daoConfigM4494clone13.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone14 = map.get(CirclePostDao.class).clone();
        this.r = daoConfigM4494clone14;
        daoConfigM4494clone14.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone15 = map.get(FwDwonSuccessInfoDao.class).clone();
        this.s = daoConfigM4494clone15;
        daoConfigM4494clone15.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone16 = map.get(ManualDataDao.class).clone();
        this.t = daoConfigM4494clone16;
        daoConfigM4494clone16.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone17 = map.get(AlarmDao.class).clone();
        this.u = daoConfigM4494clone17;
        daoConfigM4494clone17.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone18 = map.get(ActivetrackDao.class).clone();
        this.v = daoConfigM4494clone18;
        daoConfigM4494clone18.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone19 = map.get(TrackdeathbookDao.class).clone();
        this.w = daoConfigM4494clone19;
        daoConfigM4494clone19.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone20 = map.get(ActivetrackhrDao.class).clone();
        this.x = daoConfigM4494clone20;
        daoConfigM4494clone20.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone21 = map.get(ReminderDao.class).clone();
        this.y = daoConfigM4494clone21;
        daoConfigM4494clone21.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone22 = map.get(AdEntityDao.class).clone();
        this.z = daoConfigM4494clone22;
        daoConfigM4494clone22.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone23 = map.get(WeightInfosDao.class).clone();
        this.A = daoConfigM4494clone23;
        daoConfigM4494clone23.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone24 = map.get(DeviceDao.class).clone();
        this.B = daoConfigM4494clone24;
        daoConfigM4494clone24.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone25 = map.get(TrackdataDao.class).clone();
        this.C = daoConfigM4494clone25;
        daoConfigM4494clone25.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone26 = map.get(PushDao.class).clone();
        this.D = daoConfigM4494clone26;
        daoConfigM4494clone26.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone27 = map.get(MedalDao.class).clone();
        this.E = daoConfigM4494clone27;
        daoConfigM4494clone27.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone28 = map.get(DismissAdvDao.class).clone();
        this.F = daoConfigM4494clone28;
        daoConfigM4494clone28.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone29 = map.get(ShoesDataDao.class).clone();
        this.G = daoConfigM4494clone29;
        daoConfigM4494clone29.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone30 = map.get(UserInfosDao.class).clone();
        this.H = daoConfigM4494clone30;
        daoConfigM4494clone30.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone31 = map.get(CompareModelDao.class).clone();
        this.I = daoConfigM4494clone31;
        daoConfigM4494clone31.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone32 = map.get(WeightGoalsDao.class).clone();
        this.J = daoConfigM4494clone32;
        daoConfigM4494clone32.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone33 = map.get(TrackstatisticsDao.class).clone();
        this.K = daoConfigM4494clone33;
        daoConfigM4494clone33.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone34 = map.get(ShoesPartnersDao.class).clone();
        this.L = daoConfigM4494clone34;
        daoConfigM4494clone34.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone35 = map.get(FbtEteResultDao.class).clone();
        this.M = daoConfigM4494clone35;
        daoConfigM4494clone35.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone36 = map.get(TrainingDetailDao.class).clone();
        this.N = daoConfigM4494clone36;
        daoConfigM4494clone36.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone37 = map.get(CoachDao.class).clone();
        this.O = daoConfigM4494clone37;
        daoConfigM4494clone37.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone38 = map.get(TrainingCourseItemDao.class).clone();
        this.P = daoConfigM4494clone38;
        daoConfigM4494clone38.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone39 = map.get(TrainingCourseDao.class).clone();
        this.Q = daoConfigM4494clone39;
        daoConfigM4494clone39.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone40 = map.get(TrainingItemDao.class).clone();
        this.R = daoConfigM4494clone40;
        daoConfigM4494clone40.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone41 = map.get(ActionVideoDao.class).clone();
        this.S = daoConfigM4494clone41;
        daoConfigM4494clone41.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone42 = map.get(ActionContentDao.class).clone();
        this.T = daoConfigM4494clone42;
        daoConfigM4494clone42.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone43 = map.get(TrainingRecordDao.class).clone();
        this.U = daoConfigM4494clone43;
        daoConfigM4494clone43.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone44 = map.get(BgMusicDao.class).clone();
        this.V = daoConfigM4494clone44;
        daoConfigM4494clone44.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone45 = map.get(HaveDoneActionDao.class).clone();
        this.W = daoConfigM4494clone45;
        daoConfigM4494clone45.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone46 = map.get(ActionAudioDao.class).clone();
        this.X = daoConfigM4494clone46;
        daoConfigM4494clone46.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone47 = map.get(TrainingHeartRateDao.class).clone();
        this.Y = daoConfigM4494clone47;
        daoConfigM4494clone47.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone48 = map.get(ConfigDao.class).clone();
        this.Z = daoConfigM4494clone48;
        daoConfigM4494clone48.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone49 = map.get(NormandyDataDao.class).clone();
        this.a0 = daoConfigM4494clone49;
        daoConfigM4494clone49.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone50 = map.get(MyShoesDao.class).clone();
        this.b0 = daoConfigM4494clone50;
        daoConfigM4494clone50.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone51 = map.get(FbtThaResultDao.class).clone();
        this.c0 = daoConfigM4494clone51;
        daoConfigM4494clone51.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone52 = map.get(ActivetrackDistanceDao.class).clone();
        this.d0 = daoConfigM4494clone52;
        daoConfigM4494clone52.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone53 = map.get(ActiveMiPlusShoesDao.class).clone();
        this.e0 = daoConfigM4494clone53;
        daoConfigM4494clone53.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone54 = map.get(AtrialFibrillationDataItemDao.class).clone();
        this.f0 = daoConfigM4494clone54;
        daoConfigM4494clone54.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone55 = map.get(DetailDao.class).clone();
        this.g0 = daoConfigM4494clone55;
        daoConfigM4494clone55.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone56 = map.get(FriendMessageDao.class).clone();
        this.h0 = daoConfigM4494clone56;
        daoConfigM4494clone56.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone57 = map.get(HeartRateDao.class).clone();
        this.i0 = daoConfigM4494clone57;
        daoConfigM4494clone57.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone58 = map.get(EarbudDateDataDao.class).clone();
        this.j0 = daoConfigM4494clone58;
        daoConfigM4494clone58.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone59 = map.get(EarbudMusicInfoDao.class).clone();
        this.k0 = daoConfigM4494clone59;
        daoConfigM4494clone59.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone60 = map.get(WatchSkinDao.class).clone();
        this.l0 = daoConfigM4494clone60;
        daoConfigM4494clone60.initIdentityScope(identityScopeType);
        DaoConfig daoConfigM4494clone61 = map.get(UserScaleInfoDao.class).clone();
        this.m0 = daoConfigM4494clone61;
        daoConfigM4494clone61.initIdentityScope(identityScopeType);
        DateDataDao dateDataDao = new DateDataDao(daoConfigM4494clone, this);
        this.n0 = dateDataDao;
        HmPropertyDao hmPropertyDao = new HmPropertyDao(daoConfigM4494clone2, this);
        this.o0 = hmPropertyDao;
        NewCaloriesDao newCaloriesDao = new NewCaloriesDao(daoConfigM4494clone3, this);
        this.p0 = newCaloriesDao;
        SensorDataDao sensorDataDao = new SensorDataDao(daoConfigM4494clone4, this);
        this.q0 = sensorDataDao;
        RunconfigDao runconfigDao = new RunconfigDao(daoConfigM4494clone5, this);
        this.r0 = runconfigDao;
        FriendDao friendDao = new FriendDao(daoConfigM4494clone6, this);
        this.s0 = friendDao;
        ActivetrackStepDao activetrackStepDao = new ActivetrackStepDao(daoConfigM4494clone7, this);
        this.t0 = activetrackStepDao;
        LaunchEntityDao launchEntityDao = new LaunchEntityDao(daoConfigM4494clone8, this);
        this.u0 = launchEntityDao;
        TrackrecordDao trackrecordDao = new TrackrecordDao(daoConfigM4494clone9, this);
        this.v0 = trackrecordDao;
        TrackhrDao trackhrDao = new TrackhrDao(daoConfigM4494clone10, this);
        this.w0 = trackhrDao;
        ActivetrackBarDao activetrackBarDao = new ActivetrackBarDao(daoConfigM4494clone11, this);
        this.x0 = activetrackBarDao;
        LabActionDao labActionDao = new LabActionDao(daoConfigM4494clone12, this);
        this.y0 = labActionDao;
        RecomendedUserDao recomendedUserDao = new RecomendedUserDao(daoConfigM4494clone13, this);
        this.z0 = recomendedUserDao;
        CirclePostDao circlePostDao = new CirclePostDao(daoConfigM4494clone14, this);
        this.A0 = circlePostDao;
        FwDwonSuccessInfoDao fwDwonSuccessInfoDao = new FwDwonSuccessInfoDao(daoConfigM4494clone15, this);
        this.B0 = fwDwonSuccessInfoDao;
        ManualDataDao manualDataDao = new ManualDataDao(daoConfigM4494clone16, this);
        this.C0 = manualDataDao;
        AlarmDao alarmDao = new AlarmDao(daoConfigM4494clone17, this);
        this.D0 = alarmDao;
        ActivetrackDao activetrackDao = new ActivetrackDao(daoConfigM4494clone18, this);
        this.E0 = activetrackDao;
        TrackdeathbookDao trackdeathbookDao = new TrackdeathbookDao(daoConfigM4494clone19, this);
        this.F0 = trackdeathbookDao;
        ActivetrackhrDao activetrackhrDao = new ActivetrackhrDao(daoConfigM4494clone20, this);
        this.G0 = activetrackhrDao;
        ReminderDao reminderDao = new ReminderDao(daoConfigM4494clone21, this);
        this.H0 = reminderDao;
        AdEntityDao adEntityDao = new AdEntityDao(daoConfigM4494clone22, this);
        this.I0 = adEntityDao;
        WeightInfosDao weightInfosDao = new WeightInfosDao(daoConfigM4494clone23, this);
        this.J0 = weightInfosDao;
        DeviceDao deviceDao = new DeviceDao(daoConfigM4494clone24, this);
        this.K0 = deviceDao;
        TrackdataDao trackdataDao = new TrackdataDao(daoConfigM4494clone25, this);
        this.L0 = trackdataDao;
        PushDao pushDao = new PushDao(daoConfigM4494clone26, this);
        this.M0 = pushDao;
        MedalDao medalDao = new MedalDao(daoConfigM4494clone27, this);
        this.N0 = medalDao;
        DismissAdvDao dismissAdvDao = new DismissAdvDao(daoConfigM4494clone28, this);
        this.O0 = dismissAdvDao;
        ShoesDataDao shoesDataDao = new ShoesDataDao(daoConfigM4494clone29, this);
        this.P0 = shoesDataDao;
        UserInfosDao userInfosDao = new UserInfosDao(daoConfigM4494clone30, this);
        this.Q0 = userInfosDao;
        CompareModelDao compareModelDao = new CompareModelDao(daoConfigM4494clone31, this);
        this.R0 = compareModelDao;
        WeightGoalsDao weightGoalsDao = new WeightGoalsDao(daoConfigM4494clone32, this);
        this.S0 = weightGoalsDao;
        TrackstatisticsDao trackstatisticsDao = new TrackstatisticsDao(daoConfigM4494clone33, this);
        this.T0 = trackstatisticsDao;
        ShoesPartnersDao shoesPartnersDao = new ShoesPartnersDao(daoConfigM4494clone34, this);
        this.U0 = shoesPartnersDao;
        FbtEteResultDao fbtEteResultDao = new FbtEteResultDao(daoConfigM4494clone35, this);
        this.V0 = fbtEteResultDao;
        TrainingDetailDao trainingDetailDao = new TrainingDetailDao(daoConfigM4494clone36, this);
        this.W0 = trainingDetailDao;
        CoachDao coachDao = new CoachDao(daoConfigM4494clone37, this);
        this.X0 = coachDao;
        TrainingCourseItemDao trainingCourseItemDao = new TrainingCourseItemDao(daoConfigM4494clone38, this);
        this.Y0 = trainingCourseItemDao;
        TrainingCourseDao trainingCourseDao = new TrainingCourseDao(daoConfigM4494clone39, this);
        this.Z0 = trainingCourseDao;
        TrainingItemDao trainingItemDao = new TrainingItemDao(daoConfigM4494clone40, this);
        this.a1 = trainingItemDao;
        ActionVideoDao actionVideoDao = new ActionVideoDao(daoConfigM4494clone41, this);
        this.b1 = actionVideoDao;
        ActionContentDao actionContentDao = new ActionContentDao(daoConfigM4494clone42, this);
        this.c1 = actionContentDao;
        TrainingRecordDao trainingRecordDao = new TrainingRecordDao(daoConfigM4494clone43, this);
        this.d1 = trainingRecordDao;
        BgMusicDao bgMusicDao = new BgMusicDao(daoConfigM4494clone44, this);
        this.e1 = bgMusicDao;
        HaveDoneActionDao haveDoneActionDao = new HaveDoneActionDao(daoConfigM4494clone45, this);
        this.f1 = haveDoneActionDao;
        ActionAudioDao actionAudioDao = new ActionAudioDao(daoConfigM4494clone46, this);
        this.g1 = actionAudioDao;
        TrainingHeartRateDao trainingHeartRateDao = new TrainingHeartRateDao(daoConfigM4494clone47, this);
        this.h1 = trainingHeartRateDao;
        ConfigDao configDao = new ConfigDao(daoConfigM4494clone48, this);
        this.i1 = configDao;
        NormandyDataDao normandyDataDao = new NormandyDataDao(daoConfigM4494clone49, this);
        this.j1 = normandyDataDao;
        MyShoesDao myShoesDao = new MyShoesDao(daoConfigM4494clone50, this);
        this.k1 = myShoesDao;
        FbtThaResultDao fbtThaResultDao = new FbtThaResultDao(daoConfigM4494clone51, this);
        this.l1 = fbtThaResultDao;
        ActivetrackDistanceDao activetrackDistanceDao = new ActivetrackDistanceDao(daoConfigM4494clone52, this);
        this.m1 = activetrackDistanceDao;
        ActiveMiPlusShoesDao activeMiPlusShoesDao = new ActiveMiPlusShoesDao(daoConfigM4494clone53, this);
        this.n1 = activeMiPlusShoesDao;
        AtrialFibrillationDataItemDao atrialFibrillationDataItemDao = new AtrialFibrillationDataItemDao(daoConfigM4494clone54, this);
        this.o1 = atrialFibrillationDataItemDao;
        DetailDao detailDao = new DetailDao(daoConfigM4494clone55, this);
        this.p1 = detailDao;
        FriendMessageDao friendMessageDao = new FriendMessageDao(daoConfigM4494clone56, this);
        this.q1 = friendMessageDao;
        HeartRateDao heartRateDao = new HeartRateDao(daoConfigM4494clone57, this);
        this.r1 = heartRateDao;
        EarbudDateDataDao earbudDateDataDao = new EarbudDateDataDao(daoConfigM4494clone58, this);
        this.s1 = earbudDateDataDao;
        EarbudMusicInfoDao earbudMusicInfoDao = new EarbudMusicInfoDao(daoConfigM4494clone59, this);
        this.t1 = earbudMusicInfoDao;
        WatchSkinDao watchSkinDao = new WatchSkinDao(daoConfigM4494clone60, this);
        this.u1 = watchSkinDao;
        UserScaleInfoDao userScaleInfoDao = new UserScaleInfoDao(daoConfigM4494clone61, this);
        this.v1 = userScaleInfoDao;
        registerDao(DateData.class, dateDataDao);
        registerDao(HmProperty.class, hmPropertyDao);
        registerDao(NewCalories.class, newCaloriesDao);
        registerDao(SensorData.class, sensorDataDao);
        registerDao(Runconfig.class, runconfigDao);
        registerDao(Friend.class, friendDao);
        registerDao(ActivetrackStep.class, activetrackStepDao);
        registerDao(LaunchEntity.class, launchEntityDao);
        registerDao(Trackrecord.class, trackrecordDao);
        registerDao(Trackhr.class, trackhrDao);
        registerDao(ActivetrackBar.class, activetrackBarDao);
        registerDao(LabAction.class, labActionDao);
        registerDao(RecomendedUser.class, recomendedUserDao);
        registerDao(CirclePost.class, circlePostDao);
        registerDao(FwDwonSuccessInfo.class, fwDwonSuccessInfoDao);
        registerDao(ManualData.class, manualDataDao);
        registerDao(Alarm.class, alarmDao);
        registerDao(Activetrack.class, activetrackDao);
        registerDao(Trackdeathbook.class, trackdeathbookDao);
        registerDao(Activetrackhr.class, activetrackhrDao);
        registerDao(Reminder.class, reminderDao);
        registerDao(AdEntity.class, adEntityDao);
        registerDao(WeightInfos.class, weightInfosDao);
        registerDao(Device.class, deviceDao);
        registerDao(Trackdata.class, trackdataDao);
        registerDao(Push.class, pushDao);
        registerDao(Medal.class, medalDao);
        registerDao(DismissAdv.class, dismissAdvDao);
        registerDao(ShoesData.class, shoesDataDao);
        registerDao(UserInfos.class, userInfosDao);
        registerDao(CompareModel.class, compareModelDao);
        registerDao(WeightGoals.class, weightGoalsDao);
        registerDao(Trackstatistics.class, trackstatisticsDao);
        registerDao(ShoesPartners.class, shoesPartnersDao);
        registerDao(FbtEteResult.class, fbtEteResultDao);
        registerDao(TrainingDetail.class, trainingDetailDao);
        registerDao(Coach.class, coachDao);
        registerDao(TrainingCourseItem.class, trainingCourseItemDao);
        registerDao(TrainingCourse.class, trainingCourseDao);
        registerDao(TrainingItem.class, trainingItemDao);
        registerDao(ActionVideo.class, actionVideoDao);
        registerDao(ActionContent.class, actionContentDao);
        registerDao(TrainingRecord.class, trainingRecordDao);
        registerDao(BgMusic.class, bgMusicDao);
        registerDao(HaveDoneAction.class, haveDoneActionDao);
        registerDao(ActionAudio.class, actionAudioDao);
        registerDao(TrainingHeartRate.class, trainingHeartRateDao);
        registerDao(Config.class, configDao);
        registerDao(NormandyData.class, normandyDataDao);
        registerDao(MyShoes.class, myShoesDao);
        registerDao(FbtThaResult.class, fbtThaResultDao);
        registerDao(ActivetrackDistance.class, activetrackDistanceDao);
        registerDao(ActiveMiPlusShoes.class, activeMiPlusShoesDao);
        registerDao(AtrialFibrillationDataItem.class, atrialFibrillationDataItemDao);
        registerDao(Detail.class, detailDao);
        registerDao(FriendMessage.class, friendMessageDao);
        registerDao(HeartRate.class, heartRateDao);
        registerDao(EarbudDateData.class, earbudDateDataDao);
        registerDao(EarbudMusicInfo.class, earbudMusicInfoDao);
        registerDao(WatchSkin.class, watchSkinDao);
        registerDao(UserScaleInfo.class, userScaleInfoDao);
    }

    public void clear() {
        this.e.clearIdentityScope();
        this.f.clearIdentityScope();
        this.g.clearIdentityScope();
        this.h.clearIdentityScope();
        this.i.clearIdentityScope();
        this.j.clearIdentityScope();
        this.k.clearIdentityScope();
        this.l.clearIdentityScope();
        this.m.clearIdentityScope();
        this.n.clearIdentityScope();
        this.o.clearIdentityScope();
        this.p.clearIdentityScope();
        this.q.clearIdentityScope();
        this.r.clearIdentityScope();
        this.s.clearIdentityScope();
        this.t.clearIdentityScope();
        this.u.clearIdentityScope();
        this.v.clearIdentityScope();
        this.w.clearIdentityScope();
        this.x.clearIdentityScope();
        this.y.clearIdentityScope();
        this.z.clearIdentityScope();
        this.A.clearIdentityScope();
        this.B.clearIdentityScope();
        this.C.clearIdentityScope();
        this.D.clearIdentityScope();
        this.E.clearIdentityScope();
        this.F.clearIdentityScope();
        this.G.clearIdentityScope();
        this.H.clearIdentityScope();
        this.I.clearIdentityScope();
        this.J.clearIdentityScope();
        this.K.clearIdentityScope();
        this.L.clearIdentityScope();
        this.M.clearIdentityScope();
        this.N.clearIdentityScope();
        this.O.clearIdentityScope();
        this.P.clearIdentityScope();
        this.Q.clearIdentityScope();
        this.R.clearIdentityScope();
        this.S.clearIdentityScope();
        this.T.clearIdentityScope();
        this.U.clearIdentityScope();
        this.V.clearIdentityScope();
        this.W.clearIdentityScope();
        this.X.clearIdentityScope();
        this.Y.clearIdentityScope();
        this.Z.clearIdentityScope();
        this.a0.clearIdentityScope();
        this.b0.clearIdentityScope();
        this.c0.clearIdentityScope();
        this.d0.clearIdentityScope();
        this.e0.clearIdentityScope();
        this.f0.clearIdentityScope();
        this.g0.clearIdentityScope();
        this.h0.clearIdentityScope();
        this.i0.clearIdentityScope();
        this.j0.clearIdentityScope();
        this.k0.clearIdentityScope();
        this.l0.clearIdentityScope();
        this.m0.clearIdentityScope();
    }

    public ActionAudioDao getActionAudioDao() {
        return this.g1;
    }

    public ActionContentDao getActionContentDao() {
        return this.c1;
    }

    public ActionVideoDao getActionVideoDao() {
        return this.b1;
    }

    public ActiveMiPlusShoesDao getActiveMiPlusShoesDao() {
        return this.n1;
    }

    public ActivetrackBarDao getActivetrackBarDao() {
        return this.x0;
    }

    public ActivetrackDao getActivetrackDao() {
        return this.E0;
    }

    public ActivetrackDistanceDao getActivetrackDistanceDao() {
        return this.m1;
    }

    public ActivetrackStepDao getActivetrackStepDao() {
        return this.t0;
    }

    public ActivetrackhrDao getActivetrackhrDao() {
        return this.G0;
    }

    public AdEntityDao getAdEntityDao() {
        return this.I0;
    }

    public AlarmDao getAlarmDao() {
        return this.D0;
    }

    public AtrialFibrillationDataItemDao getAtrialFibrillationDataItemDao() {
        return this.o1;
    }

    public BgMusicDao getBgMusicDao() {
        return this.e1;
    }

    public CirclePostDao getCirclePostDao() {
        return this.A0;
    }

    public CoachDao getCoachDao() {
        return this.X0;
    }

    public CompareModelDao getCompareModelDao() {
        return this.R0;
    }

    public ConfigDao getConfigDao() {
        return this.i1;
    }

    public DateDataDao getDateDataDao() {
        return this.n0;
    }

    public DetailDao getDetailDao() {
        return this.p1;
    }

    public DeviceDao getDeviceDao() {
        return this.K0;
    }

    public DismissAdvDao getDismissAdvDao() {
        return this.O0;
    }

    public EarbudDateDataDao getEarbudDateDataDao() {
        return this.s1;
    }

    public EarbudMusicInfoDao getEarbudMusicInfoDao() {
        return this.t1;
    }

    public FbtEteResultDao getFbtEteResultDao() {
        return this.V0;
    }

    public FbtThaResultDao getFbtThaResultDao() {
        return this.l1;
    }

    public FriendDao getFriendDao() {
        return this.s0;
    }

    public FriendMessageDao getFriendMessageDao() {
        return this.q1;
    }

    public FwDwonSuccessInfoDao getFwDwonSuccessInfoDao() {
        return this.B0;
    }

    public HaveDoneActionDao getHaveDoneActionDao() {
        return this.f1;
    }

    public HeartRateDao getHeartRateDao() {
        return this.r1;
    }

    public HmPropertyDao getHmPropertyDao() {
        return this.o0;
    }

    public LabActionDao getLabActionDao() {
        return this.y0;
    }

    public LaunchEntityDao getLaunchEntityDao() {
        return this.u0;
    }

    public ManualDataDao getManualDataDao() {
        return this.C0;
    }

    public MedalDao getMedalDao() {
        return this.N0;
    }

    public MyShoesDao getMyShoesDao() {
        return this.k1;
    }

    public NewCaloriesDao getNewCaloriesDao() {
        return this.p0;
    }

    public NormandyDataDao getNormandyDataDao() {
        return this.j1;
    }

    public PushDao getPushDao() {
        return this.M0;
    }

    public RecomendedUserDao getRecomendedUserDao() {
        return this.z0;
    }

    public ReminderDao getReminderDao() {
        return this.H0;
    }

    public RunconfigDao getRunconfigDao() {
        return this.r0;
    }

    public SensorDataDao getSensorDataDao() {
        return this.q0;
    }

    public ShoesDataDao getShoesDataDao() {
        return this.P0;
    }

    public ShoesPartnersDao getShoesPartnersDao() {
        return this.U0;
    }

    public TrackdataDao getTrackdataDao() {
        return this.L0;
    }

    public TrackdeathbookDao getTrackdeathbookDao() {
        return this.F0;
    }

    public TrackhrDao getTrackhrDao() {
        return this.w0;
    }

    public TrackrecordDao getTrackrecordDao() {
        return this.v0;
    }

    public TrackstatisticsDao getTrackstatisticsDao() {
        return this.T0;
    }

    public TrainingCourseDao getTrainingCourseDao() {
        return this.Z0;
    }

    public TrainingCourseItemDao getTrainingCourseItemDao() {
        return this.Y0;
    }

    public TrainingDetailDao getTrainingDetailDao() {
        return this.W0;
    }

    public TrainingHeartRateDao getTrainingHeartRateDao() {
        return this.h1;
    }

    public TrainingItemDao getTrainingItemDao() {
        return this.a1;
    }

    public TrainingRecordDao getTrainingRecordDao() {
        return this.d1;
    }

    public UserInfosDao getUserInfosDao() {
        return this.Q0;
    }

    public UserScaleInfoDao getUserScaleInfoDao() {
        return this.v1;
    }

    public WatchSkinDao getWatchSkinDao() {
        return this.u1;
    }

    public WeightGoalsDao getWeightGoalsDao() {
        return this.S0;
    }

    public WeightInfosDao getWeightInfosDao() {
        return this.J0;
    }
}
