package com.huami.watch.companion.ui.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.sport.helper.SportDetailNavigateHelper;
import com.huami.watch.companion.sport.pb.PBConfig;
import com.huami.watch.companion.sport.pb.PBDataAPI;
import com.huami.watch.companion.sport.pb.PBInfoView;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.sport.pb.PBType;
import com.huami.watch.companion.sport.pb.PBUtil;
import com.huami.watch.companion.sport.pb.PersonalBest;
import com.huami.watch.companion.sync.PBSyncApi;
import com.huami.watch.companion.sync.SyncCloudPBHelper;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes16.dex */
public class PBFragment extends Fragment {
    private static final String e = "PBFragment";
    private static final String f = "showType";
    private LinearLayout a;
    private int b;
    private AlertDialogFragment c;
    private Lazy<PBSyncApi> d = KoinJavaComponent.inject(PBSyncApi.class);

    public static class RecordEvent {
        public static final String FARTHEST_DISTANCE = "farthestdistance";
        public static final String HALF_MARATHON_FASTEST = "halfmarathonfastest";
        public static final String HIGHEST_ALTITUDE = "highestaltitude";
        public static final String KM_FASTEST10 = "10kmfastest";
        public static final String KM_FASTEST5 = "5kmfastest";
        public static final String KM_FASTEST_20 = "20kmfastest";
        public static final String KM_FASTEST_40 = "40kmfastest";
        public static final String KM_FAS_EST_3 = "3kmfastest";
        public static final String LONGEST_TIME = "longesttime";
        public static final String MALAYSIA_FASTEST = "marathonfastest";
        public static final String MAXCRAWL = "maxcrawl";
        public static final String MAXTOTALCLIMB = "maxtotalclimb";
        public static final String MAXTOTALDECLINE = "maxtotaldecline";
        public static final String MAXTOTALRISE = "maxtotalrise";
        public static final String MI_FASTEST_10 = "10mifastest";
        public static final String MI_FASTEST_20 = "20mifastest";
        public static final String MI_FASTEST_3 = "3mifastest";
        public static final String MI_FASTEST_40 = "20mifastest";
        public static final String MI_FASTEST_5 = "5mifastest";
        public static final String PB = "PB";
        public static final String a = "DELETE_PB_C";
        public static final String b = "CONFIRM_PB_C";
        public static final String c = "DISCARD_PB_C";
        public static final String d = "tp";
        public static final String e = "pos";
        public static final String f = "outdoorRun";
        public static final String g = "outdoorCycle";
        public static final String h = "Climb";
        public static final String i = "id";
        public static final String j = "MY_PB_RECORD_C";
    }

    public class a implements PBInfoView.onUnConfirmedClickListener {
        public final /* synthetic */ PBInfoView a;

        public a(PBInfoView pBInfoView) {
            this.a = pBInfoView;
        }

        @Override // com.huami.watch.companion.sport.pb.PBInfoView.onUnConfirmedClickListener
        public void onConfirmedClick(PersonalBest personalBest) {
            PBFragment.this.n(this.a, personalBest);
        }

        @Override // com.huami.watch.companion.sport.pb.PBInfoView.onUnConfirmedClickListener
        public void onGiveUpClick(PersonalBest personalBest) {
            PBFragment.this.B(this.a, personalBest);
        }
    }

    public class b implements PBInfoView.onItemLongClickListener {
        public final /* synthetic */ PBInfoView a;

        public b(PBInfoView pBInfoView) {
            this.a = pBInfoView;
        }

