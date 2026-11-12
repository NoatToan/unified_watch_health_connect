package com.xiaomi.hm.health.bt.profile.sport;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class HMSportController implements IHMSportListener, ISportSupplementPanelApi {
    private static final String h = "HMSportController";
    private static final int i = 5000;
    private HMSportProfile a;
    private IHMSportListener b = null;
    private Timer c = null;
    private TimerTask d = null;
    private Object e = new Object();
    private int f = -1;
    private ExecutorService g = Executors.newSingleThreadExecutor();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            HMSportController.this.a.doSportCommand(SportCommand.HEART, null);
        }
    }

    public HMSportController(GattPeripheral gattPeripheral) {
        this.a = null;
        HMSportProfile hMSportProfile = new HMSportProfile(gattPeripheral);
        this.a = hMSportProfile;
        hMSportProfile.setListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(SportCommand sportCommand, SportInfo sportInfo) {
        boolean zDoSportCommand;
        Debug.i(h, "sendCommand start");
        SportCommand sportCommand2 = SportCommand.PAUSE;
        if (sportCommand == sportCommand2) {
            i();
        } else if (sportCommand == SportCommand.RESUME || sportCommand == SportCommand.STOP) {
            stopTimer();
        }
        if (this.a.isSupportPiece()) {
            zDoSportCommand = this.a.doSportCommandPiece(sportCommand, sportInfo);
        } else {
            if (sportInfo != null && (sportCommand == SportCommand.SHOW || sportCommand == sportCommand2)) {
                SportInfo sportInfo2 = new SportInfo();
                sportInfo2.setHr(sportInfo.getHr());
                sportInfo2.setDistance(sportInfo.getDistance());
                SportType sportType = sportInfo.getSportType();
                if (sportType == SportType.SPORT_TYPE_ODRUN) {
                    sportInfo2.setPace(sportInfo.getPace());
                    sportInfo2.setAvePace(sportInfo.getAvePace());
                } else if (sportType == SportType.SPORT_TYPE_IDRUN) {
                    sportInfo2.setStepFreq(sportInfo.getStepFreq());
                    sportInfo2.setStep(sportInfo.getStep());
                } else if (sportType == SportType.SPORT_TYPE_RIDING) {
                    sportInfo2.setSpeed(sportInfo.getSpeed());
                    sportInfo2.setAveSpeed(sportInfo.getAveSpeed());
                } else if (sportType == SportType.SPORT_TYPE_WALKING) {
                    sportInfo2.setStep(sportInfo.getStep());
                    sportInfo2.setSpeed(sportInfo.getSpeed());
                }
                sportInfo = sportInfo2;
            }
            zDoSportCommand = this.a.doSportCommand(sportCommand, sportInfo);
        }
        if (sportCommand == SportCommand.STOP) {
            zDoSportCommand &= j();
        }
        Debug.i(h, "sendCommand stop:" + zDoSportCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SportCommand sportCommand, SportInfo sportInfo) {
        Debug.i(h, "sendCommandPiece start");
        Debug.i(h, "sendCommandPiece stop:" + (sportCommand == SportCommand.STOP ? j() : this.a.doSportCommandPiece(sportCommand, sportInfo)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(SportConfig sportConfig) {
        Debug.i(h, "sendConfig start");
        Debug.i(h, "sendConfig stop:" + (this.a.init() && (this.f != 0 || this.a.doSportConfig(sportConfig))));
    }

    private synchronized void h(final SportCommand command, final SportInfo info) {
        Debug.i(h, "sendCommandPiece:" + command);
        if (this.f != 1) {
            return;
        }
        this.g.execute(new Runnable() { // from class: ai3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(command, info);
            }
        });
    }

    private void i() {
        synchronized (this.e) {
            TimerTask timerTask = this.d;
            if (timerTask != null) {
                timerTask.cancel();
            }
            Timer timer = this.c;
            if (timer != null) {
                timer.cancel();
                this.c.purge();
            }
            this.c = new Timer("sport");
            a aVar = new a();
            this.d = aVar;
            this.c.schedule(aVar, 5000L, 5000L);
        }
    }

    private boolean j() {
        this.f = -1;
        return this.a.deInit();
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void control(@NotNull SportCommand command, @NotNull SportInfo sportInfo) {
        sendCommand(command, sportInfo);
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void controlWithoutHeartbeat(@NotNull SportCommand command, @NotNull SportInfo sportInfo) {
        h(command, sportInfo);
    }

    public void disconnect() {
        this.f = -1;
        stopTimer();
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void initPanel(@NotNull SportConfig sportConfig, @NotNull IHMSportListener listener) {
        sendConfig(sportConfig, listener);
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
    public void onSportCommand(SportCommand command) {
        if (command == SportCommand.PAUSE) {
            i();
        } else if (command == SportCommand.RESUME || command == SportCommand.STOP) {
            stopTimer();
        }
        IHMSportListener iHMSportListener = this.b;
        if (iHMSportListener != null) {
            iHMSportListener.onSportCommand(command);
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void release() {
        this.f = -1;
        stopTimer();
        j();
    }

    public synchronized void sendCommand(final SportCommand command, final SportInfo info) {
        Debug.i(h, "sendCommand:" + command);
        if (this.f != 0) {
            return;
        }
        this.g.execute(new Runnable() { // from class: bi3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(command, info);
            }
        });
    }

    public synchronized void sendConfig(final SportConfig config, IHMSportListener listener) {
        Debug.i(h, "SportConfig:" + config);
        if (this.f == 1) {
            return;
        }
        this.b = listener;
        this.f = config.getSource();
        this.g.execute(new Runnable() { // from class: ci3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(config);
            }
        });
    }

    public void sendSportNoTimerConfig(SportConfig config, IHMSportListener listener) {
        config.setNeedDeviceClock(false);
        sendConfig(config, listener);
    }

    public void stopTimer() {
        synchronized (this.e) {
            TimerTask timerTask = this.d;
            if (timerTask != null) {
                timerTask.cancel();
            }
            Timer timer = this.c;
            if (timer != null) {
                timer.cancel();
                this.c.purge();
            }
            this.c = null;
            this.d = null;
        }
    }
}
