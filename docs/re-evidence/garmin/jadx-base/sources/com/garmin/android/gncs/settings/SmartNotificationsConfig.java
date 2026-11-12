package com.garmin.android.gncs.settings;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.ancs.ANCSMessageManager;
import com.garmin.android.gncs.GNCSListenerServiceInitUpdateCallback;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSNotificationManager;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.StatusBarNotificationListenerManager;
import com.garmin.android.gncs.actionhandler.ActionSettings;
import com.garmin.android.gncs.datamappers.AbstractDataMapper;
import com.garmin.android.gncs.datamappers.ConfigurableDataMapper;
import com.garmin.android.gncs.datamappers.DuoDataMapper;
import com.garmin.android.gncs.datamappers.EmailDataMapper;
import com.garmin.android.gncs.datamappers.FacebookMessengerDataMapper;
import com.garmin.android.gncs.datamappers.GoogleMessageDataMapper;
import com.garmin.android.gncs.datamappers.GoogleNowDataMapper;
import com.garmin.android.gncs.datamappers.IgnoreLargeIconMMSDataMapper;
import com.garmin.android.gncs.datamappers.ImageValidateDataMapper;
import com.garmin.android.gncs.datamappers.LineDataMapper;
import com.garmin.android.gncs.datamappers.NoActionDataMapper;
import com.garmin.android.gncs.datamappers.NoSimpleActionIndexDataMapper;
import com.garmin.android.gncs.datamappers.OverrideNewSilentDataMapper;
import com.garmin.android.gncs.datamappers.ShouldIAnswerDataMapper;
import com.garmin.android.gncs.datamappers.WeChatDataMapper;
import com.garmin.android.gncs.handlers.AbstractAppHandler;
import com.garmin.android.gncs.handlers.DoNotSendAppHandler;
import com.garmin.android.gncs.handlers.DoNotSendIfForegroundAndOngoingAppHandler;
import com.garmin.android.gncs.handlers.DoNotSendIfLocalAppHandler;
import com.garmin.android.gncs.handlers.InCallUiAppHandler;
import com.garmin.android.gncs.handlers.NoForegroundServiceAppHandler;
import com.garmin.android.gncs.handlers.ProgressUpdateHandler;
import com.garmin.android.gncs.handlers.SamsungCalendarAppHandler;
import com.garmin.android.gncs.handlers.SamsungDialerAppHandler;
import com.garmin.android.gncs.handlers.SendOverrideAppHandler;
import com.garmin.android.gncs.handlers.SendUnlessOngoingAndHighPriorityAppHandler;
import com.garmin.android.gncs.handlers.ShouldIAnswerAppHandler;
import com.garmin.android.gncs.handlers.TrueCallerAppHandler;
import com.garmin.android.gncs.notificationmatcher.ConsiderPostTimeNotificationMatcher;
import com.garmin.android.gncs.notificationmatcher.NotificationMatcher;
import com.garmin.android.gncs.persistence.GNCSApplicationsDatabase;
import com.garmin.android.gncs.persistence.GNCSNotificationDatabase;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import gh2.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class SmartNotificationsConfig {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String GNCS_APP_HANDLERS = "gncs_app_handlers_4";
    private static final String GNCS_CONFIG_OVERRIDES = "gncs_config_overrides";
    private static final String GNCS_DATA_MAPPERS = "gncs_data_mappers_4";
    private static final String GNCS_NOTIFICATION_TYPES = "gncs_notification_types";
    private static final String GNCS_NO_REPLY_ACTION_PACKAGES = "gncs_no_reply_action_packages";
    private static final String GNCS_PACKAGE_OVERRIDES = "gncs_package_overrides";
    private static final String GNCS_REMOTE_DATA_MAPPER_CONFIG = "gncs_remote_data_mapper_config";
    private static final String GNCS_REMOTE_VIEW_PARSING_ENABLED = "gncs_remote_view_parsing_enabled";
    public static final long MAX_TIME_TO_KEEP_STALE_NOTIFICATIONS = 60000;
    private static final String[] appsToIgnoreLargeIconForMMS = new String[0];
    public static SmartNotificationsConfig sInstance;
    private final CopyOnWriteArrayList<GNCSNotificationInfo.NotificationType> restrictedTypes = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<String> noReplyActionPackages = new CopyOnWriteArrayList<>();
    private boolean verboseLoggingEnabled = false;
    private boolean obfuscateLoggingEnabled = true;
    private boolean shareSettingsAcrossApps = true;
    private boolean parseRemoteViewImages = true;
    private n remoteConfiguration = null;

    private SmartNotificationsConfig() {
    }

    private void applyNoReplyActionPackages(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                if (jSONObject.getBoolean("enabled")) {
                    addNoReplyActionPackage(jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME));
                } else {
                    removeNoReplyActionPackage(jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME));
                }
            }
        } catch (Exception e4) {
            ih2.b.a(e4, "SmartNotificationsConfig.applyNoReplyActionPackages");
        }
    }

    private void applyOverrides(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ActionSettings.loadDynamically(str);
        } catch (Exception e4) {
            ih2.b.a(e4, "SmartNotificationsConfig.applyOverrides");
        }
    }

    private void applyRemoteViewImageParsing(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zC = this.remoteConfiguration.c(GNCS_REMOTE_VIEW_PARSING_ENABLED);
        ih2.b.b("SmartNotificationsConfig.applyRemoteViewImageParsing :[" + zC + "]");
        this.parseRemoteViewImages = zC;
    }

    public static SmartNotificationsConfig getInstance() {
        SmartNotificationsConfig smartNotificationsConfig = sInstance;
        if (smartNotificationsConfig != null) {
            return smartNotificationsConfig;
        }
        h.z("App's onCreate must call GNCSListenerService.init() before obtaining instance");
        return null;
    }

    public static void init(Context context, n nVar, GNCSListenerServiceInitUpdateCallback gNCSListenerServiceInitUpdateCallback) {
        ih2.b.b("SmartNotificationsConfig.init");
        if (sInstance == null) {
            sInstance = new SmartNotificationsConfig();
        }
        jb2.a[] aVarArr = {new GNCSNotificationManager.InjectorConfiguration(), new ANCSMessageManager.InjectorConfiguration(), new StatusBarNotificationListenerManager.InjectorConfiguration()};
        Collections.addAll(jb2.b.f98119e, aVarArr);
        jb2.b bVar = jb2.b.f98118d;
        if (bVar != null) {
            for (int i14 = 0; i14 < 3; i14++) {
                jb2.a aVar = aVarArr[i14];
                aVar.configure();
                bVar.f98120a.putAll(aVar.getInstanceFactoryMap());
                bVar.f98121b.putAll(aVar.getSingletonFactoryMap());
            }
        }
        new Thread(new a8.d(context, 16, nVar, gNCSListenerServiceInitUpdateCallback)).start();
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(Observable observable, Object obj) {
        sInstance.applyRemoteConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$1(Context context, n nVar, GNCSListenerServiceInitUpdateCallback gNCSListenerServiceInitUpdateCallback) {
        GNCSNotificationDatabase.init(context);
        GNCSApplicationsDatabase.init(context);
        AbstractDataMapper.registerDataMapper("com.android.mms", 0, NoSimpleActionIndexDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.android.mms.services", 0, NoSimpleActionIndexDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.duosecurity.duomobile", 0, DuoDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.google.android.calendar", 0, NoActionDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.google.android.gm", 0, EmailDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.google.android.googlequicksearchbox", 0, GoogleNowDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.google.android.talk", 0, EmailDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.microsoft.office.lync15", 0, OverrideNewSilentDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.samsung.android.messaging", 0, NoSimpleActionIndexDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.skype.raider", 0, OverrideNewSilentDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.tencent.mm", 0, WeChatDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.yahoo.mobile.client.android.mail", 0, EmailDataMapper.class);
        AbstractDataMapper.registerDataMapper("jp.naver.line.android", 0, LineDataMapper.class);
        AbstractDataMapper.registerDataMapper("org.mistergroup.shouldianswer", 0, ShouldIAnswerDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.facebook.orca", 0, FacebookMessengerDataMapper.class);
        AbstractDataMapper.registerDataMapper("com.whatsapp", 0, ImageValidateDataMapper.class);
        AbstractDataMapper.registerDataMapper(SmartNotificationsUtil.Packages.GOOGLE_MESSAGES_APP_PACKAGE_NAME, 0, GoogleMessageDataMapper.class);
        AbstractAppHandler.registerApplicationHandler("com.android.phone", 0, SendUnlessOngoingAndHighPriorityAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.crash.air", 0, NoForegroundServiceAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.google.android.gm", 0, DoNotSendIfLocalAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.google.android.talk", 0, NoForegroundServiceAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.mapquest.android.ace", 0, DoNotSendIfForegroundAndOngoingAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.microsoft.office.outlook", 0, SendOverrideAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.samsung.android.contacts", 0, SamsungDialerAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.sec.android.app.sbrowser", 0, DoNotSendIfLocalAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.tencent.mm", 0, SendOverrideAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("dev.firebase.appdistribution", 0, ProgressUpdateHandler.class);
        AbstractAppHandler.registerApplicationHandler("io.crash.air", 0, NoForegroundServiceAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("org.mistergroup.shouldianswer", 0, ShouldIAnswerAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("wit.android.bcpBankingApp.millenniumPL", 0, ProgressUpdateHandler.class);
        AbstractAppHandler.registerApplicationHandler(SmartNotificationsUtil.Packages.TRUE_CALLER_PACKAGE_NAME, 0, TrueCallerAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.android.incallui", 0, InCallUiAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.amazon.mp3", 0, DoNotSendAppHandler.class);
        AbstractAppHandler.registerApplicationHandler(SmartNotificationsUtil.Packages.FOSSIFY_CALLER_PACKAGE_NAME, 0, DoNotSendAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.google.android.gms", 0, DoNotSendAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.google.android.music", 0, DoNotSendAppHandler.class);
        AbstractAppHandler.registerApplicationHandler(SmartNotificationsUtil.Packages.SAMSUNG_INCALL_UI_PACKAGE_NAME, 0, DoNotSendAppHandler.class);
        AbstractAppHandler.registerApplicationHandler(SmartNotificationsUtil.Packages.ASUS_INCALL_UI_PACKAGE_NAME, 0, DoNotSendAppHandler.class);
        AbstractAppHandler.registerApplicationHandler("com.samsung.tmowfc.wfccontroller", 0, DoNotSendAppHandler.class);
        AbstractAppHandler.registerApplicationHandler(SmartNotificationsUtil.Packages.SAMSUNG_CALENDAR_PACKAGE_NAME, 0, SamsungCalendarAppHandler.class);
        registerMMSHandlers();
        NotificationMatcher.registerNotificationMatcher("com.facebook.orca", 0, ConsiderPostTimeNotificationMatcher.class);
        Iterator<String> it = GNCSSettings.getInstance().getDefaultPackageNames(GNCSNotificationInfo.NotificationType.SCHEDULE).iterator();
        while (it.hasNext()) {
            NotificationMatcher.registerNotificationMatcher(it.next(), 0, ConsiderPostTimeNotificationMatcher.class);
        }
        if (nVar != null) {
            sInstance.remoteConfiguration = nVar;
            nVar.addObserver(new f());
        }
        GNCSSettings.getInstance().performUpgrade();
        GNCSSettings.getInstance().reloadPackages(context);
        if (gNCSListenerServiceInitUpdateCallback != null) {
            gNCSListenerServiceInitUpdateCallback.smartConfigInitializationComplete();
        }
    }

    private static void registerMMSHandlers() {
        for (String str : appsToIgnoreLargeIconForMMS) {
            AbstractDataMapper.registerDataMapper(str, 0, IgnoreLargeIconMMSDataMapper.class);
        }
    }

    public void addNoReplyActionPackage(String str) {
        this.noReplyActionPackages.addIfAbsent(str);
    }

    public void addRestrictedType(GNCSNotificationInfo.NotificationType notificationType) {
        this.restrictedTypes.addIfAbsent(notificationType);
    }

    public void applyRemoteConfiguration() {
        n nVar = this.remoteConfiguration;
        if (nVar == null) {
            return;
        }
        nVar.getClass();
        AbstractDataMapper.loadDynamicDataMappers(nVar.h(GNCS_DATA_MAPPERS));
        n nVar2 = this.remoteConfiguration;
        nVar2.getClass();
        ConfigurableDataMapper.setRemoteConfig(nVar2.h(GNCS_REMOTE_DATA_MAPPER_CONFIG));
        n nVar3 = this.remoteConfiguration;
        nVar3.getClass();
        AbstractAppHandler.loadDynamicAppHandlers(nVar3.h(GNCS_APP_HANDLERS));
        GNCSSettings gNCSSettings = GNCSSettings.getInstance();
        n nVar4 = this.remoteConfiguration;
        nVar4.getClass();
        gNCSSettings.applyNotificationTypes(nVar4.h(GNCS_NOTIFICATION_TYPES));
        GNCSSettings gNCSSettings2 = GNCSSettings.getInstance();
        n nVar5 = this.remoteConfiguration;
        nVar5.getClass();
        gNCSSettings2.applyPackageOverrides(nVar5.h(GNCS_PACKAGE_OVERRIDES));
        n nVar6 = this.remoteConfiguration;
        nVar6.getClass();
        applyOverrides(nVar6.h(GNCS_CONFIG_OVERRIDES));
        n nVar7 = this.remoteConfiguration;
        nVar7.getClass();
        applyNoReplyActionPackages(nVar7.h(GNCS_NO_REPLY_ACTION_PACKAGES));
        n nVar8 = this.remoteConfiguration;
        nVar8.getClass();
        applyRemoteViewImageParsing(nVar8.h(GNCS_REMOTE_VIEW_PARSING_ENABLED));
    }

    public boolean forceSilentWhenDoNotDisturb() {
        return ActionSettings.getDefault().getForceSilentWhenDoNotDisturb();
    }

    public boolean getAddBlockAppAction() {
        return ActionSettings.getDefault().getAddBlockAppAction();
    }

    public boolean getAddDismissAppAction() {
        return ActionSettings.getDefault().getAddDismissAppAction();
    }

    public List<String> getNoReplyActionPackages() {
        return Collections.unmodifiableList(this.noReplyActionPackages);
    }

    public List<String> getRemotelyDisabledPackages() {
        try {
            n nVar = this.remoteConfiguration;
            if (nVar == null) {
                return Collections.EMPTY_LIST;
            }
            nVar.getClass();
            String strH = nVar.h(GNCS_PACKAGE_OVERRIDES);
            if (TextUtils.isEmpty(strH)) {
                return Collections.EMPTY_LIST;
            }
            JSONArray jSONArray = new JSONArray(strH);
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                if (!jSONObject.getBoolean("enabled")) {
                    String string = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                    ih2.b.b("SmartNotificationsConfig.getRemotelyDisabledPackages -> Package [" + string + "] is remotely disabled.");
                    arrayList.add(string);
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            ih2.b.c("SmartNotificationsConfig.getRemotelyDisabledPackages", th3);
            return Collections.EMPTY_LIST;
        }
    }

    public List<GNCSNotificationInfo.NotificationType> getRestrictedTypes() {
        return Collections.unmodifiableList(this.restrictedTypes);
    }

    public boolean isNoReplyActionPackage(String str) {
        return this.noReplyActionPackages.contains(str);
    }

    public boolean isObfuscateLoggingEnabled() {
        return this.obfuscateLoggingEnabled;
    }

    public boolean isRemoteViewImageParsingEnabled() {
        return this.parseRemoteViewImages;
    }

    public boolean isRestrictedType(GNCSNotificationInfo.NotificationType notificationType) {
        return this.restrictedTypes.contains(notificationType);
    }

    public boolean isSharingSettingsAcrossApps() {
        return this.shareSettingsAcrossApps;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.verboseLoggingEnabled;
    }

    public boolean onlyUseWearableActions() {
        return ActionSettings.getDefault().getOnlyUseWearableActions();
    }

    public boolean preferWearableActions() {
        return ActionSettings.getDefault().getPreferWearableActions();
    }

    public void removeNoReplyActionPackage(String str) {
        this.noReplyActionPackages.remove(str);
    }

    public void removeRestrictedType(GNCSNotificationInfo.NotificationType notificationType) {
        this.restrictedTypes.remove(notificationType);
    }

    public void setAddBlockAppAction(boolean z14) {
        ActionSettings.getDefault().setAddBlockAppAction(z14);
    }

    public void setAddDismissAppAction(boolean z14) {
        ActionSettings.getDefault().setAddDismissAppAction(z14);
    }

    public void setForceSilentWhenDoNotDisturb(boolean z14) {
        ActionSettings.getDefault().setForceSilentWhenDoNotDisturb(z14);
    }

    public void setObfuscateLoggingEnabled(boolean z14) {
        this.obfuscateLoggingEnabled = z14;
    }

    public void setOnlyUseWearableActions(boolean z14) {
        ActionSettings.getDefault().setOnlyUseWearableActions(z14);
    }

    public void setPreferWearableActions(boolean z14) {
        ActionSettings.getDefault().setPreferWearableActions(z14);
    }

    public void setShareSettingsAcrossApps(boolean z14) {
        this.shareSettingsAcrossApps = z14;
    }

    public void setUseSimpleActions(boolean z14) {
        ActionSettings.getDefault().setUseSimpleActions(z14);
    }

    public void setVerboseLoggingEnabled(boolean z14) {
        this.verboseLoggingEnabled = z14;
    }

    public boolean useSimpleActions() {
        return ActionSettings.getDefault().getUseSimpleActions();
    }

    public boolean forceSilentWhenDoNotDisturb(String str) {
        return ActionSettings.getBy(str).getForceSilentWhenDoNotDisturb();
    }

    public boolean getAddBlockAppAction(String str) {
        return ActionSettings.getBy(str).getAddBlockAppAction();
    }

    public boolean getAddDismissAppAction(String str) {
        return ActionSettings.getBy(str).getAddDismissAppAction();
    }

    public boolean onlyUseWearableActions(String str) {
        return ActionSettings.getBy(str).getOnlyUseWearableActions();
    }

    public boolean preferWearableActions(String str) {
        return ActionSettings.getBy(str).getPreferWearableActions();
    }

    public boolean useSimpleActions(String str) {
        return ActionSettings.getBy(str).getUseSimpleActions();
    }

    public static void init(Context context, n nVar) {
        init(context, nVar, null);
    }
}