        @Override // com.huami.watch.companion.sport.pb.PBInfoView.onItemLongClickListener
        public void onItemLongClick(PersonalBest personalBest) {
            PBFragment.this.A(this.a, personalBest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(final PBInfoView pBInfoView, final PersonalBest personalBest) {
        com.huami.android.design.dialog.AlertDialogFragment.Builder builder = new com.huami.android.design.dialog.AlertDialogFragment.Builder(getContext());
        builder.setTitle(R.string.pb_tip_delet_record);
        builder.setPositiveButton(R.string.pb_tip_delet_record_ok, new DialogInterface.OnClickListener() { // from class: vn5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.x(pBInfoView, personalBest, dialogInterface, i);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        builder.show(getActivity().getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(final PBInfoView pBInfoView, final PersonalBest personalBest) {
        showLoadingDialog();
        Analytics.recordEvent(new CountEventBuilder(RecordEvent.c).addExtra("tp", q(this.b)));
        Rx.io(new ObservableOnSubscribe() { // from class: zn5
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.y(personalBest, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: ao5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.z(personalBest, pBInfoView, (Boolean) obj);
            }
        });
    }

    private void initView() {
        HashMap<String, HashMap<PBConfig.Status, PersonalBest>> allPBMap = PBManager.get().getAllPBMap();
        PBConfig.Unit unit = PBConfig.Unit.METRIC;
        if (getActivity() != null && !UnitManager.isDistanceKM(getActivity())) {
            unit = PBConfig.Unit.IMPERIAL;
        }
        for (PBType pBType : PBType.values()) {
            if (pBType.getShowType() == this.b && (pBType.getUnit() == unit || pBType.getUnit() == PBConfig.Unit.NONE)) {
                HashMap<PBConfig.Status, PersonalBest> map = allPBMap.get(pBType.getName());
                if (map == null || map.get(PBConfig.Status.CURRENT) == null) {
                    if (map == null) {
                        map = new HashMap<>(3);
                    }
                    PersonalBest personalBest = new PersonalBest();
                    personalBest.setName(pBType.getName());
                    map.put(PBConfig.Status.CURRENT, personalBest);
                }
                PBInfoView pBInfoView = new PBInfoView(getActivity());
                pBInfoView.addonUnConfirmedClickListener(new a(pBInfoView));
                pBInfoView.addOnItemClickListener(new PBInfoView.onItemClickListener() { // from class: wn5
                    @Override // com.huami.watch.companion.sport.pb.PBInfoView.onItemClickListener
                    public final void onItemClick(PersonalBest personalBest2) {
                        this.a.m(personalBest2);
                    }
                });
                pBInfoView.addOnItemLongClickListener(new b(pBInfoView));
                pBInfoView.setData(map);
                this.a.addView(pBInfoView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(PersonalBest personalBest) {
        SportDetailNavigateHelper.getInstance().naviSportDetailPage(getContext(), personalBest.getTrackId(), personalBest.getSource(), personalBest.getType(), "PB");
        Analytics.recordEvent(new CountEventBuilder(RecordEvent.j).addExtra("id", String.valueOf(personalBest.getTrackId())).addExtra("tp", q(this.b)).addExtra("pos", PBUtil.getPBEventKey(personalBest.getName()) + "(" + PBUtil.formatPBValuePos(getContext(), personalBest.getName(), personalBest.getValue()) + ")"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final PBInfoView pBInfoView, final PersonalBest personalBest) {
        showLoadingDialog();
        Analytics.recordEvent(new CountEventBuilder(RecordEvent.b).addExtra("tp", q(this.b)));
        Rx.io(new ObservableOnSubscribe() { // from class: yn5
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.s(personalBest, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: co5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.u(personalBest, pBInfoView, (Boolean) obj);
            }
        });
    }

    public static PBFragment newInstance(int i) {
        PBFragment pBFragment = new PBFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(f, i);
        pBFragment.setArguments(bundle);
        return pBFragment;
    }

    private void o(final PBInfoView pBInfoView, final PersonalBest personalBest) {
        showLoadingDialog();
        Analytics.recordEvent(new CountEventBuilder(RecordEvent.a).addExtra("tp", q(this.b)));
        Rx.io(new ObservableOnSubscribe() { // from class: xn5
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.v(personalBest, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: bo5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.w(personalBest, pBInfoView, (Boolean) obj);
            }
        });
    }

    private void p() {
        AlertDialogFragment alertDialogFragment = this.c;
        if (alertDialogFragment != null) {
            try {
                alertDialogFragment.dismissAllowingStateLoss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.c = null;
        }
    }

    private String q(int i) {
        if (i == 1) {
            return RecordEvent.f;
        }
        if (i == 2) {
            return RecordEvent.g;
        }
        return i == 4 ? "Climb" : "";
    }

    private void r() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.b = arguments.getInt(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(PersonalBest personalBest, ObservableEmitter observableEmitter) throws Exception {
        personalBest.setStatus(PBConfig.KEY_CONFIRMED);
        ArrayList arrayList = new ArrayList();
        arrayList.add(personalBest);
        PBDataAPI.PersonalBestResult personalBestResultUpdatePBData = PBDataAPI.updatePBData(getActivity(), arrayList);
        if (personalBestResultUpdatePBData.success) {
            personalBestResultUpdatePBData.success = PBDataAPI.deletePBData(getActivity(), personalBest.getName(), PBConfig.KEY_UNCONFIRMED).success;
        }
        observableEmitter.onNext(Boolean.valueOf(personalBestResultUpdatePBData.success));
    }

    private void showLoadingDialog() {
        AlertDialogFragment alertDialogFragment = this.c;
        if (alertDialogFragment != null) {
            alertDialogFragment.dismissAllowingStateLoss();
            this.c = null;
        }
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
        this.c = alertDialogFragmentNewInstance;
        alertDialogFragmentNewInstance.setMessage(getString(R.string.running_history_loading));
        this.c.setCancelable(false);
        try {
            this.c.show(getActivity().getFragmentManager(), "");
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(PersonalBest personalBest) {
        if (this.d.getValue().supportSyncPb()) {
            this.d.getValue().sendPBInfos(PBManager.get().getConfirmedPBToWatch(personalBest), false);
        } else {
            SyncUtil.syncConfirmedPbToWatch(getActivity(), CompanionModule.ACTION_SYNC_CONFIRMED_PB, PBManager.get().getConfirmedPBToWatch(personalBest));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(final PersonalBest personalBest, PBInfoView pBInfoView, Boolean bool) throws Exception {
        p();
        if (bool.booleanValue()) {
            if (DeviceManager.getManager(getActivity()).isCurrentDeviceBLE()) {
                Rx.io(new Runnable() { // from class: do5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.t(personalBest);
                    }
                }).safeSubscribe();
            } else {
                SyncUtil.syncConfirmedPbToWatch(getActivity(), CompanionModule.ACTION_SYNC_CONFIRMED_PB, PBManager.get().getConfirmedPBToWatch(personalBest));
            }
            PBManager.get().confirmedPB(personalBest.getName());
            pBInfoView.confirmed(PBManager.get().getAllPBMap().get(personalBest.getName()).get(PBConfig.Status.CURRENT), PBManager.get().getAllPBMap().get(personalBest.getName()).get(PBConfig.Status.LAST));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(PersonalBest personalBest, ObservableEmitter observableEmitter) throws Exception {
        PBDataAPI.PersonalBestResult personalBestResultDeletePBDataByTimeStamp = PBDataAPI.deletePBDataByTimeStamp(getActivity(), personalBest.getName(), Long.valueOf(personalBest.getTimestamp() / 1000));
        if (personalBestResultDeletePBDataByTimeStamp.success) {
            SyncCloudPBHelper.getHelper(getActivity()).start();
        }
        observableEmitter.onNext(Boolean.valueOf(personalBestResultDeletePBDataByTimeStamp.success));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(PersonalBest personalBest, PBInfoView pBInfoView, Boolean bool) throws Exception {
        p();
        if (bool.booleanValue()) {
            PBManager.get().init();
            HashMap<PBConfig.Status, PersonalBest> map = PBManager.get().getAllPBMap().get(personalBest.getName());
            if (map == null || map.get(PBConfig.Status.CURRENT) == null) {
                if (map == null) {
                    map = new HashMap<>(3);
                }
                PersonalBest personalBest2 = new PersonalBest();
                personalBest2.setName(personalBest.getName());
                map.put(PBConfig.Status.CURRENT, personalBest2);
            }
            pBInfoView.setData(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(PBInfoView pBInfoView, PersonalBest personalBest, DialogInterface dialogInterface, int i) {
        o(pBInfoView, personalBest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(PersonalBest personalBest, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(PBDataAPI.deletePBData(getActivity(), personalBest.getName(), PBConfig.KEY_UNCONFIRMED).success));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(PersonalBest personalBest, PBInfoView pBInfoView, Boolean bool) throws Exception {
        p();
        if (bool.booleanValue()) {
            PBManager.get().giveUpPB(personalBest.getName());
            pBInfoView.giveUp();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        r();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pb, viewGroup, false);
        this.a = (LinearLayout) viewInflate.findViewById(R.id.container);
        initView();
        return viewInflate;
    }
}
