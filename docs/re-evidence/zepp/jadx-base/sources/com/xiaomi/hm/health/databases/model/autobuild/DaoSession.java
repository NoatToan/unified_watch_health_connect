package com.xiaomi.hm.health.databases.model.autobuild;

import com.xiaomi.hm.health.databases.model.ActiveMiPlusShoes;
import com.xiaomi.hm.health.databases.model.Activetrack;
import com.xiaomi.hm.health.databases.model.ActivetrackBar;
import com.xiaomi.hm.health.databases.model.ActivetrackDistance;
import com.xiaomi.hm.health.databases.model.ActivetrackStep;
import com.xiaomi.hm.health.databases.model.Activetrackhr;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.databases.model.AtrialFibrillationDataItem;
import com.xiaomi.hm.health.databases.model.CompareModel;
import com.xiaomi.hm.health.databases.model.Config;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.Detail;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.DismissAdv;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.databases.model.FbtEteResult;
import com.xiaomi.hm.health.databases.model.FbtThaResult;
import com.xiaomi.hm.health.databases.model.Friend;
import com.xiaomi.hm.health.databases.model.FriendMessage;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfo;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.databases.model.LaunchEntity;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.Medal;
import com.xiaomi.hm.health.databases.model.MyShoes;
import com.xiaomi.hm.health.databases.model.NewCalories;
import com.xiaomi.hm.health.databases.model.NormandyData;
import com.xiaomi.hm.health.databases.model.Push;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.databases.model.Runconfig;
import com.xiaomi.hm.health.databases.model.SensorData;
import com.xiaomi.hm.health.databases.model.ShoesData;
import com.xiaomi.hm.health.databases.model.ShoesPartners;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackdeathbook;
import com.xiaomi.hm.health.databases.model.Trackhr;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.Trackstatistics;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.databases.model.WatchSkin;
import com.xiaomi.hm.health.databases.model.WeightGoals;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.databases.model.circle.CirclePost;
import com.xiaomi.hm.health.databases.model.circle.RecomendedUser;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudio;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.BgMusic;
import com.xiaomi.hm.health.databases.model.trainning.Coach;
import com.xiaomi.hm.health.databases.model.trainning.HaveDoneAction;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import java.util.Map;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class DaoSession extends AbstractDaoSession {
    private final DaoConfig A;
    private final DismissAdvDao A0;
    private final DaoConfig B;
    private final EarbudDateDataDao B0;
    private final DaoConfig C;
    private final EarbudMusicInfoDao C0;
    private final DaoConfig D;
    private final FbtEteResultDao D0;
    private final DaoConfig E;
    private final FbtThaResultDao E0;
    private final DaoConfig F;
    private final FriendDao F0;
    private final DaoConfig G;
    private final FriendMessageDao G0;
    private final DaoConfig H;
    private final FwDwonSuccessInfoDao H0;
    private final DaoConfig I;
    private final HeartRateDao I0;
    private final DaoConfig J;
    private final HmPropertyDao J0;
    private final DaoConfig K;
    private final LaunchEntityDao K0;
    private final DaoConfig L;
    private final ManualDataDao L0;
    private final DaoConfig M;
    private final MedalDao M0;
    private final DaoConfig N;
    private final MyShoesDao N0;
    private final DaoConfig O;
    private final NewCaloriesDao O0;
    private final DaoConfig P;
    private final NormandyDataDao P0;
    private final DaoConfig Q;
    private final PushDao Q0;
    private final DaoConfig R;
    private final ReminderDao R0;
    private final DaoConfig S;
    private final RunconfigDao S0;
    private final DaoConfig T;
    private final SensorDataDao T0;
    private final DaoConfig U;
    private final ShoesDataDao U0;
    private final DaoConfig V;
    private final ShoesPartnersDao V0;
    private final DaoConfig W;
    private final TrackdataDao W0;
    private final DaoConfig X;
    private final TrackdeathbookDao X0;
    private final DaoConfig Y;
    private final TrackhrDao Y0;
    private final DaoConfig Z;
    private final TrackrecordDao Z0;
    private final DaoConfig a0;
    private final TrackstatisticsDao a1;
    private final DaoConfig b0;
    private final UserInfosDao b1;
    private final DaoConfig c0;
    private final UserScaleInfoDao c1;
    private final DaoConfig d0;
    private final WatchSkinDao d1;
    private final DaoConfig e;
    private final DaoConfig e0;
    private final WeightGoalsDao e1;
    private final DaoConfig f;
    private final DaoConfig f0;
    private final WeightInfosDao f1;
    private final DaoConfig g;
    private final DaoConfig g0;
    private final CirclePostDao g1;
    private final DaoConfig h;
    private final DaoConfig h0;
    private final RecomendedUserDao h1;
    private final DaoConfig i;
    private final DaoConfig i0;
    private final ActionAudioDao i1;
    private final DaoConfig j;
    private final DaoConfig j0;
    private final ActionContentDao j1;
    private final DaoConfig k;
    private final DaoConfig k0;
    private final ActionVideoDao k1;
    private final DaoConfig l;
    private final DaoConfig l0;
    private final BgMusicDao l1;
    private final DaoConfig m;
    private final ActiveMiPlusShoesDao m0;
    private final CoachDao m1;
    private final DaoConfig n;
    private final ActivetrackDao n0;
    private final HaveDoneActionDao n1;
    private final DaoConfig o;
    private final ActivetrackBarDao o0;
    private final TrainingCourseDao o1;
    private final DaoConfig p;
    private final ActivetrackDistanceDao p0;
    private final TrainingCourseItemDao p1;
    private final DaoConfig q;
    private final ActivetrackStepDao q0;
    private final TrainingDetailDao q1;
    private final DaoConfig r;
    private final ActivetrackhrDao r0;
    private final TrainingHeartRateDao r1;
    private final DaoConfig s;
    private final AdEntityDao s0;
    private final TrainingItemDao s1;
    private final DaoConfig t;
    private final AlarmDao t0;
    private final TrainingRecordDao t1;
    private final DaoConfig u;
    private final AtrialFibrillationDataItemDao u0;
    private final DaoConfig v;
    private final CompareModelDao v0;
    private final DaoConfig w;
    private final ConfigDao w0;
    private final DaoConfig x;
    private final DateDataDao x0;
    private final DaoConfig y;
    private final DetailDao y0;
    private final DaoConfig z;
    private final DeviceDao z0;

    public DaoSession(Database database, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(database);
        DaoConfig daoConfigClone = map.get(ActiveMiPlusShoesDao.class).clone();
        this.e = daoConfigClone;
        daoConfigClone.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone2 = map.get(ActivetrackDao.class).clone();
        this.f = daoConfigClone2;
        daoConfigClone2.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone3 = map.get(ActivetrackBarDao.class).clone();
        this.g = daoConfigClone3;
        daoConfigClone3.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone4 = map.get(ActivetrackDistanceDao.class).clone();
        this.h = daoConfigClone4;
        daoConfigClone4.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone5 = map.get(ActivetrackStepDao.class).clone();
        this.i = daoConfigClone5;
        daoConfigClone5.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone6 = map.get(ActivetrackhrDao.class).clone();
        this.j = daoConfigClone6;
        daoConfigClone6.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone7 = map.get(AdEntityDao.class).clone();
        this.k = daoConfigClone7;
        daoConfigClone7.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone8 = map.get(AlarmDao.class).clone();
        this.l = daoConfigClone8;
        daoConfigClone8.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone9 = map.get(AtrialFibrillationDataItemDao.class).clone();
        this.m = daoConfigClone9;
        daoConfigClone9.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone10 = map.get(CompareModelDao.class).clone();
        this.n = daoConfigClone10;
        daoConfigClone10.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone11 = map.get(ConfigDao.class).clone();
        this.o = daoConfigClone11;
        daoConfigClone11.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone12 = map.get(DateDataDao.class).clone();
        this.p = daoConfigClone12;
        daoConfigClone12.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone13 = map.get(DetailDao.class).clone();
        this.q = daoConfigClone13;
        daoConfigClone13.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone14 = map.get(DeviceDao.class).clone();
        this.r = daoConfigClone14;
        daoConfigClone14.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone15 = map.get(DismissAdvDao.class).clone();
        this.s = daoConfigClone15;
        daoConfigClone15.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone16 = map.get(EarbudDateDataDao.class).clone();
        this.t = daoConfigClone16;
        daoConfigClone16.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone17 = map.get(EarbudMusicInfoDao.class).clone();
        this.u = daoConfigClone17;
        daoConfigClone17.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone18 = map.get(FbtEteResultDao.class).clone();
        this.v = daoConfigClone18;
        daoConfigClone18.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone19 = map.get(FbtThaResultDao.class).clone();
        this.w = daoConfigClone19;
        daoConfigClone19.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone20 = map.get(FriendDao.class).clone();
        this.x = daoConfigClone20;
        daoConfigClone20.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone21 = map.get(FriendMessageDao.class).clone();
        this.y = daoConfigClone21;
        daoConfigClone21.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone22 = map.get(FwDwonSuccessInfoDao.class).clone();
        this.z = daoConfigClone22;
        daoConfigClone22.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone23 = map.get(HeartRateDao.class).clone();
        this.A = daoConfigClone23;
        daoConfigClone23.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone24 = map.get(HmPropertyDao.class).clone();
        this.B = daoConfigClone24;
        daoConfigClone24.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone25 = map.get(LaunchEntityDao.class).clone();
        this.C = daoConfigClone25;
        daoConfigClone25.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone26 = map.get(ManualDataDao.class).clone();
        this.D = daoConfigClone26;
        daoConfigClone26.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone27 = map.get(MedalDao.class).clone();
        this.E = daoConfigClone27;
        daoConfigClone27.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone28 = map.get(MyShoesDao.class).clone();
        this.F = daoConfigClone28;
        daoConfigClone28.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone29 = map.get(NewCaloriesDao.class).clone();
        this.G = daoConfigClone29;
        daoConfigClone29.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone30 = map.get(NormandyDataDao.class).clone();
        this.H = daoConfigClone30;
        daoConfigClone30.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone31 = map.get(PushDao.class).clone();
        this.I = daoConfigClone31;
        daoConfigClone31.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone32 = map.get(ReminderDao.class).clone();
        this.J = daoConfigClone32;
        daoConfigClone32.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone33 = map.get(RunconfigDao.class).clone();
        this.K = daoConfigClone33;
        daoConfigClone33.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone34 = map.get(SensorDataDao.class).clone();
        this.L = daoConfigClone34;
        daoConfigClone34.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone35 = map.get(ShoesDataDao.class).clone();
        this.M = daoConfigClone35;
        daoConfigClone35.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone36 = map.get(ShoesPartnersDao.class).clone();
        this.N = daoConfigClone36;
        daoConfigClone36.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone37 = map.get(TrackdataDao.class).clone();
        this.O = daoConfigClone37;
        daoConfigClone37.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone38 = map.get(TrackdeathbookDao.class).clone();
        this.P = daoConfigClone38;
        daoConfigClone38.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone39 = map.get(TrackhrDao.class).clone();
        this.Q = daoConfigClone39;
        daoConfigClone39.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone40 = map.get(TrackrecordDao.class).clone();
        this.R = daoConfigClone40;
        daoConfigClone40.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone41 = map.get(TrackstatisticsDao.class).clone();
        this.S = daoConfigClone41;
        daoConfigClone41.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone42 = map.get(UserInfosDao.class).clone();
        this.T = daoConfigClone42;
        daoConfigClone42.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone43 = map.get(UserScaleInfoDao.class).clone();
        this.U = daoConfigClone43;
        daoConfigClone43.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone44 = map.get(WatchSkinDao.class).clone();
        this.V = daoConfigClone44;
        daoConfigClone44.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone45 = map.get(WeightGoalsDao.class).clone();
        this.W = daoConfigClone45;
        daoConfigClone45.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone46 = map.get(WeightInfosDao.class).clone();
        this.X = daoConfigClone46;
        daoConfigClone46.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone47 = map.get(CirclePostDao.class).clone();
        this.Y = daoConfigClone47;
        daoConfigClone47.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone48 = map.get(RecomendedUserDao.class).clone();
        this.Z = daoConfigClone48;
        daoConfigClone48.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone49 = map.get(ActionAudioDao.class).clone();
        this.a0 = daoConfigClone49;
        daoConfigClone49.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone50 = map.get(ActionContentDao.class).clone();
        this.b0 = daoConfigClone50;
        daoConfigClone50.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone51 = map.get(ActionVideoDao.class).clone();
        this.c0 = daoConfigClone51;
        daoConfigClone51.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone52 = map.get(BgMusicDao.class).clone();
        this.d0 = daoConfigClone52;
        daoConfigClone52.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone53 = map.get(CoachDao.class).clone();
        this.e0 = daoConfigClone53;
        daoConfigClone53.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone54 = map.get(HaveDoneActionDao.class).clone();
        this.f0 = daoConfigClone54;
        daoConfigClone54.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone55 = map.get(TrainingCourseDao.class).clone();
        this.g0 = daoConfigClone55;
        daoConfigClone55.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone56 = map.get(TrainingCourseItemDao.class).clone();
        this.h0 = daoConfigClone56;
        daoConfigClone56.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone57 = map.get(TrainingDetailDao.class).clone();
        this.i0 = daoConfigClone57;
        daoConfigClone57.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone58 = map.get(TrainingHeartRateDao.class).clone();
        this.j0 = daoConfigClone58;
        daoConfigClone58.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone59 = map.get(TrainingItemDao.class).clone();
        this.k0 = daoConfigClone59;
        daoConfigClone59.initIdentityScope(identityScopeType);
        DaoConfig daoConfigClone60 = map.get(TrainingRecordDao.class).clone();
        this.l0 = daoConfigClone60;
        daoConfigClone60.initIdentityScope(identityScopeType);
        ActiveMiPlusShoesDao activeMiPlusShoesDao = new ActiveMiPlusShoesDao(daoConfigClone, this);
        this.m0 = activeMiPlusShoesDao;
        ActivetrackDao activetrackDao = new ActivetrackDao(daoConfigClone2, this);
        this.n0 = activetrackDao;
        ActivetrackBarDao activetrackBarDao = new ActivetrackBarDao(daoConfigClone3, this);
        this.o0 = activetrackBarDao;
        ActivetrackDistanceDao activetrackDistanceDao = new ActivetrackDistanceDao(daoConfigClone4, this);
        this.p0 = activetrackDistanceDao;
        ActivetrackStepDao activetrackStepDao = new ActivetrackStepDao(daoConfigClone5, this);
        this.q0 = activetrackStepDao;
        ActivetrackhrDao activetrackhrDao = new ActivetrackhrDao(daoConfigClone6, this);
        this.r0 = activetrackhrDao;
        AdEntityDao adEntityDao = new AdEntityDao(daoConfigClone7, this);
        this.s0 = adEntityDao;
        AlarmDao alarmDao = new AlarmDao(daoConfigClone8, this);
        this.t0 = alarmDao;
        AtrialFibrillationDataItemDao atrialFibrillationDataItemDao = new AtrialFibrillationDataItemDao(daoConfigClone9, this);
        this.u0 = atrialFibrillationDataItemDao;
        CompareModelDao compareModelDao = new CompareModelDao(daoConfigClone10, this);
        this.v0 = compareModelDao;
        ConfigDao configDao = new ConfigDao(daoConfigClone11, this);
        this.w0 = configDao;
        DateDataDao dateDataDao = new DateDataDao(daoConfigClone12, this);
        this.x0 = dateDataDao;
        DetailDao detailDao = new DetailDao(daoConfigClone13, this);
        this.y0 = detailDao;
        DeviceDao deviceDao = new DeviceDao(daoConfigClone14, this);
        this.z0 = deviceDao;
        DismissAdvDao dismissAdvDao = new DismissAdvDao(daoConfigClone15, this);
        this.A0 = dismissAdvDao;
        EarbudDateDataDao earbudDateDataDao = new EarbudDateDataDao(daoConfigClone16, this);
        this.B0 = earbudDateDataDao;
        EarbudMusicInfoDao earbudMusicInfoDao = new EarbudMusicInfoDao(daoConfigClone17, this);
        this.C0 = earbudMusicInfoDao;
        FbtEteResultDao fbtEteResultDao = new FbtEteResultDao(daoConfigClone18, this);
        this.D0 = fbtEteResultDao;
        FbtThaResultDao fbtThaResultDao = new FbtThaResultDao(daoConfigClone19, this);
        this.E0 = fbtThaResultDao;
        FriendDao friendDao = new FriendDao(daoConfigClone20, this);
        this.F0 = friendDao;
        FriendMessageDao friendMessageDao = new FriendMessageDao(daoConfigClone21, this);
        this.G0 = friendMessageDao;
        FwDwonSuccessInfoDao fwDwonSuccessInfoDao = new FwDwonSuccessInfoDao(daoConfigClone22, this);
        this.H0 = fwDwonSuccessInfoDao;
        HeartRateDao heartRateDao = new HeartRateDao(daoConfigClone23, this);
        this.I0 = heartRateDao;
        HmPropertyDao hmPropertyDao = new HmPropertyDao(daoConfigClone24, this);
        this.J0 = hmPropertyDao;
        LaunchEntityDao launchEntityDao = new LaunchEntityDao(daoConfigClone25, this);
        this.K0 = launchEntityDao;
        ManualDataDao manualDataDao = new ManualDataDao(daoConfigClone26, this);
        this.L0 = manualDataDao;
        MedalDao medalDao = new MedalDao(daoConfigClone27, this);
        this.M0 = medalDao;
        MyShoesDao myShoesDao = new MyShoesDao(daoConfigClone28, this);
        this.N0 = myShoesDao;
        NewCaloriesDao newCaloriesDao = new NewCaloriesDao(daoConfigClone29, this);
        this.O0 = newCaloriesDao;
        NormandyDataDao normandyDataDao = new NormandyDataDao(daoConfigClone30, this);
        this.P0 = normandyDataDao;
        PushDao pushDao = new PushDao(daoConfigClone31, this);
        this.Q0 = pushDao;
        ReminderDao reminderDao = new ReminderDao(daoConfigClone32, this);
        this.R0 = reminderDao;
        RunconfigDao runconfigDao = new RunconfigDao(daoConfigClone33, this);
        this.S0 = runconfigDao;
        SensorDataDao sensorDataDao = new SensorDataDao(daoConfigClone34, this);
        this.T0 = sensorDataDao;
        ShoesDataDao shoesDataDao = new ShoesDataDao(daoConfigClone35, this);
        this.U0 = shoesDataDao;
        ShoesPartnersDao shoesPartnersDao = new ShoesPartnersDao(daoConfigClone36, this);
        this.V0 = shoesPartnersDao;
        TrackdataDao trackdataDao = new TrackdataDao(daoConfigClone37, this);
        this.W0 = trackdataDao;
        TrackdeathbookDao trackdeathbookDao = new TrackdeathbookDao(daoConfigClone38, this);
        this.X0 = trackdeathbookDao;
        TrackhrDao trackhrDao = new TrackhrDao(daoConfigClone39, this);
        this.Y0 = trackhrDao;
        TrackrecordDao trackrecordDao = new TrackrecordDao(daoConfigClone40, this);
        this.Z0 = trackrecordDao;
        TrackstatisticsDao trackstatisticsDao = new TrackstatisticsDao(daoConfigClone41, this);
        this.a1 = trackstatisticsDao;
        UserInfosDao userInfosDao = new UserInfosDao(daoConfigClone42, this);
        this.b1 = userInfosDao;
        UserScaleInfoDao userScaleInfoDao = new UserScaleInfoDao(daoConfigClone43, this);
        this.c1 = userScaleInfoDao;
        WatchSkinDao watchSkinDao = new WatchSkinDao(daoConfigClone44, this);
        this.d1 = watchSkinDao;
        WeightGoalsDao weightGoalsDao = new WeightGoalsDao(daoConfigClone45, this);
        this.e1 = weightGoalsDao;
        WeightInfosDao weightInfosDao = new WeightInfosDao(daoConfigClone46, this);
        this.f1 = weightInfosDao;
        CirclePostDao circlePostDao = new CirclePostDao(daoConfigClone47, this);
        this.g1 = circlePostDao;
        RecomendedUserDao recomendedUserDao = new RecomendedUserDao(daoConfigClone48, this);
        this.h1 = recomendedUserDao;
        ActionAudioDao actionAudioDao = new ActionAudioDao(daoConfigClone49, this);
        this.i1 = actionAudioDao;
        ActionContentDao actionContentDao = new ActionContentDao(daoConfigClone50, this);
        this.j1 = actionContentDao;
        ActionVideoDao actionVideoDao = new ActionVideoDao(daoConfigClone51, this);
        this.k1 = actionVideoDao;
        BgMusicDao bgMusicDao = new BgMusicDao(daoConfigClone52, this);
        this.l1 = bgMusicDao;
        CoachDao coachDao = new CoachDao(daoConfigClone53, this);
        this.m1 = coachDao;
        HaveDoneActionDao haveDoneActionDao = new HaveDoneActionDao(daoConfigClone54, this);
        this.n1 = haveDoneActionDao;
        TrainingCourseDao trainingCourseDao = new TrainingCourseDao(daoConfigClone55, this);
        this.o1 = trainingCourseDao;
        TrainingCourseItemDao trainingCourseItemDao = new TrainingCourseItemDao(daoConfigClone56, this);
        this.p1 = trainingCourseItemDao;
        TrainingDetailDao trainingDetailDao = new TrainingDetailDao(daoConfigClone57, this);
        this.q1 = trainingDetailDao;
        TrainingHeartRateDao trainingHeartRateDao = new TrainingHeartRateDao(daoConfigClone58, this);
        this.r1 = trainingHeartRateDao;
        TrainingItemDao trainingItemDao = new TrainingItemDao(daoConfigClone59, this);
        this.s1 = trainingItemDao;
        TrainingRecordDao trainingRecordDao = new TrainingRecordDao(daoConfigClone60, this);
        this.t1 = trainingRecordDao;
        registerDao(ActiveMiPlusShoes.class, activeMiPlusShoesDao);
        registerDao(Activetrack.class, activetrackDao);
        registerDao(ActivetrackBar.class, activetrackBarDao);
        registerDao(ActivetrackDistance.class, activetrackDistanceDao);
        registerDao(ActivetrackStep.class, activetrackStepDao);
        registerDao(Activetrackhr.class, activetrackhrDao);
        registerDao(AdEntity.class, adEntityDao);
        registerDao(Alarm.class, alarmDao);
        registerDao(AtrialFibrillationDataItem.class, atrialFibrillationDataItemDao);
        registerDao(CompareModel.class, compareModelDao);
        registerDao(Config.class, configDao);
        registerDao(DateData.class, dateDataDao);
        registerDao(Detail.class, detailDao);
        registerDao(Device.class, deviceDao);
        registerDao(DismissAdv.class, dismissAdvDao);
        registerDao(EarbudDateData.class, earbudDateDataDao);
        registerDao(EarbudMusicInfo.class, earbudMusicInfoDao);
        registerDao(FbtEteResult.class, fbtEteResultDao);
        registerDao(FbtThaResult.class, fbtThaResultDao);
        registerDao(Friend.class, friendDao);
        registerDao(FriendMessage.class, friendMessageDao);
        registerDao(FwDwonSuccessInfo.class, fwDwonSuccessInfoDao);
        registerDao(HeartRate.class, heartRateDao);
        registerDao(HmProperty.class, hmPropertyDao);
        registerDao(LaunchEntity.class, launchEntityDao);
        registerDao(ManualData.class, manualDataDao);
        registerDao(Medal.class, medalDao);
        registerDao(MyShoes.class, myShoesDao);
        registerDao(NewCalories.class, newCaloriesDao);
        registerDao(NormandyData.class, normandyDataDao);
        registerDao(Push.class, pushDao);
        registerDao(Reminder.class, reminderDao);
        registerDao(Runconfig.class, runconfigDao);
        registerDao(SensorData.class, sensorDataDao);
        registerDao(ShoesData.class, shoesDataDao);
        registerDao(ShoesPartners.class, shoesPartnersDao);
        registerDao(Trackdata.class, trackdataDao);
        registerDao(Trackdeathbook.class, trackdeathbookDao);
        registerDao(Trackhr.class, trackhrDao);
        registerDao(Trackrecord.class, trackrecordDao);
        registerDao(Trackstatistics.class, trackstatisticsDao);
        registerDao(UserInfos.class, userInfosDao);
        registerDao(UserScaleInfo.class, userScaleInfoDao);
        registerDao(WatchSkin.class, watchSkinDao);
        registerDao(WeightGoals.class, weightGoalsDao);
        registerDao(WeightInfos.class, weightInfosDao);
        registerDao(CirclePost.class, circlePostDao);
        registerDao(RecomendedUser.class, recomendedUserDao);
        registerDao(ActionAudio.class, actionAudioDao);
        registerDao(ActionContent.class, actionContentDao);
        registerDao(ActionVideo.class, actionVideoDao);
        registerDao(BgMusic.class, bgMusicDao);
        registerDao(Coach.class, coachDao);
        registerDao(HaveDoneAction.class, haveDoneActionDao);
        registerDao(TrainingCourse.class, trainingCourseDao);
        registerDao(TrainingCourseItem.class, trainingCourseItemDao);
        registerDao(TrainingDetail.class, trainingDetailDao);
        registerDao(TrainingHeartRate.class, trainingHeartRateDao);
        registerDao(TrainingItem.class, trainingItemDao);
        registerDao(TrainingRecord.class, trainingRecordDao);
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
    }

    public ActionAudioDao getActionAudioDao() {
        return this.i1;
    }

    public ActionContentDao getActionContentDao() {
        return this.j1;
    }

    public ActionVideoDao getActionVideoDao() {
        return this.k1;
    }

    public ActiveMiPlusShoesDao getActiveMiPlusShoesDao() {
        return this.m0;
    }

    public ActivetrackBarDao getActivetrackBarDao() {
        return this.o0;
    }

    public ActivetrackDao getActivetrackDao() {
        return this.n0;
    }

    public ActivetrackDistanceDao getActivetrackDistanceDao() {
        return this.p0;
    }

    public ActivetrackStepDao getActivetrackStepDao() {
        return this.q0;
    }

    public ActivetrackhrDao getActivetrackhrDao() {
        return this.r0;
    }

    public AdEntityDao getAdEntityDao() {
        return this.s0;
    }

    public AlarmDao getAlarmDao() {
        return this.t0;
    }

    public AtrialFibrillationDataItemDao getAtrialFibrillationDataItemDao() {
        return this.u0;
    }

    public BgMusicDao getBgMusicDao() {
        return this.l1;
    }

    public CirclePostDao getCirclePostDao() {
        return this.g1;
    }

    public CoachDao getCoachDao() {
        return this.m1;
    }

    public CompareModelDao getCompareModelDao() {
        return this.v0;
    }

    public ConfigDao getConfigDao() {
        return this.w0;
    }

    public DateDataDao getDateDataDao() {
        return this.x0;
    }

    public DetailDao getDetailDao() {
        return this.y0;
    }

    public DeviceDao getDeviceDao() {
        return this.z0;
    }

    public DismissAdvDao getDismissAdvDao() {
        return this.A0;
    }

    public EarbudDateDataDao getEarbudDateDataDao() {
        return this.B0;
    }

    public EarbudMusicInfoDao getEarbudMusicInfoDao() {
        return this.C0;
    }

    public FbtEteResultDao getFbtEteResultDao() {
        return this.D0;
    }

    public FbtThaResultDao getFbtThaResultDao() {
        return this.E0;
    }

    public FriendDao getFriendDao() {
        return this.F0;
    }

    public FriendMessageDao getFriendMessageDao() {
        return this.G0;
    }

    public FwDwonSuccessInfoDao getFwDwonSuccessInfoDao() {
        return this.H0;
    }

    public HaveDoneActionDao getHaveDoneActionDao() {
        return this.n1;
    }

    public HeartRateDao getHeartRateDao() {
        return this.I0;
    }

    public HmPropertyDao getHmPropertyDao() {
        return this.J0;
    }

    public LaunchEntityDao getLaunchEntityDao() {
        return this.K0;
    }

    public ManualDataDao getManualDataDao() {
        return this.L0;
    }

    public MedalDao getMedalDao() {
        return this.M0;
    }

    public MyShoesDao getMyShoesDao() {
        return this.N0;
    }

    public NewCaloriesDao getNewCaloriesDao() {
        return this.O0;
    }

    public NormandyDataDao getNormandyDataDao() {
        return this.P0;
    }

    public PushDao getPushDao() {
        return this.Q0;
    }

    public RecomendedUserDao getRecomendedUserDao() {
        return this.h1;
    }

    public ReminderDao getReminderDao() {
        return this.R0;
    }

    public RunconfigDao getRunconfigDao() {
        return this.S0;
    }

    public SensorDataDao getSensorDataDao() {
        return this.T0;
    }

    public ShoesDataDao getShoesDataDao() {
        return this.U0;
    }

    public ShoesPartnersDao getShoesPartnersDao() {
        return this.V0;
    }

    public TrackdataDao getTrackdataDao() {
        return this.W0;
    }

    public TrackdeathbookDao getTrackdeathbookDao() {
        return this.X0;
    }

    public TrackhrDao getTrackhrDao() {
        return this.Y0;
    }

    public TrackrecordDao getTrackrecordDao() {
        return this.Z0;
    }

    public TrackstatisticsDao getTrackstatisticsDao() {
        return this.a1;
    }

    public TrainingCourseDao getTrainingCourseDao() {
        return this.o1;
    }

    public TrainingCourseItemDao getTrainingCourseItemDao() {
        return this.p1;
    }

    public TrainingDetailDao getTrainingDetailDao() {
        return this.q1;
    }

    public TrainingHeartRateDao getTrainingHeartRateDao() {
        return this.r1;
    }

    public TrainingItemDao getTrainingItemDao() {
        return this.s1;
    }

    public TrainingRecordDao getTrainingRecordDao() {
        return this.t1;
    }

    public UserInfosDao getUserInfosDao() {
        return this.b1;
    }

    public UserScaleInfoDao getUserScaleInfoDao() {
        return this.c1;
    }

    public WatchSkinDao getWatchSkinDao() {
        return this.d1;
    }

    public WeightGoalsDao getWeightGoalsDao() {
        return this.e1;
    }

    public WeightInfosDao getWeightInfosDao() {
        return this.f1;
    }
}
