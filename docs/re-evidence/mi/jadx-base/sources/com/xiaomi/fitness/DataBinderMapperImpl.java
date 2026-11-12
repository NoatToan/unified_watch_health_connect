package com.xiaomi.fitness;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.qk5;
import defpackage.rk5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f11476a = new SparseIntArray(0);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f11477a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(48);
            f11477a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "accessoryDevice");
            sparseArray.put(2, "addSongList");
            sparseArray.put(3, "allInfo");
            sparseArray.put(4, "categoryData");
            sparseArray.put(5, "channelViewModel");
            sparseArray.put(6, "click");
            sparseArray.put(7, "clickListener");
            sparseArray.put(8, "currentDevice");
            sparseArray.put(9, "data");
            sparseArray.put(10, "detail");
            sparseArray.put(11, "device");
            sparseArray.put(12, "deviceInfo");
            sparseArray.put(13, "ftpData");
            sparseArray.put(14, "info");
            sparseArray.put(15, "isUbox");
            sparseArray.put(16, "item");
            sparseArray.put(17, "label");
            sparseArray.put(18, "launchBean");
            sparseArray.put(19, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            sparseArray.put(20, "localSportBean");
            sparseArray.put(21, "mainViewModel");
            sparseArray.put(22, "medal");
            sparseArray.put(23, "mineViewModel");
            sparseArray.put(24, "nameStr");
            sparseArray.put(25, "navigation");
            sparseArray.put(26, "night");
            sparseArray.put(27, "normalSportBean");
            sparseArray.put(28, "onClick");
            sparseArray.put(29, "orderId");
            sparseArray.put(30, "phoneData");
            sparseArray.put(31, "player");
            sparseArray.put(32, "previewUrl");
            sparseArray.put(33, "priceValue");
            sparseArray.put(34, "regionViewModel");
            sparseArray.put(35, "report");
            sparseArray.put(36, "resultViewModel");
            sparseArray.put(37, "rnDeviceInfo");
            sparseArray.put(38, "scannedDeviceInfo");
            sparseArray.put(39, "shareListHelper");
            sparseArray.put(40, "song");
            sparseArray.put(41, "songlist");
            sparseArray.put(42, "startTimestamp");
            sparseArray.put(43, "tabListData");
            sparseArray.put(44, "titleData");
            sparseArray.put(45, "viewModel");
            sparseArray.put(46, "viewmodel");
            sparseArray.put(47, "vm");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f11478a = new HashMap<>(0);
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(211);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.BV.LinearGradient.DataBinderMapperImpl());
        arrayList.add(new com.chad.library.DataBinderMapperImpl());
        arrayList.add(new com.dylanvann.fastimage.DataBinderMapperImpl());
        arrayList.add(new com.example.aivs.export.DataBinderMapperImpl());
        arrayList.add(new com.example.appupgrade.export.DataBinderMapperImpl());
        arrayList.add(new com.example.habit.export.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.access.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.data.access.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.imagepicker.DataBinderMapperImpl());
        arrayList.add(new com.learnium.RNDeviceInfo.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.alexa.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.capability.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.capability.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.checkupdate.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.checkupdate.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.course.schecule.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.course.schedule.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.ecg.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.lpamanagement.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.lpamanagement.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.netproxy.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.sfnttly.tools.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.temperature.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.appupgrade.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.fitness.data.provider.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.map.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.message.center.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.message.center.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.nearby.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.opusdecoder.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.permission.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.uri_parser.DataBinderMapperImpl());
        arrayList.add(new com.mi.health_provider.DataBinderMapperImpl());
        arrayList.add(new com.reactnative.blob.DataBinderMapperImpl());
        arrayList.add(new com.reactnative.ivpusic.imagepicker.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.cameraroll.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.cookies.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.slider.DataBinderMapperImpl());
        arrayList.add(new com.reactnativecommunity.yrn.netinfo.DataBinderMapperImpl());
        arrayList.add(new com.reactnativepagerview.DataBinderMapperImpl());
        arrayList.add(new com.rnfs.DataBinderMapperImpl());
        arrayList.add(new com.swmansion.gesturehandler.react.DataBinderMapperImpl());
        arrayList.add(new com.swmansion.reanimated.DataBinderMapperImpl());
        arrayList.add(new com.th3rdwave.safeareacontext.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.eco.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.eco.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.persist.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.sleep.algo.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.about.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.access.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.active.pk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.active.pk.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.aivs.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.app.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.auto.start.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.banner.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.blood_sugar_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.chart.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.dataprovider.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.contact.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.exception.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.exception.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.feedback.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.feedback.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.habit.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.heartrate.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.heartrate.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.instance.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.keep_alive.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.map.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.media.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.media.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.membership.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.membership.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mijia.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.milink.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.milink.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.milink_sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.ble.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.motion.recognition.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.nfc.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.nfc.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.notify.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.notify.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.pay.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.pay.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.push.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.push.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.res.preload.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.res.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.research.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.research.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.settings.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.route.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.route.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.running.group.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.running.group.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sensor.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sleep.trace.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.smarthome.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport.eco.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_capture.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_capture_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_eco.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_eco_manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_eco_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_xms.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_xms_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.stand.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.stand.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.steps.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sync.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.training_plan.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.training_plan_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ubox_guide.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ubox_guide.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.userinfo.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.watch.face.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.watch.face.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.wearos.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.wearos.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.yrn_config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.firebase.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.lyra_lib.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.play.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.components.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.sdk.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.xms.wearable.DataBinderMapperImpl());
        arrayList.add(new com.xms.wearable.export.DataBinderMapperImpl());
        arrayList.add(new com.zoontek.rnlocalize.DataBinderMapperImpl());
        arrayList.add(new services.reminder.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f11477a.get(i);
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f11476a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f11478a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        if (f11476a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
