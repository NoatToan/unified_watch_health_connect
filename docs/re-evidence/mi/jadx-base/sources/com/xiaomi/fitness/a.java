package com.xiaomi.fitness;

import android.app.Activity;
import android.app.Service;
import android.os.IBinder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import com.example.aivs.export.AivsHelper;
import com.example.habit.export.HabitManager;
import com.example.statistics.export.IOnetrack;
import com.fitness.banner.compare.CompareImpl;
import com.fitness.banner.export.BannerImpl;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.compare.BannerRequest;
import com.fitness.banner.export.compare.ICompare;
import com.fitness.banner.net.CityRequest;
import com.fitness.permission.manager.export.IPermissionManager;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.gson.Gson;
import com.mi.command.remote.ResearchCommandPb;
import com.mi.command.remote.ResearchCommandServer;
import com.mi.fitness.capability.CapabilityManagerImpl;
import com.mi.fitness.capability.export.CapabilityManager;
import com.mi.fitness.capability.export.model.CapabilityModel;
import com.mi.fitness.checkupdate.export.CheckUpdateManager;
import com.mi.fitness.checkupdate.net.CheckUpdateRequest;
import com.mi.fitness.checkupdate.util.CheckUpdateManagerImpl;
import com.mi.fitness.course.schecule.export.CourseScheduleHelper;
import com.mi.fitness.course.schedule.di.CourseScheduleSingleModule;
import com.mi.fitness.course.schedule.impl.CourseScheduleHelperImpl;
import com.mi.fitness.lpamanagement.di.LpaManagementHelperImpl;
import com.mi.fitness.lpamanagement.export.LpaManagementHelper;
import com.mi.fitness.netproxy.NetProxyModule;
import com.mi.health.appupgrade.di.AppUpgradeHelperImpl;
import com.mi.health.appupgrade.ui.AppUpgradeActivity;
import com.mi.health.course.activity.CourseAllCatalogActivity;
import com.mi.health.course.activity.CourseAudioActivity;
import com.mi.health.course.activity.CourseCatalogActivity;
import com.mi.health.course.activity.CourseFeedActivity;
import com.mi.health.course.activity.CourseInfoActivity;
import com.mi.health.course.activity.CourseMeActivity;
import com.mi.health.course.activity.CourseOpenVipFragment;
import com.mi.health.course.activity.CourseSearchActivity;
import com.mi.health.course.activity.CourseSeriseInfoActivity;
import com.mi.health.course.activity.CourseSmartHrActivity;
import com.mi.health.course.activity.CourseVideoActivity;
import com.mi.health.course.activity.CourseVipActivity;
import com.mi.health.course.activity.CourseVipTranslucentActivity;
import com.mi.health.course.activity.eco.EcoCourseAudioActivity;
import com.mi.health.course.activity.eco.EcoCourseAudioVM;
import com.mi.health.course.activity.eco.EcoCourseInfoActivity;
import com.mi.health.course.activity.eco.EcoCourseInfoVM;
import com.mi.health.course.activity.eco.EcoCourseSmartHrActivity;
import com.mi.health.course.activity.eco.EcoCourseSmartHrVM;
import com.mi.health.course.activity.eco.EcoCourseVideoActivity;
import com.mi.health.course.activity.eco.EcoCourseVideoVM;
import com.mi.health.course.activity.eco.EcoRoutingActivity;
import com.mi.health.course.activity.eco.EcoRoutingActivityViewModel;
import com.mi.health.course.api.CourseApiImpl;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.api.CourseVipActivityRequest;
import com.mi.health.course.api.CourseVipRequest;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseManager;
import com.mi.health.course.export.CourseManagerImpl;
import com.mi.health.course.vm.CourseAudioVM;
import com.mi.health.course.vm.CourseCatalogAllVM;
import com.mi.health.course.vm.CourseCatalogVM;
import com.mi.health.course.vm.CourseFeedVM;
import com.mi.health.course.vm.CourseHeartRateVM;
import com.mi.health.course.vm.CourseInfoVM;
import com.mi.health.course.vm.CourseMeVM;
import com.mi.health.course.vm.CourseSearchVM;
import com.mi.health.course.vm.CourseSeriesVM;
import com.mi.health.course.vm.CourseVideoVM;
import com.mi.health.course.vm.CourseVipVM;
import com.mi.health.course.widget.CourseInfoHeaderPreView;
import com.mi.health.course.widget.CourseInfoHeaderView;
import com.mi.health.di.DeviceSettingsPageImpl;
import com.mi.health.map.MapExport;
import com.mi.health.message.center.export.MessageCenterImpl;
import com.mi.health.message.center.net.MessageCenterRequest;
import com.mi.health.message.center.ui.MessageCenterActivity;
import com.mi.health.message.center.ui.RelativeCareMessageFragment;
import com.mi.health.message.center.viewModel.MessageCenterViewModel;
import com.mi.health.message.center.viewModel.RelativeCareViewModel;
import com.mi.health.permission.PermissionManger;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.device.utils.DeviceToolImpl;
import com.xiaomi.fit.fitness.FitnessServerSyncMgr;
import com.xiaomi.fit.fitness.device.hm.PaiGoalDataHelper;
import com.xiaomi.fit.fitness.eco.manager.EcoFitnessDataSyncManager;
import com.xiaomi.fit.fitness.eco.remote.EcoFitnessSyncRemoteImpl;
import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.HealthConnectApi;
import com.xiaomi.fit.fitness.export.api.ISummarySyncManager;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.api.ThirdPartyDataServerSyncer;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.step.IStepProviderSyncer;
import com.xiaomi.fit.fitness.impl.CurseApiImpl;
import com.xiaomi.fit.fitness.impl.FitnessDataGetterImpl;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fit.fitness.impl.HealthConnectApiImpl;
import com.xiaomi.fit.fitness.impl.SportSummaryApiImpl;
import com.xiaomi.fit.fitness.manager.FitnessDataSyncManager;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.server.SportSummaryRequest;
import com.xiaomi.fit.fitness.persist.server.ThirdPartyDataSyncImpl;
import com.xiaomi.fit.fitness.remote.FitnessDataRemoteImpl;
import com.xiaomi.fit.fitness.remote.FitnessSyncRemoteImpl;
import com.xiaomi.fit.fitness.sync.export.api.FitnessExternalSyncer;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.api.PaiDataInterface;
import com.xiaomi.fitness.about.AboutActivity;
import com.xiaomi.fitness.about.AboutManagerImpl;
import com.xiaomi.fitness.about.AboutModel;
import com.xiaomi.fitness.about.AboutViewModel;
import com.xiaomi.fitness.about.DeviceDualAuthorizationModel;
import com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.about.request.AboutRequest;
import com.xiaomi.fitness.about.setting.DeviceDualAuthorizationActivity;
import com.xiaomi.fitness.about.setting.SettingActivity;
import com.xiaomi.fitness.about.setting.SportHealthServiceActivity;
import com.xiaomi.fitness.access.AccessActivity;
import com.xiaomi.fitness.access.AccessManagerImpl;
import com.xiaomi.fitness.access.AccessModel;
import com.xiaomi.fitness.access.AccessViewModel;
import com.xiaomi.fitness.access.AlipayActivity;
import com.xiaomi.fitness.access.BaseThirdPartyAccessActivity;
import com.xiaomi.fitness.access.GoogleFitAccessActivity;
import com.xiaomi.fitness.access.StravaAccessActivity;
import com.xiaomi.fitness.access.SuuntoAccessActivity;
import com.xiaomi.fitness.access.WechatActivity;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.health_connect.HealthConnectPrivacyActivity;
import com.xiaomi.fitness.access.misport.MiSportImportActivity;
import com.xiaomi.fitness.access.misport.MiSportViewModel;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.access.wechatsportimport.WechatDeviceActivity;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerActivity;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel;
import com.xiaomi.fitness.access.wechatsportimport.manager.DeleteDeviceFromWechatActivity;
import com.xiaomi.fitness.account.AccountManagerRemoteImpl;
import com.xiaomi.fitness.account.ParameterInterceptor;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.manager.AccountManagerImpl;
import com.xiaomi.fitness.account.manager.MiAccountInternalManager;
import com.xiaomi.fitness.account.token.CookieFetcher;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.account.token.TokenManagerImpl;
import com.xiaomi.fitness.account.token.VerifyToken;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.ActivePkRepository;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.active.pk.export.PkExportImpl;
import com.xiaomi.fitness.active.pk.net.ActivePkRequest;
import com.xiaomi.fitness.active.pk.ui.InviteReceiveActivity;
import com.xiaomi.fitness.active.pk.ui.PkHistoryDetailActivity;
import com.xiaomi.fitness.active.pk.ui.PkListActivity;
import com.xiaomi.fitness.active.pk.ui.PkProcessDetailActivity;
import com.xiaomi.fitness.active.pk.ui.SendingInvitationActivity;
import com.xiaomi.fitness.aggregation.di.SummaryModule;
import com.xiaomi.fitness.aivs.di.AivsHelperImpl;
import com.xiaomi.fitness.aivs.impl.CourseScheduleManagerRemoteImpl;
import com.xiaomi.fitness.aivs.request.AivsRequest;
import com.xiaomi.fitness.app.CloudInterceptor;
import com.xiaomi.fitness.app.UAInterceptor;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.base.StubActivity;
import com.xiaomi.fitness.camera.sport_capture_export.ISportCaptureManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.repository.Repository;
import com.xiaomi.fitness.configwifi.ConfigWifiActivity;
import com.xiaomi.fitness.device.contact.DeviceContactImpl;
import com.xiaomi.fitness.device.contact.SyncObservers;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncer;
import com.xiaomi.fitness.device.contact.remote.DeviceContactEngineImpl;
import com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceManagerImpl;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.ProductManager;
import com.xiaomi.fitness.device.manager.ProductManagerImpl;
import com.xiaomi.fitness.device.manager.TempManagerImpl;
import com.xiaomi.fitness.device.manager.WearableDeviceManagerImpl;
import com.xiaomi.fitness.device.manager.WearableProductManagerImpl;
import com.xiaomi.fitness.device.manager.api.DeviceRequest;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.di.ContentItemModule;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider;
import com.xiaomi.fitness.device.manager.export.DeviceTabManager;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.device.manager.export.TempManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.internal.DeviceManagerService;
import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.manager.remote.ProductManagerRemoteImpl;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceModel;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceViewModel;
import com.xiaomi.fitness.device.manager.ui.bind.BindBleDeviceDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindHeadphoneDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindHuaMiDeviceDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindHuamiViewModel;
import com.xiaomi.fitness.device.manager.ui.bind.BindLocalViewModel;
import com.xiaomi.fitness.device.manager.ui.bind.BindThirdPartyDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.bind.BindThirdPartyDeviceViewModel;
import com.xiaomi.fitness.device.manager.ui.bind.BindViewModel;
import com.xiaomi.fitness.device.manager.ui.guide.GuideOpenKeepAliveSettingFragment;
import com.xiaomi.fitness.device.manager.ui.guide.GuideOpenKeepAliveSettingViewModel;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerActivity;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;
import com.xiaomi.fitness.device.manager.ui.scan.ScanManager;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListFragment;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListViewModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabFragmentV4;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabManagerImpl;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentFragmentV4;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentViewModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel;
import com.xiaomi.fitness.device.manager.utils.BluetoothPermissionUtilImpl;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import com.xiaomi.fitness.devicesettings.DeviceSettingHelperImpl;
import com.xiaomi.fitness.devicesettings.SettingsPageUtilImpl;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPBehaviorDebugFragment;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPDebugFragment;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugFragment;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel;
import com.xiaomi.fitness.devicesettings.base.sedenraty.Sedentary2ViewModel;
import com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryFragment;
import com.xiaomi.fitness.devicesettings.base.sedenraty.SedentaryModel;
import com.xiaomi.fitness.devicesettings.base.stand.StandDetectSettingFragment;
import com.xiaomi.fitness.devicesettings.base.stand.StandDetectViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.WatchAppLayoutSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactSyncHelperImpl;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionModel;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHeartRateModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.BlePressureSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.BlePressureSettingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.view.BleSleepSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.viewmodel.BleSleepSettingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2Model;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelHelperImpl;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelModel;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.WearModeHelperImpl;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupEditFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManagerFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerFragmentV2;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerV2ViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetMangerViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSportListFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetTemplateFragment;
import com.xiaomi.fitness.devicesettings.common.findPhone.FindPhoneHelperImpl;
import com.xiaomi.fitness.devicesettings.common.hotspot.HotspotFragment;
import com.xiaomi.fitness.devicesettings.common.language.LanguageSettingFragment;
import com.xiaomi.fitness.devicesettings.common.phonemute.PhoneMuteHelperImpl;
import com.xiaomi.fitness.devicesettings.di.DeviceSettingsPageInterface;
import com.xiaomi.fitness.devicesettings.di.DeviceSettingsSyncHelperImpl;
import com.xiaomi.fitness.devicesettings.di.HealthMonitorManagerImpl;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingHelper;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelper;
import com.xiaomi.fitness.devicesettings.export.HealthMonitorManager;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SleepModelHelper;
import com.xiaomi.fitness.devicesettings.export.emergency.EmergencyContactSyncHelper;
import com.xiaomi.fitness.devicesettings.export.phonemute.PhoneMuteHelper;
import com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManager;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper;
import com.xiaomi.fitness.devicesettings.guide.GuideNotificationSelectAppFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideNotificationViewModel;
import com.xiaomi.fitness.devicesettings.guide.GuideOpenNotificationRemindFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideOpenPhoneCallFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideSyncSystemSettingFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideWearInstructionFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideWearInstructionViewModel;
import com.xiaomi.fitness.devicesettings.guide.GuideWebViewFragment;
import com.xiaomi.fitness.devicesettings.guide.GuideWebViewViewModel;
import com.xiaomi.fitness.devicesettings.guide.OpenPolicyAccessActivity;
import com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindFragment;
import com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.DefaultHuamiHealthModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.HuamiPressureSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.HuamiPressureSettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.PressureModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.HuamiSleepSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.HuamiSleepSettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.SleepModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.Spo2Model;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.AddCustomVibrateModeFragment;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.fitness.devicesettings.thirdparty.MiAicrManagerImp;
import com.xiaomi.fitness.di.MiuiFunctionModule;
import com.xiaomi.fitness.eco.device.contact.EcoDeviceContactImpl;
import com.xiaomi.fitness.eco.device.contact.EcoSyncObservers;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineImpl;
import com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal;
import com.xiaomi.fitness.eco.device.manager.EcoBindDeviceManagerImpl;
import com.xiaomi.fitness.eco.device.manager.EcoDeviceConfigManagerImpl;
import com.xiaomi.fitness.eco.device.manager.EcoDeviceManagerImpl;
import com.xiaomi.fitness.eco.device.manager.EcoProductManagerImpl;
import com.xiaomi.fitness.eco.device.manager.OtherDeviceLoaderManagerImpl;
import com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest;
import com.xiaomi.fitness.eco.device.manager.export.EcoBindDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.OtherDeviceLoaderManager;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.manager.remote.EcoProductManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoDeviceDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListActivity;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabModel;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerInternal;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import com.xiaomi.fitness.electronic.scale.AboutDeviceActivity;
import com.xiaomi.fitness.electronic.scale.AboutDeviceViewModel;
import com.xiaomi.fitness.electronic.scale.AddShareActivity;
import com.xiaomi.fitness.electronic.scale.BabyWeightActivity;
import com.xiaomi.fitness.electronic.scale.BalanceWeightActivity;
import com.xiaomi.fitness.electronic.scale.ClaimRecordsActivity;
import com.xiaomi.fitness.electronic.scale.ClaimRecordsViewModel;
import com.xiaomi.fitness.electronic.scale.DataReportActivity;
import com.xiaomi.fitness.electronic.scale.DataReportModel;
import com.xiaomi.fitness.electronic.scale.DataReportViewModel;
import com.xiaomi.fitness.electronic.scale.DeviceShareActivity;
import com.xiaomi.fitness.electronic.scale.PairGuideActivity;
import com.xiaomi.fitness.electronic.scale.ShareConfirmActivity;
import com.xiaomi.fitness.electronic.scale.ShareMemberActivity;
import com.xiaomi.fitness.electronic.scale.UserAddActivity;
import com.xiaomi.fitness.electronic.scale.UserIndicatorsActivity;
import com.xiaomi.fitness.electronic.scale.UserManageActivity;
import com.xiaomi.fitness.electronic.scale.UserinfoSelectViewModel;
import com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity;
import com.xiaomi.fitness.electronic.scale.VirtualMemberDayFragment;
import com.xiaomi.fitness.electronic.scale.VirtualMemberStatisticsFragment;
import com.xiaomi.fitness.electronic.scale.VisitorWeightActivity;
import com.xiaomi.fitness.electronic.scale.WeightActivity;
import com.xiaomi.fitness.electronic.scale.WeightGuideActivity;
import com.xiaomi.fitness.electronic.scale.WifiInfoActivity;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelper;
import com.xiaomi.fitness.electronic.scale.model.UserDataViewModel;
import com.xiaomi.fitness.electronic.scale.model.UserManageViewModel;
import com.xiaomi.fitness.electronic.scale.model.VirtualMemberDayViewModel;
import com.xiaomi.fitness.electronic.scale.request.OTARequest;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleActivityFinisherHelperImpl;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleCmdHelperImpl;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleManagerImpl;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleRequestImpl;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleShareHelperImpl;
import com.xiaomi.fitness.electronic.scale.widget.dialog.EcoDialogHelperImpl;
import com.xiaomi.fitness.exception.ExceptionHelperImpl;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import com.xiaomi.fitness.feedback.UploadFileImpl;
import com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity;
import com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel;
import com.xiaomi.fitness.feedback.bugreport.FeedbackViewModel;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.WearosBugreportInter;
import com.xiaomi.fitness.feedback.history.HistoryActivity;
import com.xiaomi.fitness.feedback.history.HistoryDetailActivity;
import com.xiaomi.fitness.feedback.history.HistoryDetailModel;
import com.xiaomi.fitness.feedback.history.HistoryDetailViewModel;
import com.xiaomi.fitness.feedback.history.HistoryModel;
import com.xiaomi.fitness.feedback.history.HistoryViewModel;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.ui.FeedbackModel;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionModel;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionViewModel;
import com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil;
import com.xiaomi.fitness.habit.export.HabitManagerImpl;
import com.xiaomi.fitness.habit.model.HabitModel;
import com.xiaomi.fitness.habit.request.HabitRequest;
import com.xiaomi.fitness.habit.ui.AddHabitActivity;
import com.xiaomi.fitness.habit.ui.AddHabitViewModel;
import com.xiaomi.fitness.habit.ui.HabitListActivity;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import com.xiaomi.fitness.habit.ui.HabitShareViewModel;
import com.xiaomi.fitness.habit.ui.HabitTodayActivity;
import com.xiaomi.fitness.habit.ui.HabitTodayViewModel;
import com.xiaomi.fitness.habit.ui.HabitViewModel;
import com.xiaomi.fitness.habit.ui.MyHabitListActivity;
import com.xiaomi.fitness.habit.ui.MyHabitListViewModel;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseAGPLand;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAddValueFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseAllDayItemFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseExpandableExtremeHighRecordsFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseExpandableExtremeLowRecordsFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseExpandableManualRecordsFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerDayItemFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerMonthItemFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFingerWeekItemFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseMonthItemFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseRecordDetailFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseWeekItemFragment;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindBiz;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureAddFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureAllRecordsFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureDayItemFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureMonthItemFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureRecordDetailFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureWeekItemFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.MeasureRemindPreferenceFragment;
import com.xiaomi.fitness.health.calorie.CalorieDayItemFragment;
import com.xiaomi.fitness.health.calorie.CalorieMonthItemFragment;
import com.xiaomi.fitness.health.calorie.CalorieWeekItemFragment;
import com.xiaomi.fitness.health.curse.CurseBarChartFragment;
import com.xiaomi.fitness.health.curse.CurseEditActivity;
import com.xiaomi.fitness.health.curse.CurseHistoryActivity;
import com.xiaomi.fitness.health.curse.CurseInfoActivity;
import com.xiaomi.fitness.health.curse.CurseListFragment;
import com.xiaomi.fitness.health.curse.CurseMainActivity;
import com.xiaomi.fitness.health.curse.CurseMonthFragment;
import com.xiaomi.fitness.health.curse.CurseResetActivity;
import com.xiaomi.fitness.health.curse.CurseSetActivity;
import com.xiaomi.fitness.health.curse.vm.CurseEditVM;
import com.xiaomi.fitness.health.curse.vm.CurseInfoVM;
import com.xiaomi.fitness.health.curse.vm.CurseLatestVM;
import com.xiaomi.fitness.health.curse.vm.CurseListVM;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.health.curse.vm.CurseMonthVM;
import com.xiaomi.fitness.health.curse.vm.CurseResetVM;
import com.xiaomi.fitness.health.curse.vm.CurseSetVM;
import com.xiaomi.fitness.health.curse.vm.CurseSymVM;
import com.xiaomi.fitness.health.ecg.EcgAccountAuthLoginFragment;
import com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository;
import com.xiaomi.fitness.health.ecg.EcgAnalyzeServiceAuthFragment;
import com.xiaomi.fitness.health.ecg.EcgCheckingQualityFragment;
import com.xiaomi.fitness.health.ecg.EcgFragment;
import com.xiaomi.fitness.health.ecg.EcgItemDetailActivity;
import com.xiaomi.fitness.health.ecg.EcgSubmitAnalyzeResultFragment;
import com.xiaomi.fitness.health.ecg.EcgViewModel;
import com.xiaomi.fitness.health.ecg.N60EcgAllRecordsFragment;
import com.xiaomi.fitness.health.ecg.SelectEcgForAnalyzingFragment;
import com.xiaomi.fitness.health.ecg.net.EcgRequest;
import com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity;
import com.xiaomi.fitness.health.energy.EnergyDayItemFragment;
import com.xiaomi.fitness.health.energy.EnergyMonthItemFragment;
import com.xiaomi.fitness.health.energy.EnergyViewModel;
import com.xiaomi.fitness.health.energy.EnergyWeekItemFragment;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.hearing.HearingDayItemFragment;
import com.xiaomi.fitness.health.hearing.HearingEnvironmentalNoiseFragment;
import com.xiaomi.fitness.health.hearing.HearingEnvironmentalNoiseViewModel;
import com.xiaomi.fitness.health.hearing.HearingMonthItemFragment;
import com.xiaomi.fitness.health.hearing.HearingWeekItemFragment;
import com.xiaomi.fitness.health.hrm.HrAndPaceExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrAndPaceSegmentReportDetailFragment;
import com.xiaomi.fitness.health.hrm.HrmAbnormalChartFragment;
import com.xiaomi.fitness.health.hrm.HrmAddFragment;
import com.xiaomi.fitness.health.hrm.HrmAllRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrmDayItemFragment;
import com.xiaomi.fitness.health.hrm.HrmExpandableExtremeHighRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrmExpandableExtremeLowRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrmExpandableFibRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrmExpandableManualRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrmMonthItemFragment;
import com.xiaomi.fitness.health.hrm.HrmRecordDetailFragment;
import com.xiaomi.fitness.health.hrm.HrmViewModel;
import com.xiaomi.fitness.health.hrm.HrmWeekItemFragment;
import com.xiaomi.fitness.health.hrm.deprecated.HrmAbnormalHighRecordsFragment;
import com.xiaomi.fitness.health.hrm.deprecated.HrmAbnormalLowRecordsFragment;
import com.xiaomi.fitness.health.hrm.deprecated.HrmFibAbnormalRecordsFragment;
import com.xiaomi.fitness.health.hrm.deprecated.HrmManuallyMeasuredRecordsFragment;
import com.xiaomi.fitness.health.mhintensity.MHStrengthDayItemFragment;
import com.xiaomi.fitness.health.mhintensity.MHStrengthMonthItemFragment;
import com.xiaomi.fitness.health.mhintensity.MHStrengthWeekItemFragment;
import com.xiaomi.fitness.health.pai.PaiDayFragment;
import com.xiaomi.fitness.health.pai.PaiRateChartFragment;
import com.xiaomi.fitness.health.pai.PaiViewModel;
import com.xiaomi.fitness.health.physicalstatus.PhysicalStatusDayFragment;
import com.xiaomi.fitness.health.physicalstatus.PhysicalStatusViewModel;
import com.xiaomi.fitness.health.pingan.PinganHealthCareWebViewActivity;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorViewModel;
import com.xiaomi.fitness.health.sleep.GoToBedTimeCalibrateFragment;
import com.xiaomi.fitness.health.sleep.deprecated.SleepAllRecordsFragment;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetFragment;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonthItemViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.calendar.SleepRhythmCalendarItemFragment;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryMedicationUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmAllFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmSleepChatAllFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmUpToRemoteFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmUpToRemoteSucFragment;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmCalendarActivity;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorSettingFragment;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmRecordListFragment;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmRemindSettingFragment;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmSupportDevicesFragment;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmSupportDevicesViewModel;
import com.xiaomi.fitness.health.sleep.ui.SleepAddRecordFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalAllRecordsFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalDetectingActivity;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalReportActivity;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.health.sleep.ui.SleepDayItemFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepLandScapeActivity;
import com.xiaomi.fitness.health.sleep.ui.SleepMonthItemFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepQualityDetailFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepSegmentReportDetailFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepWeekItemFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepPermissionSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingModel;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSnoreDetectionSettingActivity;
import com.xiaomi.fitness.health.sleep.view.SleepShareViewModel;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.health.spo2.Spo2AbnormalChartFragment;
import com.xiaomi.fitness.health.spo2.Spo2DayItemFragment;
import com.xiaomi.fitness.health.spo2.Spo2ExpandableExtremeLowRecordsFragment;
import com.xiaomi.fitness.health.spo2.Spo2ExpandableManualRecordsFragment;
import com.xiaomi.fitness.health.spo2.Spo2MonthItemFragment;
import com.xiaomi.fitness.health.spo2.Spo2RecordDetailFragment;
import com.xiaomi.fitness.health.spo2.Spo2ViewModel;
import com.xiaomi.fitness.health.spo2.Spo2WeekItemFragment;
import com.xiaomi.fitness.health.spo2.deprecated.Spo2ExtremeLowRecordsFragment;
import com.xiaomi.fitness.health.spo2.deprecated.Spo2ManuallyMeasuredRecordsFragment;
import com.xiaomi.fitness.health.stand.StandDayItemFragment;
import com.xiaomi.fitness.health.stand.StandMonthItemFragment;
import com.xiaomi.fitness.health.stand.StandViewModel;
import com.xiaomi.fitness.health.stand.StandWeekItemFragment;
import com.xiaomi.fitness.health.step.RecognizeSettingActivity;
import com.xiaomi.fitness.health.step.StepDayItemFragment;
import com.xiaomi.fitness.health.step.StepMonthItemFragment;
import com.xiaomi.fitness.health.step.StepWeekItemFragment;
import com.xiaomi.fitness.health.stress.StressDayItemFragment;
import com.xiaomi.fitness.health.stress.StressExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.stress.StressMonthItemFragment;
import com.xiaomi.fitness.health.stress.StressRecordDetailFragment;
import com.xiaomi.fitness.health.stress.StressViewModel;
import com.xiaomi.fitness.health.stress.StressWeekItemFragment;
import com.xiaomi.fitness.health.stress.deprecated.StressAllRecordsFragment;
import com.xiaomi.fitness.health.temperature.TemperatureViewModel;
import com.xiaomi.fitness.health.temperature.ui.TemperatureAddFragment;
import com.xiaomi.fitness.health.temperature.ui.TemperatureAllRecordsFragment;
import com.xiaomi.fitness.health.temperature.ui.TemperatureDayItemFragment;
import com.xiaomi.fitness.health.temperature.ui.TemperatureExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.temperature.ui.TemperatureMonthItemFragment;
import com.xiaomi.fitness.health.temperature.ui.TemperatureRecordDetailFragment;
import com.xiaomi.fitness.health.temperature.ui.TemperatureWeekItemFragment;
import com.xiaomi.fitness.health.threetarget.ShareSportTargetActivity;
import com.xiaomi.fitness.health.threetarget.TargetChartFragment;
import com.xiaomi.fitness.health.threetarget.ThreeTargetViewModel;
import com.xiaomi.fitness.health.threetarget.ThreeTargetWeekFragment;
import com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.HealthCheckExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.todayhealth.ui.TodayHealthDayFragment;
import com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckMeasureReminderSettingFragment;
import com.xiaomi.fitness.health.trainload.TrainingLoadViewModel;
import com.xiaomi.fitness.health.vitality.VitalityDayFragment;
import com.xiaomi.fitness.health.vitality.VitalityViewModel;
import com.xiaomi.fitness.health.vo2max.VO2MaxMonthItemFragment;
import com.xiaomi.fitness.health.vo2max.VO2MaxWeekItemFragment;
import com.xiaomi.fitness.health.weight.WeightViewModel;
import com.xiaomi.fitness.health.weight.ui.WeightAddFragment;
import com.xiaomi.fitness.health.weight.ui.WeightAllRecordsFragment;
import com.xiaomi.fitness.health.weight.ui.WeightDayItemFragment;
import com.xiaomi.fitness.health.weight.ui.WeightExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.weight.ui.WeightRecordDetailFragment;
import com.xiaomi.fitness.heartrate.HeartrateMeasurerImpl;
import com.xiaomi.fitness.heartrate.export.HeartrateMeasurer;
import com.xiaomi.fitness.heartrate.finger.FingerprintDetectManager;
import com.xiaomi.fitness.heartrate.ui.CameraDetectActivity;
import com.xiaomi.fitness.heartrate.ui.FingerDetectActivity;
import com.xiaomi.fitness.heartrate.ui.HeartRateDetectViewModel;
import com.xiaomi.fitness.heartrate.ui.HeartRateReportActivity;
import com.xiaomi.fitness.heartrate.ui.ReportViewModel;
import com.xiaomi.fitness.homepage.HealthModel;
import com.xiaomi.fitness.homepage.HealthModule;
import com.xiaomi.fitness.homepage.HealthV2Fragment;
import com.xiaomi.fitness.homepage.HealthViewModel;
import com.xiaomi.fitness.homepage.ShareCaloConsumActivity;
import com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel;
import com.xiaomi.fitness.homepage.viewmodule.RelativeHealthViewModel;
import com.xiaomi.fitness.login.CheckerUserProfileImpl;
import com.xiaomi.fitness.login.LoginModel;
import com.xiaomi.fitness.login.LoginViewModel;
import com.xiaomi.fitness.login.SplashViewModel;
import com.xiaomi.fitness.login.export.AccountCookieManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.mode.GuidePersonalizeActivity;
import com.xiaomi.fitness.login.privacy.PrivacyActivity;
import com.xiaomi.fitness.login.privacy.PrivacyViewModel;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.login.region.RegionSelectActivity;
import com.xiaomi.fitness.login.region.RegionSelectListActivity;
import com.xiaomi.fitness.login.region.RegionSelectListViewModel;
import com.xiaomi.fitness.login.region.RegionSelectModel;
import com.xiaomi.fitness.login.region.RegionViewModel;
import com.xiaomi.fitness.login.request.RegionByIpRequest;
import com.xiaomi.fitness.login.request.RegionRequest;
import com.xiaomi.fitness.login.request.RegionUrlSwitcherImpl;
import com.xiaomi.fitness.login.request.SetUserDataRequest;
import com.xiaomi.fitness.login.token.AccountServiceCookieImpl;
import com.xiaomi.fitness.login.token.TokenManagerDelegate;
import com.xiaomi.fitness.login.token.TokenManagerRemoteImpl;
import com.xiaomi.fitness.login.welcome.WelcomeActivity;
import com.xiaomi.fitness.main.BaseMainFragmentDelegateImpl;
import com.xiaomi.fitness.main.MainActivity;
import com.xiaomi.fitness.main.MainModel;
import com.xiaomi.fitness.main.MainViewModel;
import com.xiaomi.fitness.main.di.MainHelperImpl;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.map.export.IMapExportService;
import com.xiaomi.fitness.medal.MedalHelper;
import com.xiaomi.fitness.medal.MedalManagerImpl;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailViewModel;
import com.xiaomi.fitness.medal.medallist.CityMedalListActivity;
import com.xiaomi.fitness.medal.medallist.MedalListActivity;
import com.xiaomi.fitness.medal.medallist.MedalModel;
import com.xiaomi.fitness.medal.medallist.MedalViewModel;
import com.xiaomi.fitness.medal.repository.PopMedalListRepo;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.MedalV2Request;
import com.xiaomi.fitness.medal.share.MedalShareActivity;
import com.xiaomi.fitness.medal.share.MedalShareViewModel;
import com.xiaomi.fitness.media.di.MediaHelperImpl;
import com.xiaomi.fitness.media.export.MediaHelper;
import com.xiaomi.fitness.membership.api.MembershipRequest;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.impl.MembershipHelperImpl;
import com.xiaomi.fitness.milink.export.MilinkManager;
import com.xiaomi.fitness.milink.export.MilinkManagerImpl;
import com.xiaomi.fitness.mine.MineActivity;
import com.xiaomi.fitness.mine.MineFragment;
import com.xiaomi.fitness.mine.MineModel;
import com.xiaomi.fitness.mine.MineSettingManagerImpl;
import com.xiaomi.fitness.mine.MineViewModel;
import com.xiaomi.fitness.mine.company.CompanyUserRepository;
import com.xiaomi.fitness.mine.company.CompanyUserRequest;
import com.xiaomi.fitness.mine.company.CompanyUserWebViewActivity;
import com.xiaomi.fitness.mine.data.DataModule;
import com.xiaomi.fitness.mine.export.MineSettingManager;
import com.xiaomi.fitness.mine.personal.data.management.AppSpecificDataManagementActivity;
import com.xiaomi.fitness.mine.personal.data.management.AuthConfigListActivity;
import com.xiaomi.fitness.mine.personal.data.management.DataManagementViewModel;
import com.xiaomi.fitness.mine.personal.data.management.LabCollaborationManagementActivity;
import com.xiaomi.fitness.mine.personal.data.management.ThirdPartyAuthActivity;
import com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRepository;
import com.xiaomi.fitness.mine.personal.data.management.data.DataManagementRequest;
import com.xiaomi.fitness.mine.v4.MineFragmentV4;
import com.xiaomi.fitness.mine.v4.MineV4ViewModel;
import com.xiaomi.fitness.mine.weeklyreport.WeekReportRequest;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.MotionRecognizerImpl;
import com.xiaomi.fitness.motion.recognition.MotionRecognizerInternal;
import com.xiaomi.fitness.net.HttpConfig;
import com.xiaomi.fitness.net.HttpRepository;
import com.xiaomi.fitness.net.di.HttpClientModule;
import com.xiaomi.fitness.net.interceptor.HttpBeforeHandler;
import com.xiaomi.fitness.net.interceptor.HttpHandlerInterceptor;
import com.xiaomi.fitness.net.url.ApiHolder;
import com.xiaomi.fitness.net.url.URLs;
import com.xiaomi.fitness.nfc.common.CommonBaseActivity;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerImpl;
import com.xiaomi.fitness.nfc.ui.AddCardNumberViewModel;
import com.xiaomi.fitness.nfc.ui.AddDoorViewModel;
import com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel;
import com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel;
import com.xiaomi.fitness.nfc.ui.CardListViewModel;
import com.xiaomi.fitness.nfc.ui.CardManagerViewModel;
import com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel;
import com.xiaomi.fitness.nfc.ui.CardPrepareViewModel;
import com.xiaomi.fitness.nfc.ui.CloudDoorViewModel;
import com.xiaomi.fitness.nfc.ui.CopyCardViewModel;
import com.xiaomi.fitness.nfc.ui.CouponViewModel;
import com.xiaomi.fitness.nfc.ui.Cvn2ViewModel;
import com.xiaomi.fitness.nfc.ui.IssueDoor3CardViewModel;
import com.xiaomi.fitness.nfc.ui.IssueRechargeViewModel;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.fitness.nfc.ui.IssuerListViewModel;
import com.xiaomi.fitness.nfc.ui.IssuerViewModel;
import com.xiaomi.fitness.nfc.ui.NewPayViewModel;
import com.xiaomi.fitness.nfc.ui.NfcSettingViewModel;
import com.xiaomi.fitness.nfc.ui.RechargeViewModel;
import com.xiaomi.fitness.nfc.ui.SyncEseViewModel;
import com.xiaomi.fitness.nfc.ui.TransferInViewModel;
import com.xiaomi.fitness.nfc.ui.TransferOutViewModel;
import com.xiaomi.fitness.nfc.ui.TransitViewModel;
import com.xiaomi.fitness.nfc.ui.TsmResultViewModel;
import com.xiaomi.fitness.nfc.ui.VerifyViewModel;
import com.xiaomi.fitness.nfc.ui.issued.ActiviteCardViewModel;
import com.xiaomi.fitness.nfc.ui.issued.BankCardDetailViewModel;
import com.xiaomi.fitness.nfc.ui.issued.CarCardViewModel;
import com.xiaomi.fitness.nfc.ui.issued.CardRenameViewModel;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel;
import com.xiaomi.fitness.nfc.ui.issued.DoorCardViewModel;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListViewModel;
import com.xiaomi.fitness.nfc.ui.issued.MasterTranslationViewModel;
import com.xiaomi.fitness.nfc.ui.issued.ReissueMasterCardViewModel;
import com.xiaomi.fitness.nfc.ui.issued.SZTReturnCardViewModel;
import com.xiaomi.fitness.nfc.ui.issued.SelectActiveWayViewModel;
import com.xiaomi.fitness.nfc.ui.issued.TransitionCardRecordViewModel;
import com.xiaomi.fitness.nfc.ui.issued.YoYoCardViewModel;
import com.xiaomi.fitness.notify.NotifyFragment;
import com.xiaomi.fitness.notify.NotifyStartImpl;
import com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment;
import com.xiaomi.fitness.notify.callnotify.CallNotifyModel;
import com.xiaomi.fitness.notify.callnotify.CallNotifyViewModel;
import com.xiaomi.fitness.notify.callnotify.smsreply.BleSmsReplyFragment;
import com.xiaomi.fitness.notify.callnotify.smsreply.BleSmsReplyViewModel;
import com.xiaomi.fitness.notify.callnotify.smsreply.HuamiSmsReplyFragment;
import com.xiaomi.fitness.notify.callnotify.smsreply.HuamiSmsReplyViewModel;
import com.xiaomi.fitness.notify.di.NotifyStartInterface;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.focus.NotificationFocusInterface;
import com.xiaomi.fitness.notify.focus.NotificationFocusManager;
import com.xiaomi.fitness.notify.notification.NotificationManagerExport;
import com.xiaomi.fitness.notify.notification.NotificationManagerImpl;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import com.xiaomi.fitness.pay.PaymentManagerImpl;
import com.xiaomi.fitness.pay.api.PaymentApiRequest;
import com.xiaomi.fitness.pay.channel.PayChannelActivity;
import com.xiaomi.fitness.pay.channel.PayChannelModel;
import com.xiaomi.fitness.pay.channel.PayChannelViewModel;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.order.PaymentOrderCourseVipListFragment;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListActivity;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListModel;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListViewModel;
import com.xiaomi.fitness.pay.order.PaymentOrderWatchFaceListFragment;
import com.xiaomi.fitness.pay.result.PayResultActivity;
import com.xiaomi.fitness.pay.result.PayResultModel;
import com.xiaomi.fitness.pay.result.PayResultViewModel;
import com.xiaomi.fitness.privacy.PrivacyHelperImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.push.export.PushManager;
import com.xiaomi.fitness.push.export.PushManagerImpl;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.bloodpressure.BloodPressureDayItemRFragment;
import com.xiaomi.fitness.relative.bloodpressure.BloodPressureWeekItemRFragment;
import com.xiaomi.fitness.relative.calorie.CalorieDayItemRFragment;
import com.xiaomi.fitness.relative.calorie.CalorieWeekItemRFragment;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessImpl;
import com.xiaomi.fitness.relative.home.RelativeHealthFragment;
import com.xiaomi.fitness.relative.home.RelativeViewModel;
import com.xiaomi.fitness.relative.hrm.HrmDayItemRFragment;
import com.xiaomi.fitness.relative.hrm.HrmRViewModel;
import com.xiaomi.fitness.relative.hrm.HrmWeekItemRFragment;
import com.xiaomi.fitness.relative.mhintensity.MHStrengthDayItemRFragment;
import com.xiaomi.fitness.relative.mhintensity.MHStrengthWeekItemRFragment;
import com.xiaomi.fitness.relative.sleep.SleepDayItemRFragment;
import com.xiaomi.fitness.relative.sleep.SleepWeekItemRFragment;
import com.xiaomi.fitness.relative.spo2.Spo2DayItemRFragment;
import com.xiaomi.fitness.relative.spo2.Spo2WeekItemRFragment;
import com.xiaomi.fitness.relative.stand.StandDayItemRFragment;
import com.xiaomi.fitness.relative.stand.StandWeekItemRFragment;
import com.xiaomi.fitness.relative.step.StepDayItemRFragment;
import com.xiaomi.fitness.relative.step.StepWeekItemRFragment;
import com.xiaomi.fitness.relative.threetarget.TargetChartRFragment;
import com.xiaomi.fitness.relative.threetarget.ThreeTargetRViewModel;
import com.xiaomi.fitness.relative.ui.ConfirmUserInfoActivity;
import com.xiaomi.fitness.relative.ui.DataAccessibleToTAActivity;
import com.xiaomi.fitness.relative.ui.DataRequestedByTAActivity;
import com.xiaomi.fitness.relative.ui.DataSharedByTAActivity;
import com.xiaomi.fitness.relative.ui.DataSharedToTAActivity;
import com.xiaomi.fitness.relative.ui.EditIdentityLabelActivity;
import com.xiaomi.fitness.relative.ui.InputXiaomiAccountActivity;
import com.xiaomi.fitness.relative.ui.MyQRCodeActivity;
import com.xiaomi.fitness.relative.ui.NoDataSharedActivity;
import com.xiaomi.fitness.relative.ui.RelativeCareHomePageActivity;
import com.xiaomi.fitness.relative.ui.RelativeDataSettingsActivity;
import com.xiaomi.fitness.relative.ui.TimeScopeAccessibleToTAActivity;
import com.xiaomi.fitness.relative.weight.WeightDayItemRFragment;
import com.xiaomi.fitness.repo.RepositoryProviderImpl;
import com.xiaomi.fitness.repo.curse.CurseAggregation;
import com.xiaomi.fitness.repo.curse.CurseRepo;
import com.xiaomi.fitness.repo.summary.SportSummaryRepo;
import com.xiaomi.fitness.res.preload.ResPreloadManagerImpl;
import com.xiaomi.fitness.res.preload.export.ResPreloadManager;
import com.xiaomi.fitness.res.preload.export.ResRegistryModel;
import com.xiaomi.fitness.research.ResearchSupporterImpl;
import com.xiaomi.fitness.research.device.DeviceInfoFetcherImpl;
import com.xiaomi.fitness.research.device.ProductInfoFetcherImpl;
import com.xiaomi.fitness.research.export.ResearchSupporter;
import com.xiaomi.fitness.research.sync.remote.ResearchRemoteServer;
import com.xiaomi.fitness.rn.RNDeviceManagerImpl;
import com.xiaomi.fitness.rn.export.DeviceShareManager;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RnSettingsExportApi;
import com.xiaomi.fitness.rn.settings.RnSettingsExportApiImpl;
import com.xiaomi.fitness.rn.share.di.DeviceShareManagerImpl;
import com.xiaomi.fitness.rn.share.viewmodel.AcceptListViewModel;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceListViewModel;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceShareDetailViewModel;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceShareViewModel;
import com.xiaomi.fitness.rn.share.viewmodel.InputUserIdViewModel;
import com.xiaomi.fitness.rn.share.viewmodel.ReceiveUserInfoViewModel;
import com.xiaomi.fitness.route.export.api.TrackApi;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.track.TrackImpl;
import com.xiaomi.fitness.route.track.model.MyTrackLibraryModel;
import com.xiaomi.fitness.route.track.model.TrackDetailModel;
import com.xiaomi.fitness.route.track.server.TrackRepository;
import com.xiaomi.fitness.route.track.server.TrackRequest;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity;
import com.xiaomi.fitness.route.track.view.TrackCollectListFragment;
import com.xiaomi.fitness.route.track.view.TrackCreateListFragment;
import com.xiaomi.fitness.route.track.view.TrackDetailActivity;
import com.xiaomi.fitness.route.track.view.TrackEditNameActivity;
import com.xiaomi.fitness.route.track.view.TrackImportListFragment;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;
import com.xiaomi.fitness.route.track.viewmodel.TrackDetailVM;
import com.xiaomi.fitness.running.group.api.RunningGroupApiImpl;
import com.xiaomi.fitness.running.group.api.RunningGroupRequest;
import com.xiaomi.fitness.running.group.export.RunningGroupApi;
import com.xiaomi.fitness.service.DefaultBinderPool;
import com.xiaomi.fitness.service.DefaultRemoteService;
import com.xiaomi.fitness.share.report.EditSportReportCustomShareActivity;
import com.xiaomi.fitness.share.report.SportReportShareActivity;
import com.xiaomi.fitness.showalldata.HealthShowAllDataFragment;
import com.xiaomi.fitness.showalldata.HealthShowAllDataViewModel;
import com.xiaomi.fitness.showalldata.ManageHealthFunctionFragment;
import com.xiaomi.fitness.showalldata.ManageHealthFunctionViewModel;
import com.xiaomi.fitness.sleep.behavior.collection.CollectionTaskManager;
import com.xiaomi.fitness.sleep.behavior.collection.ICollectionTaskManager;
import com.xiaomi.fitness.sleep.trace.ConfigurationInternal;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfigurationImpl;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.SleepTracerImpl;
import com.xiaomi.fitness.sleep.trace.SleepTracerInternal;
import com.xiaomi.fitness.smarthome.di.SmartModule;
import com.xiaomi.fitness.sport.SportModule;
import com.xiaomi.fitness.sport.eco.export.EcoSportManager;
import com.xiaomi.fitness.sport.export.RunningRouteApiImpl;
import com.xiaomi.fitness.sport.export.SportAccessApiImp;
import com.xiaomi.fitness.sport.export.SportAidongGameApiImpl;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.LaunchSportModel;
import com.xiaomi.fitness.sport.model.weather.WeatherRequest;
import com.xiaomi.fitness.sport.route.detail.RouteDetailActivity;
import com.xiaomi.fitness.sport.route.detail.UserFeedbackActivity;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.fitness.sport.sporttab.SportTabV4Fragment;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.view.goal.GoalVM;
import com.xiaomi.fitness.sport.view.justdance.JustDanceImpl;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlModel;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceShareWebViewActivity;
import com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchActivity;
import com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchModel;
import com.xiaomi.fitness.sport.view.justdance.launch.JustDanceLaunchViewModel;
import com.xiaomi.fitness.sport.view.launch.LaunchSportActivity;
import com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity;
import com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingRequest;
import com.xiaomi.fitness.sport.view.lockscreen.viewmodel.SportLockScreenViewModel;
import com.xiaomi.fitness.sport.view.route.CreateRouteActivity;
import com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity;
import com.xiaomi.fitness.sport.view.route.RunningRouteHistoryActivity;
import com.xiaomi.fitness.sport.view.route.RunningRouteListActivity;
import com.xiaomi.fitness.sport.view.sporting.CommonSportActivity;
import com.xiaomi.fitness.sport.view.sporting.IndoorRunningActivity;
import com.xiaomi.fitness.sport.view.sporting.RunningPostureActivity;
import com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanModeWearGuideActivity;
import com.xiaomi.fitness.sport.viewmodel.CommonSportVM;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteDetailViewModel;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import com.xiaomi.fitness.sport.viewmodel.IndoorSportVM;
import com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel;
import com.xiaomi.fitness.sport.viewmodel.RunningPostureViewModel;
import com.xiaomi.fitness.sport.viewmodel.RunningRouteHistoryViewModel;
import com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM;
import com.xiaomi.fitness.sport_capture.SportVideoModel;
import com.xiaomi.fitness.sport_capture.SportVideoViewModel;
import com.xiaomi.fitness.sport_capture.manager.SportCaptureManager;
import com.xiaomi.fitness.sport_capture.ui.VideoViewModel;
import com.xiaomi.fitness.sport_eco.api.EcoSportManagerImpl;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpApi;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpApiImpl;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpRequest;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryActivity;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestHistoryViewModel;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestIntroduceActivity;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestIntroduceViewModel;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultActivity;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultV2Activity;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultV2ViewModel;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpTestResultViewModel;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2ActivityViewModel;
import com.xiaomi.fitness.sport_eco.view.goal.JumpGoalVM;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingActivity;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingDurationFragment;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingDurationVM;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingNumberFragment;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingNumberVM;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingVM;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModelExt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.BeltAdjustWebViewActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingFragment;
import com.xiaomi.fitness.sport_eco.view.lockscreen.view.SportLockScreenActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.IndoorRidingActivity;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import com.xiaomi.fitness.sport_eco.viewmodel.IndoorRidingSportVM;
import com.xiaomi.fitness.sport_eco.viewmodel.IndoorRunningSportVM;
import com.xiaomi.fitness.sport_eco.viewmodel.JumpingSportVM;
import com.xiaomi.fitness.sport_eco_manager.client.EcoSportDataCaller;
import com.xiaomi.fitness.sport_eco_manager.client.EcoSportStateCaller;
import com.xiaomi.fitness.sport_eco_manager.db.SCMRepository;
import com.xiaomi.fitness.sport_eco_manager.server.EcoSportDataServer;
import com.xiaomi.fitness.sport_eco_manager.server.EcoSportStateServer;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoGym;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAidongGameApi;
import com.xiaomi.fitness.sport_manager.client.SportDataCaller;
import com.xiaomi.fitness.sport_manager.client.SportStateCaller;
import com.xiaomi.fitness.sport_manager.music.SportMusicManager;
import com.xiaomi.fitness.sport_manager.server.SportDataServer;
import com.xiaomi.fitness.sport_manager.server.SportStateServer;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreferenceExt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IGym;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference;
import com.xiaomi.fitness.sport_xms.SportXmsHelperImpl;
import com.xiaomi.fitness.sport_xms_export.SportXmsHelper;
import com.xiaomi.fitness.stand.StandDetectInternalManager;
import com.xiaomi.fitness.stand.StandDetectManagerImpl;
import com.xiaomi.fitness.stand.export.StandDetectManager;
import com.xiaomi.fitness.stand.reminder.StandDetectReceiver;
import com.xiaomi.fitness.statistics.OnetrackImpl;
import com.xiaomi.fitness.step.StepSyncerExport;
import com.xiaomi.fitness.steps.PhoneStepsProviderImpl;
import com.xiaomi.fitness.steps.StepProviderInternal;
import com.xiaomi.fitness.sync.di.SyncExportManagerImp;
import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.weather.SyncWeatherManagerImp;
import com.xiaomi.fitness.trail.DimenTotalFragment;
import com.xiaomi.fitness.trail.RecordListFragment;
import com.xiaomi.fitness.trail.RecordMainActivity;
import com.xiaomi.fitness.trail.SportRecordApiImpl;
import com.xiaomi.fitness.trail.diving.DivingRepository;
import com.xiaomi.fitness.trail.diving.DivingRequest;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.viewmodel.DimTotalVM;
import com.xiaomi.fitness.trail.viewmodel.RecordListVM;
import com.xiaomi.fitness.trail.viewmodel.RecordMainVM;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDateActivity;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDetailActivity;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanQuestionActivity;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityQuestionModel;
import com.xiaomi.fitness.training_plan.ability_plan.AbilityQuestionViewModel;
import com.xiaomi.fitness.training_plan.ability_plan.CreateLoadingModel;
import com.xiaomi.fitness.training_plan.ability_plan.CreateLoadingViewModel;
import com.xiaomi.fitness.training_plan.ability_plan.PlanDetailModel;
import com.xiaomi.fitness.training_plan.ability_plan.PlanDetailViewModel;
import com.xiaomi.fitness.training_plan.common.PlanCourseListActivity;
import com.xiaomi.fitness.training_plan.common.PlanHistoryListActivity;
import com.xiaomi.fitness.training_plan.common.TrainingTypeListActivity;
import com.xiaomi.fitness.training_plan.common.TrainingTypeListModel;
import com.xiaomi.fitness.training_plan.common.TrainingTypeListVM;
import com.xiaomi.fitness.training_plan.di.TrainingModule;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanDetailActivity;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHistoryRecordListActivity;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestActivity;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestModel;
import com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM;
import com.xiaomi.fitness.training_plan.manager.TrainingManager;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportShareActivity;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.ubox.export.GuideNavigator;
import com.xiaomi.fitness.ubox.export.UboxGuideManager;
import com.xiaomi.fitness.ubox_guide.export.UBoxGuideManagerImpl;
import com.xiaomi.fitness.ubox_guide.ui.GuideActivity;
import com.xiaomi.fitness.ubox_guide.ui.GuideViewModel;
import com.xiaomi.fitness.ubox_guide.ui.fragment.TempViewModel;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.ICollectReportManager;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.userinfo.SetPageManagerImpl;
import com.xiaomi.fitness.userinfo.UserInfoSyncerImpl;
import com.xiaomi.fitness.userinfo.UserInformationManagerImpl;
import com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager;
import com.xiaomi.fitness.userinfo.di.GoalNotifySingleModule;
import com.xiaomi.fitness.userinfo.goal.CalorieGoalActivity;
import com.xiaomi.fitness.userinfo.goal.GoalGuidPageActivity;
import com.xiaomi.fitness.userinfo.goal.GoalGuideViewModel;
import com.xiaomi.fitness.userinfo.goal.GoalManagerActivity;
import com.xiaomi.fitness.userinfo.goal.GoalSwitchGuidPageActivity;
import com.xiaomi.fitness.userinfo.goal.GoalSyncerImpl;
import com.xiaomi.fitness.userinfo.goal.MhsGoalActivity;
import com.xiaomi.fitness.userinfo.goal.SetGoalPageActivity;
import com.xiaomi.fitness.userinfo.goal.SetGoalPageManager;
import com.xiaomi.fitness.userinfo.goal.StandTimesGoalActivity;
import com.xiaomi.fitness.userinfo.goal.StepGoalActivity;
import com.xiaomi.fitness.userinfo.information.HeartRateActivity;
import com.xiaomi.fitness.userinfo.information.UserinfoSelectModel;
import com.xiaomi.fitness.userinfo.medicalid.entity.MedicalIdModel;
import com.xiaomi.fitness.userinfo.medicalid.repository.MedicalIdSecurityRepository;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdAddEmergencyContactActivity;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdHomeActivity;
import com.xiaomi.fitness.userinfo.medicalid.viewmodel.MedicalIdViewModel;
import com.xiaomi.fitness.userinfo.net.UserInfoReportRequest;
import com.xiaomi.fitness.userinfo.ui.GuideBodyCompositionFinishActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditBirthdayActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditGenderActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditHeightActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditUserInfoActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditWeightActivity;
import com.xiaomi.fitness.userinfo.ui.UserGuideModel;
import com.xiaomi.fitness.userinfo.ui.UserGuideViewModel;
import com.xiaomi.fitness.util.HealthPageImpl;
import com.xiaomi.fitness.view.setting.temperature.TemperatureSettingViewModel;
import com.xiaomi.fitness.watch.face.FaceCategoryFragment;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.FaceEditFragment;
import com.xiaomi.fitness.watch.face.FaceInfoBleFragment;
import com.xiaomi.fitness.watch.face.FaceInfoHMFragment;
import com.xiaomi.fitness.watch.face.FaceMeFragment;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.base.CommonBaseModel;
import com.xiaomi.fitness.watch.face.base.FaceCommonInterceptor;
import com.xiaomi.fitness.watch.face.debug.FaceDebugHelperImpl;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerFragment;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerModel;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropViewModel;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerModel;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerViewModel;
import com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropViewModel;
import com.xiaomi.fitness.watch.face.export.FaceDebugHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperImpl;
import com.xiaomi.fitness.watch.face.export.FaceSyncerImpl;
import com.xiaomi.fitness.watch.face.export.FaceWearOsHelper;
import com.xiaomi.fitness.watch.face.export.FaceWearOsHelperImpl;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel;
import com.xiaomi.fitness.watch.face.market.search.FaceSearchFragment;
import com.xiaomi.fitness.watch.face.model.FaceDetailModel;
import com.xiaomi.fitness.watch.face.model.FaceEditModel;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListFragment;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListModel;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListViewModel;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceMeViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel;
import com.xiaomi.fitness.wearos.export.FastPairManager;
import com.xiaomi.fitness.wearos.export.FastPairManagerImpl;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOSUtilImpl;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.WebViewVM;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.smarthome.setting.LoginSetting;
import com.xiaomi.wearable.HuamiApiClient;
import com.xiaomi.wearable.HuamiApiClientImpl;
import com.xiaomi.wearable.HuamiApiServiceImpl;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import com.xiaomi.wearable.yrn.export.debug.YRNDebugHelper;
import com.xiaomi.wearable.yrn.helper.WearableRNPushHandler;
import com.xiaomi.wearable.yrn.impl.YRNDebugHelperImpl;
import com.xiaomi.wearable.yrn.impl.YRNHelperImpl;
import com.xiaomi.xms.wearable.XmsManagerImpl;
import com.xiaomi.xms.wearable.di.FeatureItemModule;
import com.xiaomi.xms.wearable.ui.appshop.detail.ThirdAppDetailFragment;
import com.xiaomi.xms.wearable.ui.appshop.detail.ThirdAppDetailViewModel;
import com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalFragment;
import com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalRequest;
import com.xiaomi.xms.wearable.ui.appshop.local.ThirdAppLocalViewModel;
import com.xiaomi.xms.wearable.ui.appshop.market.ThirdAppMarketListFragment;
import com.xiaomi.xms.wearable.ui.appshop.market.ThirdAppMarketListViewModel;
import com.xiaomi.xms.wearable.ui.appshop.market.ThirdAppMarketRequest;
import com.xms.wearable.export.XmsManager;
import commi.health.message.center.export.IMessageCenter;
import defpackage.a2b;
import defpackage.a3f;
import defpackage.a4p;
import defpackage.a6c;
import defpackage.a76;
import defpackage.a7f;
import defpackage.a7n;
import defpackage.a82;
import defpackage.a96;
import defpackage.a9c;
import defpackage.a9n;
import defpackage.aad;
import defpackage.aai;
import defpackage.aap;
import defpackage.ab5;
import defpackage.abp;
import defpackage.ac5;
import defpackage.adk;
import defpackage.ae2;
import defpackage.aeh;
import defpackage.ag2;
import defpackage.ag9;
import defpackage.agd;
import defpackage.agq;
import defpackage.ah9;
import defpackage.akb;
import defpackage.alc;
import defpackage.am5;
import defpackage.ao9;
import defpackage.ap7;
import defpackage.ar4;
import defpackage.asa;
import defpackage.asl;
import defpackage.at0;
import defpackage.au6;
import defpackage.aw4;
import defpackage.awd;
import defpackage.az;
import defpackage.az4;
import defpackage.az7;
import defpackage.azl;
import defpackage.b0r;
import defpackage.b2l;
import defpackage.b3f;
import defpackage.b6c;
import defpackage.b76;
import defpackage.b7n;
import defpackage.b96;
import defpackage.b9c;
import defpackage.b9n;
import defpackage.bad;
import defpackage.bai;
import defpackage.bao;
import defpackage.bb5;
import defpackage.bbp;
import defpackage.bc5;
import defpackage.bdk;
import defpackage.beh;
import defpackage.bg2;
import defpackage.bg9;
import defpackage.bgq;
import defpackage.bh9;
import defpackage.bhq;
import defpackage.bik;
import defpackage.bkb;
import defpackage.blc;
import defpackage.bm5;
import defpackage.bmc;
import defpackage.bp7;
import defpackage.bq3;
import defpackage.bq4;
import defpackage.br4;
import defpackage.br7;
import defpackage.br8;
import defpackage.bs6;
import defpackage.bsa;
import defpackage.bsl;
import defpackage.bu2;
import defpackage.bu6;
import defpackage.bw4;
import defpackage.bw8;
import defpackage.bwd;
import defpackage.byl;
import defpackage.bz;
import defpackage.bz4;
import defpackage.bz7;
import defpackage.bzl;
import defpackage.c0r;
import defpackage.c2l;
import defpackage.c3c;
import defpackage.c45;
import defpackage.c75;
import defpackage.c7b;
import defpackage.c7n;
import defpackage.c84;
import defpackage.c96;
import defpackage.c9n;
import defpackage.cad;
import defpackage.cai;
import defpackage.cao;
import defpackage.cbp;
import defpackage.cc5;
import defpackage.ceh;
import defpackage.cg2;
import defpackage.cg9;
import defpackage.cgq;
import defpackage.ch9;
import defpackage.chc;
import defpackage.chq;
import defpackage.cik;
import defpackage.cjr;
import defpackage.ckb;
import defpackage.clc;
import defpackage.clq;
import defpackage.cm5;
import defpackage.cmc;
import defpackage.cnh;
import defpackage.cp4;
import defpackage.cq3;
import defpackage.cq4;
import defpackage.cr4;
import defpackage.cr7;
import defpackage.cs6;
import defpackage.csa;
import defpackage.ct2;
import defpackage.cu2;
import defpackage.cu6;
import defpackage.cv4;
import defpackage.cw4;
import defpackage.cw8;
import defpackage.cxd;
import defpackage.cxp;
import defpackage.cy1;
import defpackage.cym;
import defpackage.cz;
import defpackage.cz4;
import defpackage.d0r;
import defpackage.d2l;
import defpackage.d45;
import defpackage.d46;
import defpackage.d50;
import defpackage.d56;
import defpackage.d5a;
import defpackage.d75;
import defpackage.d7b;
import defpackage.d84;
import defpackage.dab;
import defpackage.dad;
import defpackage.dai;
import defpackage.dao;
import defpackage.dbo;
import defpackage.dc5;
import defpackage.dei;
import defpackage.dg2;
import defpackage.dg9;
import defpackage.dh9;
import defpackage.dhc;
import defpackage.dik;
import defpackage.djr;
import defpackage.dkb;
import defpackage.dkd;
import defpackage.dlq;
import defpackage.dm5;
import defpackage.dmc;
import defpackage.dnh;
import defpackage.dpk;
import defpackage.dq3;
import defpackage.dq4;
import defpackage.dr4;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dtn;
import defpackage.dto;
import defpackage.du2;
import defpackage.du6;
import defpackage.dv4;
import defpackage.dvq;
import defpackage.dw4;
import defpackage.dw8;
import defpackage.dxp;
import defpackage.dy1;
import defpackage.dym;
import defpackage.e0c;
import defpackage.e2l;
import defpackage.e45;
import defpackage.e46;
import defpackage.e50;
import defpackage.e56;
import defpackage.e75;
import defpackage.e7b;
import defpackage.e84;
import defpackage.e88;
import defpackage.e90;
import defpackage.e92;
import defpackage.eab;
import defpackage.ead;
import defpackage.ebo;
import defpackage.ec5;
import defpackage.ecr;
import defpackage.eg9;
import defpackage.eh9;
import defpackage.eik;
import defpackage.ej3;
import defpackage.ejh;
import defpackage.ejr;
import defpackage.ekd;
import defpackage.el4;
import defpackage.elq;
import defpackage.em5;
import defpackage.enh;
import defpackage.eo8;
import defpackage.epk;
import defpackage.eq4;
import defpackage.et2;
import defpackage.etk;
import defpackage.etn;
import defpackage.eto;
import defpackage.eu2;
import defpackage.ev4;
import defpackage.exp;
import defpackage.ey1;
import defpackage.ey2;
import defpackage.ey8;
import defpackage.eym;
import defpackage.ez;
import defpackage.f0c;
import defpackage.f2b;
import defpackage.f2p;
import defpackage.f30;
import defpackage.f44;
import defpackage.f45;
import defpackage.f46;
import defpackage.f50;
import defpackage.f56;
import defpackage.f65;
import defpackage.f6g;
import defpackage.f6i;
import defpackage.f75;
import defpackage.f7b;
import defpackage.f84;
import defpackage.f88;
import defpackage.f90;
import defpackage.fab;
import defpackage.fbd;
import defpackage.fbo;
import defpackage.fc5;
import defpackage.fcr;
import defpackage.fdp;
import defpackage.fdr;
import defpackage.ff9;
import defpackage.fg9;
import defpackage.fh9;
import defpackage.fj3;
import defpackage.fj9;
import defpackage.fjh;
import defpackage.fjr;
import defpackage.fkd;
import defpackage.fl4;
import defpackage.flq;
import defpackage.fm5;
import defpackage.fnd;
import defpackage.fnh;
import defpackage.fo8;
import defpackage.fp8;
import defpackage.fq4;
import defpackage.fra;
import defpackage.fsa;
import defpackage.ft2;
import defpackage.fto;
import defpackage.fv4;
import defpackage.fvq;
import defpackage.fy2;
import defpackage.fy8;
import defpackage.fyd;
import defpackage.fym;
import defpackage.g1c;
import defpackage.g26;
import defpackage.g2b;
import defpackage.g2p;
import defpackage.g30;
import defpackage.g44;
import defpackage.g45;
import defpackage.g46;
import defpackage.g65;
import defpackage.g70;
import defpackage.g75;
import defpackage.g84;
import defpackage.g88;
import defpackage.gab;
import defpackage.gb8;
import defpackage.gbd;
import defpackage.gbo;
import defpackage.gc5;
import defpackage.gcr;
import defpackage.gdp;
import defpackage.gf9;
import defpackage.gfc;
import defpackage.gg9;
import defpackage.gh9;
import defpackage.gi0;
import defpackage.gj9;
import defpackage.gjh;
import defpackage.gjr;
import defpackage.gl4;
import defpackage.glq;
import defpackage.gnd;
import defpackage.gnh;
import defpackage.go8;
import defpackage.gp6;
import defpackage.gpo;
import defpackage.gra;
import defpackage.gsa;
import defpackage.gt2;
import defpackage.gtg;
import defpackage.gu2;
import defpackage.gv4;
import defpackage.gvd;
import defpackage.gvq;
import defpackage.gx4;
import defpackage.gy2;
import defpackage.gy8;
import defpackage.gyd;
import defpackage.gym;
import defpackage.h05;
import defpackage.h1c;
import defpackage.h1g;
import defpackage.h26;
import defpackage.h2b;
import defpackage.h2l;
import defpackage.h2p;
import defpackage.h30;
import defpackage.h49;
import defpackage.h65;
import defpackage.h70;
import defpackage.h82;
import defpackage.h84;
import defpackage.h8d;
import defpackage.h8k;
import defpackage.hb8;
import defpackage.hbd;
import defpackage.hc5;
import defpackage.hdp;
import defpackage.hee;
import defpackage.hf0;
import defpackage.hf9;
import defpackage.hfc;
import defpackage.hg9;
import defpackage.hh9;
import defpackage.hid;
import defpackage.hjh;
import defpackage.hjr;
import defpackage.hk2;
import defpackage.hk9;
import defpackage.hl7;
import defpackage.hlg;
import defpackage.hlq;
import defpackage.hnd;
import defpackage.ho8;
import defpackage.hp6;
import defpackage.hr2;
import defpackage.hra;
import defpackage.hsa;
import defpackage.htg;
import defpackage.hu2;
import defpackage.hvd;
import defpackage.hx4;
import defpackage.hy2;
import defpackage.hy8;
import defpackage.hyd;
import defpackage.i05;
import defpackage.i1c;
import defpackage.i1l;
import defpackage.i2l;
import defpackage.i49;
import defpackage.i4g;
import defpackage.i65;
import defpackage.i70;
import defpackage.i84;
import defpackage.i85;
import defpackage.i8d;
import defpackage.i8k;
import defpackage.i9n;
import defpackage.ib8;
import defpackage.ic5;
import defpackage.idp;
import defpackage.if0;
import defpackage.if9;
import defpackage.ifc;
import defpackage.ig0;
import defpackage.ig9;
import defpackage.igk;
import defpackage.ih9;
import defpackage.iid;
import defpackage.iip;
import defpackage.ik9;
import defpackage.il3;
import defpackage.il7;
import defpackage.ilg;
import defpackage.ilq;
import defpackage.im2;
import defpackage.io8;
import defpackage.ip6;
import defpackage.ipb;
import defpackage.iq0;
import defpackage.iqn;
import defpackage.ir2;
import defpackage.ire;
import defpackage.irf;
import defpackage.itg;
import defpackage.iu2;
import defpackage.ivd;
import defpackage.iw6;
import defpackage.iwp;
import defpackage.ix4;
import defpackage.iyd;
import defpackage.izg;
import defpackage.izp;
import defpackage.j05;
import defpackage.j1b;
import defpackage.j1g;
import defpackage.j1l;
import defpackage.j2l;
import defpackage.j2r;
import defpackage.j49;
import defpackage.j4g;
import defpackage.j5e;
import defpackage.j65;
import defpackage.j70;
import defpackage.j85;
import defpackage.j8d;
import defpackage.j8k;
import defpackage.j92;
import defpackage.j9n;
import defpackage.jap;
import defpackage.jb8;
import defpackage.jf9;
import defpackage.jfc;
import defpackage.jg0;
import defpackage.jg9;
import defpackage.jgk;
import defpackage.jh1;
import defpackage.jid;
import defpackage.jip;
import defpackage.jk9;
import defpackage.jl3;
import defpackage.jl7;
import defpackage.jlg;
import defpackage.jlq;
import defpackage.jm2;
import defpackage.jm7;
import defpackage.jpb;
import defpackage.jpk;
import defpackage.jq0;
import defpackage.jq7;
import defpackage.jqn;
import defpackage.jr2;
import defpackage.jr3;
import defpackage.jre;
import defpackage.jrf;
import defpackage.jsq;
import defpackage.jw4;
import defpackage.jw6;
import defpackage.jwp;
import defpackage.jx4;
import defpackage.jyd;
import defpackage.jym;
import defpackage.jzp;
import defpackage.k05;
import defpackage.k1b;
import defpackage.k2l;
import defpackage.k2r;
import defpackage.k49;
import defpackage.k4g;
import defpackage.k4m;
import defpackage.k5e;
import defpackage.k69;
import defpackage.k70;
import defpackage.k85;
import defpackage.k8d;
import defpackage.k8k;
import defpackage.k94;
import defpackage.k9o;
import defpackage.kck;
import defpackage.kdk;
import defpackage.kf9;
import defpackage.kg0;
import defpackage.kg9;
import defpackage.kgd;
import defpackage.kgk;
import defpackage.kh1;
import defpackage.kk9;
import defpackage.kl2;
import defpackage.kl3;
import defpackage.kl7;
import defpackage.klc;
import defpackage.klk;
import defpackage.klq;
import defpackage.km2;
import defpackage.km7;
import defpackage.kmc;
import defpackage.kme;
import defpackage.kn2;
import defpackage.ko6;
import defpackage.kpb;
import defpackage.kpk;
import defpackage.kq7;
import defpackage.kql;
import defpackage.kqm;
import defpackage.kqn;
import defpackage.kr2;
import defpackage.kr3;
import defpackage.kre;
import defpackage.krf;
import defpackage.kt;
import defpackage.kup;
import defpackage.kw4;
import defpackage.kw6;
import defpackage.kw7;
import defpackage.kwp;
import defpackage.kx4;
import defpackage.kym;
import defpackage.kzk;
import defpackage.kzp;
import defpackage.l05;
import defpackage.l07;
import defpackage.l1b;
import defpackage.l1n;
import defpackage.l24;
import defpackage.l2b;
import defpackage.l2g;
import defpackage.l2r;
import defpackage.l3l;
import defpackage.l49;
import defpackage.l4g;
import defpackage.l4m;
import defpackage.l4o;
import defpackage.l5e;
import defpackage.l69;
import defpackage.l85;
import defpackage.l8c;
import defpackage.l8d;
import defpackage.l8k;
import defpackage.l94;
import defpackage.ldk;
import defpackage.ldp;
import defpackage.lef;
import defpackage.lf0;
import defpackage.lf9;
import defpackage.lfq;
import defpackage.lg9;
import defpackage.lgd;
import defpackage.lgk;
import defpackage.lh1;
import defpackage.ll2;
import defpackage.ll7;
import defpackage.llc;
import defpackage.lld;
import defpackage.llk;
import defpackage.llq;
import defpackage.lm2;
import defpackage.lm4;
import defpackage.lm5;
import defpackage.lmc;
import defpackage.lme;
import defpackage.lmp;
import defpackage.ln2;
import defpackage.lo6;
import defpackage.lpb;
import defpackage.lq7;
import defpackage.lql;
import defpackage.lqn;
import defpackage.lr2;
import defpackage.lr3;
import defpackage.lr8;
import defpackage.lre;
import defpackage.lrn;
import defpackage.lt;
import defpackage.lu8;
import defpackage.lup;
import defpackage.lw6;
import defpackage.lw7;
import defpackage.lwp;
import defpackage.lym;
import defpackage.lz1;
import defpackage.lzk;
import defpackage.m07;
import defpackage.m1b;
import defpackage.m1n;
import defpackage.m24;
import defpackage.m2b;
import defpackage.m2r;
import defpackage.m3c;
import defpackage.m3l;
import defpackage.m4c;
import defpackage.m4g;
import defpackage.m4m;
import defpackage.m4o;
import defpackage.m5e;
import defpackage.m69;
import defpackage.mdh;
import defpackage.mdk;
import defpackage.mdp;
import defpackage.mef;
import defpackage.mf0;
import defpackage.mf9;
import defpackage.mfq;
import defpackage.mg9;
import defpackage.mgd;
import defpackage.mgk;
import defpackage.mj9;
import defpackage.ml2;
import defpackage.ml7;
import defpackage.mlc;
import defpackage.mlk;
import defpackage.mm2;
import defpackage.mm4;
import defpackage.mmc;
import defpackage.mme;
import defpackage.mmp;
import defpackage.mn2;
import defpackage.mo6;
import defpackage.moh;
import defpackage.mp3;
import defpackage.mq7;
import defpackage.mql;
import defpackage.mqn;
import defpackage.mr8;
import defpackage.mu8;
import defpackage.mup;
import defpackage.mw6;
import defpackage.mw7;
import defpackage.mw8;
import defpackage.mwp;
import defpackage.mym;
import defpackage.mz1;
import defpackage.n1b;
import defpackage.n1f;
import defpackage.n1n;
import defpackage.n1o;
import defpackage.n24;
import defpackage.n2b;
import defpackage.n3c;
import defpackage.n3l;
import defpackage.n3o;
import defpackage.n4b;
import defpackage.n4c;
import defpackage.n4m;
import defpackage.n4o;
import defpackage.n4p;
import defpackage.n5e;
import defpackage.n69;
import defpackage.n75;
import defpackage.n8c;
import defpackage.nap;
import defpackage.nc6;
import defpackage.ndl;
import defpackage.ndp;
import defpackage.nf0;
import defpackage.nf5;
import defpackage.nf9;
import defpackage.nfq;
import defpackage.ng9;
import defpackage.ngf;
import defpackage.ngk;
import defpackage.nhr;
import defpackage.nif;
import defpackage.nj9;
import defpackage.nl2;
import defpackage.nl7;
import defpackage.nlc;
import defpackage.nlm;
import defpackage.nm2;
import defpackage.nm4;
import defpackage.nmc;
import defpackage.nme;
import defpackage.nmp;
import defpackage.nn5;
import defpackage.no2;
import defpackage.no3;
import defpackage.np3;
import defpackage.np8;
import defpackage.nq7;
import defpackage.nql;
import defpackage.nqn;
import defpackage.nr8;
import defpackage.nra;
import defpackage.ns6;
import defpackage.nta;
import defpackage.nu8;
import defpackage.nw7;
import defpackage.nw8;
import defpackage.nz;
import defpackage.nz1;
import defpackage.nzh;
import defpackage.o1n;
import defpackage.o1o;
import defpackage.o2l;
import defpackage.o3c;
import defpackage.o3l;
import defpackage.o3o;
import defpackage.o40;
import defpackage.o4c;
import defpackage.o4m;
import defpackage.o4o;
import defpackage.o4p;
import defpackage.o54;
import defpackage.o59;
import defpackage.o5e;
import defpackage.o69;
import defpackage.o75;
import defpackage.o8c;
import defpackage.oc6;
import defpackage.odl;
import defpackage.odp;
import defpackage.of0;
import defpackage.of5;
import defpackage.of9;
import defpackage.ofb;
import defpackage.ofg;
import defpackage.ofq;
import defpackage.og9;
import defpackage.ogf;
import defpackage.ogk;
import defpackage.ohb;
import defpackage.ohr;
import defpackage.oif;
import defpackage.ol7;
import defpackage.olm;
import defpackage.om2;
import defpackage.omp;
import defpackage.on7;
import defpackage.onf;
import defpackage.oo2;
import defpackage.oo3;
import defpackage.oo4;
import defpackage.op3;
import defpackage.op8;
import defpackage.oq0;
import defpackage.oq7;
import defpackage.oql;
import defpackage.oqn;
import defpackage.or8;
import defpackage.ora;
import defpackage.ota;
import defpackage.oto;
import defpackage.ou8;
import defpackage.ow7;
import defpackage.ow8;
import defpackage.oz;
import defpackage.ozh;
import defpackage.p1o;
import defpackage.p27;
import defpackage.p2l;
import defpackage.p3c;
import defpackage.p3l;
import defpackage.p3o;
import defpackage.p40;
import defpackage.p4c;
import defpackage.p4o;
import defpackage.p4p;
import defpackage.p5e;
import defpackage.p75;
import defpackage.p8c;
import defpackage.p94;
import defpackage.p99;
import defpackage.p9m;
import defpackage.pck;
import defpackage.pdl;
import defpackage.pf0;
import defpackage.pf5;
import defpackage.pf9;
import defpackage.pfb;
import defpackage.pfq;
import defpackage.pg2;
import defpackage.pg9;
import defpackage.pgf;
import defpackage.pgk;
import defpackage.phb;
import defpackage.phr;
import defpackage.pif;
import defpackage.pik;
import defpackage.pjg;
import defpackage.plm;
import defpackage.pm2;
import defpackage.pmg;
import defpackage.pmp;
import defpackage.pn5;
import defpackage.pn7;
import defpackage.po2;
import defpackage.po3;
import defpackage.po4;
import defpackage.po9;
import defpackage.pp8;
import defpackage.pq0;
import defpackage.pq3;
import defpackage.pq7;
import defpackage.pqm;
import defpackage.pqn;
import defpackage.pr8;
import defpackage.pra;
import defpackage.ps1;
import defpackage.ps6;
import defpackage.pta;
import defpackage.pto;
import defpackage.pu8;
import defpackage.pum;
import defpackage.pw8;
import defpackage.pwf;
import defpackage.py8;
import defpackage.pz;
import defpackage.pzh;
import defpackage.q27;
import defpackage.q2f;
import defpackage.q3c;
import defpackage.q3h;
import defpackage.q3o;
import defpackage.q40;
import defpackage.q4p;
import defpackage.q5e;
import defpackage.q5o;
import defpackage.q6b;
import defpackage.q75;
import defpackage.q7k;
import defpackage.q8c;
import defpackage.q94;
import defpackage.q9b;
import defpackage.q9m;
import defpackage.qa3;
import defpackage.qc7;
import defpackage.qck;
import defpackage.qdl;
import defpackage.qeg;
import defpackage.qf2;
import defpackage.qf9;
import defpackage.qg2;
import defpackage.qg9;
import defpackage.qhb;
import defpackage.qhr;
import defpackage.qif;
import defpackage.qik;
import defpackage.qmg;
import defpackage.qn0;
import defpackage.qn5;
import defpackage.qn7;
import defpackage.qn8;
import defpackage.qnf;
import defpackage.qo2;
import defpackage.qo4;
import defpackage.qo8;
import defpackage.qo9;
import defpackage.qoh;
import defpackage.qp4;
import defpackage.qp8;
import defpackage.qq0;
import defpackage.qq3;
import defpackage.qq7;
import defpackage.qqm;
import defpackage.qr4;
import defpackage.qra;
import defpackage.qs1;
import defpackage.qs6;
import defpackage.qt8;
import defpackage.qta;
import defpackage.qum;
import defpackage.qvh;
import defpackage.qw8;
import defpackage.qwf;
import defpackage.qy8;
import defpackage.qz;
import defpackage.qzh;
import defpackage.r05;
import defpackage.r0p;
import defpackage.r27;
import defpackage.r2f;
import defpackage.r3h;
import defpackage.r40;
import defpackage.r49;
import defpackage.r5e;
import defpackage.r5o;
import defpackage.r65;
import defpackage.r6b;
import defpackage.r75;
import defpackage.r9b;
import defpackage.r9m;
import defpackage.ra3;
import defpackage.rc7;
import defpackage.rck;
import defpackage.rdl;
import defpackage.reg;
import defpackage.rf9;
import defpackage.rfb;
import defpackage.rfc;
import defpackage.rg2;
import defpackage.rg9;
import defpackage.rgq;
import defpackage.rhb;
import defpackage.rhf;
import defpackage.rhj;
import defpackage.rib;
import defpackage.rif;
import defpackage.rik;
import defpackage.rjb;
import defpackage.rk9;
import defpackage.rkq;
import defpackage.rn5;
import defpackage.rn7;
import defpackage.rn8;
import defpackage.rnf;
import defpackage.ro4;
import defpackage.ro8;
import defpackage.ro9;
import defpackage.roh;
import defpackage.rom;
import defpackage.rp4;
import defpackage.rp8;
import defpackage.rph;
import defpackage.rq0;
import defpackage.rq3;
import defpackage.rqm;
import defpackage.rr4;
import defpackage.rs1;
import defpackage.rs6;
import defpackage.rta;
import defpackage.rtm;
import defpackage.ru2;
import defpackage.ru3;
import defpackage.rum;
import defpackage.rvh;
import defpackage.rwf;
import defpackage.rxh;
import defpackage.rz;
import defpackage.rz3;
import defpackage.rz4;
import defpackage.rzh;
import defpackage.rzr;
import defpackage.s05;
import defpackage.s2f;
import defpackage.s3f;
import defpackage.s40;
import defpackage.s5e;
import defpackage.s5o;
import defpackage.s65;
import defpackage.s6b;
import defpackage.s8g;
import defpackage.s9b;
import defpackage.s9m;
import defpackage.sa3;
import defpackage.sc7;
import defpackage.sck;
import defpackage.sec;
import defpackage.seg;
import defpackage.sf9;
import defpackage.sfc;
import defpackage.sg2;
import defpackage.sg9;
import defpackage.shb;
import defpackage.shf;
import defpackage.shj;
import defpackage.shq;
import defpackage.si1;
import defpackage.sib;
import defpackage.sik;
import defpackage.sj9;
import defpackage.sjb;
import defpackage.sk9;
import defpackage.skq;
import defpackage.sn0;
import defpackage.sn5;
import defpackage.sn7;
import defpackage.sn8;
import defpackage.snf;
import defpackage.so2;
import defpackage.so9;
import defpackage.sof;
import defpackage.soh;
import defpackage.som;
import defpackage.sp4;
import defpackage.sqa;
import defpackage.sqm;
import defpackage.sr0;
import defpackage.sr4;
import defpackage.ss;
import defpackage.ss1;
import defpackage.ss6;
import defpackage.stm;
import defpackage.su2;
import defpackage.su3;
import defpackage.svh;
import defpackage.swf;
import defpackage.sxd;
import defpackage.sxh;
import defpackage.sz3;
import defpackage.sz4;
import defpackage.szr;
import defpackage.t05;
import defpackage.t2f;
import defpackage.t3f;
import defpackage.t49;
import defpackage.t5o;
import defpackage.t65;
import defpackage.t8c;
import defpackage.t8g;
import defpackage.t9b;
import defpackage.t9d;
import defpackage.t9m;
import defpackage.ta3;
import defpackage.tc6;
import defpackage.tc7;
import defpackage.tck;
import defpackage.tec;
import defpackage.teg;
import defpackage.tf9;
import defpackage.tfc;
import defpackage.tfg;
import defpackage.tg2;
import defpackage.tg9;
import defpackage.thb;
import defpackage.thf;
import defpackage.thj;
import defpackage.thq;
import defpackage.ti1;
import defpackage.tib;
import defpackage.tik;
import defpackage.tj9;
import defpackage.tjb;
import defpackage.tk9;
import defpackage.tn0;
import defpackage.tn3;
import defpackage.tn5;
import defpackage.tn7;
import defpackage.tn8;
import defpackage.tnf;
import defpackage.to2;
import defpackage.to9;
import defpackage.tof;
import defpackage.toh;
import defpackage.tom;
import defpackage.tp4;
import defpackage.tph;
import defpackage.tqa;
import defpackage.tqe;
import defpackage.tr;
import defpackage.tr0;
import defpackage.tr4;
import defpackage.tr6;
import defpackage.ts1;
import defpackage.ts6;
import defpackage.tt4;
import defpackage.ttl;
import defpackage.ttm;
import defpackage.tu2;
import defpackage.tum;
import defpackage.tvh;
import defpackage.twf;
import defpackage.txd;
import defpackage.tz3;
import defpackage.tzr;
import defpackage.u05;
import defpackage.u25;
import defpackage.u27;
import defpackage.u2e;
import defpackage.u2n;
import defpackage.u3f;
import defpackage.u3g;
import defpackage.u49;
import defpackage.u4l;
import defpackage.u5o;
import defpackage.u65;
import defpackage.u7k;
import defpackage.u85;
import defpackage.u8c;
import defpackage.u8l;
import defpackage.u99;
import defpackage.u9d;
import defpackage.u9l;
import defpackage.ua3;
import defpackage.uap;
import defpackage.uc6;
import defpackage.uc7;
import defpackage.uck;
import defpackage.uec;
import defpackage.ueg;
import defpackage.uf9;
import defpackage.ufc;
import defpackage.ufg;
import defpackage.ug1;
import defpackage.ug9;
import defpackage.ugd;
import defpackage.uh7;
import defpackage.uhf;
import defpackage.uhq;
import defpackage.uib;
import defpackage.uj9;
import defpackage.ujb;
import defpackage.uk9;
import defpackage.ul2;
import defpackage.umd;
import defpackage.un3;
import defpackage.un7;
import defpackage.un8;
import defpackage.unf;
import defpackage.unp;
import defpackage.uo2;
import defpackage.uo9;
import defpackage.uoh;
import defpackage.up4;
import defpackage.uph;
import defpackage.uq2;
import defpackage.uqa;
import defpackage.ur;
import defpackage.ur0;
import defpackage.us6;
import defpackage.ut4;
import defpackage.uu2;
import defpackage.uum;
import defpackage.uxd;
import defpackage.uxp;
import defpackage.uyq;
import defpackage.uz3;
import defpackage.uzp;
import defpackage.v03;
import defpackage.v05;
import defpackage.v1f;
import defpackage.v25;
import defpackage.v2g;
import defpackage.v2l;
import defpackage.v3f;
import defpackage.v3g;
import defpackage.v3q;
import defpackage.v49;
import defpackage.v4l;
import defpackage.v5e;
import defpackage.v65;
import defpackage.v7k;
import defpackage.v85;
import defpackage.v8b;
import defpackage.v8l;
import defpackage.v99;
import defpackage.v9d;
import defpackage.vap;
import defpackage.vc6;
import defpackage.vcf;
import defpackage.vec;
import defpackage.vf9;
import defpackage.vfg;
import defpackage.vfq;
import defpackage.vg1;
import defpackage.vg9;
import defpackage.vgd;
import defpackage.vh7;
import defpackage.vhf;
import defpackage.vhq;
import defpackage.vj9;
import defpackage.vjb;
import defpackage.vl2;
import defpackage.vmd;
import defpackage.vn3;
import defpackage.vn7;
import defpackage.vnp;
import defpackage.vo2;
import defpackage.vo9;
import defpackage.vp9;
import defpackage.vph;
import defpackage.vq2;
import defpackage.vqa;
import defpackage.vr6;
import defpackage.vt4;
import defpackage.vt8;
import defpackage.vtp;
import defpackage.vu2;
import defpackage.vum;
import defpackage.vw4;
import defpackage.vxd;
import defpackage.vxp;
import defpackage.vz3;
import defpackage.vzp;
import defpackage.w03;
import defpackage.w25;
import defpackage.w2g;
import defpackage.w2l;
import defpackage.w36;
import defpackage.w3f;
import defpackage.w3g;
import defpackage.w3q;
import defpackage.w49;
import defpackage.w4l;
import defpackage.w5e;
import defpackage.w72;
import defpackage.w7k;
import defpackage.w85;
import defpackage.w8l;
import defpackage.w99;
import defpackage.w9b;
import defpackage.w9d;
import defpackage.w9p;
import defpackage.wap;
import defpackage.wc6;
import defpackage.wc7;
import defpackage.wcf;
import defpackage.wf9;
import defpackage.wfg;
import defpackage.wg1;
import defpackage.wg9;
import defpackage.wgd;
import defpackage.wh7;
import defpackage.whq;
import defpackage.wko;
import defpackage.wl2;
import defpackage.wlc;
import defpackage.wmd;
import defpackage.wmh;
import defpackage.wn7;
import defpackage.wo2;
import defpackage.wo9;
import defpackage.wp9;
import defpackage.wph;
import defpackage.wqa;
import defpackage.wra;
import defpackage.ws0;
import defpackage.wt4;
import defpackage.wt8;
import defpackage.wtp;
import defpackage.ww4;
import defpackage.wxp;
import defpackage.wzp;
import defpackage.x03;
import defpackage.x25;
import defpackage.x2l;
import defpackage.x3g;
import defpackage.x3q;
import defpackage.x49;
import defpackage.x4l;
import defpackage.x5c;
import defpackage.x5e;
import defpackage.x72;
import defpackage.x7f;
import defpackage.x7k;
import defpackage.x85;
import defpackage.x99;
import defpackage.x9b;
import defpackage.x9d;
import defpackage.x9p;
import defpackage.xa5;
import defpackage.xap;
import defpackage.xbk;
import defpackage.xcf;
import defpackage.xck;
import defpackage.xf9;
import defpackage.xg9;
import defpackage.xgd;
import defpackage.xh7;
import defpackage.xij;
import defpackage.xko;
import defpackage.xl2;
import defpackage.xlc;
import defpackage.xn7;
import defpackage.xoq;
import defpackage.xp0;
import defpackage.xph;
import defpackage.xrq;
import defpackage.xs0;
import defpackage.xt4;
import defpackage.xt8;
import defpackage.xtp;
import defpackage.xvd;
import defpackage.xvm;
import defpackage.xw4;
import defpackage.xx5;
import defpackage.xxm;
import defpackage.y03;
import defpackage.y0m;
import defpackage.y25;
import defpackage.y2l;
import defpackage.y3g;
import defpackage.y3i;
import defpackage.y3p;
import defpackage.y4e;
import defpackage.y4l;
import defpackage.y4r;
import defpackage.y5c;
import defpackage.y5e;
import defpackage.y6f;
import defpackage.y72;
import defpackage.y7f;
import defpackage.y7k;
import defpackage.y85;
import defpackage.y8c;
import defpackage.y9b;
import defpackage.y9p;
import defpackage.ya5;
import defpackage.ybk;
import defpackage.ycf;
import defpackage.yck;
import defpackage.ydh;
import defpackage.yf9;
import defpackage.yfq;
import defpackage.yg9;
import defpackage.ygd;
import defpackage.yh4;
import defpackage.yh7;
import defpackage.yij;
import defpackage.yko;
import defpackage.ylc;
import defpackage.yn4;
import defpackage.yo7;
import defpackage.yoq;
import defpackage.yp0;
import defpackage.yqa;
import defpackage.yrq;
import defpackage.ys0;
import defpackage.ytp;
import defpackage.yvd;
import defpackage.yvm;
import defpackage.yw4;
import defpackage.yx5;
import defpackage.yy;
import defpackage.yz4;
import defpackage.z03;
import defpackage.z2f;
import defpackage.z2l;
import defpackage.z3i;
import defpackage.z3p;
import defpackage.z5c;
import defpackage.z5e;
import defpackage.z66;
import defpackage.z6f;
import defpackage.z72;
import defpackage.z7f;
import defpackage.z8c;
import defpackage.z8n;
import defpackage.z9b;
import defpackage.z9p;
import defpackage.za5;
import defpackage.zap;
import defpackage.zb5;
import defpackage.zcf;
import defpackage.zck;
import defpackage.zdh;
import defpackage.zf2;
import defpackage.zf9;
import defpackage.zfq;
import defpackage.zg9;
import defpackage.zgd;
import defpackage.zh4;
import defpackage.zij;
import defpackage.zjb;
import defpackage.zkc;
import defpackage.zko;
import defpackage.zl5;
import defpackage.zlc;
import defpackage.zn4;
import defpackage.zo7;
import defpackage.zoq;
import defpackage.zp0;
import defpackage.zq4;
import defpackage.zqa;
import defpackage.zrl;
import defpackage.zrq;
import defpackage.zs0;
import defpackage.zt6;
import defpackage.zvd;
import defpackage.zvm;
import defpackage.zw4;
import defpackage.zy;
import defpackage.zy4;
import defpackage.zz4;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: com.xiaomi.fitness.a$a, reason: collision with other inner class name */
    public static final class C0372a implements gi0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11483b;
        public Activity c;

        @Override // defpackage.gi0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0372a a(Activity activity) {
            this.c = (Activity) f6i.b(activity);
            return this;
        }

        @Override // defpackage.gi0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public po9 build() {
            f6i.a(this.c, Activity.class);
            return new b(this.f11482a, this.f11483b, new DataModule(), new HealthModule(), new SportModule(), this.c);
        }

        public C0372a(j jVar, d dVar) {
            this.f11482a = jVar;
            this.f11483b = dVar;
        }
    }

    public static final class b extends po9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataModule f11484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HealthModule f11485b;
        public final SportModule c;
        public final j d;
        public final d e;
        public final b f = this;

        public b(j jVar, d dVar, DataModule dataModule, HealthModule healthModule, SportModule sportModule, Activity activity) {
            this.d = jVar;
            this.e = dVar;
            this.f11484a = dataModule;
            this.f11485b = healthModule;
            this.c = sportModule;
        }

        @Override // defpackage.ugm
        public void A(SleepAnimalReportActivity sleepAnimalReportActivity) {
        }

        @Override // defpackage.q65
        public void A0(CurseInfoActivity curseInfoActivity) {
        }

        @Override // defpackage.hi2
        public void A1(BeltAdjustWebViewActivity beltAdjustWebViewActivity) {
        }

        @Override // defpackage.zra
        public void A2(FtpTestResultV2Activity ftpTestResultV2Activity) {
        }

        public final IntervalTrainingActivity A3(IntervalTrainingActivity intervalTrainingActivity) {
            agd.a(intervalTrainingActivity, new IntervalTrainingDurationFragment());
            agd.b(intervalTrainingActivity, new IntervalTrainingNumberFragment());
            return intervalTrainingActivity;
        }

        @Override // defpackage.gqn
        public void B(SportLockScreenActivity sportLockScreenActivity) {
        }

        @Override // defpackage.ggm
        public void B0(SleepAnimalDetectingActivity sleepAnimalDetectingActivity) {
        }

        @Override // defpackage.l65
        public void B1(CurseHistoryActivity curseHistoryActivity) {
        }

        @Override // defpackage.jsm
        public void B2(SleepRhythmCalendarActivity sleepRhythmCalendarActivity) {
        }

        public final IssuerActivity B3(IssuerActivity issuerActivity) {
            lld.a(issuerActivity, this.d.S.get());
            return issuerActivity;
        }

        @Override // defpackage.hck
        public void C(RegionSelectActivity regionSelectActivity) {
        }

        @Override // defpackage.keg
        public void C0(MyHabitListActivity myHabitListActivity) {
        }

        @Override // defpackage.k5b
        public void C1(GuideEditUserInfoActivity guideEditUserInfoActivity) {
        }

        @Override // defpackage.l1f
        public void C2(MainActivity mainActivity) {
            C3(mainActivity);
        }

        public final MainActivity C3(MainActivity mainActivity) {
            n1f.c(mainActivity, R3());
            n1f.b(mainActivity, this.d.u.get());
            n1f.e(mainActivity, this.d.w1.get());
            n1f.a(mainActivity, this.d.y2.get());
            n1f.d(mainActivity, this.d.A.get());
            return mainActivity;
        }

        @Override // defpackage.lo2
        public void D(BindThirdPartyDeviceActivity bindThirdPartyDeviceActivity) {
            p3(bindThirdPartyDeviceActivity);
        }

        @Override // defpackage.t30
        public void D0(AccessActivity accessActivity) {
        }

        @Override // defpackage.msp
        public void D1(TrainPlanReportShareActivity trainPlanReportShareActivity) {
        }

        @Override // defpackage.uep
        public void D2(TimeScopeAccessibleToTAActivity timeScopeAccessibleToTAActivity) {
        }

        public final MineFragment D3(MineFragment mineFragment) {
            e92.a(mineFragment, new BaseMainFragmentDelegateImpl());
            j1g.c(mineFragment, this.d.z.get());
            j1g.b(mineFragment, this.d.S.get());
            j1g.a(mineFragment, this.d.y2.get());
            return mineFragment;
        }

        @Override // defpackage.jl2
        public void E(BindEcoDeviceDeviceActivity bindEcoDeviceDeviceActivity) {
        }

        @Override // defpackage.g85
        public void E0(CurseMainActivity curseMainActivity) {
        }

        @Override // defpackage.tfr
        public void E1(WeightGuideActivity weightGuideActivity) {
        }

        @Override // defpackage.ol2
        public void E2(BindHeadphoneDeviceActivity bindHeadphoneDeviceActivity) {
            m3(bindHeadphoneDeviceActivity);
        }

        public final RegionSelectListActivity E3(RegionSelectListActivity regionSelectListActivity) {
            kck.a(regionSelectListActivity, this.d.S.get());
            return regionSelectListActivity;
        }

        @Override // defpackage.c65
        public void F(CurseEditActivity curseEditActivity) {
        }

        @Override // defpackage.adr
        public void F0(WechatActivity wechatActivity) {
        }

        @Override // defpackage.m1f
        public void F1(com.xiaomi.fitness.electronic.scale.MainActivity mainActivity) {
        }

        @Override // defpackage.vd4
        public void F2(ConfirmUserInfoActivity confirmUserInfoActivity) {
        }

        public final RunningPostureActivity F3(RunningPostureActivity runningPostureActivity) {
            ae2.a(runningPostureActivity, new SportMusicManager());
            return runningPostureActivity;
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.a
        public jsq G() {
            return new k(this.d, this.e, this.f);
        }

        @Override // defpackage.dnf
        public void G0(MedicalIdEditActivity medicalIdEditActivity) {
        }

        @Override // defpackage.jck
        public void G1(RegionSelectListActivity regionSelectListActivity) {
            E3(regionSelectListActivity);
        }

        @Override // defpackage.l54
        public void G2(CommonBaseActivity commonBaseActivity) {
        }

        public final SendingInvitationActivity G3(SendingInvitationActivity sendingInvitationActivity) {
            ttl.a(sendingInvitationActivity, this.d.S.get());
            return sendingInvitationActivity;
        }

        @Override // defpackage.uw1
        public void H(BabyWeightActivity babyWeightActivity) {
        }

        @Override // defpackage.yu4
        public void H0(CourseMeActivity courseMeActivity) {
        }

        @Override // defpackage.afg
        public void H1(MyQRCodeActivity myQRCodeActivity) {
        }

        @Override // defpackage.kg3
        public void H2(CameraDetectActivity cameraDetectActivity) {
        }

        public final SettingActivity H3(SettingActivity settingActivity) {
            y0m.a(settingActivity, this.d.S.get());
            y0m.b(settingActivity, this.d.w1.get());
            return settingActivity;
        }

        @Override // defpackage.e8d
        public void I(IndoorRidingActivity indoorRidingActivity) {
        }

        @Override // defpackage.t28
        public void I0(EditSportReportCustomShareActivity editSportReportCustomShareActivity) {
        }

        @Override // defpackage.uyl
        public void I1(SetGoalPageActivity setGoalPageActivity) {
        }

        @Override // defpackage.p5b
        public void I2(GuideEditWeightActivity guideEditWeightActivity) {
        }

        public final com.xiaomi.fitness.sport.view.lockscreen.view.SportLockScreenActivity I3(com.xiaomi.fitness.sport.view.lockscreen.view.SportLockScreenActivity sportLockScreenActivity) {
            ae2.a(sportLockScreenActivity, new SportMusicManager());
            return sportLockScreenActivity;
        }

        @Override // defpackage.qgq
        public void J(UserIndicatorsActivity userIndicatorsActivity) {
            J3(userIndicatorsActivity);
        }

        @Override // defpackage.fwf
        public void J0(MiSportImportActivity miSportImportActivity) {
        }

        @Override // defpackage.ph9
        public void J1(FeedBackDeviceActivity feedBackDeviceActivity) {
        }

        @Override // defpackage.so7
        public void J2(EcoCourseSmartHrActivity ecoCourseSmartHrActivity) {
        }

        public final UserIndicatorsActivity J3(UserIndicatorsActivity userIndicatorsActivity) {
            rgq.a(userIndicatorsActivity, this.d.A.get());
            return userIndicatorsActivity;
        }

        @Override // defpackage.okr
        public void K(WifiInfoActivity wifiInfoActivity) {
        }

        @Override // defpackage.qib
        public void K0(HabitShareActivity habitShareActivity) {
        }

        @Override // defpackage.jeo
        public void K1(StepGoalActivity stepGoalActivity) {
        }

        @Override // defpackage.q2b
        public void K2(GoogleFitAccessActivity googleFitAccessActivity) {
        }

        public final WechatDeviceActivity K3(WechatDeviceActivity wechatDeviceActivity) {
            fdr.a(wechatDeviceActivity, new AccessRequest());
            return wechatDeviceActivity;
        }

        @Override // defpackage.g2e
        public void L(LabCollaborationManagementActivity labCollaborationManagementActivity) {
        }

        @Override // defpackage.iuf
        public void L0(MhsGoalActivity mhsGoalActivity) {
        }

        @Override // defpackage.wym
        public void L1(SleepSnoreDetectionSettingActivity sleepSnoreDetectionSettingActivity) {
        }

        @Override // defpackage.lq1
        public void L2(AuthConfigListActivity authConfigListActivity) {
        }

        public MineFragment L3() {
            return D3(h1g.a(this.d.v.get()));
        }

        @Override // defpackage.kcf
        public void M(MedalDetailActivity medalDetailActivity) {
        }

        @Override // defpackage.hn7
        public void M0(EcoCourseInfoActivity ecoCourseInfoActivity) {
        }

        @Override // defpackage.oo5
        public void M1(DataSharedByTAActivity dataSharedByTAActivity) {
        }

        @Override // defpackage.hwp
        public void M2(TrainingTypeListActivity trainingTypeListActivity) {
        }

        public OtherDeviceTabFragmentV4 M3() {
            return new OtherDeviceTabFragmentV4(this.d.u0.get());
        }

        @Override // defpackage.we2
        public void N(BaseThirdPartyAccessActivity baseThirdPartyAccessActivity) {
        }

        @Override // defpackage.j3l
        public void N0(RunningRouteHistoryActivity runningRouteHistoryActivity) {
        }

        @Override // defpackage.rmp
        public void N1(TrackEditNameActivity trackEditNameActivity) {
        }

        @Override // defpackage.mn5
        public void N2(DataReportActivity dataReportActivity) {
        }

        public MainTab N3() {
            return f0c.a(this.f11485b, k3());
        }

        @Override // defpackage.x4b
        public void O(GuideEditGenderActivity guideEditGenderActivity) {
        }

        @Override // defpackage.cum
        public void O0(SleepRhythmMonitorGuideActivity sleepRhythmMonitorGuideActivity) {
        }

        @Override // defpackage.v36
        public void O1(DeviceDualAuthorizationActivity deviceDualAuthorizationActivity) {
        }

        @Override // defpackage.vq4
        public void O2(CourseFeedActivity courseFeedActivity) {
        }

        public MainTab O3() {
            return lm5.a(this.f11484a, L3());
        }

        @Override // defpackage.fn2
        public void P(BindRopeSkippingListActivity bindRopeSkippingListActivity) {
        }

        @Override // defpackage.jhq
        public void P0(UserManageActivity userManageActivity) {
        }

        @Override // defpackage.jyf
        public void P1(MineActivity mineActivity) {
        }

        @Override // defpackage.hqn
        public void P2(com.xiaomi.fitness.sport.view.lockscreen.view.SportLockScreenActivity sportLockScreenActivity) {
            I3(sportLockScreenActivity);
        }

        public MainTab P3() {
            return lrn.a(this.c, new SportTabV4Fragment());
        }

        @Override // defpackage.ii2
        public void Q(com.xiaomi.fitness.sport.view.launch.gym.setting.BeltAdjustWebViewActivity beltAdjustWebViewActivity) {
        }

        @Override // defpackage.z4m
        public void Q0(ShareConfirmActivity shareConfirmActivity) {
        }

        @Override // defpackage.ls0
        public void Q1(AddHabitActivity addHabitActivity) {
        }

        @Override // defpackage.n94
        public void Q2(CompanyUserWebViewActivity companyUserWebViewActivity) {
        }

        public MainTab Q3() {
            return ds6.a(h3());
        }

        @Override // defpackage.aw2
        public void R(BloodGlucoseAGPLand bloodGlucoseAGPLand) {
        }

        @Override // defpackage.prb
        public void R0(HealthConnectPrivacyActivity healthConnectPrivacyActivity) {
        }

        @Override // defpackage.uvd
        public void R1(JumpingActivity jumpingActivity) {
        }

        @Override // defpackage.th1
        public void R2(AppSpecificDataManagementActivity appSpecificDataManagementActivity) {
        }

        public Set<MainTab> R3() {
            return ImmutableSet.of(O3(), Q3(), N3(), P3());
        }

        @Override // defpackage.yy3
        public void S(ClaimRecordsActivity claimRecordsActivity) {
        }

        @Override // defpackage.vx3
        public void S0(CityMedalListActivity cityMedalListActivity) {
        }

        @Override // defpackage.gq0
        public void S1(AddDeviceActivity addDeviceActivity) {
        }

        @Override // defpackage.edr
        public void S2(WechatDeviceActivity wechatDeviceActivity) {
            K3(wechatDeviceActivity);
        }

        @Override // defpackage.mo4
        public void T(CourseAudioActivity courseAudioActivity) {
        }

        @Override // defpackage.abo
        public void T0(StandTimesGoalActivity standTimesGoalActivity) {
        }

        @Override // defpackage.zyd
        public void T1(JustDanceShareWebViewActivity justDanceShareWebViewActivity) {
        }

        @Override // defpackage.yqf
        public void T2(MessageCenterActivity messageCenterActivity) {
        }

        @Override // defpackage.pgq
        public void U(com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity userIndicatorsActivity) {
        }

        @Override // defpackage.tn
        public void U0(AbilityPlanQuestionActivity abilityPlanQuestionActivity) {
        }

        @Override // defpackage.d1r
        public void U1(VisitorWeightActivity visitorWeightActivity) {
        }

        @Override // defpackage.k2b
        public void U2(GoalSwitchGuidPageActivity goalSwitchGuidPageActivity) {
        }

        @Override // defpackage.ffb
        public void V(HabitListActivity habitListActivity) {
        }

        @Override // defpackage.ot0
        public void V0(AddShareActivity addShareActivity) {
        }

        @Override // defpackage.kd4
        public void V1(ConfigWifiActivity configWifiActivity) {
        }

        @Override // defpackage.pw7
        public void V2(EcoRoutingActivity ecoRoutingActivity) {
        }

        @Override // defpackage.qjh
        public void W(PairGuideActivity pairGuideActivity) {
        }

        @Override // defpackage.nug
        public void W0(NoDataSharedActivity noDataSharedActivity) {
        }

        @Override // defpackage.el7
        public void W1(EcoCourseAudioActivity ecoCourseAudioActivity) {
        }

        @Override // defpackage.eff
        public void W2(MedalListActivity medalListActivity) {
        }

        @Override // defpackage.k3f
        public void X(ManagerActivity managerActivity) {
        }

        @Override // defpackage.hfg
        public void X0(MyTrackLibraryActivity myTrackLibraryActivity) {
        }

        @Override // defpackage.g8k
        public void X1(RecordMainActivity recordMainActivity) {
        }

        @Override // defpackage.tfq
        public void X2(UserFeedbackActivity userFeedbackActivity) {
        }

        @Override // defpackage.efk
        public void Y(RelativeCareHomePageActivity relativeCareHomePageActivity) {
        }

        @Override // dagger.hilt.android.internal.managers.a.InterfaceC0910a
        public d5a Y0() {
            return new f(this.d, this.e, this.f);
        }

        @Override // defpackage.jj2
        public void Y1(BindBleDeviceDeviceActivity bindBleDeviceDeviceActivity) {
            l3(bindBleDeviceDeviceActivity);
        }

        @Override // defpackage.f40
        public void Y2(AccessDeviceManagerActivity accessDeviceManagerActivity) {
        }

        @Override // defpackage.on4
        public void Z(CourseAllCatalogActivity courseAllCatalogActivity) {
        }

        @Override // defpackage.q9d
        public void Z0(IndoorRunningActivity indoorRunningActivity) {
            z3(indoorRunningActivity);
        }

        @Override // defpackage.wwh
        public void Z1(PinganHealthCareWebViewActivity pinganHealthCareWebViewActivity) {
        }

        @Override // defpackage.vy5
        public void Z2(DeleteDeviceFromWechatActivity deleteDeviceFromWechatActivity) {
        }

        @Override // xx5.a
        public xx5.c a() {
            return yx5.a(j3(), new m(this.d, this.e));
        }

        @Override // defpackage.jjj
        public void a0(RecognizeSettingActivity recognizeSettingActivity) {
        }

        @Override // defpackage.m54
        public void a1(com.xiaomi.fitness.baseui.common.CommonBaseActivity commonBaseActivity) {
        }

        @Override // defpackage.e4m
        public void a2(ShareCaloConsumActivity shareCaloConsumActivity) {
        }

        @Override // defpackage.dgb
        public void a3(HabitPlanHistoryRecordListActivity habitPlanHistoryRecordListActivity) {
        }

        @Override // defpackage.w9m
        public void b(ShareSportTargetActivity shareSportTargetActivity) {
        }

        @Override // defpackage.vc7
        public void b0(EcgWebViewActivity ecgWebViewActivity) {
            t3(ecgWebViewActivity);
        }

        @Override // defpackage.syk
        public void b1(RouteDetailActivity routeDetailActivity) {
        }

        @Override // defpackage.tl2
        public void b2(BindHuaMiDeviceDeviceActivity bindHuaMiDeviceDeviceActivity) {
            n3(bindHuaMiDeviceDeviceActivity);
        }

        @Override // defpackage.q9i
        public void b3(PrivacyActivity privacyActivity) {
        }

        @Override // defpackage.jjb
        public void c(HabitTodayActivity habitTodayActivity) {
        }

        @Override // defpackage.g5c
        public void c0(HeartRateActivity heartRateActivity) {
        }

        @Override // defpackage.mp4
        public void c1(CourseCatalogActivity courseCatalogActivity) {
        }

        @Override // defpackage.yo5
        public void c2(DataSharedToTAActivity dataSharedToTAActivity) {
        }

        @Override // defpackage.xqa
        public void c3(FtpActivity ftpActivity) {
        }

        @Override // defpackage.oph
        public void d(PaymentOrderPageListActivity paymentOrderPageListActivity) {
        }

        @Override // defpackage.eyd
        public void d0(JustDanceLaunchActivity justDanceLaunchActivity) {
        }

        @Override // defpackage.kan
        public void d1(SportBeanModeWearGuideActivity sportBeanModeWearGuideActivity) {
        }

        @Override // defpackage.vpm
        public void d2(SleepLandScapeActivity sleepLandScapeActivity) {
        }

        @Override // defpackage.k54
        public void d3(com.xiaomi.fitness.devicesettings.base.CommonBaseActivity commonBaseActivity) {
        }

        @Override // defpackage.m6c
        public void e(HeartRateReportActivity heartRateReportActivity) {
        }

        @Override // defpackage.m4b
        public void e0(GuideActivity guideActivity) {
            x3(guideActivity);
        }

        @Override // defpackage.ybb
        public void e1(GymLaunchEcoSportActivity gymLaunchEcoSportActivity) {
        }

        @Override // defpackage.lbd
        public void e2(InputXiaomiAccountActivity inputXiaomiAccountActivity) {
        }

        @Override // defpackage.yn5
        public void e3(DataRequestedByTAActivity dataRequestedByTAActivity) {
        }

        @Override // defpackage.dl7
        public void f(com.mi.health.course.eco.activity.EcoCourseAudioActivity ecoCourseAudioActivity) {
        }

        @Override // defpackage.mnf
        public void f0(MedicalIdHomeActivity medicalIdHomeActivity) {
        }

        @Override // defpackage.y8b
        public void f1(GuidePersonalizeActivity guidePersonalizeActivity) {
        }

        @Override // defpackage.c5b
        public void f2(GuideEditHeightActivity guideEditHeightActivity) {
        }

        @Override // defpackage.n3e
        public void f3(LaunchSportActivity launchSportActivity) {
        }

        @Override // defpackage.p9d
        public void g(com.xiaomi.fitness.sport_eco.view.sporting.IndoorRunningActivity indoorRunningActivity) {
        }

        @Override // defpackage.nio
        public void g0(StravaAccessActivity stravaAccessActivity) {
        }

        @Override // defpackage.mer
        public void g1(WeightActivity weightActivity) {
        }

        @Override // defpackage.i8c
        public void g2(HistoryActivity historyActivity) {
        }

        public DeviceTabFragmentV4 g3() {
            return r3(tr6.a(this.d.v.get(), this.d.Z.get()));
        }

        @Override // defpackage.dra
        public void h(FtpTestHistoryActivity ftpTestHistoryActivity) {
        }

        @Override // defpackage.x1b
        public void h0(GoalManagerActivity goalManagerActivity) {
        }

        @Override // defpackage.mra
        public void h1(FtpTestIntroduceActivity ftpTestIntroduceActivity) {
            v3(ftpTestIntroduceActivity);
        }

        @Override // defpackage.zfd
        public void h2(IntervalTrainingActivity intervalTrainingActivity) {
            A3(intervalTrainingActivity);
        }

        public DeviceTabParentFragmentV4 h3() {
            return s3(ns6.a());
        }

        @Override // defpackage.ri
        public void i(AbilityPlanDateActivity abilityPlanDateActivity) {
        }

        @Override // defpackage.dbh
        public void i0(OpenPolicyAccessActivity openPolicyAccessActivity) {
        }

        @Override // defpackage.mzh
        public void i1(PlanCourseListActivity planCourseListActivity) {
        }

        @Override // defpackage.xlo
        public void i2(StubActivity stubActivity) {
        }

        public Set<DeviceTabInfoProvider> i3() {
            return ImmutableSet.of((OtherDeviceTabFragmentV4) g3(), M3());
        }

        @Override // defpackage.pb3
        public void j(CalorieGoalActivity calorieGoalActivity) {
        }

        @Override // defpackage.ayh
        public void j0(PkHistoryDetailActivity pkHistoryDetailActivity) {
        }

        @Override // defpackage.gm2
        public void j1(BindLocalDeviceActivity bindLocalDeviceActivity) {
        }

        @Override // defpackage.kmp
        public void j2(TrackDetailActivity trackDetailActivity) {
        }

        public Map<Class<?>, Boolean> j3() {
            return hee.a(ImmutableMap.builderWithExpectedSize(262).g(lt.f25407a, Boolean.valueOf(ss.a())).g(bz.f4737a, Boolean.valueOf(zy.a())).g(qz.f31993a, Boolean.valueOf(oz.a())).g(h30.f19637a, Boolean.valueOf(f30.a())).g(r40.f32165a, Boolean.valueOf(p40.a())).g(j70.f22475a, Boolean.valueOf(h70.a())).g(of0.f29096a, Boolean.valueOf(mf0.a())).g(kg0.f23811a, Boolean.valueOf(ig0.a())).g(zp0.f41533a, Boolean.valueOf(xp0.a())).g(rq0.f32782a, Boolean.valueOf(pq0.a())).g(ur0.f36039a, Boolean.valueOf(sr0.a())).g(zs0.f41617a, Boolean.valueOf(xs0.a())).g(wg1.f37932a, Boolean.valueOf(ug1.a())).g(lh1.f25059a, Boolean.valueOf(jh1.a())).g(ss1.f33931a, Boolean.valueOf(qs1.a())).g(ey1.f17179a, Boolean.valueOf(cy1.a())).g(nz1.f28581a, Boolean.valueOf(lz1.a())).g(z72.f40969a, Boolean.valueOf(x72.a())).g(cg2.f5299a, Boolean.valueOf(ag2.a())).g(sg2.f33604a, Boolean.valueOf(qg2.a())).g(nl2.f28030a, Boolean.valueOf(ll2.a())).g(xl2.f39226a, Boolean.valueOf(vl2.a())).g(pm2.f30532a, Boolean.valueOf(lm2.a())).g(om2.f29286a, Boolean.valueOf(km2.a())).g(mn2.f27020a, Boolean.valueOf(kn2.a())).g(qo2.f31688a, Boolean.valueOf(oo2.a())).g(vo2.f37078a, Boolean.valueOf(to2.a())).g(kr2.f24205a, Boolean.valueOf(ir2.a())).g(ft2.f18173a, Boolean.valueOf(dt2.a())).g(eu2.f17067a, Boolean.valueOf(cu2.a())).g(iu2.f22090a, Boolean.valueOf(gu2.a())).g(uu2.f36142a, Boolean.valueOf(su2.a())).g(hy2.f20590a, Boolean.valueOf(fy2.a())).g(y03.f39632a, Boolean.valueOf(w03.a())).g(ua3.f35559a, Boolean.valueOf(sa3.a())).g(kl3.f23959a, Boolean.valueOf(il3.a())).g(vn3.f37051a, Boolean.valueOf(tn3.a())).g(po3.f30579a, Boolean.valueOf(no3.a())).g(op3.f29355a, Boolean.valueOf(mp3.a())).g(dq3.f15801a, Boolean.valueOf(bq3.a())).g(rq3.f32785a, Boolean.valueOf(pq3.a())).g(lr3.f25366a, Boolean.valueOf(jr3.a())).g(uz3.f36297a, Boolean.valueOf(sz3.a())).g(n24.f27465a, Boolean.valueOf(l24.a())).g(h84.f19795a, Boolean.valueOf(f84.a())).g(gl4.f19098a, Boolean.valueOf(el4.a())).g(nm4.f28061a, Boolean.valueOf(lm4.a())).g(ro4.f32740a, Boolean.valueOf(po4.a())).g(tp4.f34905a, Boolean.valueOf(rp4.a())).g(eq4.f16951a, Boolean.valueOf(cq4.a())).g(cr4.f14637a, Boolean.valueOf(ar4.a())).g(tr4.f34955a, Boolean.valueOf(rr4.a())).g(wt4.f38330a, Boolean.valueOf(ut4.a())).g(fv4.f18279a, Boolean.valueOf(dv4.a())).g(yw4.f40633a, Boolean.valueOf(ww4.a())).g(jx4.f23212a, Boolean.valueOf(hx4.a())).g(cz4.f14881a, Boolean.valueOf(az4.a())).g(k05.f23288a, Boolean.valueOf(i05.a())).g(v05.f36339a, Boolean.valueOf(t05.a())).g(x25.f38599a, Boolean.valueOf(v25.a())).g(f45.f17382a, Boolean.valueOf(d45.a())).g(i65.f20826a, Boolean.valueOf(g65.a())).g(u65.f35448a, Boolean.valueOf(s65.a())).g(f75.f17485a, Boolean.valueOf(d75.a())).g(q75.f31191a, Boolean.valueOf(o75.a())).g(l85.f24762a, Boolean.valueOf(j85.a())).g(x85.f38837a, Boolean.valueOf(v85.a())).g(ab5.f848a, Boolean.valueOf(ya5.a())).g(cc5.f5177a, Boolean.valueOf(ac5.a())).g(hc5.f19927a, Boolean.valueOf(fc5.a())).g(pf5.f30345a, Boolean.valueOf(nf5.a())).g(em5.f16801a, Boolean.valueOf(cm5.a())).g(sn5.f33803a, Boolean.valueOf(qn5.a())).g(g46.f18575a, Boolean.valueOf(e46.a())).g(f56.f17417a, Boolean.valueOf(d56.a())).g(b76.f3878a, Boolean.valueOf(z66.a())).g(c96.f5070a, Boolean.valueOf(a96.a())).g(wc6.f37833a, Boolean.valueOf(uc6.a())).g(mo6.f27042a, Boolean.valueOf(ko6.a())).g(ip6.f21969a, Boolean.valueOf(gp6.a())).g(us6.f36079a, Boolean.valueOf(ss6.a())).g(cu6.f14719a, Boolean.valueOf(au6.a())).g(lw6.f25487a, Boolean.valueOf(jw6.a())).g(r27.f32104a, Boolean.valueOf(p27.a())).g(tc7.f34560a, Boolean.valueOf(rc7.a())).g(xh7.f39120a, Boolean.valueOf(vh7.a())).g(ol7.f29265a, Boolean.valueOf(kl7.a())).g(nl7.f28033a, Boolean.valueOf(jl7.a())).g(vn7.f37054a, Boolean.valueOf(rn7.a())).g(un7.f35946a, Boolean.valueOf(qn7.a())).g(bp7.f4444a, Boolean.valueOf(zo7.a())).g(qq7.f31740a, Boolean.valueOf(mq7.a())).g(pq7.f30638a, Boolean.valueOf(lq7.a())).g(nw7.f28501a, Boolean.valueOf(lw7.a())).g(g88.f18711a, Boolean.valueOf(e88.a())).g(jb8.f22613a, Boolean.valueOf(hb8.a())).g(tn8.f34867a, Boolean.valueOf(rn8.a())).g(ho8.f20283a, Boolean.valueOf(fo8.a())).g(qp8.f31713a, Boolean.valueOf(op8.a())).g(or8.f29416a, Boolean.valueOf(mr8.a())).g(xt8.f39449a, Boolean.valueOf(vt8.a())).g(pu8.f30786a, Boolean.valueOf(nu8.a())).g(dw8.f15986a, Boolean.valueOf(bw8.a())).g(pw8.f30853a, Boolean.valueOf(nw8.a())).g(hy8.f20605a, Boolean.valueOf(fy8.a())).g(k49.f23418a, Boolean.valueOf(i49.a())).g(w49.f37605a, Boolean.valueOf(u49.a())).g(n69.f27589a, Boolean.valueOf(l69.a())).g(x99.f38885a, Boolean.valueOf(v99.a())).g(vj9.f36945a, Boolean.valueOf(tj9.a())).g(kk9.f23944a, Boolean.valueOf(ik9.a())).g(uk9.f35865a, Boolean.valueOf(sk9.a())).g(vqa.f37130a, Boolean.valueOf(tqa.a())).g(hra.f20367a, Boolean.valueOf(fra.a())).g(qra.f31766a, Boolean.valueOf(ora.a())).g(csa.f14671a, Boolean.valueOf(asa.a())).g(hsa.f20402a, Boolean.valueOf(fsa.a())).g(qta.f31826a, Boolean.valueOf(ota.a())).g(m1b.f25647a, Boolean.valueOf(k1b.a())).g(h2b.f19605a, Boolean.valueOf(f2b.a())).g(n2b.f27471a, Boolean.valueOf(l2b.a())).g(s6b.f33340a, Boolean.valueOf(q6b.a())).g(f7b.f17491a, Boolean.valueOf(d7b.a())).g(t9b.f34475a, Boolean.valueOf(r9b.a())).g(z9b.f41044a, Boolean.valueOf(x9b.a())).g(gab.f18777a, Boolean.valueOf(eab.a())).g(shb.f33637a, Boolean.valueOf(qhb.a())).g(uib.f35787a, Boolean.valueOf(sib.a())).g(ujb.f35815a, Boolean.valueOf(sjb.a())).g(ckb.f5420a, Boolean.valueOf(akb.a())).g(lpb.f25297a, Boolean.valueOf(jpb.a())).g(i1c.f20663a, Boolean.valueOf(g1c.a())).g(p3c.f29959a, Boolean.valueOf(n3c.a())).g(p4c.f29986a, Boolean.valueOf(n4c.a())).g(a6c.f683a, Boolean.valueOf(y5c.a())).g(q8c.f31223a, Boolean.valueOf(o8c.a())).g(b9c.f3949a, Boolean.valueOf(z8c.a())).g(vec.f36800a, Boolean.valueOf(tec.a())).g(jfc.f22733a, Boolean.valueOf(hfc.a())).g(clc.f5451a, Boolean.valueOf(alc.a())).g(nlc.f28037a, Boolean.valueOf(llc.a())).g(zlc.f41430a, Boolean.valueOf(xlc.a())).g(dmc.f15685a, Boolean.valueOf(bmc.a())).g(nmc.f28069a, Boolean.valueOf(lmc.a())).g(k8d.f23586a, Boolean.valueOf(i8d.a())).g(w9d.f37745a, Boolean.valueOf(u9d.a())).g(dad.f15304a, Boolean.valueOf(bad.a())).g(hbd.f19904a, Boolean.valueOf(fbd.a())).g(mgd.f26138a, Boolean.valueOf(kgd.a())).g(wgd.f37941a, Boolean.valueOf(ugd.a())).g(zgd.f41250a, Boolean.valueOf(xgd.a())).g(jid.f22830a, Boolean.valueOf(hid.a())).g(fkd.f17871a, Boolean.valueOf(dkd.a())).g(wmd.f38127a, Boolean.valueOf(umd.a())).g(hnd.f20259a, Boolean.valueOf(fnd.a())).g(ivd.f22131a, Boolean.valueOf(gvd.a())).g(awd.f3511a, Boolean.valueOf(yvd.a())).g(vxd.f37328a, Boolean.valueOf(txd.a())).g(jyd.f23244a, Boolean.valueOf(hyd.a())).g(q5e.f31132a, Boolean.valueOf(m5e.a())).g(p5e.f30014a, Boolean.valueOf(l5e.a())).g(y5e.f39807a, Boolean.valueOf(w5e.a())).g(lre.f25373a, Boolean.valueOf(jre.a())).g(t2f.f34232a, Boolean.valueOf(r2f.a())).g(b3f.f3747a, Boolean.valueOf(z2f.a())).g(v3f.f36438a, Boolean.valueOf(t3f.a())).g(a7f.f712a, Boolean.valueOf(y6f.a())).g(z7f.f40982a, Boolean.valueOf(x7f.a())).g(ycf.f40037a, Boolean.valueOf(wcf.a())).g(uhf.f35761a, Boolean.valueOf(shf.a())).g(qif.f31546a, Boolean.valueOf(oif.a())).g(tnf.f34873a, Boolean.valueOf(rnf.a())).g(krf.f24223a, Boolean.valueOf(irf.a())).g(swf.f34057a, Boolean.valueOf(qwf.a())).g(x3g.f38645a, Boolean.valueOf(v3g.a())).g(l4g.f24659a, Boolean.valueOf(j4g.a())).g(teg.f34621a, Boolean.valueOf(reg.a())).g(wfg.f37921a, Boolean.valueOf(ufg.a())).g(jlg.f22908a, Boolean.valueOf(hlg.a())).g(itg.f22076a, Boolean.valueOf(gtg.a())).g(beh.f4124a, Boolean.valueOf(zdh.a())).g(hjh.f20131a, Boolean.valueOf(fjh.a())).g(fnh.f17956a, Boolean.valueOf(dnh.a())).g(toh.f34893a, Boolean.valueOf(roh.a())).g(wph.f38216a, Boolean.valueOf(uph.a())).g(tvh.f35107a, Boolean.valueOf(rvh.a())).g(rzh.f33098a, Boolean.valueOf(pzh.a())).g(dai.f15314a, Boolean.valueOf(bai.a())).g(thj.f34709a, Boolean.valueOf(rhj.a())).g(zij.f41320a, Boolean.valueOf(xij.a())).g(x7k.f38787a, Boolean.valueOf(v7k.a())).g(k8k.f23597a, Boolean.valueOf(i8k.a())).g(sck.f33508a, Boolean.valueOf(qck.a())).g(adk.f905a, Boolean.valueOf(yck.a())).g(mdk.f26041a, Boolean.valueOf(kdk.a())).g(ogk.f29148a, Boolean.valueOf(kgk.a())).g(ngk.f27911a, Boolean.valueOf(jgk.a())).g(eik.f16689a, Boolean.valueOf(cik.a())).g(sik.f33682a, Boolean.valueOf(qik.a())).g(mlk.f26984a, Boolean.valueOf(klk.a())).g(e2l.f16198a, Boolean.valueOf(c2l.a())).g(k2l.f23366a, Boolean.valueOf(i2l.a())).g(y2l.f39719a, Boolean.valueOf(w2l.a())).g(o3l.f28702a, Boolean.valueOf(m3l.a())).g(x4l.f38693a, Boolean.valueOf(v4l.a())).g(w8l.f37724a, Boolean.valueOf(u8l.a())).g(qdl.f31416a, Boolean.valueOf(odl.a())).g(nql.f28266a, Boolean.valueOf(lql.a())).g(bsl.f4568a, Boolean.valueOf(zrl.a())).g(n4m.f27546a, Boolean.valueOf(l4m.a())).g(s9m.f33434a, Boolean.valueOf(q9m.a())).g(plm.f30526a, Boolean.valueOf(nlm.a())).g(tom.f34896a, Boolean.valueOf(rom.a())).g(sqm.f33893a, Boolean.valueOf(qqm.a())).g(ttm.f35032a, Boolean.valueOf(rtm.a())).g(rum.f32921a, Boolean.valueOf(pum.a())).g(vum.f37239a, Boolean.valueOf(tum.a())).g(zvm.f41720a, Boolean.valueOf(xvm.a())).g(fym.f18379a, Boolean.valueOf(dym.a())).g(mym.f27354a, Boolean.valueOf(kym.a())).g(o1n.f28649a, Boolean.valueOf(m1n.a())).g(c7n.f5022a, Boolean.valueOf(a7n.a())).g(c9n.f5089a, Boolean.valueOf(a9n.a())).g(pqn.f30652a, Boolean.valueOf(lqn.a())).g(oqn.f29396a, Boolean.valueOf(kqn.a())).g(p1o.f29918a, Boolean.valueOf(n1o.a())).g(o4o.f28735a, Boolean.valueOf(m4o.a())).g(u5o.f35435a, Boolean.valueOf(s5o.a())).g(dao.f15321a, Boolean.valueOf(bao.a())).g(gbo.f18814a, Boolean.valueOf(ebo.a())).g(zko.f41409a, Boolean.valueOf(xko.a())).g(fto.f18235a, Boolean.valueOf(dto.a())).g(h2p.f19623a, Boolean.valueOf(f2p.a())).g(a4p.f615a, Boolean.valueOf(y3p.a())).g(q4p.f31102a, Boolean.valueOf(o4p.a())).g(z9p.f41054a, Boolean.valueOf(x9p.a())).g(xap.f38922a, Boolean.valueOf(vap.a())).g(cbp.f5169a, Boolean.valueOf(abp.a())).g(idp.f21036a, Boolean.valueOf(gdp.a())).g(odp.f29044a, Boolean.valueOf(mdp.a())).g(pmp.f30547a, Boolean.valueOf(nmp.a())).g(ytp.f40531a, Boolean.valueOf(wtp.a())).g(mwp.f27298a, Boolean.valueOf(kwp.a())).g(exp.f17168a, Boolean.valueOf(cxp.a())).g(wxp.f38467a, Boolean.valueOf(uxp.a())).g(kzp.f24460a, Boolean.valueOf(izp.a())).g(wzp.f38526a, Boolean.valueOf(uzp.a())).g(x3q.f38656a, Boolean.valueOf(v3q.a())).g(ofq.f29121a, Boolean.valueOf(mfq.a())).g(bgq.f4193a, Boolean.valueOf(zfq.a())).g(vhq.f36911a, Boolean.valueOf(thq.a())).g(jlq.f22913a, Boolean.valueOf(flq.a())).g(ilq.f21282a, Boolean.valueOf(elq.a())).g(zoq.f41528a, Boolean.valueOf(xoq.a())).g(zrq.f41610a, Boolean.valueOf(xrq.a())).g(d0r.f14939a, Boolean.valueOf(b0r.a())).g(m2r.f25690a, Boolean.valueOf(k2r.a())).g(gcr.f18842a, Boolean.valueOf(ecr.a())).g(qhr.f31533a, Boolean.valueOf(ohr.a())).g(ejr.f16716a, Boolean.valueOf(cjr.a())).g(hjr.f20140a, Boolean.valueOf(fjr.a())).g(tzr.f35230a, Boolean.valueOf(rzr.a())).a());
        }

        @Override // defpackage.kld
        public void k(IssuerActivity issuerActivity) {
            B3(issuerActivity);
        }

        @Override // defpackage.wn6
        public void k0(DeviceShareActivity deviceShareActivity) {
        }

        @Override // defpackage.lhk
        public void k1(RelativeDataSettingsActivity relativeDataSettingsActivity) {
        }

        @Override // defpackage.x0m
        public void k2(SettingActivity settingActivity) {
            H3(settingActivity);
        }

        public HealthV2Fragment k3() {
            return y3(c3c.a());
        }

        @Override // defpackage.w5m
        public void l(ShareMemberActivity shareMemberActivity) {
        }

        @Override // defpackage.u15
        public void l0(CreateRouteActivity createRouteActivity) {
        }

        @Override // defpackage.wb5
        public void l1(CurseSetActivity curseSetActivity) {
        }

        @Override // defpackage.ob7
        public void l2(EcgItemDetailActivity ecgItemDetailActivity) {
        }

        public final BindBleDeviceDeviceActivity l3(BindBleDeviceDeviceActivity bindBleDeviceDeviceActivity) {
            hk2.a(bindBleDeviceDeviceActivity, this.d.g0.get());
            return bindBleDeviceDeviceActivity;
        }

        @Override // defpackage.va5
        public void m(CurseResetActivity curseResetActivity) {
        }

        @Override // defpackage.l28
        public void m0(EditIdentityLabelActivity editIdentityLabelActivity) {
        }

        @Override // defpackage.zs4
        public void m1(CourseInfoActivity courseInfoActivity) {
        }

        @Override // defpackage.mhf
        public void m2(MedalShareActivity medalShareActivity) {
        }

        public final BindHeadphoneDeviceActivity m3(BindHeadphoneDeviceActivity bindHeadphoneDeviceActivity) {
            hk2.a(bindHeadphoneDeviceActivity, this.d.g0.get());
            return bindHeadphoneDeviceActivity;
        }

        @Override // defpackage.ok5
        public void n(DataAccessibleToTAActivity dataAccessibleToTAActivity) {
        }

        @Override // defpackage.stl
        public void n0(SendingInvitationActivity sendingInvitationActivity) {
            G3(sendingInvitationActivity);
        }

        @Override // defpackage.k8c
        public void n1(HistoryDetailActivity historyDetailActivity) {
        }

        @Override // defpackage.rbp
        public void n2(ThirdPartyAuthActivity thirdPartyAuthActivity) {
        }

        public final BindHuaMiDeviceDeviceActivity n3(BindHuaMiDeviceDeviceActivity bindHuaMiDeviceDeviceActivity) {
            hk2.a(bindHuaMiDeviceDeviceActivity, this.d.g0.get());
            return bindHuaMiDeviceDeviceActivity;
        }

        @Override // defpackage.zn9
        public void o(FingerDetectActivity fingerDetectActivity) {
            u3(fingerDetectActivity);
        }

        @Override // defpackage.ufb
        public void o0(HabitPlanDetailActivity habitPlanDetailActivity) {
        }

        @Override // defpackage.lj9
        public void o1(FeedbackQuestionActivity feedbackQuestionActivity) {
        }

        @Override // defpackage.pon
        public void o2(SportHealthServiceActivity sportHealthServiceActivity) {
        }

        public final com.xiaomi.fitness.device.manager.ui.bind.BindLocalDeviceActivity o3(com.xiaomi.fitness.device.manager.ui.bind.BindLocalDeviceActivity bindLocalDeviceActivity) {
            hk2.a(bindLocalDeviceActivity, this.d.g0.get());
            return bindLocalDeviceActivity;
        }

        @Override // defpackage.izh
        public void p(PkProcessDetailActivity pkProcessDetailActivity) {
        }

        @Override // defpackage.ci1
        public void p0(AppUpgradeActivity appUpgradeActivity) {
        }

        @Override // defpackage.sta
        public void p1(FtpV2Activity ftpV2Activity) {
        }

        @Override // defpackage.tzq
        public void p2(VirtualMemberDataActivity virtualMemberDataActivity) {
        }

        public final BindThirdPartyDeviceActivity p3(BindThirdPartyDeviceActivity bindThirdPartyDeviceActivity) {
            hk2.a(bindThirdPartyDeviceActivity, this.d.g0.get());
            return bindThirdPartyDeviceActivity;
        }

        @Override // defpackage.r74
        public void q(CommonSportActivity commonSportActivity) {
            q3(commonSportActivity);
        }

        @Override // defpackage.zcl
        public void q0(ScanDeviceActivity scanDeviceActivity) {
        }

        @Override // defpackage.hm2
        public void q1(com.xiaomi.fitness.device.manager.ui.bind.BindLocalDeviceActivity bindLocalDeviceActivity) {
            o3(bindLocalDeviceActivity);
        }

        @Override // defpackage.t25
        public void q2(CreateRouteDetailActivity createRouteDetailActivity) {
        }

        public final CommonSportActivity q3(CommonSportActivity commonSportActivity) {
            ae2.a(commonSportActivity, new SportMusicManager());
            return commonSportActivity;
        }

        @Override // defpackage.qy
        public void r(AboutActivity aboutActivity) {
        }

        @Override // defpackage.shr
        public void r0(WelcomeActivity welcomeActivity) {
        }

        @Override // defpackage.aq7
        public void r1(EcoCourseVideoActivity ecoCourseVideoActivity) {
        }

        @Override // defpackage.i1b
        public void r2(GoalGuidPageActivity goalGuidPageActivity) {
        }

        public final DeviceTabFragmentV4 r3(DeviceTabFragmentV4 deviceTabFragmentV4) {
            vr6.a(deviceTabFragmentV4, new BaseMainFragmentDelegateImpl());
            return deviceTabFragmentV4;
        }

        @Override // defpackage.uy4
        public void s(CourseVideoActivity courseVideoActivity) {
        }

        @Override // defpackage.icb
        public void s0(GymLaunchSportActivity gymLaunchSportActivity) {
        }

        @Override // defpackage.o4l
        public void s1(RunningRouteListActivity runningRouteListActivity) {
        }

        @Override // defpackage.sy
        public void s2(AboutDeviceActivity aboutDeviceActivity) {
        }

        public final DeviceTabParentFragmentV4 s3(DeviceTabParentFragmentV4 deviceTabParentFragmentV4) {
            e92.a(deviceTabParentFragmentV4, new BaseMainFragmentDelegateImpl());
            ps6.a(deviceTabParentFragmentV4, i3());
            return deviceTabParentFragmentV4;
        }

        @Override // defpackage.nhb
        public void t(HabitPlanSuggestActivity habitPlanSuggestActivity) {
        }

        @Override // defpackage.g2l
        public void t0(RunningPostureActivity runningPostureActivity) {
            F3(runningPostureActivity);
        }

        @Override // defpackage.umh
        public void t1(PayChannelActivity payChannelActivity) {
        }

        @Override // defpackage.ihm
        public void t2(SleepAnimalShareActivity sleepAnimalShareActivity) {
        }

        public final EcgWebViewActivity t3(EcgWebViewActivity ecgWebViewActivity) {
            wc7.a(ecgWebViewActivity, this.d.A2.get());
            return ecgWebViewActivity;
        }

        @Override // defpackage.zwd
        public void u(JustDanceControlActivity justDanceControlActivity) {
        }

        @Override // defpackage.weq
        public void u0(UserAddActivity userAddActivity) {
        }

        @Override // defpackage.sx4
        public void u1(CourseSeriseInfoActivity courseSeriseInfoActivity) {
        }

        @Override // defpackage.sw4
        public void u2(CourseSearchActivity courseSearchActivity) {
        }

        public final FingerDetectActivity u3(FingerDetectActivity fingerDetectActivity) {
            ao9.a(fingerDetectActivity, this.d.R0.get());
            return fingerDetectActivity;
        }

        @Override // defpackage.f05
        public void v(CourseVipTranslucentActivity courseVipTranslucentActivity) {
        }

        @Override // defpackage.rx1
        public void v0(BalanceWeightActivity balanceWeightActivity) {
        }

        @Override // defpackage.jmf
        public void v1(MedicalIdAddEmergencyContactActivity medicalIdAddEmergencyContactActivity) {
        }

        @Override // defpackage.fl
        public void v2(AbilityPlanDetailActivity abilityPlanDetailActivity) {
        }

        public final FtpTestIntroduceActivity v3(FtpTestIntroduceActivity ftpTestIntroduceActivity) {
            nra.a(ftpTestIntroduceActivity, this.d.S.get());
            return ftpTestIntroduceActivity;
        }

        @Override // defpackage.yqo
        public void w(SuuntoAccessActivity suuntoAccessActivity) {
        }

        @Override // defpackage.tz4
        public void w0(CourseVipActivity courseVipActivity) {
        }

        @Override // defpackage.k61
        public void w1(AlipayActivity alipayActivity) {
        }

        @Override // defpackage.yyn
        public void w2(SportReportShareActivity sportReportShareActivity) {
        }

        public final FtpTestResultActivity w3(FtpTestResultActivity ftpTestResultActivity) {
            wra.a(ftpTestResultActivity, this.d.S.get());
            return ftpTestResultActivity;
        }

        @Override // defpackage.whd
        public void x(InviteReceiveActivity inviteReceiveActivity) {
        }

        @Override // defpackage.rbr
        public void x0(WebViewActivity webViewActivity) {
        }

        @Override // defpackage.vra
        public void x1(FtpTestResultActivity ftpTestResultActivity) {
            w3(ftpTestResultActivity);
        }

        @Override // defpackage.t3c
        public void x2(HealthWebViewActivity healthWebViewActivity) {
        }

        public final GuideActivity x3(GuideActivity guideActivity) {
            n4b.a(guideActivity, this.e.d.get());
            return guideActivity;
        }

        @Override // defpackage.azh
        public void y(PkListActivity pkListActivity) {
        }

        @Override // defpackage.koh
        public void y0(PayResultActivity payResultActivity) {
        }

        @Override // defpackage.xzh
        public void y1(PlanHistoryListActivity planHistoryListActivity) {
        }

        @Override // defpackage.ij2
        public void y2(com.xiaomi.fitness.eco.device.manager.ui.bind.BindBleDeviceDeviceActivity bindBleDeviceDeviceActivity) {
        }

        public final HealthV2Fragment y3(HealthV2Fragment healthV2Fragment) {
            e92.a(healthV2Fragment, new BaseMainFragmentDelegateImpl());
            return healthV2Fragment;
        }

        @Override // defpackage.zp7
        public void z(com.mi.health.course.eco.activity.EcoCourseVideoActivity ecoCourseVideoActivity) {
        }

        @Override // defpackage.iy4
        public void z0(CourseSmartHrActivity courseSmartHrActivity) {
        }

        @Override // defpackage.t4b
        public void z1(GuideEditBirthdayActivity guideEditBirthdayActivity) {
        }

        @Override // defpackage.p4b
        public void z2(GuideBodyCompositionFinishActivity guideBodyCompositionFinishActivity) {
        }

        public final IndoorRunningActivity z3(IndoorRunningActivity indoorRunningActivity) {
            ae2.a(indoorRunningActivity, new SportMusicManager());
            return indoorRunningActivity;
        }
    }

    public static final class c implements qn0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u9l f11487b;

        @Override // defpackage.qn0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public qo9 build() {
            f6i.a(this.f11487b, u9l.class);
            return new d(this.f11486a, this.f11487b);
        }

        @Override // defpackage.qn0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a(u9l u9lVar) {
            this.f11487b = (u9l) f6i.b(u9lVar);
            return this;
        }

        public c(j jVar) {
            this.f11486a = jVar;
        }
    }

    public static final class d extends qo9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11489b = this;
        public dei<tn0> c;
        public dei<GuideNavigator> d;

        /* JADX INFO: renamed from: com.xiaomi.fitness.a$d$a, reason: collision with other inner class name */
        public static final class C0373a<T> implements dei<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f11490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f11491b;
            public final int c;

            public C0373a(j jVar, d dVar, int i) {
                this.f11490a = jVar;
                this.f11491b = dVar;
                this.c = i;
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.c;
                if (i == 0) {
                    return (T) sn0.a();
                }
                if (i == 1) {
                    return (T) new GuideNavigator();
                }
                throw new AssertionError(this.c);
            }
        }

        public d(j jVar, u9l u9lVar) {
            this.f11488a = jVar;
            c(u9lVar);
        }

        @Override // hi0.a
        public gi0 a() {
            return new C0372a(this.f11488a, this.f11489b);
        }

        @Override // rn0.d
        public tn0 b() {
            return this.c.get();
        }

        public final void c(u9l u9lVar) {
            this.c = u27.c(new C0373a(this.f11488a, this.f11489b, 0));
            this.d = u27.c(new C0373a(this.f11488a, this.f11489b, 1));
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public si1 f11492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CourseScheduleSingleModule f11493b;
        public GoalNotifySingleModule c;
        public HttpClientModule d;
        public MiuiFunctionModule e;
        public NetProxyModule f;
        public SmartModule g;
        public SummaryModule h;
        public TrainingModule i;

        public e a(si1 si1Var) {
            this.f11492a = (si1) f6i.b(si1Var);
            return this;
        }

        public to9 b() {
            f6i.a(this.f11492a, si1.class);
            if (this.f11493b == null) {
                this.f11493b = new CourseScheduleSingleModule();
            }
            if (this.c == null) {
                this.c = new GoalNotifySingleModule();
            }
            if (this.d == null) {
                this.d = new HttpClientModule();
            }
            if (this.e == null) {
                this.e = new MiuiFunctionModule();
            }
            if (this.f == null) {
                this.f = new NetProxyModule();
            }
            if (this.g == null) {
                this.g = new SmartModule();
            }
            if (this.h == null) {
                this.h = new SummaryModule();
            }
            if (this.i == null) {
                this.i = new TrainingModule();
            }
            return new j(this.f11492a, this.f11493b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public e() {
        }
    }

    public static final class f implements d5a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11495b;
        public final b c;
        public Fragment d;

        @Override // defpackage.d5a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ro9 build() {
            f6i.a(this.d, Fragment.class);
            return new g(this.f11494a, this.f11495b, this.c, this.d);
        }

        @Override // defpackage.d5a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public f a(Fragment fragment) {
            this.d = (Fragment) f6i.b(fragment);
            return this;
        }

        public f(j jVar, d dVar, b bVar) {
            this.f11494a = jVar;
            this.f11495b = dVar;
            this.c = bVar;
        }
    }

    public static final class g extends ro9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11497b;
        public final b c;
        public final g d = this;

        public g(j jVar, d dVar, b bVar, Fragment fragment) {
            this.f11496a = jVar;
            this.f11497b = dVar;
            this.c = bVar;
        }

        @Override // defpackage.ep8
        public void A(FaceDesignerFragment faceDesignerFragment) {
        }

        @Override // defpackage.vzq
        public void A0(VirtualMemberDayFragment virtualMemberDayFragment) {
        }

        @Override // defpackage.jc7
        public void A1(EcgSubmitAnalyzeResultFragment ecgSubmitAnalyzeResultFragment) {
        }

        @Override // defpackage.ikm
        public void A2(SleepDayItemRFragment sleepDayItemRFragment) {
        }

        public final GuideWearInstructionFragment A3(GuideWearInstructionFragment guideWearInstructionFragment) {
            w9b.a(guideWearInstructionFragment, this.f11497b.d.get());
            return guideWearInstructionFragment;
        }

        @Override // defpackage.i1g
        public void B(MineFragment mineFragment) {
            E3(mineFragment);
        }

        @Override // defpackage.j8n
        public void B0(Spo2MonthItemFragment spo2MonthItemFragment) {
        }

        @Override // defpackage.rvm
        public void B1(SleepRhythmSleepChatAllFragment sleepRhythmSleepChatAllFragment) {
        }

        @Override // defpackage.nvm
        public void B2(SleepRhythmRemindSettingFragment sleepRhythmRemindSettingFragment) {
        }

        public final GuideWebViewFragment B3(GuideWebViewFragment guideWebViewFragment) {
            dab.a(guideWebViewFragment, this.f11497b.d.get());
            return guideWebViewFragment;
        }

        @Override // defpackage.fu2
        public void C(BleSmsReplyFragment bleSmsReplyFragment) {
        }

        @Override // defpackage.g1g
        public void C0(MineFragmentV4 mineFragmentV4) {
            F3(mineFragmentV4);
        }

        @Override // defpackage.alo
        public void C1(StressWeekItemFragment stressWeekItemFragment) {
        }

        @Override // defpackage.u8b
        public void C2(GuideOpenPhoneCallFragment guideOpenPhoneCallFragment) {
            y3(guideOpenPhoneCallFragment);
        }

        public final HealthV2Fragment C3(HealthV2Fragment healthV2Fragment) {
            e92.a(healthV2Fragment, new BaseMainFragmentDelegateImpl());
            return healthV2Fragment;
        }

        @Override // defpackage.zjr
        public void D(WidgetSportListFragment widgetSportListFragment) {
        }

        @Override // defpackage.g4c
        public void D0(HearingDayItemFragment hearingDayItemFragment) {
        }

        @Override // defpackage.fko
        public void D1(StressMonthItemFragment stressMonthItemFragment) {
        }

        @Override // defpackage.yx2
        public void D2(BloodGlucoseRecordDetailFragment bloodGlucoseRecordDetailFragment) {
        }

        public final LanguageSettingFragment D3(LanguageSettingFragment languageSettingFragment) {
            u2e.a(languageSettingFragment, this.f11496a.u.get());
            return languageSettingFragment;
        }

        @Override // defpackage.cab
        public void E(GuideWebViewFragment guideWebViewFragment) {
            B3(guideWebViewFragment);
        }

        @Override // defpackage.wih
        public void E0(PaiRateChartFragment paiRateChartFragment) {
        }

        @Override // defpackage.dwm
        public void E1(SleepRhythmUpToRemoteFragment sleepRhythmUpToRemoteFragment) {
        }

        @Override // defpackage.ldh
        public void E2(OtherDeviceTabFragmentV4 otherDeviceTabFragmentV4) {
        }

        public final MineFragment E3(MineFragment mineFragment) {
            e92.a(mineFragment, new BaseMainFragmentDelegateImpl());
            j1g.c(mineFragment, this.f11496a.z.get());
            j1g.b(mineFragment, this.f11496a.S.get());
            j1g.a(mineFragment, this.f11496a.y2.get());
            return mineFragment;
        }

        @Override // defpackage.e9n
        public void F(Spo2WeekItemRFragment spo2WeekItemRFragment) {
        }

        @Override // defpackage.q1n
        public void F0(SleepWeekItemRFragment sleepWeekItemRFragment) {
        }

        @Override // defpackage.sx2
        public void F1(BloodGlucoseFragment bloodGlucoseFragment) {
        }

        @Override // defpackage.sa8
        public void F2(EnergyMonthItemFragment energyMonthItemFragment) {
        }

        public final MineFragmentV4 F3(MineFragmentV4 mineFragmentV4) {
            e92.a(mineFragmentV4, new BaseMainFragmentDelegateImpl());
            return mineFragmentV4;
        }

        @Override // defpackage.xwe
        public void G(MHStrengthWeekItemRFragment mHStrengthWeekItemRFragment) {
        }

        @Override // defpackage.ner
        public void G0(WeightAddFragment weightAddFragment) {
        }

        @Override // defpackage.pwe
        public void G1(MHStrengthMonthItemFragment mHStrengthMonthItemFragment) {
        }

        @Override // defpackage.jph
        public void G2(PaymentOrderCourseVipListFragment paymentOrderCourseVipListFragment) {
        }

        public final NotifyFragment G3(NotifyFragment notifyFragment) {
            izg.a(notifyFragment, this.f11497b.d.get());
            return notifyFragment;
        }

        @Override // defpackage.zq8
        public void H(FaceDetailFragment faceDetailFragment) {
        }

        @Override // defpackage.la7
        public void H0(EcgAccountAuthLoginFragment ecgAccountAuthLoginFragment) {
        }

        @Override // defpackage.vvm
        public void H1(SleepRhythmSupportDevicesFragment sleepRhythmSupportDevicesFragment) {
        }

        @Override // defpackage.xec
        public void H2(HrmRecordDetailFragment hrmRecordDetailFragment) {
        }

        public final RecordListFragment H3(RecordListFragment recordListFragment) {
            q7k.a(recordListFragment, this.f11496a.L.get());
            return recordListFragment;
        }

        @Override // defpackage.ny2
        public void I(BloodPressureAddFragment bloodPressureAddFragment) {
        }

        @Override // defpackage.rrm
        public void I0(SleepRhythmAllFragment sleepRhythmAllFragment) {
        }

        @Override // defpackage.y2f
        public void I1(ManageHealthFunctionFragment manageHealthFunctionFragment) {
        }

        @Override // defpackage.fkm
        public void I2(SleepDayItemFragment sleepDayItemFragment) {
        }

        public final TargetChartFragment I3(TargetChartFragment targetChartFragment) {
            r0p.a(targetChartFragment, this.f11496a.A.get());
            return targetChartFragment;
        }

        @Override // defpackage.v7n
        public void J(Spo2DayItemRFragment spo2DayItemRFragment) {
        }

        @Override // defpackage.jfo
        public void J0(StepWeekItemFragment stepWeekItemFragment) {
        }

        @Override // defpackage.g99
        public void J1(FallDetectionFragment fallDetectionFragment) {
        }

        @Override // defpackage.m75
        public void J2(CurseListFragment curseListFragment) {
        }

        public final ThirdAppLocalFragment J3(ThirdAppLocalFragment thirdAppLocalFragment) {
            jap.a(thirdAppLocalFragment, this.f11496a.x.get());
            return thirdAppLocalFragment;
        }

        @Override // defpackage.cec
        public void K(HrmFibAbnormalRecordsFragment hrmFibAbnormalRecordsFragment) {
        }

        @Override // defpackage.eb7
        public void K0(EcgFragment ecgFragment) {
        }

        @Override // defpackage.ra7
        public void K1(EcgCheckingQualityFragment ecgCheckingQualityFragment) {
        }

        @Override // defpackage.tih
        public void K2(PaiDayFragment paiDayFragment) {
        }

        public final ThirdAppMarketListFragment K3(ThirdAppMarketListFragment thirdAppMarketListFragment) {
            jap.a(thirdAppMarketListFragment, this.f11496a.x.get());
            return thirdAppMarketListFragment;
        }

        @Override // defpackage.gmc
        public void L(HuamiSpo2SettingFragment huamiSpo2SettingFragment) {
        }

        @Override // defpackage.v66
        public void L0(DeviceInstallAPPDebugFragment deviceInstallAPPDebugFragment) {
        }

        @Override // defpackage.fx2
        public void L1(BloodGlucoseExpandableManualRecordsFragment bloodGlucoseExpandableManualRecordsFragment) {
        }

        @Override // defpackage.erm
        public void L2(SleepQualityDetailFragment sleepQualityDetailFragment) {
        }

        public final WatchAppLayoutSettingFragment L3(WatchAppLayoutSettingFragment watchAppLayoutSettingFragment) {
            y4r.a(watchAppLayoutSettingFragment, this.f11497b.d.get());
            return watchAppLayoutSettingFragment;
        }

        @Override // defpackage.ule
        public void M(LocalSportSettingFragment localSportSettingFragment) {
        }

        @Override // defpackage.lz2
        public void M0(BloodPressureDayItemFragment bloodPressureDayItemFragment) {
        }

        @Override // defpackage.p2p
        public void M1(TemperatureAllRecordsFragment temperatureAllRecordsFragment) {
        }

        @Override // defpackage.qx2
        public void M2(BloodGlucoseFingerWeekItemFragment bloodGlucoseFingerWeekItemFragment) {
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.b
        public uyq N() {
            return new o(this.f11496a, this.f11497b, this.c, this.d);
        }

        @Override // defpackage.rb3
        public void N0(CalorieMonthItemFragment calorieMonthItemFragment) {
        }

        @Override // defpackage.lb3
        public void N1(CalorieDayItemRFragment calorieDayItemRFragment) {
        }

        @Override // defpackage.a13
        public void N2(BloodPressureWeekItemFragment bloodPressureWeekItemFragment) {
        }

        @Override // defpackage.wdo
        public void O(StepDayItemFragment stepDayItemFragment) {
        }

        @Override // defpackage.kum
        public void O0(SleepRhythmMonitorSettingFragment sleepRhythmMonitorSettingFragment) {
        }

        @Override // defpackage.jgd
        public void O1(IntervalTrainingDurationFragment intervalTrainingDurationFragment) {
        }

        @Override // defpackage.qz2
        public void O2(BloodPressureExpandableAllRecordsFragment bloodPressureExpandableAllRecordsFragment) {
        }

        @Override // defpackage.y66
        public void P(DeviceInstallAPPInfoDebugFragment deviceInstallAPPInfoDebugFragment) {
        }

        @Override // defpackage.l7n
        public void P0(Spo2AbnormalChartFragment spo2AbnormalChartFragment) {
        }

        @Override // defpackage.f1b
        public void P1(GoToBedTimeCalibrateFragment goToBedTimeCalibrateFragment) {
        }

        @Override // defpackage.x42
        public void P2(BaseCallNotifyFragment baseCallNotifyFragment) {
        }

        @Override // defpackage.uz2
        public void Q(BloodPressureMonthItemFragment bloodPressureMonthItemFragment) {
        }

        @Override // defpackage.b7b
        public void Q0(GuideOpenKeepAliveSettingFragment guideOpenKeepAliveSettingFragment) {
            x3(guideOpenKeepAliveSettingFragment);
        }

        @Override // defpackage.f0r
        public void Q1(VirtualMemberStatisticsFragment virtualMemberStatisticsFragment) {
        }

        @Override // defpackage.mfr
        public void Q2(WeightDayItemRFragment weightDayItemRFragment) {
        }

        @Override // defpackage.hzg
        public void R(NotifyFragment notifyFragment) {
            G3(notifyFragment);
        }

        @Override // defpackage.fbc
        public void R0(HotspotFragment hotspotFragment) {
        }

        @Override // defpackage.tlc
        public void R1(HuamiSleepSettingFragment huamiSleepSettingFragment) {
        }

        @Override // defpackage.xmq
        public void R2(VO2MaxWeekItemFragment vO2MaxWeekItemFragment) {
        }

        @Override // defpackage.xkp
        public void S(TrackCollectListFragment trackCollectListFragment) {
        }

        @Override // defpackage.n7b
        public void S0(GuideOpenNotificationRemindFragment guideOpenNotificationRemindFragment) {
        }

        @Override // defpackage.njo
        public void S1(StressAllRecordsFragment stressAllRecordsFragment) {
        }

        @Override // defpackage.v9b
        public void S2(GuideWearInstructionFragment guideWearInstructionFragment) {
            A3(guideWearInstructionFragment);
        }

        @Override // defpackage.xcc
        public void T(HrmAbnormalHighRecordsFragment hrmAbnormalHighRecordsFragment) {
        }

        @Override // defpackage.zdc
        public void T0(HrmExpandableManualRecordsFragment hrmExpandableManualRecordsFragment) {
        }

        @Override // defpackage.tcc
        public void T1(HrmAbnormalChartFragment hrmAbnormalChartFragment) {
        }

        @Override // defpackage.f69
        public void T2(FaceTabListFragment faceTabListFragment) {
        }

        @Override // defpackage.b13
        public void U(BloodPressureWeekItemRFragment bloodPressureWeekItemRFragment) {
        }

        @Override // defpackage.skm
        public void U0(SleepDiaryMedicationUpdateFragment sleepDiaryMedicationUpdateFragment) {
        }

        @Override // defpackage.hfm
        public void U1(SleepAddRecordFragment sleepAddRecordFragment) {
        }

        @Override // defpackage.hvm
        public void U2(SleepRhythmRecordListFragment sleepRhythmRecordListFragment) {
        }

        @Override // defpackage.qbc
        public void V(HrAndPaceSegmentReportDetailFragment hrAndPaceSegmentReportDetailFragment) {
        }

        @Override // defpackage.f1c
        public void V0(HealthShowAllDataFragment healthShowAllDataFragment) {
        }

        @Override // defpackage.hsl
        public void V1(SelectEcgForAnalyzingFragment selectEcgForAnalyzingFragment) {
        }

        @Override // defpackage.wdc
        public void V2(HrmExpandableExtremeHighRecordsFragment hrmExpandableExtremeHighRecordsFragment) {
        }

        @Override // defpackage.x4c
        public void W(HearingWeekItemFragment hearingWeekItemFragment) {
        }

        @Override // defpackage.hom
        public void W0(SleepInterfereReportFragment sleepInterfereReportFragment) {
        }

        @Override // defpackage.tap
        public void W1(ThirdAppLocalFragment thirdAppLocalFragment) {
            J3(thirdAppLocalFragment);
        }

        @Override // defpackage.yfg
        public void W2(N60EcgAllRecordsFragment n60EcgAllRecordsFragment) {
        }

        @Override // defpackage.s66
        public void X(DeviceInstallAPPBehaviorDebugFragment deviceInstallAPPBehaviorDebugFragment) {
        }

        @Override // defpackage.kc6
        public void X0(DeviceSettingListFragment deviceSettingListFragment) {
        }

        @Override // defpackage.q49
        public void X1(FacePaidListFragment facePaidListFragment) {
        }

        @Override // defpackage.xdc
        public void X2(HrmExpandableExtremeLowRecordsFragment hrmExpandableExtremeLowRecordsFragment) {
        }

        @Override // defpackage.tgd
        public void Y(IntervalTrainingNumberFragment intervalTrainingNumberFragment) {
        }

        @Override // defpackage.cx6
        public void Y0(DimenTotalFragment dimenTotalFragment) {
        }

        @Override // defpackage.zfm
        public void Y1(SleepAnimalAllRecordsFragment sleepAnimalAllRecordsFragment) {
        }

        @Override // defpackage.ydc
        public void Y2(HrmExpandableFibRecordsFragment hrmExpandableFibRecordsFragment) {
        }

        @Override // defpackage.z8o
        public void Z(StandDayItemRFragment standDayItemRFragment) {
        }

        @Override // defpackage.yql
        public void Z0(SedentaryFragment sedentaryFragment) {
        }

        @Override // defpackage.kb3
        public void Z1(CalorieDayItemFragment calorieDayItemFragment) {
        }

        @Override // defpackage.u9p
        public void Z2(ThirdAppDetailFragment thirdAppDetailFragment) {
        }

        @Override // xx5.b
        public xx5.c a() {
            return this.c.a();
        }

        @Override // defpackage.eq0
        public void a0(AddCustomVibrateModeFragment addCustomVibrateModeFragment) {
        }

        @Override // defpackage.ggr
        public void a1(WeightRecordDetailFragment weightRecordDetailFragment) {
        }

        @Override // defpackage.pko
        public void a2(StressRecordDetailFragment stressRecordDetailFragment) {
        }

        @Override // defpackage.os6
        public void a3(DeviceTabParentFragmentV4 deviceTabParentFragmentV4) {
            w3(deviceTabParentFragmentV4);
        }

        @Override // defpackage.ra8
        public void b(EnergyDayItemFragment energyDayItemFragment) {
        }

        @Override // defpackage.y8o
        public void b0(StandDayItemFragment standDayItemFragment) {
        }

        @Override // defpackage.lfc
        public void b1(HrmWeekItemRFragment hrmWeekItemRFragment) {
        }

        @Override // defpackage.p9b
        public void b2(GuideSyncSystemSettingFragment guideSyncSystemSettingFragment) {
            z3(guideSyncSystemSettingFragment);
        }

        @Override // defpackage.t85
        public void b3(CurseMonthFragment curseMonthFragment) {
        }

        @Override // defpackage.amc
        public void c(HuamiSmsReplyFragment huamiSmsReplyFragment) {
        }

        @Override // defpackage.l3p
        public void c0(TemperatureMonthItemFragment temperatureMonthItemFragment) {
        }

        @Override // defpackage.ys2
        public void c1(BlePressureSettingFragment blePressureSettingFragment) {
        }

        @Override // defpackage.ibo
        public void c2(StandWeekItemRFragment standWeekItemRFragment) {
        }

        @Override // defpackage.c49
        public void c3(FaceMeFragment faceMeFragment) {
        }

        @Override // defpackage.kdc
        public void d(HrmAllRecordsFragment hrmAllRecordsFragment) {
        }

        @Override // defpackage.wx2
        public void d0(BloodGlucoseMonthItemFragment bloodGlucoseMonthItemFragment) {
        }

        @Override // defpackage.hqm
        public void d1(SleepModelFragment sleepModelFragment) {
        }

        @Override // defpackage.x4r
        public void d2(WatchAppLayoutSettingFragment watchAppLayoutSettingFragment) {
            L3(watchAppLayoutSettingFragment);
        }

        @Override // defpackage.pa7
        public void d3(EcgAnalyzeServiceAuthFragment ecgAnalyzeServiceAuthFragment) {
        }

        @Override // defpackage.g6b
        public void e(GuideNotificationSelectAppFragment guideNotificationSelectAppFragment) {
        }

        @Override // defpackage.yqm
        public void e0(SleepPermissionSettingFragment sleepPermissionSettingFragment) {
        }

        @Override // defpackage.aqh
        public void e1(PaymentOrderWatchFaceListFragment paymentOrderWatchFaceListFragment) {
        }

        @Override // defpackage.oir
        public void e2(WidgetGroupManagerFragment widgetGroupManagerFragment) {
        }

        @Override // defpackage.g03
        public void e3(BloodPressureRecordDetailFragment bloodPressureRecordDetailFragment) {
        }

        @Override // defpackage.yap
        public void f(ThirdAppMarketListFragment thirdAppMarketListFragment) {
            K3(thirdAppMarketListFragment);
        }

        @Override // defpackage.z9o
        public void f0(StandDetectSettingFragment standDetectSettingFragment) {
        }

        @Override // defpackage.d3c
        public void f1(HealthV2Fragment healthV2Fragment) {
            C3(healthV2Fragment);
        }

        @Override // defpackage.bw2
        public void f2(BloodGlucoseAddValueFragment bloodGlucoseAddValueFragment) {
        }

        @Override // defpackage.w09
        public void f3(FaceInfoHMFragment faceInfoHMFragment) {
        }

        @Override // defpackage.p1n
        public void g(SleepWeekItemFragment sleepWeekItemFragment) {
        }

        @Override // defpackage.oz2
        public void g0(BloodPressureDayItemRFragment bloodPressureDayItemRFragment) {
        }

        @Override // defpackage.kb8
        public void g1(EnergyWeekItemFragment energyWeekItemFragment) {
        }

        @Override // defpackage.zn8
        public void g2(FaceCategoryFragment faceCategoryFragment) {
        }

        @Override // defpackage.hbo
        public void g3(StandWeekItemFragment standWeekItemFragment) {
        }

        @Override // defpackage.cpb
        public void h(HealthCheckMeasureReminderSettingFragment healthCheckMeasureReminderSettingFragment) {
        }

        @Override // defpackage.i8n
        public void h0(Spo2ManuallyMeasuredRecordsFragment spo2ManuallyMeasuredRecordsFragment) {
        }

        @Override // defpackage.mnp
        public void h1(TrackImportListFragment trackImportListFragment) {
        }

        @Override // defpackage.pt8
        public void h2(FaceEditFragment faceEditFragment) {
        }

        @Override // defpackage.gmm
        public void h3(SleepExpandableAllRecordsFragment sleepExpandableAllRecordsFragment) {
        }

        @Override // defpackage.vv4
        public void i(CourseOpenVipFragment courseOpenVipFragment) {
        }

        @Override // defpackage.t8n
        public void i0(Spo2RecordDetailFragment spo2RecordDetailFragment) {
        }

        @Override // defpackage.bko
        public void i1(StressExpandableAllRecordsFragment stressExpandableAllRecordsFragment) {
        }

        @Override // defpackage.v0p
        public void i2(TargetChartRFragment targetChartRFragment) {
        }

        @Override // defpackage.ex2
        public void i3(BloodGlucoseExpandableExtremeLowRecordsFragment bloodGlucoseExpandableExtremeLowRecordsFragment) {
        }

        @Override // defpackage.b09
        public void j(FaceInfoBleFragment faceInfoBleFragment) {
        }

        @Override // defpackage.c88
        public void j0(EmergencyContactListFragment emergencyContactListFragment) {
        }

        @Override // defpackage.cpm
        public void j1(SleepInterfereSetFragment sleepInterfereSetFragment) {
        }

        @Override // defpackage.ofm
        public void j2(SleepAllRecordsFragment sleepAllRecordsFragment) {
        }

        @Override // defpackage.t3p
        public void j3(TemperatureRecordDetailFragment temperatureRecordDetailFragment) {
        }

        @Override // defpackage.osm
        public void k(SleepRhythmCalendarItemFragment sleepRhythmCalendarItemFragment) {
        }

        @Override // defpackage.hlc
        public void k0(HuamiPressureSettingFragment huamiPressureSettingFragment) {
        }

        @Override // defpackage.w7n
        public void k1(Spo2ExpandableExtremeLowRecordsFragment spo2ExpandableExtremeLowRecordsFragment) {
        }

        @Override // defpackage.vle
        public void k2(com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingFragment localSportSettingFragment) {
        }

        @Override // defpackage.rkc
        public void k3(HuamiHrSettingFragment huamiHrSettingFragment) {
        }

        @Override // defpackage.d9n
        public void l(Spo2WeekItemFragment spo2WeekItemFragment) {
        }

        @Override // defpackage.vjo
        public void l0(StressDayItemFragment stressDayItemFragment) {
        }

        @Override // defpackage.q1r
        public void l1(VitalityDayFragment vitalityDayFragment) {
        }

        @Override // defpackage.ou2
        public void l2(BleSpo2SettingFragment bleSpo2SettingFragment) {
        }

        @Override // defpackage.nbf
        public void l3(MeasureRemindPreferenceFragment measureRemindPreferenceFragment) {
        }

        @Override // defpackage.q0p
        public void m(TargetChartFragment targetChartFragment) {
            I3(targetChartFragment);
        }

        @Override // defpackage.n59
        public void m0(FaceSearchFragment faceSearchFragment) {
        }

        @Override // defpackage.b8n
        public void m1(Spo2ExtremeLowRecordsFragment spo2ExtremeLowRecordsFragment) {
        }

        @Override // defpackage.iy2
        public void m2(BloodGlucoseWeekItemFragment bloodGlucoseWeekItemFragment) {
        }

        @Override // defpackage.sy2
        public void m3(BloodPressureAllRecordsFragment bloodPressureAllRecordsFragment) {
        }

        @Override // defpackage.fhp
        public void n(TodayHealthFragment todayHealthFragment) {
        }

        @Override // defpackage.xdo
        public void n0(StepDayItemRFragment stepDayItemRFragment) {
        }

        @Override // defpackage.hwm
        public void n1(SleepRhythmUpToRemoteSucFragment sleepRhythmUpToRemoteSucFragment) {
        }

        @Override // defpackage.obc
        public void n2(HrAndPaceExpandableAllRecordsFragment hrAndPaceExpandableAllRecordsFragment) {
        }

        @Override // defpackage.u7n
        public void n3(Spo2DayItemFragment spo2DayItemFragment) {
        }

        @Override // defpackage.gir
        public void o(WidgetGroupEditFragment widgetGroupEditFragment) {
        }

        @Override // defpackage.k4c
        public void o0(HearingEnvironmentalNoiseFragment hearingEnvironmentalNoiseFragment) {
        }

        @Override // defpackage.edc
        public void o1(HrmAddFragment hrmAddFragment) {
        }

        @Override // defpackage.rke
        public void o2(LocalRopeSettingFragment localRopeSettingFragment) {
        }

        @Override // defpackage.ptm
        public void o3(SleepRhythmDetailFragment sleepRhythmDetailFragment) {
        }

        @Override // defpackage.xt2
        public void p(BleSleepSettingFragment bleSleepSettingFragment) {
        }

        @Override // defpackage.e2b
        public void p0(GoalRemindFragment goalRemindFragment) {
        }

        @Override // defpackage.kfo
        public void p1(StepWeekItemRFragment stepWeekItemRFragment) {
        }

        @Override // defpackage.px2
        public void p2(BloodGlucoseFingerMonthItemFragment bloodGlucoseFingerMonthItemFragment) {
        }

        @Override // defpackage.pfr
        public void p3(WeightExpandableAllRecordsFragment weightExpandableAllRecordsFragment) {
        }

        @Override // defpackage.g3p
        public void q(TemperatureDayItemFragment temperatureDayItemFragment) {
        }

        @Override // defpackage.sb3
        public void q0(CalorieWeekItemFragment calorieWeekItemFragment) {
        }

        @Override // defpackage.tqm
        public void q1(SleepMonthItemFragment sleepMonthItemFragment) {
        }

        @Override // defpackage.mdc
        public void q2(HrmDayItemFragment hrmDayItemFragment) {
        }

        @Override // defpackage.vhk
        public void q3(RelativeHealthFragment relativeHealthFragment) {
        }

        @Override // defpackage.kec
        public void r(HrmMonthItemFragment hrmMonthItemFragment) {
        }

        @Override // defpackage.kfc
        public void r0(HrmWeekItemFragment hrmWeekItemFragment) {
        }

        @Override // defpackage.exm
        public void r1(SleepSegmentReportDetailFragment sleepSegmentReportDetailFragment) {
        }

        @Override // defpackage.w4c
        public void r2(HearingMonthItemFragment hearingMonthItemFragment) {
        }

        @Override // defpackage.umq
        public void r3(VO2MaxMonthItemFragment vO2MaxMonthItemFragment) {
        }

        @Override // defpackage.nwe
        public void s(MHStrengthDayItemFragment mHStrengthDayItemFragment) {
        }

        @Override // defpackage.vxm
        public void s0(SleepSettingFragment sleepSettingFragment) {
        }

        @Override // defpackage.ur6
        public void s1(DeviceTabFragmentV4 deviceTabFragmentV4) {
            v3(deviceTabFragmentV4);
        }

        @Override // defpackage.kfr
        public void s2(WeightDayItemFragment weightDayItemFragment) {
        }

        @Override // defpackage.x7n
        public void s3(Spo2ExpandableManualRecordsFragment spo2ExpandableManualRecordsFragment) {
        }

        @Override // defpackage.dx2
        public void t(BloodGlucoseExpandableExtremeHighRecordsFragment bloodGlucoseExpandableExtremeHighRecordsFragment) {
        }

        @Override // defpackage.bdc
        public void t0(HrmAbnormalLowRecordsFragment hrmAbnormalLowRecordsFragment) {
        }

        @Override // defpackage.pob
        public void t1(HealthCheckExpandableAllRecordsFragment healthCheckExpandableAllRecordsFragment) {
        }

        @Override // defpackage.ugp
        public void t2(TodayHealthDayFragment todayHealthDayFragment) {
        }

        @Override // defpackage.wwe
        public void t3(MHStrengthWeekItemFragment mHStrengthWeekItemFragment) {
        }

        @Override // defpackage.ku8
        public void u(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment) {
        }

        @Override // defpackage.jec
        public void u0(HrmManuallyMeasuredRecordsFragment hrmManuallyMeasuredRecordsFragment) {
        }

        @Override // defpackage.i3p
        public void u1(TemperatureExpandableAllRecordsFragment temperatureExpandableAllRecordsFragment) {
        }

        @Override // defpackage.er2
        public void u2(BleHrSettingFragment bleHrSettingFragment) {
        }

        @Override // defpackage.ndc
        public void u3(HrmDayItemRFragment hrmDayItemRFragment) {
        }

        @Override // defpackage.t2e
        public void v(LanguageSettingFragment languageSettingFragment) {
            D3(languageSettingFragment);
        }

        @Override // defpackage.tb3
        public void v0(CalorieWeekItemRFragment calorieWeekItemRFragment) {
        }

        @Override // defpackage.wfk
        public void v1(RelativeCareMessageFragment relativeCareMessageFragment) {
        }

        @Override // defpackage.ter
        public void v2(WeightAllRecordsFragment weightAllRecordsFragment) {
        }

        public final DeviceTabFragmentV4 v3(DeviceTabFragmentV4 deviceTabFragmentV4) {
            vr6.a(deviceTabFragmentV4, new BaseMainFragmentDelegateImpl());
            return deviceTabFragmentV4;
        }

        @Override // defpackage.r4p
        public void w(TemperatureWeekItemFragment temperatureWeekItemFragment) {
        }

        @Override // defpackage.p55
        public void w0(CurseBarChartFragment curseBarChartFragment) {
        }

        @Override // defpackage.reo
        public void w1(StepMonthItemFragment stepMonthItemFragment) {
        }

        @Override // defpackage.fkr
        public void w2(WidgetTemplateFragment widgetTemplateFragment) {
        }

        public final DeviceTabParentFragmentV4 w3(DeviceTabParentFragmentV4 deviceTabParentFragmentV4) {
            e92.a(deviceTabParentFragmentV4, new BaseMainFragmentDelegateImpl());
            ps6.a(deviceTabParentFragmentV4, this.c.i3());
            return deviceTabParentFragmentV4;
        }

        @Override // defpackage.p7k
        public void x(RecordListFragment recordListFragment) {
            H3(recordListFragment);
        }

        @Override // defpackage.ox2
        public void x0(BloodGlucoseFingerDayItemFragment bloodGlucoseFingerDayItemFragment) {
        }

        @Override // defpackage.i4o
        public void x1(SportTabV4Fragment sportTabV4Fragment) {
        }

        @Override // defpackage.owe
        public void x2(MHStrengthDayItemRFragment mHStrengthDayItemRFragment) {
        }

        public final GuideOpenKeepAliveSettingFragment x3(GuideOpenKeepAliveSettingFragment guideOpenKeepAliveSettingFragment) {
            c7b.a(guideOpenKeepAliveSettingFragment, this.f11497b.d.get());
            return guideOpenKeepAliveSettingFragment;
        }

        @Override // defpackage.k2p
        public void y(TemperatureAddFragment temperatureAddFragment) {
        }

        @Override // defpackage.mlm
        public void y0(SleepDiaryUpdateFragment sleepDiaryUpdateFragment) {
        }

        @Override // defpackage.jlp
        public void y1(TrackCreateListFragment trackCreateListFragment) {
        }

        @Override // defpackage.tw2
        public void y2(BloodGlucoseAllDayItemFragment bloodGlucoseAllDayItemFragment) {
        }

        public final GuideOpenPhoneCallFragment y3(GuideOpenPhoneCallFragment guideOpenPhoneCallFragment) {
            v8b.a(guideOpenPhoneCallFragment, this.f11497b.d.get());
            return guideOpenPhoneCallFragment;
        }

        @Override // defpackage.gao
        public void z(StandMonthItemFragment standMonthItemFragment) {
        }

        @Override // defpackage.rdp
        public void z0(ThreeTargetWeekFragment threeTargetWeekFragment) {
        }

        @Override // defpackage.lvh
        public void z1(PhysicalStatusDayFragment physicalStatusDayFragment) {
        }

        @Override // defpackage.bjr
        public void z2(WidgetManagerFragmentV2 widgetManagerFragmentV2) {
        }

        public final GuideSyncSystemSettingFragment z3(GuideSyncSystemSettingFragment guideSyncSystemSettingFragment) {
            q9b.a(guideSyncSystemSettingFragment, this.f11497b.d.get());
            return guideSyncSystemSettingFragment;
        }
    }

    public static final class h implements byl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Service f11499b;

        @Override // defpackage.byl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public so9 build() {
            f6i.a(this.f11499b, Service.class);
            return new i(this.f11498a, this.f11499b);
        }

        @Override // defpackage.byl
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public h a(Service service) {
            this.f11499b = (Service) f6i.b(service);
            return this;
        }

        public h(j jVar) {
            this.f11498a = jVar;
        }
    }

    public static final class i extends so9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f11501b = this;

        public i(j jVar, Service service) {
            this.f11500a = jVar;
        }

        @Override // defpackage.ma6
        public void a(DeviceManagerService deviceManagerService) {
        }

        @Override // defpackage.ow5
        public void b(DefaultRemoteService defaultRemoteService) {
        }
    }

    public static final class j extends to9 {
        public dei<UserInfoManager> A;
        public dei<OtherDeviceLoaderManagerImpl> A0;
        public dei<RNDeviceManagerImpl> A1;
        public dei<EcgAnalyzeRepository> A2;
        public dei<SportSummaryRepo> B;
        public dei<EcoDeviceRequest> B0;
        public dei<RnSettingsExportApiImpl> B1;
        public dei<CompanyUserRequest> B2;
        public dei<CurseAggregation> C;
        public dei<EcoProductManagerRemoteImpl> C0;
        public dei<TrackImpl> C1;
        public dei<CompanyUserRepository> C2;
        public dei<CurseRepo> D;
        public dei<EcoDeviceManagerRemoteImpl> D0;
        public dei<TrackRequest> D1;
        public dei<ScanManager> D2;
        public dei<EcoFitnessDataSyncManager> E;
        public dei<EcoDialogHelperImpl> E0;
        public dei<TrackRepository> E1;
        public dei<SleepInterfereRequest> E2;
        public dei<FitnessDataRecorderImpl> F;
        public dei<ElectronicScaleActivityFinisherHelperImpl> F0;
        public dei<TokenManagerImpl> F1;
        public dei<FitnessDataGetterImpl> G;
        public dei<ElectronicScaleCmdHelperImpl> G0;
        public dei<TokenManagerRemoteImpl> G1;
        public dei<RepositoryProviderImpl> H;
        public dei<ElectronicScaleManagerImpl> H0;
        public dei<EcoFitnessSyncRemoteImpl> H1;
        public dei<FitnessServerSyncMgr> I;
        public dei<ElectronicScaleRequestImpl> I0;
        public dei<FitnessDataRemoteImpl> I1;
        public dei<ISummarySyncManager> J;
        public dei<ElectronicScaleShareHelperImpl> J0;
        public dei<FitnessSyncRemoteImpl> J1;
        public dei<CurseApiImpl> K;
        public dei<OTARequest> K0;
        public dei<HuamiApiServiceImpl> K1;
        public dei<SportSummaryApiImpl> L;
        public dei<ExceptionHelperImpl> L0;
        public dei<ResearchCommandPb> L1;
        public dei<HealthConnectApiImpl> M;
        public dei<UploadFileImpl> M0;
        public dei<ResearchCommandServer> M1;
        public dei<ThirdPartyDataSyncImpl> N;
        public dei<FeedbackUploadDeviceLogDialogUtil> N0;
        public dei<ResearchRemoteServer> N1;
        public dei<StepSyncerExport> O;
        public dei<BloodPressurePreRepository> O0;
        public dei<DefaultBinderPool> O1;
        public dei<FitnessDataSyncManager> P;
        public dei<BloodPressureRemindBiz> P0;
        public dei<CollectionTaskManager> P1;
        public dei<PaiGoalDataHelper> Q;
        public dei<HealthPageImpl> Q0;
        public dei<EcoSportManagerImpl> Q1;
        public dei<AccessManagerImpl> R;
        public dei<FingerprintDetectManager> R0;
        public dei<LocalSportSettingRequest> R1;
        public dei<AccountManagerImpl> S;
        public dei<HeartrateMeasurerImpl> S0;
        public dei<com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest> S1;
        public dei<TokenManagerDelegate> T;
        public dei<MilinkManagerImpl> T0;
        public dei<JustDanceImpl> T1;
        public dei<ActivePkRequest> U;
        public dei<MotionRecognizerImpl> U0;
        public dei<RouteRequest> U1;
        public dei<ActivePkRepository> V;
        public dei<SleepTracerImpl> V0;
        public dei<RouteRepository> V1;
        public dei<PkExportImpl> W;
        public dei<StandDetectManagerImpl> W0;
        public dei<RunningRouteApiImpl> W1;
        public dei<AivsRequest> X;
        public dei<AccountServiceCookieImpl> X0;
        public dei<SportAccessApiImp> X1;
        public dei<SportCaptureManager> Y;
        public dei<CheckerUserProfileImpl> Y0;
        public dei<SportXmsHelperImpl> Y1;
        public dei<WearableDeviceManagerImpl> Z;
        public dei<SetUserDataRequest> Z0;
        public dei<SyncExportManagerImp> Z1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CourseScheduleSingleModule f11502a;
        public dei<FaceSyncerImpl> a0;
        public dei<RegionManagerImpl> a1;
        public dei<SyncWeatherManagerImp> a2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NetProxyModule f11503b;
        public dei<DeviceContactImpl> b0;
        public dei<MapExport> b1;
        public dei<DivingRequest> b2;
        public final SmartModule c;
        public dei<DeviceContactEngineImpl> c0;
        public dei<AboutManagerImpl> c1;
        public dei<DivingRepository> c2;
        public final TrainingModule d;
        public dei<ProductManagerImpl> d0;
        public dei<MedalHelper> d1;
        public dei<SportRecordApiImpl> d2;
        public final HttpClientModule e;
        public dei<DeviceManagerImpl> e0;
        public dei<MedalManagerImpl> e1;
        public dei<TrainingManager> e2;
        public final si1 f;
        public dei<DeviceToolImpl> f0;
        public dei<PopMedalListRepo> f1;
        public dei<UBoxGuideManagerImpl> f2;
        public final SummaryModule g;
        public dei<WearableProductManagerImpl> g0;
        public dei<MediaHelperImpl> g1;
        public dei<UserInfoReportRequest> g2;
        public final MiuiFunctionModule h;
        public dei<BluetoothPermissionUtilImpl> h0;
        public dei<MembershipHelperImpl> h1;
        public dei<CollectReportInfoManager> h2;
        public final GoalNotifySingleModule i;
        public dei<DeviceTabManagerImpl> i0;
        public dei<DataManagementRequest> i1;
        public dei<SetGoalPageManager> i2;
        public final j j = this;
        public dei<TempManagerImpl> j0;
        public dei<DataManagementRepository> j1;
        public dei<SetPageManagerImpl> j2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public dei<AivsHelperImpl> f11504k;
        public dei<DeviceRequest> k0;
        public dei<HttpConfig> k1;
        public dei<UserInformationManagerImpl> k2;
        public dei<HabitManagerImpl> l;
        public dei<ProductManagerRemoteImpl> l0;
        public dei<Map<String, CookieFetcher>> l1;
        public dei<MedicalIdSecurityRepository> l2;
        public dei<OnetrackImpl> m;
        public dei<DeviceManagerRemoteImpl> m0;
        public dei<ApiHolder> m1;
        public dei<FaceDebugHelperImpl> m2;
        public dei<BannerRequest> n;
        public dei<DeviceSettingsRequest> n0;
        public dei<VerifyToken> n1;
        public dei<FaceHelperImpl> n2;
        public dei<CityRequest> o;
        public dei<DeviceSettingHelperImpl> o0;
        public dei<RegionUrlSwitcherImpl> o1;
        public dei<FaceWearOsHelperImpl> o2;
        public dei<BannerImpl> p;
        public dei<SettingsPageUtilImpl> p0;
        public dei<HttpHandlerInterceptor> p1;
        public dei<FastPairManagerImpl> p2;
        public dei<CompareImpl> q;
        public dei<SleepModelHelperImpl> q0;
        public dei<OkHttpClient.Builder> q1;
        public dei<WearOSUtilImpl> q2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public dei<PermissionManger> f11505r;
        public dei<PhoneMuteHelperImpl> r0;
        public dei<etk> r1;
        public dei<HuamiApiClientImpl> r2;
        public dei<CheckUpdateRequest> s;
        public dei<DeviceSettingsSyncHelperImpl> s0;
        public dei<HttpRepository> s1;
        public dei<YRNDebugHelperImpl> s2;
        public dei<AppManager> t;
        public dei<WearModeHelperImpl> t0;
        public dei<NfcManagerImpl> t1;
        public dei<YRNHelperImpl> t2;
        public dei<CheckUpdateManagerImpl> u;
        public dei<EcoDeviceManagerImpl> u0;
        public dei<PaymentManagerImpl> u1;
        public dei<WearableRNPushHandler> u2;
        public dei<MainHelperImpl> v;
        public dei<EcoDeviceContactImpl> v0;
        public dei<PrivacyHelperImpl> v1;
        public dei<XmsManagerImpl> v2;
        public dei<LpaManagementHelperImpl> w;
        public dei<EcoDeviceContactEngineImpl> w0;
        public dei<PushManagerImpl> w1;
        public dei<MessageCenterRequest> w2;
        public dei<Gson> x;
        public dei<EcoBindDeviceManagerImpl> x0;
        public dei<RelativeCareAccessImpl> x1;
        public dei<MessageCenterImpl> x2;
        public dei<CourseManagerImpl> y;
        public dei<EcoDeviceConfigManagerImpl> y0;
        public dei<ResearchSupporterImpl> y1;
        public dei<AppUpgradeHelperImpl> y2;
        public dei<MiAccountInternalManager> z;
        public dei<EcoProductManagerImpl> z0;
        public dei<DeviceShareManagerImpl> z1;
        public dei<EcgRequest> z2;

        /* JADX INFO: renamed from: com.xiaomi.fitness.a$j$a, reason: collision with other inner class name */
        public static final class C0374a<T> implements dei<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f11506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f11507b;

            public C0374a(j jVar, int i) {
                this.f11506a = jVar;
                this.f11507b = i;
            }

            public final T a() {
                switch (this.f11507b) {
                    case 0:
                        return (T) new AivsHelperImpl();
                    case 1:
                        return (T) this.f11506a.O0(ofb.a());
                    case 2:
                        return (T) new OnetrackImpl();
                    case 3:
                        return (T) new BannerImpl(this.f11506a.n.get(), this.f11506a.o.get());
                    case 4:
                        return (T) new BannerRequest();
                    case 5:
                        return (T) new CityRequest();
                    case 6:
                        return (T) this.f11506a.z0(p94.a());
                    case 7:
                        return (T) new PermissionManger();
                    case 8:
                        return (T) new CheckUpdateRequest();
                    case 9:
                        return (T) this.f11506a.w0(ru3.a());
                    case 10:
                        return (T) com.xiaomi.fitness.app.a.a();
                    case 11:
                        return (T) new MainHelperImpl();
                    case 12:
                        return (T) new LpaManagementHelperImpl();
                    case 13:
                        return (T) tfc.a(this.f11506a.e);
                    case 14:
                        return (T) new CourseManagerImpl();
                    case 15:
                        return (T) this.f11506a.q1(bhq.a());
                    case 16:
                        return (T) new MiAccountInternalManager(ti1.a(this.f11506a.f));
                    case 17:
                        j jVar = this.f11506a;
                        return (T) jVar.j1(n3o.a(jVar.B1()));
                    case 18:
                        return (T) new CurseRepo(this.f11506a.C.get());
                    case 19:
                        return (T) new CurseAggregation();
                    case 20:
                        return (T) new EcoFitnessDataSyncManager();
                    case 21:
                        return (T) new FitnessDataRecorderImpl();
                    case 22:
                        return (T) this.f11506a.M0(vp9.a());
                    case 23:
                        return (T) new RepositoryProviderImpl();
                    case 24:
                        return (T) new FitnessServerSyncMgr();
                    case 25:
                        return (T) gpo.a(this.f11506a.g);
                    case 26:
                        return (T) new CurseApiImpl(this.f11506a.D.get());
                    case 27:
                        return (T) new SportSummaryApiImpl(this.f11506a.B.get());
                    case 28:
                        return (T) new HealthConnectApiImpl();
                    case 29:
                        return (T) new ThirdPartyDataSyncImpl();
                    case 30:
                        return (T) new StepSyncerExport();
                    case 31:
                        return (T) new FitnessDataSyncManager();
                    case 32:
                        return (T) new PaiGoalDataHelper();
                    case 33:
                        return (T) this.f11506a.s0(d50.a());
                    case 34:
                        return (T) new AccountManagerImpl(ti1.a(this.f11506a.f), this.f11506a.z.get());
                    case 35:
                        return (T) new TokenManagerDelegate();
                    case 36:
                        return (T) this.f11506a.Y0(rxh.a());
                    case 37:
                        return (T) this.f11506a.u0(hf0.a());
                    case 38:
                        return (T) new ActivePkRequest();
                    case 39:
                        return (T) new AivsRequest();
                    case 40:
                        return (T) new SportCaptureManager();
                    case 41:
                        j jVar2 = this.f11506a;
                        return (T) jVar2.G0(g26.a(jVar2.Z.get()));
                    case 42:
                        return (T) new WearableDeviceManagerImpl();
                    case 43:
                        return (T) new FaceSyncerImpl();
                    case 44:
                        return (T) new DeviceContactEngineImpl();
                    case 45:
                        return (T) new ProductManagerImpl();
                    case 46:
                        return (T) new DeviceManagerImpl();
                    case 47:
                        return (T) new DeviceToolImpl();
                    case 48:
                        return (T) new WearableProductManagerImpl();
                    case 49:
                        return (T) new BluetoothPermissionUtilImpl();
                    case 50:
                        return (T) new DeviceTabManagerImpl();
                    case 51:
                        return (T) new TempManagerImpl();
                    case 52:
                        return (T) new DeviceManagerRemoteImpl(this.f11506a.l0.get());
                    case 53:
                        return (T) new ProductManagerRemoteImpl(this.f11506a.k0.get(), this.f11506a.x.get());
                    case 54:
                        return (T) new DeviceRequest();
                    case 55:
                        return (T) new DeviceSettingsRequest();
                    case 56:
                        return (T) new DeviceSettingHelperImpl();
                    case 57:
                        return (T) new SettingsPageUtilImpl();
                    case 58:
                        return (T) new SleepModelHelperImpl();
                    case 59:
                        return (T) new PhoneMuteHelperImpl();
                    case 60:
                        return (T) new DeviceSettingsSyncHelperImpl();
                    case 61:
                        return (T) new WearModeHelperImpl();
                    case 62:
                        j jVar3 = this.f11506a;
                        return (T) jVar3.I0(br7.a(jVar3.u0.get()));
                    case 63:
                        return (T) new EcoDeviceManagerImpl();
                    case 64:
                        return (T) new EcoDeviceContactEngineImpl();
                    case 65:
                        return (T) new EcoBindDeviceManagerImpl();
                    case 66:
                        return (T) new EcoDeviceConfigManagerImpl();
                    case 67:
                        return (T) new EcoProductManagerImpl();
                    case 68:
                        return (T) new OtherDeviceLoaderManagerImpl();
                    case 69:
                        return (T) new EcoDeviceManagerRemoteImpl(this.f11506a.C0.get());
                    case 70:
                        return (T) new EcoProductManagerRemoteImpl(this.f11506a.B0.get(), this.f11506a.x.get());
                    case 71:
                        return (T) new EcoDeviceRequest();
                    case 72:
                        return (T) new EcoDialogHelperImpl();
                    case 73:
                        return (T) new ElectronicScaleActivityFinisherHelperImpl();
                    case 74:
                        return (T) new ElectronicScaleCmdHelperImpl();
                    case 75:
                        return (T) new ElectronicScaleManagerImpl();
                    case 76:
                        return (T) new ElectronicScaleRequestImpl();
                    case 77:
                        return (T) new ElectronicScaleShareHelperImpl();
                    case 78:
                        return (T) this.f11506a.X0(q3h.a());
                    case 79:
                        return (T) new ExceptionHelperImpl();
                    case 80:
                        return (T) new UploadFileImpl();
                    case 81:
                        return (T) new FeedbackUploadDeviceLogDialogUtil();
                    case 82:
                        return (T) new BloodPressureRemindBiz(this.f11506a.O0.get());
                    case 83:
                        return (T) new BloodPressurePreRepository(ti1.a(this.f11506a.f));
                    case 84:
                        return (T) new HealthPageImpl();
                    case 85:
                        return (T) new HeartrateMeasurerImpl(this.f11506a.R0.get());
                    case 86:
                        return (T) new FingerprintDetectManager(ti1.a(this.f11506a.f));
                    case 87:
                        return (T) new MilinkManagerImpl();
                    case 88:
                        return (T) this.f11506a.W0(s8g.a());
                    case 89:
                        return (T) new SleepTracerImpl(ti1.a(this.f11506a.f));
                    case 90:
                        return (T) new StandDetectManagerImpl();
                    case 91:
                        return (T) new AccountServiceCookieImpl(this.f11506a.T.get(), this.f11506a.S.get());
                    case 92:
                        return (T) new CheckerUserProfileImpl();
                    case 93:
                        return (T) this.f11506a.a1(xbk.a());
                    case 94:
                        return (T) new SetUserDataRequest();
                    case 95:
                        return (T) new MapExport();
                    case 96:
                        return (T) new AboutManagerImpl();
                    case 97:
                        return (T) this.f11506a.T0(ngf.a());
                    case 98:
                        return (T) this.f11506a.S0(lef.a());
                    case 99:
                        return (T) this.f11506a.Z0(y3i.a());
                    default:
                        throw new AssertionError(this.f11507b);
                }
            }

            public final T b() {
                switch (this.f11507b) {
                    case 100:
                        return (T) new MediaHelperImpl();
                    case 101:
                        return (T) this.f11506a.U0(sof.a());
                    case 102:
                        return (T) this.f11506a.F0(zl5.a());
                    case 103:
                        return (T) new DataManagementRequest();
                    case 104:
                        return (T) this.f11506a.P0(chc.a());
                    case 105:
                        return (T) ufc.a(this.f11506a.e, this.f11506a.t1(), this.f11506a.k1.get(), this.f11506a.x.get());
                    case 106:
                        return (T) rfc.a(this.f11506a.e, this.f11506a.k1.get(), this.f11506a.p1.get(), this.f11506a.y1());
                    case 107:
                        return (T) com.xiaomi.fitness.app.b.a();
                    case 108:
                        return (T) new HttpHandlerInterceptor(this.f11506a.x1());
                    case 109:
                        return (T) new VerifyToken(u27.b(this.f11506a.l1), this.f11506a.T.get(), this.f11506a.m1.get());
                    case 110:
                        return (T) ImmutableMap.builderWithExpectedSize(6).g("hlth.io.mi.com", com.xiaomi.fitness.account.di.a.a()).g(LoginSetting.COOKIE_DOMAIN_PASSPORT_API, com.xiaomi.fitness.aivs.di.a.a()).g("watch-appstore.iot.mi.com", com.xiaomi.fitness.watch.face.base.a.a()).g("region.hlth.io.mi.com", com.xiaomi.fitness.login.di.a.a()).g("watch.iot.mi.com", com.xiaomi.fitness.medal.di.a.a()).g(URLs.HEALTH_RESEARCH_HOST, com.xiaomi.fitness.health.todayhealth.model.a.a()).a();
                    case 111:
                        return (T) new ApiHolder();
                    case 112:
                        return (T) new RegionUrlSwitcherImpl(this.f11506a.m1.get());
                    case 113:
                        return (T) new NfcManagerImpl();
                    case 114:
                        return (T) new PaymentManagerImpl();
                    case 115:
                        return (T) new PrivacyHelperImpl();
                    case 116:
                        return (T) new PushManagerImpl();
                    case 117:
                        return (T) new RelativeCareAccessImpl();
                    case 118:
                        return (T) new ResearchSupporterImpl();
                    case 119:
                        return (T) new DeviceShareManagerImpl();
                    case 120:
                        return (T) new RNDeviceManagerImpl();
                    case 121:
                        return (T) new RnSettingsExportApiImpl();
                    case 122:
                        return (T) new TrackImpl();
                    case 123:
                        return (T) this.f11506a.o1(unp.a());
                    case 124:
                        return (T) new TrackRequest();
                    case 125:
                        return (T) new DefaultBinderPool(this.f11506a.W());
                    case 126:
                        return (T) new TokenManagerRemoteImpl(this.f11506a.F1.get());
                    case 127:
                        return (T) this.f11506a.n1(iip.a());
                    case 128:
                        return (T) new EcoFitnessSyncRemoteImpl();
                    case 129:
                        return (T) new FitnessDataRemoteImpl();
                    case 130:
                        return (T) new FitnessSyncRemoteImpl();
                    case 131:
                        return (T) new HuamiApiServiceImpl();
                    case 132:
                        return (T) this.f11506a.c1(jpk.a());
                    case 133:
                        return (T) new ResearchCommandPb();
                    case 134:
                        return (T) new ResearchRemoteServer();
                    case 135:
                        return (T) new CollectionTaskManager(ti1.a(this.f11506a.f));
                    case 136:
                        return (T) new EcoSportManagerImpl();
                    case 137:
                        return (T) this.f11506a.Q0(lme.a());
                    case 138:
                        return (T) this.f11506a.R0(kme.a());
                    case 139:
                        return (T) new JustDanceImpl();
                    case 140:
                        return (T) this.f11506a.f1(o2l.a());
                    case 141:
                        return (T) this.f11506a.d1(kzk.a());
                    case 142:
                        return (T) new RouteRequest();
                    case 143:
                        return (T) this.f11506a.h1(i9n.a());
                    case 144:
                        return (T) new SportXmsHelperImpl();
                    case 145:
                        return (T) new SyncExportManagerImp();
                    case 146:
                        return (T) new SyncWeatherManagerImp();
                    case 147:
                        return (T) this.f11506a.i1(dtn.a());
                    case 148:
                        return (T) this.f11506a.H0(l07.a());
                    case 149:
                        return (T) new DivingRequest();
                    case 150:
                        return (T) this.f11506a.p1(kup.a());
                    case 151:
                        return (T) new UBoxGuideManagerImpl();
                    case 152:
                        return (T) this.f11506a.x0(f44.a());
                    case 153:
                        return (T) new UserInfoReportRequest();
                    case 154:
                        return (T) new SetGoalPageManager();
                    case 155:
                        return (T) this.f11506a.g1(azl.a());
                    case 156:
                        return (T) new UserInformationManagerImpl();
                    case 157:
                        return (T) new MedicalIdSecurityRepository();
                    case 158:
                        return (T) this.f11506a.K0(qo8.a());
                    case 159:
                        return (T) this.f11506a.L0(py8.a());
                    case 160:
                        return (T) new FaceWearOsHelperImpl();
                    case 161:
                        return (T) new FastPairManagerImpl();
                    case 162:
                        return (T) new WearOSUtilImpl();
                    case 163:
                        return (T) new HuamiApiClientImpl();
                    case 164:
                        return (T) new YRNDebugHelperImpl();
                    case 165:
                        return (T) new YRNHelperImpl();
                    case 166:
                        return (T) new WearableRNPushHandler();
                    case 167:
                        return (T) new XmsManagerImpl();
                    case 168:
                        return (T) new MessageCenterImpl(this.f11506a.w2.get());
                    case 169:
                        return (T) new MessageCenterRequest();
                    case 170:
                        return (T) new AppUpgradeHelperImpl();
                    case 171:
                        return (T) new EcgAnalyzeRepository(this.f11506a.z2.get());
                    case 172:
                        return (T) new EcgRequest();
                    case 173:
                        return (T) this.f11506a.y0(k94.a());
                    case 174:
                        return (T) new CompanyUserRequest();
                    case 175:
                        return (T) new ScanManager();
                    case 176:
                        return (T) new SleepInterfereRequest();
                    default:
                        throw new AssertionError(this.f11507b);
                }
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.f11507b / 100;
                if (i == 0) {
                    return a();
                }
                if (i == 1) {
                    return b();
                }
                throw new AssertionError(this.f11507b);
            }
        }

        public j(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.f11502a = courseScheduleSingleModule;
            this.f11503b = netProxyModule;
            this.c = smartModule;
            this.d = trainingModule;
            this.e = httpClientModule;
            this.f = si1Var;
            this.g = summaryModule;
            this.h = miuiFunctionModule;
            this.i = goalNotifySingleModule;
            k0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
            l0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
            m0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
            n0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
            o0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
            p0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
            q0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
            r0(si1Var, courseScheduleSingleModule, goalNotifySingleModule, httpClientModule, miuiFunctionModule, netProxyModule, smartModule, summaryModule, trainingModule);
        }

        public final CourseApiImpl A0(CourseApiImpl courseApiImpl) {
            zn4.b(courseApiImpl, this.x.get());
            zn4.c(courseApiImpl, b0());
            zn4.d(courseApiImpl, d0());
            zn4.a(courseApiImpl, c0());
            return courseApiImpl;
        }

        public SleepTraceConfigurationImpl A1() {
            return new SleepTraceConfigurationImpl(ti1.a(this.f));
        }

        public final CourseRequest B0(CourseRequest courseRequest) {
            dw4.a(courseRequest, this.x.get());
            return courseRequest;
        }

        public SportSummaryRequest B1() {
            return k1(p3o.a());
        }

        public final CourseRequestV3 C0(CourseRequestV3 courseRequestV3) {
            bw4.a(courseRequestV3, this.x.get());
            bw4.b(courseRequestV3, a0());
            return courseRequestV3;
        }

        public SyncObservers C1() {
            return m1(oto.a());
        }

        public final CourseVipActivityRequest D0(CourseVipActivityRequest courseVipActivityRequest) {
            sz4.a(courseVipActivityRequest, this.x.get());
            return courseVipActivityRequest;
        }

        public final CourseVipRequest E0(CourseVipRequest courseVipRequest) {
            zz4.a(courseVipRequest, this.x.get());
            return courseVipRequest;
        }

        public final DataManagementRepository F0(DataManagementRepository dataManagementRepository) {
            am5.a(dataManagementRepository, this.i1.get());
            return dataManagementRepository;
        }

        public final DeviceContactImpl G0(DeviceContactImpl deviceContactImpl) {
            h26.a(deviceContactImpl, C1());
            return deviceContactImpl;
        }

        public final DivingRepository H0(DivingRepository divingRepository) {
            m07.a(divingRepository, this.b2.get());
            return divingRepository;
        }

        public final EcoDeviceContactImpl I0(EcoDeviceContactImpl ecoDeviceContactImpl) {
            cr7.a(ecoDeviceContactImpl, g0());
            return ecoDeviceContactImpl;
        }

        public final EcoSyncObservers J0(EcoSyncObservers ecoSyncObservers) {
            bz7.a(ecoSyncObservers, f0());
            return ecoSyncObservers;
        }

        public final FaceDebugHelperImpl K0(FaceDebugHelperImpl faceDebugHelperImpl) {
            ro8.a(faceDebugHelperImpl, new FaceApiRequestV2());
            return faceDebugHelperImpl;
        }

        public final FaceHelperImpl L0(FaceHelperImpl faceHelperImpl) {
            qy8.a(faceHelperImpl, new FaceApiRequestV2());
            return faceHelperImpl;
        }

        public final FitnessDataGetterImpl M0(FitnessDataGetterImpl fitnessDataGetterImpl) {
            wp9.a(fitnessDataGetterImpl, Z());
            return fitnessDataGetterImpl;
        }

        public final FtpRequest N0(FtpRequest ftpRequest) {
            zqa.a(ftpRequest, this.x.get());
            return ftpRequest;
        }

        public final HabitManagerImpl O0(HabitManagerImpl habitManagerImpl) {
            pfb.a(habitManagerImpl, new HabitRequest());
            return habitManagerImpl;
        }

        public final HttpRepository P0(HttpRepository httpRepository) {
            dhc.c(httpRepository, this.r1.get());
            dhc.b(httpRepository, t1());
            dhc.a(httpRepository, this.m1.get());
            return httpRepository;
        }

        public final LocalSportSettingRequest Q0(LocalSportSettingRequest localSportSettingRequest) {
            nme.a(localSportSettingRequest, this.x.get());
            return localSportSettingRequest;
        }

        public final com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest R0(com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest localSportSettingRequest) {
            mme.a(localSportSettingRequest, this.x.get());
            return localSportSettingRequest;
        }

        public final MedalHelper S0(MedalHelper medalHelper) {
            mef.b(medalHelper, new MedalRequest());
            mef.a(medalHelper, new MedalRequest());
            return medalHelper;
        }

        public final MedalManagerImpl T0(MedalManagerImpl medalManagerImpl) {
            ogf.a(medalManagerImpl, this.d1.get());
            ogf.b(medalManagerImpl, new MedalRequest());
            ogf.c(medalManagerImpl, new MedalV2Request());
            return medalManagerImpl;
        }

        public final MembershipHelperImpl U0(MembershipHelperImpl membershipHelperImpl) {
            tof.a(membershipHelperImpl, new MembershipRequest());
            return membershipHelperImpl;
        }

        public AccountManagerRemoteImpl V() {
            return t0(e90.a());
        }

        public final MineSettingManagerImpl V0(MineSettingManagerImpl mineSettingManagerImpl) {
            w2g.a(mineSettingManagerImpl, this.j1.get());
            return mineSettingManagerImpl;
        }

        public Map<Integer, IBinder> W() {
            return ImmutableMap.builderWithExpectedSize(21).g(20, new CourseScheduleManagerRemoteImpl()).g(9, this.G1.get()).g(5, this.m0.get()).g(6, this.l0.get()).g(3, this.c0.get()).g(7, this.D0.get()).g(60, this.C0.get()).g(30, this.w0.get()).g(111, this.H1.get()).g(122, new EcoSportStateServer()).g(123, new EcoSportDataServer()).g(12, this.I1.get()).g(11, this.J1.get()).g(1, this.K1.get()).g(15, V()).g(705, this.M1.get()).g(501, new DeviceInfoFetcherImpl()).g(502, new ProductInfoFetcherImpl()).g(701, this.N1.get()).g(22, new SportStateServer()).g(23, new SportDataServer()).a();
        }

        public final MotionRecognizerImpl W0(MotionRecognizerImpl motionRecognizerImpl) {
            t8g.a(motionRecognizerImpl, f6g.a(this.h));
            return motionRecognizerImpl;
        }

        public CapabilityManagerImpl X() {
            return v0(ej3.a());
        }

        public final OTARequest X0(OTARequest oTARequest) {
            r3h.a(oTARequest, this.x.get());
            return oTARequest;
        }

        public CloudInterceptor Y() {
            return new CloudInterceptor(this.m1.get(), this.T.get(), this.S.get());
        }

        public final PkExportImpl Y0(PkExportImpl pkExportImpl) {
            sxh.a(pkExportImpl, this.V.get());
            return pkExportImpl;
        }

        public CourseApiImpl Z() {
            return A0(yn4.a(a0()));
        }

        public final PopMedalListRepo Z0(PopMedalListRepo popMedalListRepo) {
            z3i.a(popMedalListRepo, this.x.get());
            return popMedalListRepo;
        }

        @Override // cyl.a
        public byl a() {
            return new h(this.j);
        }

        public CourseRequest a0() {
            return B0(cw4.a());
        }

        public final RegionManagerImpl a1(RegionManagerImpl regionManagerImpl) {
            ybk.a(regionManagerImpl, new RegionRequest());
            ybk.b(regionManagerImpl, this.Z0.get());
            return regionManagerImpl;
        }

        @Override // defpackage.j9o
        public void b(StandDetectReceiver standDetectReceiver) {
            l1(standDetectReceiver);
        }

        public CourseRequestV3 b0() {
            return C0(aw4.a());
        }

        public final ResPreloadManagerImpl b1(ResPreloadManagerImpl resPreloadManagerImpl) {
            epk.a(resPreloadManagerImpl, z1());
            return resPreloadManagerImpl;
        }

        @Override // defpackage.oo9
        public void c(FitnessApp fitnessApp) {
        }

        public CourseVipActivityRequest c0() {
            return D0(rz4.a());
        }

        public final ResearchCommandServer c1(ResearchCommandServer researchCommandServer) {
            kpk.a(researchCommandServer, this.L1.get());
            return researchCommandServer;
        }

        @Override // b7a.a
        public Set<Boolean> d() {
            return ImmutableSet.of();
        }

        public CourseVipRequest d0() {
            return E0(yz4.a());
        }

        public final RouteRepository d1(RouteRepository routeRepository) {
            lzk.a(routeRepository, this.U1.get());
            return routeRepository;
        }

        @Override // y64.p
        public DeviceContact e() {
            return this.b0.get();
        }

        public Set<DeviceSyncer> e0() {
            return ImmutableSet.of((UserInfoSyncerImpl) this.a0.get(), (UserInfoSyncerImpl) this.P.get(), (UserInfoSyncerImpl) new GoalSyncerImpl(), new UserInfoSyncerImpl());
        }

        public final RunningGroupApiImpl e1(RunningGroupApiImpl runningGroupApiImpl) {
            j1l.a(runningGroupApiImpl, new RunningGroupRequest());
            return runningGroupApiImpl;
        }

        @Override // rn0.b
        public qn0 f() {
            return new c(this.j);
        }

        public Set<EcoDeviceSyncer> f0() {
            return ImmutableSet.of(this.E.get());
        }

        public final RunningRouteApiImpl f1(RunningRouteApiImpl runningRouteApiImpl) {
            p2l.a(runningRouteApiImpl, this.V1.get());
            return runningRouteApiImpl;
        }

        public EcoSyncObservers g0() {
            return J0(az7.a());
        }

        public final SetPageManagerImpl g1(SetPageManagerImpl setPageManagerImpl) {
            bzl.a(setPageManagerImpl, this.A.get());
            return setPageManagerImpl;
        }

        @Override // com.xiaomi.fit.fitness.export.step.StepSyncerPoint
        public IStepProviderSyncer geStepSyncer() {
            return this.O.get();
        }

        @Override // com.xiaomi.fitness.medal.export.AboutManagerPoint
        public AboutManager getAboutManager() {
            return this.c1.get();
        }

        @Override // com.xiaomi.fitness.access.export.AccessManagerPoint
        public AccessManager getAccessManager() {
            return this.R.get();
        }

        @Override // com.xiaomi.fitness.relative.export.RelativeCareAccessPoint
        public IRelativeCareAccessApi getAccessPoint() {
            return this.x1.get();
        }

        @Override // com.xiaomi.fitness.account.extensions.AccountPoint, xhq.a, yhq.a
        public AccountManager getAccountManager() {
            return this.S.get();
        }

        @Override // com.xiaomi.fitness.login.export.AccountServiceCookieManagerPoint
        public AccountCookieManager getAccountServiceCookieManager() {
            return this.X0.get();
        }

        @Override // com.example.aivs.export.AivsPoint
        public AivsHelper getAivsHelper() {
            return this.f11504k.get();
        }

        @Override // com.xiaomi.fitness.aivs.base.BaseAivsService.AivsRequestInterface
        public AivsRequest getAivsRequest() {
            return this.X.get();
        }

        @Override // com.mi.fitness.checkupdate.util.CheckupdateInterface
        public AppManager getAppManager() {
            return this.t.get();
        }

        @Override // com.fitness.banner.export.BannerPoint
        public IBanner getBannerImpl() {
            return this.p.get();
        }

        @Override // com.xiaomi.fitness.health.bloodpressure.remind.BloodPressurePoint
        public IBloodPressurePreRepository getBloodPressurePrefRepo() {
            return this.O0.get();
        }

        @Override // com.xiaomi.fitness.health.bloodpressure.remind.BloodPressurePoint
        public BloodPressureRemindBiz getBloodPressureRemindBiz() {
            return this.P0.get();
        }

        @Override // com.xiaomi.fitness.device.manager.export.DevicePoint
        public BluetoothPermissionTool getBluetoothPermissionDialogUtil() {
            return this.h0.get();
        }

        @Override // com.mi.fitness.capability.export.CapabilityPoint
        public CapabilityManager getCapabilityManager() {
            return X();
        }

        @Override // com.xiaomi.fitness.camera.sport_capture_export.SportCaptureManagerPoint
        public ISportCaptureManager getCaptureManager() {
            return this.Y.get();
        }

        @Override // com.mi.fitness.checkupdate.export.CheckupdateManagerPoint
        public CheckUpdateManager getCheckUpdateManager() {
            return this.u.get();
        }

        @Override // com.mi.fitness.checkupdate.UpdateHelper.UpdateRequestPoint, com.mi.fitness.checkupdate.eco.EcoUpdateHelper.UpdateRequestPoint
        public CheckUpdateRequest getCheckUpdateRequest() {
            return this.s.get();
        }

        @Override // com.xiaomi.fitness.login.export.CheckerUserProfileManagerPoint
        public CheckerUserSettingManager getCheckerUserProfileManager() {
            return this.Y0.get();
        }

        @Override // com.xiaomi.fitness.user.info.export.CollectReportManager
        public ICollectReportManager getCollectReportManager() {
            return this.h2.get();
        }

        @Override // com.xiaomi.fitness.sleep.trace.extensions.SleepTracerPoint
        public ICollectionTaskManager getCollectTaskManager() {
            return this.P1.get();
        }

        @Override // com.fitness.banner.export.compare.ComparePoint
        public ICompare getCompareImpl() {
            return this.q.get();
        }

        @Override // com.mi.health.course.export.CourseEntryPoint
        public CourseApi getCourseApi() {
            return Z();
        }

        @Override // com.mi.health.course.export.CourseManagerPoint
        public CourseManager getCourseManager() {
            return this.y.get();
        }

        @Override // com.mi.fitness.course.schecule.export.di.CourseSchedulePoint
        public CourseScheduleHelper getCourseScheduleHelper() {
            return new CourseScheduleHelperImpl();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public CurseApi getCurseApi() {
            return this.K.get();
        }

        @Override // com.xiaomi.fit.fitness.di.FitnessEntryPoint
        public CurseRepo getCurseRepo() {
            return this.D.get();
        }

        @Override // com.xiaomi.fitness.service.DeviceBinderPoint
        public DefaultBinderPool getDeviceBinderPool() {
            return this.O1.get();
        }

        @Override // com.xiaomi.fitness.device.manager.DevicePoint
        public DeviceManager<DeviceModel<DeviceInfo<Device>>> getDeviceManager() {
            return this.e0.get();
        }

        @Override // com.xiaomi.fitness.device.manager.extensions.DevicePoint
        public DeviceManagerRemoteImpl getDeviceManagerRemote() {
            return this.m0.get();
        }

        @Override // com.xiaomi.fitness.device.manager.extensions.DevicePoint
        public WearableDeviceManagerWrapper getDeviceManagerWrapper() {
            return this.Z.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.DeviceSettingHelperPoint
        public DeviceSettingHelper getDeviceSettingHelper() {
            return this.o0.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.di.DeviceSettingsPagePoint
        public DeviceSettingsPageInterface getDeviceSettingsPage() {
            return new DeviceSettingsPageImpl();
        }

        @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsPoint
        public DeviceSettingsRequest getDeviceSettingsRequest() {
            return this.n0.get();
        }

        @Override // com.xiaomi.fitness.rn.export.DeviceShareManagerPoint
        public DeviceShareManager getDeviceShareManager() {
            return this.z1.get();
        }

        @Override // com.xiaomi.fitness.device.contact.extensions.DeviceSyncPoint
        public DeviceContactEngineInternal getDeviceSyncEngine() {
            return this.c0.get();
        }

        @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncPoint
        public DeviceContact getDeviceSyncManage() {
            return this.b0.get();
        }

        @Override // com.xiaomi.fitness.device.manager.export.DeviceTabManagerPoint
        public DeviceTabManager getDeviceTabManager() {
            return this.i0.get();
        }

        @Override // com.xiaomi.fitness.device.manager.export.DevicePoint
        public DeviceTool getDeviceTool() {
            return this.f0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.EcoBindDevicePoint
        public EcoBindDeviceManager getEcoBindDeviceManager() {
            return this.x0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigPoint
        public EcoDeviceConfigManager getEcoDeviceConfigManager() {
            return this.y0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDevicePoint
        public EcoDeviceManager getEcoDeviceManager() {
            return this.u0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.extensions.EcoDevicePoint
        public EcoDeviceManagerRemoteImpl getEcoDeviceManagerRemote() {
            return this.D0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.extensions.EcoDevicePoint
        public EcoDeviceManagerWrapper getEcoDeviceManagerWrapper() {
            return this.u0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.contact.extensions.EcoDeviceSyncPoint
        public EcoDeviceContactEngineInternal getEcoDeviceSyncEngine() {
            return this.w0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncPoint
        public EcoDeviceContact getEcoDeviceSyncManage() {
            return this.v0.get();
        }

        @Override // com.xiaomi.fitness.electronic.scale.export.EcoShareDialogPoint
        public EcoDialogHelper getEcoDialogHelper() {
            return this.E0.get();
        }

        @Override // com.xiaomi.fit.fitness.eco.manager.EcoFitnessSyncPoint
        public EcoFitnessDataSyncManager getEcoFitnessSyncManager() {
            return this.E.get();
        }

        @Override // com.xiaomi.fit.fitness.eco.sync.export.di.EcoFitnessSyncEntryPoint
        public EcoFitnessSyncer getEcoFitnessSyncer() {
            return this.E.get();
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.di.EcoGymEntryPoint
        public IEcoGym getEcoGym() {
            return new GymDeviceModelExt();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.EcoDevicePoint
        public EcoProductManager getEcoProductManager() {
            return this.z0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.extensions.EcoDevicePoint
        public EcoProductManagerInternal getEcoProductManagerInternal() {
            return this.z0.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.extensions.EcoDevicePoint
        public EcoProductManagerRemoteInternal getEcoProductManagerRemoteInternal() {
            return this.C0.get();
        }

        @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequestPoint
        public com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingRequest getEcoRequest() {
            return this.S1.get();
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.di.EcoRepositoryPoint
        public ISCMRepository getEcoScmRepository() {
            return new SCMRepository();
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerEntryPoint
        public IEcoSportRemoteData getEcoSportDataCaller() {
            return new EcoSportDataCaller();
        }

        @Override // com.xiaomi.fitness.sport.eco.export.EcoSportManagerPoint
        public EcoSportManager getEcoSportManager() {
            return this.Q1.get();
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerEntryPoint
        public IEcoSportRemoteState getEcoSportStateCaller() {
            return new EcoSportStateCaller();
        }

        @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleActivityFinishHelperPoint
        public ElectronicScaleActivityFinishHelper getElectronicScaleActivityFinishHelper() {
            return this.F0.get();
        }

        @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperPoint
        public ElectronicScaleCMDHelper getElectronicScaleCMDHelper() {
            return this.G0.get();
        }

        @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScalePoint
        public ElectronicScaleManager getElectronicScaleManager() {
            return this.H0.get();
        }

        @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestPoint
        public ElectronicScaleRequest getElectronicScaleRequest() {
            return this.I0.get();
        }

        @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleShareHelperPoint
        public ElectronicScaleShareHelper getElectronicScaleShareHelper() {
            return this.J0.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.emergency.EmergencyContactHelperPoint
        public EmergencyContactSyncHelper getEmergencyContactHelper() {
            return new EmergencyContactSyncHelperImpl();
        }

        @Override // com.xiaomi.fitness.exception.export.ExceptionHelperPoint
        public ExceptionHelper getExceptionHelper() {
            return this.L0.get();
        }

        @Override // com.xiaomi.fit.fitness.sync.export.di.FitnessSyncEntryPoint
        public FitnessExternalSyncer getExternalFitnessSyncer() {
            return this.P.get();
        }

        @Override // com.xiaomi.fitness.watch.face.export.FaceDebugHelperPoint
        public FaceDebugHelper getFaceDebugHelper() {
            return this.m2.get();
        }

        @Override // com.xiaomi.fitness.watch.face.export.FaceHelperPoint
        public FaceHelper getFaceHelper() {
            return this.n2.get();
        }

        @Override // com.xiaomi.fitness.watch.face.export.FaceWearOsHelperPoint
        public FaceWearOsHelper getFaceWearOsHelper() {
            return this.o2.get();
        }

        @Override // com.xiaomi.fitness.wearos.export.WearOsUtilPoint
        public FastPairManager getFastPairManager() {
            return this.p2.get();
        }

        @Override // com.xiaomi.fitness.feedback.export.UploadFileManagerPoint
        public WearosBugreportInter getFeedbackUploadDeviceLogDialogUtil() {
            return this.N0.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.FindPhoneHelperPoint
        public FindPhoneHelper getFindPhoneHelper() {
            return new FindPhoneHelperImpl();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public FitnessDataGetter getFitnessDataItemGetter() {
            return this.G.get();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public FitnessDataRecorder getFitnessDataRecord() {
            return this.F.get();
        }

        @Override // com.xiaomi.fit.fitness.manager.FitnessSyncPoint
        public FitnessDataSyncManager getFitnessSyncManager() {
            return this.P.get();
        }

        @Override // com.xiaomi.fit.fitness.sync.export.di.FitnessSyncEntryPoint
        public FitnessSyncer getFitnessSyncer() {
            return this.P.get();
        }

        @Override // com.xiaomi.fitness.sport_eco.ftp.request.FtpEntryPoint
        public FtpApi getFtpApi() {
            return h0();
        }

        @Override // com.xiaomi.fitness.user.info.export.GoalPageManagerPoint
        public GoalPageManager getGoalPageManager() {
            return this.i2.get();
        }

        @Override // com.xiaomi.fit.fitness.di.FitnessEntryPoint, com.xiaomi.fitness.net.BaseRequest.RequestPoint
        public Gson getGson() {
            return this.x.get();
        }

        @Override // com.xiaomi.fitness.sport_manager_export.di.GymEntryPoint
        public IGym getGym() {
            return new com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModelExt();
        }

        @Override // com.example.habit.export.HabitManagerPoint
        public HabitManager getHabitManager() {
            return this.l.get();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public HealthConnectApi getHealthConnectApi() {
            return this.M.get();
        }

        @Override // com.xiaomi.fitness.health.export.HealthPagePoint
        public IHealthPage getHealthPage() {
            return this.Q0.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.HelthMonitorManagerPoint
        public HealthMonitorManager getHelthMonitorManager() {
            return j0();
        }

        @Override // com.xiaomi.fitness.net.extensions.HttpPoint
        public HttpConfig getHttpConfig() {
            return this.k1.get();
        }

        @Override // com.xiaomi.wearable.HuamiPoint
        public HuamiApiClient getHuamiApiManager() {
            return this.r2.get();
        }

        @Override // com.xiaomi.fitness.instance.InstancePoint
        public Map<Class<?>, Object> getInstanceMap() {
            return ImmutableMap.builderWithExpectedSize(7).g(HeartrateMeasurer.class, this.S0.get()).g(MilinkManager.class, this.T0.get()).g(MotionRecognizer.class, this.U0.get()).g(SleepTracer.class, this.V0.get()).g(ConfigurationInternal.class, A1()).g(StandDetectManager.class, this.W0.get()).g(StepProviderInternal.class, new PhoneStepsProviderImpl()).a();
        }

        @Override // com.xiaomi.fitness.stand.extensions.StandDetectEntryPoint
        public StandDetectInternalManager getInternalManager() {
            return this.W0.get();
        }

        @Override // com.xiaomi.fitness.sport_export.JustDancePoint
        public IJustDanceApi getJustDance() {
            return this.T1.get();
        }

        @Override // com.mi.fitness.lpamanagement.export.LpaManagementPoint
        public LpaManagementHelper getLpamanagementHelper() {
            return this.w.get();
        }

        @Override // com.mi.fitness.checkupdate.util.CheckupdateInterface, com.xiaomi.fitness.main.export.MainHelperPoint
        public MainHelper getMainHelper() {
            return this.v.get();
        }

        @Override // com.xiaomi.fitness.map.export.MapExportPoint
        public IMapExportService getMapExport() {
            return this.b1.get();
        }

        @Override // com.xiaomi.fitness.medal.export.MedalManagerPoint
        public MedalManager getMedalManager() {
            return this.e1.get();
        }

        @Override // com.xiaomi.fitness.media.export.MediaPoint, com.xiaomi.fitness.notify.init.NotifyComponent.MediaPoint
        public MediaHelper getMediaHelper() {
            return this.g1.get();
        }

        @Override // com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRepositoryEntryPoint
        public IMedicalIdRepository getMedicalIdRepository() {
            return this.l2.get();
        }

        @Override // com.xiaomi.fitness.membership.export.MembershipHelperPoint
        public MembershipHelper getMembershipHelper() {
            return this.h1.get();
        }

        @Override // commi.health.message.center.export.MessageCenterPoint
        public IMessageCenter getMessageCenterImpl() {
            return this.x2.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.sleepai.MiAicrManagerPoint
        public MiAicrManager getMiAicrManager() {
            return new MiAicrManagerImp();
        }

        @Override // com.xiaomi.fitness.mine.export.MineSettingManagerPoint
        public MineSettingManager getMineSettingManager() {
            return r1();
        }

        @Override // com.xiaomi.fitness.motion.recognition.extensions.MotionRecognitionPoint
        public MotionRecognizerInternal getMotionRecognizerInternal() {
            return this.U0.get();
        }

        @Override // com.xiaomi.fitness.sport_manager_export.di.SportMusicPoint, com.xiaomi.fitness.sport_manager_export.di.SportMusicPoint2
        public IMusicPlayer getMusicPlayer() {
            return new SportMusicManager();
        }

        @Override // com.xiaomi.fitness.nfc.export.NfcManagerPoint
        public NfcManager getNfcManager() {
            return this.t1.get();
        }

        @Override // com.xiaomi.fitness.notify.di.NotificationFocusManagerPoint
        public NotificationFocusInterface getNotificationFocusManager() {
            return new NotificationFocusManager();
        }

        @Override // com.xiaomi.fitness.devicesettings.bluttooth.music.NotificationManagerExportPoint, com.xiaomi.fitness.notify.export.NotificationManagerExportPoint
        public NotificationManagerExportInter getNotificationManagerExportInter() {
            return new NotificationManagerExport();
        }

        @Override // com.xiaomi.fitness.notify.di.NotificationManagerPoint
        public NotificationManagerInter getNotificationManagerImpl() {
            return s1();
        }

        @Override // com.xiaomi.fitness.notify.di.NotifyStartPoint
        public NotifyStartInterface getNotifyStartHelper() {
            return new NotifyStartImpl();
        }

        @Override // com.xiaomi.fitness.electronic.scale.request.OTARequestPoint
        public OTARequest getOTARequest() {
            return this.K0.get();
        }

        @Override // com.example.statistics.export.OneTrackPoint
        public IOnetrack getOneTrackInstance() {
            return this.m.get();
        }

        @Override // com.xiaomi.fitness.eco.device.manager.export.OtherDeviceLoaderPoint
        public OtherDeviceLoaderManager getOtherDeviceLoaderManager() {
            return this.A0.get();
        }

        @Override // com.xiaomi.fitness.sport_manager_export.di.SportManagerPreferencePoint
        public ISportManagerPreference getPFPoint() {
            return new SportManagerPreferenceExt();
        }

        @Override // com.xiaomi.fit.fitness.sync.export.di.PaiGoalEntryPoint
        public PaiDataInterface getPaiGoalData() {
            return this.Q.get();
        }

        @Override // com.xiaomi.fitness.pay.export.PaymentManagerPoint
        public PaymentManager getPaymentManager() {
            return this.u1.get();
        }

        @Override // com.fitness.permission.manager.export.PermissionPoint
        public IPermissionManager getPermissionManger() {
            return this.f11505r.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.phonemute.PhoneMuteHelperPoint
        public PhoneMuteHelper getPhoneMuteHelper() {
            return this.r0.get();
        }

        @Override // com.xiaomi.fitness.active.pk.export.PkPagePoint
        public IPkExport getPkPage() {
            return this.W.get();
        }

        @Override // com.xiaomi.fitness.medal.export.PopMedalRepoPoint
        public IPopMedalListRepo getPopMedalRepo() {
            return this.f1.get();
        }

        @Override // com.xiaomi.fitness.privacy.export.PrivacyHelperPoint
        public PrivacyHelper getPrivacyHelper() {
            return this.v1.get();
        }

        @Override // com.xiaomi.fitness.device.manager.DevicePoint
        public ProductManager<Product> getProductManager() {
            return this.d0.get();
        }

        @Override // com.xiaomi.fitness.device.manager.extensions.DevicePoint
        public ProductManagerInternal getProductManagerInternal() {
            return this.g0.get();
        }

        @Override // com.xiaomi.fitness.device.manager.extensions.DevicePoint
        public ProductManagerRemoteInternal getProductManagerRemoteInternal() {
            return this.l0.get();
        }

        @Override // com.xiaomi.fitness.push.export.PushManagerPoint
        public PushManager getPushManager() {
            return this.w1.get();
        }

        @Override // com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExportPoint
        public RNDeviceManager getRNDeviceManager() {
            return this.A1.get();
        }

        @Override // com.xiaomi.fitness.login.export.RegionManagerPoint
        public RegionManager getRegionManager() {
            return this.a1.get();
        }

        @Override // com.xiaomi.fitness.net.BaseRequest.RequestPoint
        public Repository getRepository() {
            return this.s1.get();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public IRepositoryProvider getRepositoryProvider() {
            return this.H.get();
        }

        @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingRequestPoint
        public LocalSportSettingRequest getRequest() {
            return this.R1.get();
        }

        @Override // com.xiaomi.fitness.res.preload.export.ResPreloadPoint
        public ResPreloadManager getResPreloadManager() {
            return u1();
        }

        @Override // com.xiaomi.fitness.research.export.ResearchPoint
        public ResearchSupporter getResearchSupporter() {
            return this.y1.get();
        }

        @Override // com.xiaomi.fitness.rn.export.extensions.RnSettingsExportPoint
        public RnSettingsExportApi getRnSettingsExport() {
            return this.B1.get();
        }

        @Override // com.xiaomi.fitness.running.group.export.RunningGroupEntryPoint
        public RunningGroupApi getRunningGroupApi() {
            return v1();
        }

        @Override // com.xiaomi.fitness.sport_export.RunningRouteAccessPoint
        public IRunningRouteApi getRunningRouteAccessPoint() {
            return this.W1.get();
        }

        @Override // com.xiaomi.fitness.sport_manager_export.di.RepositoryPoint
        public com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository getScmRepository() {
            return new com.xiaomi.fitness.sport_manager.db.SCMRepository();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public FitnessServerSyncer getServerSyncer() {
            return this.I.get();
        }

        @Override // com.xiaomi.fitness.user.info.export.SetPageManagerPoint
        public SetPageManager getSetPageManager() {
            return this.j2.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.SettingsPageUtilPoint
        public SettingsPageUtil getSettingsPageUtil() {
            return this.p0.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.SleepModelHelperPoint
        public SleepModelHelper getSleepModelHelper() {
            return this.q0.get();
        }

        @Override // com.xiaomi.fitness.sleep.trace.extensions.SleepTracerPoint
        public SleepTracerInternal getSleepTracerInternal() {
            return this.V0.get();
        }

        @Override // com.xiaomi.fitness.sport_export.SportAccessPoint
        public ISportAccessApi getSportAccessPoint() {
            return this.X1.get();
        }

        @Override // com.xiaomi.fitness.sport_export.SportAidongGameEntryPoint
        public SportAidongGameApi getSportAidongGameApi() {
            return new SportAidongGameApiImpl();
        }

        @Override // com.xiaomi.fitness.sport_manager_export.di.SportManagerEntryPoint
        public ISportRemoteData getSportDataCaller() {
            return new SportDataCaller();
        }

        @Override // com.xiaomi.fitness.trail.export.SportRecordPoint
        public SportRecordApi getSportRecordApi() {
            return this.d2.get();
        }

        @Override // com.xiaomi.fitness.sport_manager_export.di.SportManagerEntryPoint
        public ISportRemoteState getSportStateCaller() {
            return new SportStateCaller();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public SportSummaryApi getSportSummaryApi() {
            return this.L.get();
        }

        @Override // com.xiaomi.fit.fitness.di.FitnessEntryPoint
        public SportSummaryRepo getSportSummaryRepo() {
            return this.B.get();
        }

        @Override // com.xiaomi.fitness.sport_xms_export.FaceHelperPoint
        public SportXmsHelper getSportXmsHelper() {
            return this.Y1.get();
        }

        @Override // com.xiaomi.fit.fitness.export.di.FitnessDataEntryPoint
        public ISummarySyncManager getSummarySyncManager() {
            return this.J.get();
        }

        @Override // com.xiaomi.fitness.sync.export.di.SyncExportManagerPoint
        public SyncExportManager getSyncExportManager() {
            return this.Z1.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperPoint
        public DeviceSettingsSyncHelper getSyncHelper() {
            return this.s0.get();
        }

        @Override // com.xiaomi.fit.fitness.export.di.SyncServerPoint
        public ThirdPartyDataServerSyncer getSyncServer() {
            return this.N.get();
        }

        @Override // com.xiaomi.fitness.device.manager.export.TempManagerPoint
        public TempManager getTempManager() {
            return this.j0.get();
        }

        @Override // com.xiaomi.fitness.account.extensions.AccountPoint, s3q.c
        public TokenManager getTokenManager() {
            return this.T.get();
        }

        @Override // com.xiaomi.fitness.route.export.api.TrackApiPoint
        public TrackApi getTrackApi() {
            return this.C1.get();
        }

        @Override // com.xiaomi.fitness.route.export.track.TrackNetPoint
        public TrackNet getTrackNet() {
            return this.E1.get();
        }

        @Override // com.xiaomi.fitness.training_plan_export.manager.TrainingManagerPoint
        public ITrainingManager getTrainingManager() {
            return this.e2.get();
        }

        @Override // com.xiaomi.fitness.ubox.export.UboxGuideManagerPoint
        public UboxGuideManager getUboxGuideManager() {
            return this.f2.get();
        }

        @Override // com.xiaomi.fitness.feedback.export.UploadFileManagerPoint
        public UploadFileManager getUploadFileManager() {
            return this.M0.get();
        }

        @Override // com.xiaomi.eco.api.n.a, com.xiaomi.fitness.account.extensions.AccountPoint, xhq.b, yhq.b, s3q.c
        public UserInfoManager getUserInfoManager() {
            return this.A.get();
        }

        @Override // com.xiaomi.fitness.user.info.export.UserInformationManagerPoint
        public UserInformationManager getUserInformationManager() {
            return this.k2.get();
        }

        @Override // com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelperPoint
        public WearModeHelper getWearModeHelper() {
            return this.t0.get();
        }

        @Override // com.xiaomi.fitness.wearos.export.WearOsUtilPoint
        public WearOSUtil getWearOSUtil() {
            return this.q2.get();
        }

        @Override // com.xiaomi.fitness.device.manager.export.DevicePoint
        public WearableDeviceManager getWearableDeviceManager() {
            return this.Z.get();
        }

        @Override // com.xiaomi.fitness.device.manager.export.DevicePoint
        public WearableProductManager getWearableProductManager() {
            return this.g0.get();
        }

        @Override // com.xiaomi.fitness.sync.export.di.SyncExportManagerPoint
        public WeatherSyncManager getWeatherSyncManager() {
            return this.a2.get();
        }

        @Override // com.xms.wearable.export.XmsManagerPoint
        public XmsManager getXmsManager() {
            return this.v2.get();
        }

        @Override // com.xiaomi.wearable.yrn.export.YRNDebugHelperPoint
        public YRNDebugHelper getYRNDebugHelper() {
            return this.s2.get();
        }

        @Override // com.xiaomi.wearable.yrn.export.YRNHelperPoint
        public YRNHelper getYRNHelper() {
            return this.t2.get();
        }

        @Override // com.xiaomi.wearable.yrn.export.YRNPushHandlerPoint
        public YRNPushHandler getYRNPushHandlerHelper() {
            return this.u2.get();
        }

        public FtpApiImpl h0() {
            return new FtpApiImpl(i0());
        }

        public final SportAccessApiImp h1(SportAccessApiImp sportAccessApiImp) {
            j9n.a(sportAccessApiImp, Z());
            return sportAccessApiImp;
        }

        public FtpRequest i0() {
            return N0(yqa.a());
        }

        public final SportRecordApiImpl i1(SportRecordApiImpl sportRecordApiImpl) {
            etn.a(sportRecordApiImpl, this.c2.get());
            return sportRecordApiImpl;
        }

        public HealthMonitorManagerImpl j0() {
            return new HealthMonitorManagerImpl(this.b0.get(), this.x.get());
        }

        public final SportSummaryRepo j1(SportSummaryRepo sportSummaryRepo) {
            o3o.a(sportSummaryRepo, this.x.get());
            return sportSummaryRepo;
        }

        public final void k0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.f11504k = u27.c(new C0374a(this.j, 0));
            this.l = u27.c(new C0374a(this.j, 1));
            this.m = u27.c(new C0374a(this.j, 2));
            this.n = u27.c(new C0374a(this.j, 4));
            this.o = u27.c(new C0374a(this.j, 5));
            this.p = u27.c(new C0374a(this.j, 3));
            this.q = u27.c(new C0374a(this.j, 6));
            this.f11505r = u27.c(new C0374a(this.j, 7));
            this.s = u27.c(new C0374a(this.j, 8));
            this.t = u27.c(new C0374a(this.j, 10));
            this.u = u27.c(new C0374a(this.j, 9));
            this.v = u27.c(new C0374a(this.j, 11));
            this.w = u27.c(new C0374a(this.j, 12));
            this.x = u27.c(new C0374a(this.j, 13));
            this.y = u27.c(new C0374a(this.j, 14));
            this.z = u27.c(new C0374a(this.j, 16));
            this.A = u27.c(new C0374a(this.j, 15));
            this.B = u27.c(new C0374a(this.j, 17));
            this.C = u27.c(new C0374a(this.j, 19));
            this.D = u27.c(new C0374a(this.j, 18));
            this.E = u27.c(new C0374a(this.j, 20));
            this.F = u27.c(new C0374a(this.j, 21));
            this.G = u27.c(new C0374a(this.j, 22));
            this.H = u27.c(new C0374a(this.j, 23));
            this.I = u27.c(new C0374a(this.j, 24));
        }

        public final SportSummaryRequest k1(SportSummaryRequest sportSummaryRequest) {
            q3o.a(sportSummaryRequest, this.x.get());
            return sportSummaryRequest;
        }

        public final void l0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.J = u27.c(new C0374a(this.j, 25));
            this.K = u27.c(new C0374a(this.j, 26));
            this.L = u27.c(new C0374a(this.j, 27));
            this.M = u27.c(new C0374a(this.j, 28));
            this.N = u27.c(new C0374a(this.j, 29));
            this.O = u27.c(new C0374a(this.j, 30));
            this.P = u27.c(new C0374a(this.j, 31));
            this.Q = u27.c(new C0374a(this.j, 32));
            this.R = u27.c(new C0374a(this.j, 33));
            this.S = u27.c(new C0374a(this.j, 34));
            this.T = u27.c(new C0374a(this.j, 35));
            this.U = u27.c(new C0374a(this.j, 38));
            this.V = u27.c(new C0374a(this.j, 37));
            this.W = u27.c(new C0374a(this.j, 36));
            this.X = u27.c(new C0374a(this.j, 39));
            this.Y = u27.c(new C0374a(this.j, 40));
            this.Z = u27.c(new C0374a(this.j, 42));
            this.a0 = u27.c(new C0374a(this.j, 43));
            this.b0 = u27.c(new C0374a(this.j, 41));
            this.c0 = u27.c(new C0374a(this.j, 44));
            this.d0 = u27.c(new C0374a(this.j, 45));
            this.e0 = u27.c(new C0374a(this.j, 46));
            this.f0 = u27.c(new C0374a(this.j, 47));
            this.g0 = u27.c(new C0374a(this.j, 48));
            this.h0 = u27.c(new C0374a(this.j, 49));
        }

        public final StandDetectReceiver l1(StandDetectReceiver standDetectReceiver) {
            k9o.a(standDetectReceiver, this.W0.get());
            return standDetectReceiver;
        }

        public final void m0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.i0 = u27.c(new C0374a(this.j, 50));
            this.j0 = u27.c(new C0374a(this.j, 51));
            this.k0 = u27.c(new C0374a(this.j, 54));
            this.l0 = u27.c(new C0374a(this.j, 53));
            this.m0 = u27.c(new C0374a(this.j, 52));
            this.n0 = u27.c(new C0374a(this.j, 55));
            this.o0 = u27.c(new C0374a(this.j, 56));
            this.p0 = u27.c(new C0374a(this.j, 57));
            this.q0 = u27.c(new C0374a(this.j, 58));
            this.r0 = u27.c(new C0374a(this.j, 59));
            this.s0 = u27.c(new C0374a(this.j, 60));
            this.t0 = u27.c(new C0374a(this.j, 61));
            this.u0 = u27.c(new C0374a(this.j, 63));
            this.v0 = u27.c(new C0374a(this.j, 62));
            this.w0 = u27.c(new C0374a(this.j, 64));
            this.x0 = u27.c(new C0374a(this.j, 65));
            this.y0 = u27.c(new C0374a(this.j, 66));
            this.z0 = u27.c(new C0374a(this.j, 67));
            this.A0 = u27.c(new C0374a(this.j, 68));
            this.B0 = u27.c(new C0374a(this.j, 71));
            this.C0 = u27.c(new C0374a(this.j, 70));
            this.D0 = u27.c(new C0374a(this.j, 69));
            this.E0 = u27.c(new C0374a(this.j, 72));
            this.F0 = u27.c(new C0374a(this.j, 73));
            this.G0 = u27.c(new C0374a(this.j, 74));
        }

        public final SyncObservers m1(SyncObservers syncObservers) {
            pto.a(syncObservers, e0());
            return syncObservers;
        }

        public final void n0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.H0 = u27.c(new C0374a(this.j, 75));
            this.I0 = u27.c(new C0374a(this.j, 76));
            this.J0 = u27.c(new C0374a(this.j, 77));
            this.K0 = u27.c(new C0374a(this.j, 78));
            this.L0 = u27.c(new C0374a(this.j, 79));
            this.M0 = u27.c(new C0374a(this.j, 80));
            this.N0 = u27.c(new C0374a(this.j, 81));
            this.O0 = u27.c(new C0374a(this.j, 83));
            this.P0 = u27.c(new C0374a(this.j, 82));
            this.Q0 = u27.c(new C0374a(this.j, 84));
            this.R0 = u27.c(new C0374a(this.j, 86));
            this.S0 = u27.c(new C0374a(this.j, 85));
            this.T0 = u27.c(new C0374a(this.j, 87));
            this.U0 = u27.c(new C0374a(this.j, 88));
            this.V0 = u27.c(new C0374a(this.j, 89));
            this.W0 = u27.c(new C0374a(this.j, 90));
            this.X0 = u27.c(new C0374a(this.j, 91));
            this.Y0 = u27.c(new C0374a(this.j, 92));
            this.Z0 = u27.c(new C0374a(this.j, 94));
            this.a1 = u27.c(new C0374a(this.j, 93));
            this.b1 = u27.c(new C0374a(this.j, 95));
            this.c1 = u27.c(new C0374a(this.j, 96));
            this.d1 = u27.c(new C0374a(this.j, 98));
            this.e1 = u27.c(new C0374a(this.j, 97));
            this.f1 = u27.c(new C0374a(this.j, 99));
        }

        public final TokenManagerImpl n1(TokenManagerImpl tokenManagerImpl) {
            jip.a(tokenManagerImpl, this.z.get());
            return tokenManagerImpl;
        }

        public final void o0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.g1 = u27.c(new C0374a(this.j, 100));
            this.h1 = u27.c(new C0374a(this.j, 101));
            this.i1 = u27.c(new C0374a(this.j, 103));
            this.j1 = u27.c(new C0374a(this.j, 102));
            this.k1 = u27.c(new C0374a(this.j, 107));
            this.l1 = new C0374a(this.j, 110);
            this.m1 = u27.c(new C0374a(this.j, 111));
            this.n1 = u27.c(new C0374a(this.j, 109));
            this.o1 = u27.c(new C0374a(this.j, 112));
            this.p1 = u27.c(new C0374a(this.j, 108));
            this.q1 = u27.c(new C0374a(this.j, 106));
            this.r1 = u27.c(new C0374a(this.j, 105));
            this.s1 = u27.c(new C0374a(this.j, 104));
            this.t1 = u27.c(new C0374a(this.j, 113));
            this.u1 = u27.c(new C0374a(this.j, 114));
            this.v1 = u27.c(new C0374a(this.j, 115));
            this.w1 = u27.c(new C0374a(this.j, 116));
            this.x1 = u27.c(new C0374a(this.j, 117));
            this.y1 = u27.c(new C0374a(this.j, 118));
            this.z1 = u27.c(new C0374a(this.j, 119));
            this.A1 = u27.c(new C0374a(this.j, 120));
            this.B1 = u27.c(new C0374a(this.j, 121));
            this.C1 = u27.c(new C0374a(this.j, 122));
            this.D1 = u27.c(new C0374a(this.j, 124));
            this.E1 = u27.c(new C0374a(this.j, 123));
        }

        public final TrackRepository o1(TrackRepository trackRepository) {
            vnp.a(trackRepository, this.D1.get());
            return trackRepository;
        }

        public final void p0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.F1 = u27.c(new C0374a(this.j, 127));
            this.G1 = u27.c(new C0374a(this.j, 126));
            this.H1 = u27.c(new C0374a(this.j, 128));
            this.I1 = u27.c(new C0374a(this.j, 129));
            this.J1 = u27.c(new C0374a(this.j, 130));
            this.K1 = u27.c(new C0374a(this.j, 131));
            this.L1 = u27.c(new C0374a(this.j, 133));
            this.M1 = u27.c(new C0374a(this.j, 132));
            this.N1 = u27.c(new C0374a(this.j, 134));
            this.O1 = u27.c(new C0374a(this.j, 125));
            this.P1 = u27.c(new C0374a(this.j, 135));
            this.Q1 = u27.c(new C0374a(this.j, 136));
            this.R1 = u27.c(new C0374a(this.j, 137));
            this.S1 = u27.c(new C0374a(this.j, 138));
            this.T1 = u27.c(new C0374a(this.j, 139));
            this.U1 = u27.c(new C0374a(this.j, 142));
            this.V1 = u27.c(new C0374a(this.j, 141));
            this.W1 = u27.c(new C0374a(this.j, 140));
            this.X1 = u27.c(new C0374a(this.j, 143));
            this.Y1 = u27.c(new C0374a(this.j, 144));
            this.Z1 = u27.c(new C0374a(this.j, 145));
            this.a2 = u27.c(new C0374a(this.j, 146));
            this.b2 = u27.c(new C0374a(this.j, 149));
            this.c2 = u27.c(new C0374a(this.j, 148));
            this.d2 = u27.c(new C0374a(this.j, 147));
        }

        public final TrainingManager p1(TrainingManager trainingManager) {
            lup.a(trainingManager, this.G.get());
            lup.b(trainingManager, this.v.get());
            return trainingManager;
        }

        public final void q0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.e2 = u27.c(new C0374a(this.j, 150));
            this.f2 = u27.c(new C0374a(this.j, 151));
            this.g2 = u27.c(new C0374a(this.j, 153));
            this.h2 = u27.c(new C0374a(this.j, 152));
            this.i2 = u27.c(new C0374a(this.j, 154));
            this.j2 = u27.c(new C0374a(this.j, 155));
            this.k2 = u27.c(new C0374a(this.j, 156));
            this.l2 = u27.c(new C0374a(this.j, 157));
            this.m2 = u27.c(new C0374a(this.j, 158));
            this.n2 = u27.c(new C0374a(this.j, 159));
            this.o2 = u27.c(new C0374a(this.j, 160));
            this.p2 = u27.c(new C0374a(this.j, 161));
            this.q2 = u27.c(new C0374a(this.j, 162));
            this.r2 = u27.c(new C0374a(this.j, 163));
            this.s2 = u27.c(new C0374a(this.j, 164));
            this.t2 = u27.c(new C0374a(this.j, 165));
            this.u2 = u27.c(new C0374a(this.j, 166));
            this.v2 = u27.c(new C0374a(this.j, 167));
            this.w2 = u27.c(new C0374a(this.j, 169));
            this.x2 = u27.c(new C0374a(this.j, 168));
            this.y2 = u27.c(new C0374a(this.j, 170));
            this.z2 = u27.c(new C0374a(this.j, 172));
            this.A2 = u27.c(new C0374a(this.j, 171));
            this.B2 = u27.c(new C0374a(this.j, 174));
            this.C2 = u27.c(new C0374a(this.j, 173));
        }

        public final UserInfoManager q1(UserInfoManager userInfoManager) {
            chq.a(userInfoManager, this.z.get());
            return userInfoManager;
        }

        public final void r0(si1 si1Var, CourseScheduleSingleModule courseScheduleSingleModule, GoalNotifySingleModule goalNotifySingleModule, HttpClientModule httpClientModule, MiuiFunctionModule miuiFunctionModule, NetProxyModule netProxyModule, SmartModule smartModule, SummaryModule summaryModule, TrainingModule trainingModule) {
            this.D2 = u27.c(new C0374a(this.j, 175));
            this.E2 = u27.c(new C0374a(this.j, 176));
        }

        public MineSettingManagerImpl r1() {
            return V0(v2g.a());
        }

        public final AccessManagerImpl s0(AccessManagerImpl accessManagerImpl) {
            e50.a(accessManagerImpl, new AccessRequest());
            return accessManagerImpl;
        }

        public NotificationManagerImpl s1() {
            return new NotificationManagerImpl(ti1.a(this.f));
        }

        public final AccountManagerRemoteImpl t0(AccountManagerRemoteImpl accountManagerRemoteImpl) {
            f90.a(accountManagerRemoteImpl, this.S.get());
            return accountManagerRemoteImpl;
        }

        public OkHttpClient t1() {
            return sfc.a(this.e, this.q1.get());
        }

        public final ActivePkRepository u0(ActivePkRepository activePkRepository) {
            if0.a(activePkRepository, this.U.get());
            return activePkRepository;
        }

        public ResPreloadManagerImpl u1() {
            return b1(dpk.a());
        }

        public final CapabilityManagerImpl v0(CapabilityManagerImpl capabilityManagerImpl) {
            fj3.a(capabilityManagerImpl, w1());
            return capabilityManagerImpl;
        }

        public RunningGroupApiImpl v1() {
            return e1(i1l.a());
        }

        public final CheckUpdateManagerImpl w0(CheckUpdateManagerImpl checkUpdateManagerImpl) {
            su3.a(checkUpdateManagerImpl, this.t.get());
            return checkUpdateManagerImpl;
        }

        public Set<CapabilityModel> w1() {
            return ImmutableSet.of(com.xiaomi.fitness.aivs.di.b.a(), jw4.a(this.f11502a), com.xiaomi.fitness.devicesettings.di.a.a(), com.xiaomi.fitness.milink.di.a.a(), com.xiaomi.fitness.milink.di.b.a(), pjg.a(this.f11503b), com.xiaomi.fitness.nfc.di.b.a(), u2n.a(this.c), com.xiaomi.fitness.sport_capture.manager.a.a(), mup.a(this.d), com.xiaomi.xms.wearable.di.a.a());
        }

        public final CollectReportInfoManager x0(CollectReportInfoManager collectReportInfoManager) {
            g44.a(collectReportInfoManager, this.g2.get());
            return collectReportInfoManager;
        }

        public Set<HttpBeforeHandler> x1() {
            return ImmutableSet.of((RegionUrlSwitcherImpl) this.n1.get(), (RegionUrlSwitcherImpl) new ParameterInterceptor(), this.o1.get());
        }

        public final CompanyUserRepository y0(CompanyUserRepository companyUserRepository) {
            l94.a(companyUserRepository, this.B2.get());
            return companyUserRepository;
        }

        public Set<Interceptor> y1() {
            return ImmutableSet.of((FaceCommonInterceptor) Y(), (FaceCommonInterceptor) new UAInterceptor(), new FaceCommonInterceptor());
        }

        public final CompareImpl z0(CompareImpl compareImpl) {
            q94.a(compareImpl, this.n.get());
            return compareImpl;
        }

        public Set<ResRegistryModel> z1() {
            return ImmutableSet.copyOf((Collection) com.xiaomi.fitness.map.export.a.a());
        }
    }

    public static final class k implements jsq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11509b;
        public final b c;
        public View d;

        @Override // defpackage.jsq
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public uo9 build() {
            f6i.a(this.d, View.class);
            return new l(this.f11508a, this.f11509b, this.c, this.d);
        }

        @Override // defpackage.jsq
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public k a(View view) {
            this.d = (View) f6i.b(view);
            return this;
        }

        public k(j jVar, d dVar, b bVar) {
            this.f11508a = jVar;
            this.f11509b = dVar;
            this.c = bVar;
        }
    }

    public static final class l extends uo9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11511b;
        public final b c;
        public final l d = this;

        public l(j jVar, d dVar, b bVar, View view) {
            this.f11510a = jVar;
            this.f11511b = dVar;
            this.c = bVar;
        }

        @Override // defpackage.ot4
        public void a(CourseInfoHeaderPreView courseInfoHeaderPreView) {
        }

        @Override // defpackage.hcn
        public void b(SportCommandView sportCommandView) {
        }

        @Override // defpackage.icn
        public void c(com.xiaomi.fitness.sport.view.widget.SportCommandView sportCommandView) {
        }

        @Override // defpackage.pt4
        public void d(CourseInfoHeaderView courseInfoHeaderView) {
        }
    }

    public static final class m implements fvq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11513b;
        public SavedStateHandle c;
        public gvq d;

        @Override // defpackage.fvq
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public vo9 build() {
            f6i.a(this.c, SavedStateHandle.class);
            f6i.a(this.d, gvq.class);
            return new n(this.f11512a, this.f11513b, new ContentItemModule(), new FeatureItemModule(), this.c, this.d);
        }

        @Override // defpackage.fvq
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public m a(SavedStateHandle savedStateHandle) {
            this.c = (SavedStateHandle) f6i.b(savedStateHandle);
            return this;
        }

        @Override // defpackage.fvq
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public m b(gvq gvqVar) {
            this.d = (gvq) f6i.b(gvqVar);
            return this;
        }

        public m(j jVar, d dVar) {
            this.f11512a = jVar;
            this.f11513b = dVar;
        }
    }

    public static final class n extends vo9 {
        public dei<BindHuamiViewModel> A;
        public dei<DeviceDualAuthorizationViewModel> A0;
        public dei<GuideWebViewViewModel> A1;
        public dei<MyTrackLibraryVM> A2;
        public dei<StandViewModel> A3;
        public dei<BindLocalViewModel> B;
        public dei<DeviceFaceMarketViewModel> B0;
        public dei<HabitPlanSuggestVM> B1;
        public dei<NewPayViewModel> B2;
        public dei<StressViewModel> B3;
        public dei<com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalViewModel> C;
        public dei<DeviceInstallAPPInfoDebugViewModel> C0;
        public dei<HabitShareViewModel> C1;
        public dei<NfcSettingViewModel> C2;
        public dei<SyncEseViewModel> C3;
        public dei<BindRopeSkippingListViewModel> D;
        public dei<DeviceListViewModel> D0;
        public dei<HabitTodayViewModel> D1;
        public dei<OtherDeviceTabV4ViewModel> D2;
        public dei<TempViewModel> D3;
        public dei<BindThirdPartyDeviceViewModel> E;
        public dei<DeviceSettingListViewModel> E0;
        public dei<HabitViewModel> E1;
        public dei<PaiViewModel> E2;
        public dei<TemperatureSettingViewModel> E3;
        public dei<BindViewModel> F;
        public dei<DeviceShareDetailViewModel> F0;
        public dei<HealthCheckViewModel> F1;
        public dei<PayChannelViewModel> F2;
        public dei<TemperatureViewModel> F3;
        public dei<BleHrSettingViewModel> G;
        public dei<DeviceShareViewModel> G0;
        public dei<HealthShowAllDataViewModel> G1;
        public dei<PayResultViewModel> G2;
        public dei<ThirdAppDetailViewModel> G3;
        public dei<BlePressureSettingViewModel> H;
        public dei<DeviceTabParentViewModel> H0;
        public dei<HealthViewModel> H1;
        public dei<PaymentOrderPageListViewModel> H2;
        public dei<ThirdAppLocalViewModel> H3;
        public dei<BleSleepSettingViewModel> I;
        public dei<DeviceTabV4ViewModel> I0;
        public dei<HearingEnvironmentalNoiseViewModel> I1;
        public dei<PhysicalStatusViewModel> I2;
        public dei<ThirdAppMarketListViewModel> I3;
        public dei<BleSmsReplyViewModel> J;
        public dei<DimTotalVM> J0;
        public dei<HeartRateDetectViewModel> J1;
        public dei<PlanDetailViewModel> J2;
        public dei<ThreeTargetRViewModel> J3;
        public dei<BleSpo2SettingViewModel> K;
        public dei<DoorCardViewModel> K0;
        public dei<HistoryDetailViewModel> K1;
        public dei<PrivacyViewModel> K2;
        public dei<ThreeTargetViewModel> K3;
        public dei<BloodGlucoseViewModel> L;
        public dei<EcgViewModel> L0;
        public dei<HistoryViewModel> L1;
        public dei<ReceiveUserInfoViewModel> L2;
        public dei<TrackDetailVM> L3;
        public dei<BloodPressureViewModel> M;
        public dei<EcoBindViewModel> M0;
        public dei<HrmRViewModel> M1;
        public dei<RechargeViewModel> M2;
        public dei<TrainingLoadViewModel> M3;
        public dei<CallNotifyViewModel> N;
        public dei<EcoCourseAudioVM> N0;
        public dei<HrmViewModel> N1;
        public dei<RecordListVM> N2;
        public dei<TrainingTypeListVM> N3;
        public dei<CarCardViewModel> O;
        public dei<com.mi.health.course.eco.vm.EcoCourseAudioVM> O0;
        public dei<HuamiHrSettingViewModel> O1;
        public dei<RecordMainVM> O2;
        public dei<TransferInViewModel> O3;
        public dei<CardListViewModel> P;
        public dei<EcoCourseInfoVM> P0;
        public dei<HuamiPressureSettingViewModel> P1;
        public dei<RegionSelectListViewModel> P2;
        public dei<TransferOutViewModel> P3;
        public dei<CardManagerViewModel> Q;
        public dei<com.mi.health.course.eco.vm.EcoCourseInfoVM> Q0;
        public dei<HuamiSleepSettingViewModel> Q1;
        public dei<RegionViewModel> Q2;
        public dei<TransitViewModel> Q3;
        public dei<CardOrderDetailViewModel> R;
        public dei<EcoCourseSmartHrVM> R0;
        public dei<HuamiSmsReplyViewModel> R1;
        public dei<ReissueMasterCardViewModel> R2;
        public dei<TransitionCardRecordViewModel> R3;
        public dei<CardPrepareViewModel> S;
        public dei<EcoCourseVideoVM> S0;
        public dei<HuamiSpo2SettingViewModel> S1;
        public dei<RelativeCareViewModel> S2;
        public dei<TsmResultViewModel> S3;
        public dei<CardRenameViewModel> T;
        public dei<com.mi.health.course.eco.vm.EcoCourseVideoVM> T0;
        public dei<IndoorRidingSportVM> T1;
        public dei<com.xiaomi.fitness.relative.ui.RelativeCareViewModel> T2;
        public dei<UserDataViewModel> T3;
        public dei<CardReturnNoticeViewModel> U;
        public dei<EcoRoutingActivityViewModel> U0;
        public dei<IndoorRunningSportVM> U1;
        public dei<RelativeHealthViewModel> U2;
        public dei<UserGuideViewModel> U3;
        public dei<ClaimRecordsViewModel> V;
        public dei<EmergencyContactListViewModel> V0;
        public dei<IndoorSportVM> V1;
        public dei<RelativeViewModel> V2;
        public dei<UserManageViewModel> V3;
        public dei<CloudDoorViewModel> W;
        public dei<EnergyViewModel> W0;
        public dei<InputUserIdViewModel> W1;
        public dei<ReportViewModel> W2;
        public dei<UserinfoSelectViewModel> W3;
        public dei<CommonSportVM> X;
        public dei<FaceBleInfoViewModel> X0;
        public dei<IntervalTrainingDurationVM> X1;
        public dei<RunningIndicatorViewModel> X2;
        public dei<com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel> X3;
        public dei<CopyCardViewModel> Y;
        public dei<FaceCategoryViewModel> Y0;
        public dei<IntervalTrainingNumberVM> Y1;
        public dei<RunningPostureViewModel> Y2;
        public dei<VerifyViewModel> Y3;
        public dei<CouponViewModel> Z;
        public dei<FaceDesignerViewModel> Z0;
        public dei<IntervalTrainingVM> Z1;
        public dei<RunningRouteDetailViewModel> Z2;
        public dei<VideoViewModel> Z3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentItemModule f11514a;
        public dei<CourseAudioVM> a0;
        public dei<FaceDetailViewModel> a1;
        public dei<IssueDoor3CardViewModel> a2;
        public dei<RunningRouteHistoryViewModel> a3;
        public dei<VirtualMemberDayViewModel> a4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FeatureItemModule f11515b;
        public dei<CourseCatalogAllVM> b0;
        public dei<FaceEditPhotoCropViewModel> b1;
        public dei<IssueRechargeViewModel> b2;
        public dei<RunningRouteListVM> b3;
        public dei<VitalityViewModel> b4;
        public final j c;
        public dei<CourseCatalogVM> c0;
        public dei<FaceEditPhotoPickerViewModel> c1;
        public dei<IssuerListViewModel> c2;
        public dei<SZTReturnCardViewModel> c3;
        public dei<WebViewVM> c4;
        public final d d;
        public dei<CourseFeedVM> d0;
        public dei<FaceEditVideoCropViewModel> d1;
        public dei<IssuerViewModel> d2;
        public dei<ScanDeviceViewModel> d3;
        public dei<WeightViewModel> d4;
        public final n e = this;
        public dei<CourseHeartRateVM> e0;
        public dei<FaceEditViewModel> e1;
        public dei<JumpGoalVM> e2;
        public dei<Sedentary2ViewModel> e3;
        public dei<WidgetManagerV2ViewModel> e4;
        public dei<AbilityQuestionViewModel> f;
        public dei<CourseInfoVM> f0;
        public dei<FaceHMInfoViewModel> f1;
        public dei<JumpingSportVM> f2;
        public dei<SelectActiveWayViewModel> f3;
        public dei<WidgetMangerViewModel> f4;
        public dei<AboutDeviceViewModel> g;
        public dei<CourseMeVM> g0;
        public dei<FaceMeViewModel> g1;
        public dei<JustDanceControlViewModel> g2;
        public dei<ShareCaloConsumViewModel> g3;
        public dei<YoYoCardViewModel> g4;
        public dei<AboutViewModel> h;
        public dei<CourseSearchVM> h0;
        public dei<FacePaidListViewModel> h1;
        public dei<JustDanceLaunchViewModel> h2;
        public dei<ShareSportTagetViewModel> h3;
        public dei<AcceptListViewModel> i;
        public dei<CourseSeriesVM> i0;
        public dei<FaceTabListViewModel> i1;
        public dei<LaunchSportVM> i2;
        public dei<SleepDiaryUpdateViewModel> i3;
        public dei<AccessDeviceManagerViewModel> j;
        public dei<CourseVideoVM> j0;
        public dei<FallDetectionViewModel> j1;
        public dei<com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM> j2;
        public dei<SleepInterfereReportViewModel> j3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public dei<AccessViewModel> f11516k;
        public dei<CourseVipVM> k0;
        public dei<FeedbackQuestionViewModel> k1;
        public dei<LaunchSportViewModel> k2;
        public dei<SleepModelViewModel> k3;
        public dei<ActivePkViewModel> l;
        public dei<CreateLoadingViewModel> l0;
        public dei<FeedbackTypesViewModel> l1;
        public dei<LoginViewModel> l2;
        public dei<SleepRhythmDetailViewModel> l3;
        public dei<ActiviteCardViewModel> m;
        public dei<CreateRouteDetailViewModel> m0;
        public dei<FeedbackViewModel> m1;
        public dei<MainViewModel> m2;
        public dei<SleepRhythmMonitorViewModel> m3;
        public dei<AddCardNumberViewModel> n;
        public dei<CreateRouteViewModel> n0;
        public dei<FtpActivityViewModel> n1;
        public dei<ManageHealthFunctionViewModel> n2;
        public dei<SleepRhythmMonthItemViewModel> n3;
        public dei<AddDeviceViewModel> o;
        public dei<CurseEditVM> o0;
        public dei<FtpTestHistoryViewModel> o1;
        public dei<ManagerViewModel> o2;
        public dei<SleepRhythmSupportDevicesViewModel> o3;
        public dei<AddDoorViewModel> p;
        public dei<CurseInfoVM> p0;
        public dei<FtpTestIntroduceViewModel> p1;
        public dei<MasterCardListViewModel> p2;
        public dei<SleepSettingViewModel> p3;
        public dei<AddHabitViewModel> q;
        public dei<CurseLatestVM> q0;
        public dei<FtpTestResultV2ViewModel> q1;
        public dei<MasterTranslationViewModel> q2;
        public dei<SleepShareViewModel> q3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public dei<AppLayoutSettingViewModel> f11517r;
        public dei<CurseListVM> r0;
        public dei<FtpTestResultViewModel> r1;
        public dei<MedalDetailViewModel> r2;
        public dei<SleepViewModel> r3;
        public dei<AppSortViewModel> s;
        public dei<CurseMainVM> s0;
        public dei<FtpV2ActivityViewModel> s1;
        public dei<MedalShareViewModel> s2;
        public dei<SplashViewModel> s3;
        public dei<AutoSwitchCardViewModel> t;
        public dei<CurseMonthVM> t0;
        public dei<GoalGuideViewModel> t1;
        public dei<MedalViewModel> t2;
        public dei<Spo2ViewModel> t3;
        public dei<BanCardSplashViewModel> u;
        public dei<CurseResetVM> u0;
        public dei<GoalRemindViewModel> u1;
        public dei<MedicalIdViewModel> u2;
        public dei<SportLockScreenViewModel> u3;
        public dei<BankCardDetailViewModel> v;
        public dei<CurseSetVM> v0;
        public dei<GoalVM> v1;
        public dei<MessageCenterViewModel> v2;
        public dei<com.xiaomi.fitness.sport_eco.view.lockscreen.viewmodel.SportLockScreenViewModel> v3;
        public dei<BaseHealthMonitorViewModel> w;
        public dei<CurseSymVM> w0;
        public dei<GuideNotificationViewModel> w1;
        public dei<MiSportViewModel> w2;
        public dei<SportSortViewModel> w3;
        public dei<BasicDataViewModel> x;
        public dei<Cvn2ViewModel> x0;
        public dei<GuideOpenKeepAliveSettingViewModel> x1;
        public dei<MineV4ViewModel> x2;
        public dei<SportTabV4ViewModel> x3;
        public dei<BasicRelativeDataViewModel> y;
        public dei<DataManagementViewModel> y0;
        public dei<GuideViewModel> y1;
        public dei<MineViewModel> y2;
        public dei<SportVideoViewModel> y3;
        public dei<BindEcoViewModel> z;
        public dei<DataReportViewModel> z0;
        public dei<GuideWearInstructionViewModel> z1;
        public dei<MyHabitListViewModel> z2;
        public dei<StandDetectViewModel> z3;

        /* JADX INFO: renamed from: com.xiaomi.fitness.a$n$a, reason: collision with other inner class name */
        public static final class C0375a<T> implements dei<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f11518a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f11519b;
            public final n c;
            public final int d;

            public C0375a(j jVar, d dVar, n nVar, int i) {
                this.f11518a = jVar;
                this.f11519b = dVar;
                this.c = nVar;
                this.d = i;
            }

            private T a() {
                switch (this.d) {
                    case 0:
                        return (T) this.c.i3(ur.a());
                    case 1:
                        return (T) this.c.j3(yy.a());
                    case 2:
                        return (T) this.c.l3(nz.a());
                    case 3:
                        return (T) new AcceptListViewModel();
                    case 4:
                        return (T) this.c.m3(o40.a());
                    case 5:
                        return (T) this.c.o3(g70.a());
                    case 6:
                        return (T) this.c.p3(lf0.a());
                    case 7:
                        return (T) new ActiviteCardViewModel();
                    case 8:
                        return (T) new AddCardNumberViewModel();
                    case 9:
                        return (T) this.c.r3(oq0.a(this.f11518a.g0.get()));
                    case 10:
                        return (T) new AddDoorViewModel();
                    case 11:
                        return (T) this.c.s3(ws0.a());
                    case 12:
                        return (T) new AppLayoutSettingViewModel();
                    case 13:
                        return (T) new AppSortViewModel();
                    case 14:
                        return (T) this.c.t3(ps1.a());
                    case 15:
                        return (T) new BanCardSplashViewModel();
                    case 16:
                        return (T) new BankCardDetailViewModel();
                    case 17:
                        return (T) this.c.u3(w72.a());
                    case 18:
                        return (T) this.c.v3(zf2.a());
                    case 19:
                        return (T) this.c.w3(pg2.a());
                    case 20:
                        return (T) this.c.x3(kl2.a());
                    case 21:
                        return (T) this.c.y3(ul2.a());
                    case 22:
                        return (T) this.c.z3(jm2.a());
                    case 23:
                        return (T) this.c.A3(im2.a());
                    case 24:
                        return (T) new BindRopeSkippingListViewModel();
                    case 25:
                        return (T) this.c.B3(no2.a());
                    case 26:
                        return (T) this.c.C3(so2.a());
                    case 27:
                        return (T) this.c.E3(hr2.a());
                    case 28:
                        return (T) this.c.F3(ct2.a());
                    case 29:
                        return (T) this.c.G3(bu2.a());
                    case 30:
                        return (T) new BleSmsReplyViewModel();
                    case 31:
                        return (T) this.c.H3(ru2.a());
                    case 32:
                        return (T) this.c.I3(ey2.a());
                    case 33:
                        return (T) this.c.J3(v03.a());
                    case 34:
                        return (T) this.c.L3(ra3.a());
                    case 35:
                        return (T) new CarCardViewModel();
                    case 36:
                        return (T) new CardListViewModel();
                    case 37:
                        return (T) new CardManagerViewModel();
                    case 38:
                        return (T) new CardOrderDetailViewModel();
                    case 39:
                        return (T) new CardPrepareViewModel();
                    case 40:
                        return (T) new CardRenameViewModel();
                    case 41:
                        return (T) new CardReturnNoticeViewModel();
                    case 42:
                        return (T) this.c.M3(rz3.a());
                    case 43:
                        return (T) new CloudDoorViewModel();
                    case 44:
                        return (T) this.c.Q3(e84.a());
                    case 45:
                        return (T) new CopyCardViewModel();
                    case 46:
                        return (T) new CouponViewModel();
                    case 47:
                        return (T) this.c.R3(oo4.a());
                    case 48:
                        return (T) this.c.S3(qp4.a());
                    case 49:
                        return (T) this.c.T3(bq4.a());
                    case 50:
                        return (T) this.c.U3(zq4.a());
                    case 51:
                        return (T) this.c.V3(qr4.a());
                    case 52:
                        return (T) this.c.W3(tt4.a());
                    case 53:
                        return (T) this.c.X3(cv4.a());
                    case 54:
                        return (T) this.c.Y3(vw4.a());
                    case 55:
                        return (T) this.c.Z3(gx4.a());
                    case 56:
                        return (T) this.c.a4(zy4.a());
                    case 57:
                        return (T) this.c.b4(h05.a());
                    case 58:
                        return (T) this.c.d4(s05.a());
                    case 59:
                        return (T) this.c.e4(u25.a());
                    case 60:
                        return (T) this.c.f4(c45.a(this.f11518a.U1.get()));
                    case 61:
                        return (T) this.c.g4(f65.a());
                    case 62:
                        return (T) this.c.h4(r65.a());
                    case 63:
                        return (T) this.c.i4(c75.a());
                    case 64:
                        return (T) this.c.j4(n75.a());
                    case 65:
                        return (T) this.c.k4(i85.a());
                    case 66:
                        return (T) this.c.l4(u85.a());
                    case 67:
                        return (T) this.c.m4(xa5.a());
                    case 68:
                        return (T) this.c.n4(zb5.a());
                    case 69:
                        return (T) this.c.o4(ec5.a());
                    case 70:
                        return (T) new Cvn2ViewModel();
                    case 71:
                        return (T) this.c.p4(bm5.a());
                    case 72:
                        return (T) this.c.r4(pn5.a());
                    case 73:
                        return (T) this.c.t4(d46.a());
                    case 74:
                        return (T) new DeviceFaceMarketViewModel();
                    case 75:
                        return (T) new DeviceInstallAPPInfoDebugViewModel();
                    case 76:
                        return (T) new DeviceListViewModel();
                    case 77:
                        return (T) this.c.v4(tc6.a());
                    case 78:
                        return (T) new DeviceShareDetailViewModel();
                    case 79:
                        return (T) new DeviceShareViewModel();
                    case 80:
                        return (T) this.c.y4(rs6.a());
                    case 81:
                        return (T) this.c.z4(zt6.a(this.f11518a.Z.get(), this.f11518a.b0.get()));
                    case 82:
                        return (T) this.c.A4(iw6.a(this.f11518a.L.get()));
                    case 83:
                        return (T) new DoorCardViewModel();
                    case 84:
                        return (T) this.c.B4(qc7.a());
                    case 85:
                        return (T) this.c.C4(uh7.a());
                    case 86:
                        return (T) this.c.D4(il7.a());
                    case 87:
                        return (T) this.c.E4(hl7.a());
                    case 88:
                        return (T) this.c.F4(pn7.a());
                    case 89:
                        return (T) this.c.G4(on7.a());
                    case 90:
                        return (T) this.c.H4(yo7.a());
                    case 91:
                        return (T) this.c.I4(kq7.a());
                    case 92:
                        return (T) this.c.J4(jq7.a());
                    case 93:
                        return (T) this.c.K4(kw7.a());
                    case 94:
                        return (T) new EmergencyContactListViewModel();
                    case 95:
                        return (T) this.c.L4(gb8.a());
                    case 96:
                        return (T) this.c.M4(qn8.a());
                    case 97:
                        return (T) this.c.N4(eo8.a());
                    case 98:
                        return (T) this.c.P4(np8.a());
                    case 99:
                        return (T) this.c.R4(lr8.a());
                    default:
                        throw new AssertionError(this.d);
                }
            }

            private T b() {
                switch (this.d) {
                    case 100:
                        return (T) new FaceEditPhotoCropViewModel();
                    case 101:
                        return (T) this.c.U4(mu8.a());
                    case 102:
                        return (T) new FaceEditVideoCropViewModel();
                    case 103:
                        return (T) this.c.V4(mw8.a());
                    case 104:
                        return (T) this.c.W4(ey8.a());
                    case 105:
                        return (T) this.c.X4(h49.a());
                    case 106:
                        return (T) this.c.Z4(t49.a());
                    case 107:
                        return (T) this.c.a5(k69.a());
                    case 108:
                        return (T) this.c.c5(u99.a());
                    case 109:
                        return (T) this.c.f5(sj9.a());
                    case 110:
                        return (T) this.c.g5(hk9.a());
                    case 111:
                        return (T) this.c.h5(rk9.a());
                    case 112:
                        return (T) this.c.i5(sqa.a());
                    case 113:
                        return (T) new FtpTestHistoryViewModel(this.f11518a.i0());
                    case 114:
                        return (T) new FtpTestIntroduceViewModel();
                    case 115:
                        return (T) new FtpTestResultV2ViewModel();
                    case 116:
                        return (T) new FtpTestResultViewModel(this.f11518a.i0());
                    case 117:
                        return (T) this.c.j5(nta.a());
                    case 118:
                        return (T) this.c.k5(j1b.a());
                    case 119:
                        return (T) new GoalRemindViewModel();
                    case 120:
                        return (T) new GoalVM();
                    case 121:
                        return (T) new GuideNotificationViewModel();
                    case 122:
                        return (T) new GuideOpenKeepAliveSettingViewModel();
                    case 123:
                        return (T) new GuideViewModel();
                    case 124:
                        return (T) new GuideWearInstructionViewModel();
                    case 125:
                        return (T) new GuideWebViewViewModel();
                    case 126:
                        return (T) this.c.n5(phb.a());
                    case 127:
                        return (T) this.c.o5(rib.a());
                    case 128:
                        return (T) this.c.p5(rjb.a());
                    case 129:
                        return (T) this.c.q5(zjb.a());
                    case 130:
                        return (T) this.c.r5(ipb.a());
                    case 131:
                        return (T) new HealthShowAllDataViewModel();
                    case 132:
                        return (T) this.c.t5(m3c.a());
                    case 133:
                        return (T) this.c.u5(m4c.a());
                    case 134:
                        return (T) this.c.v5(x5c.a());
                    case 135:
                        return (T) this.c.x5(n8c.a());
                    case 136:
                        return (T) this.c.z5(y8c.a());
                    case 137:
                        return (T) this.c.A5(sec.a());
                    case 138:
                        return (T) this.c.B5(gfc.a());
                    case 139:
                        return (T) this.c.C5(zkc.a());
                    case 140:
                        return (T) this.c.D5(klc.a());
                    case 141:
                        return (T) this.c.E5(wlc.a());
                    case 142:
                        return (T) new HuamiSmsReplyViewModel();
                    case 143:
                        return (T) this.c.F5(kmc.a());
                    case 144:
                        return (T) this.c.G5(h8d.a());
                    case 145:
                        return (T) this.c.H5(t9d.a());
                    case 146:
                        return (T) this.c.I5(aad.a());
                    case 147:
                        return (T) new InputUserIdViewModel();
                    case 148:
                        return (T) new IntervalTrainingDurationVM();
                    case 149:
                        return (T) new IntervalTrainingNumberVM();
                    case 150:
                        return (T) new IntervalTrainingVM();
                    case 151:
                        return (T) new IssueDoor3CardViewModel();
                    case 152:
                        return (T) new IssueRechargeViewModel();
                    case 153:
                        return (T) new IssuerListViewModel();
                    case 154:
                        return (T) new IssuerViewModel();
                    case 155:
                        return (T) new JumpGoalVM();
                    case 156:
                        return (T) this.c.J5(xvd.a());
                    case 157:
                        return (T) this.c.L5(sxd.a());
                    case 158:
                        return (T) this.c.N5(gyd.a());
                    case 159:
                        return (T) this.c.P5(k5e.a());
                    case 160:
                        return (T) this.c.Q5(j5e.a(this.f11518a.i0()));
                    case 161:
                        return (T) this.c.R5(v5e.a());
                    case 162:
                        return (T) this.c.T5(ire.a());
                    case 163:
                        return (T) this.c.V5(q2f.a());
                    case 164:
                        return (T) new ManageHealthFunctionViewModel();
                    case 165:
                        return (T) this.c.W5(s3f.a());
                    case 166:
                        return (T) new MasterCardListViewModel();
                    case 167:
                        return (T) new MasterTranslationViewModel();
                    case 168:
                        return (T) this.c.X5(vcf.a());
                    case 169:
                        return (T) this.c.Z5(rhf.a());
                    case 170:
                        return (T) this.c.a6(nif.a());
                    case 171:
                        return (T) this.c.c6(qnf.a());
                    case 172:
                        return (T) new MessageCenterViewModel();
                    case 173:
                        return (T) this.c.d6(pwf.a());
                    case 174:
                        return (T) this.c.f6(u3g.a());
                    case 175:
                        return (T) this.c.g6(i4g.a());
                    case 176:
                        return (T) this.c.h6(qeg.a());
                    case 177:
                        return (T) this.c.j6(tfg.a());
                    case 178:
                        return (T) new NewPayViewModel();
                    case 179:
                        return (T) new NfcSettingViewModel();
                    case 180:
                        return (T) this.c.l6(ydh.a());
                    case 181:
                        return (T) this.c.m6(ejh.a());
                    case 182:
                        return (T) this.c.o6(cnh.a());
                    case SportReportBaseParser.ReportType.entryTime /* 183 */:
                        return (T) this.c.q6(qoh.a());
                    case SportReportBaseParser.ReportType.exitTime /* 184 */:
                        return (T) this.c.s6(tph.a());
                    case 185:
                        return (T) this.c.t6(qvh.a());
                    case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                        return (T) this.c.v6(ozh.a());
                    case SportReportBaseParser.ReportType.avgAscentRate /* 187 */:
                        return (T) this.c.w6(aai.a());
                    case SportReportBaseParser.ReportType.avgDescentRate /* 188 */:
                        return (T) new ReceiveUserInfoViewModel();
                    case SportReportBaseParser.ReportType.descentCount /* 189 */:
                        return (T) new RechargeViewModel();
                    case SportReportBaseParser.ReportType.maxWaterTemperature /* 190 */:
                        return (T) this.c.x6(u7k.a());
                    case SportReportBaseParser.ReportType.minWaterTemperature /* 191 */:
                        return (T) this.c.y6(h8k.a());
                    case 192:
                        return (T) this.c.z6(pck.a());
                    case SportReportBaseParser.ReportType.divingOTU /* 193 */:
                        return (T) this.c.B6(xck.a());
                    case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                        return (T) new ReissueMasterCardViewModel();
                    case SportReportBaseParser.ReportType.oxygenPartialPressureThreshold /* 195 */:
                        return (T) new RelativeCareViewModel(this.f11518a.w2.get());
                    case SportReportBaseParser.ReportType.oxygenConcentration /* 196 */:
                        return (T) this.c.C6(igk.a());
                    case SportReportBaseParser.ReportType.noFlyDuration /* 197 */:
                        return (T) this.c.D6(bik.a());
                    case SportReportBaseParser.ReportType.algorithmDataSource /* 198 */:
                        return (T) this.c.E6(pik.a());
                    case 199:
                        return (T) new ReportViewModel();
                    default:
                        throw new AssertionError(this.d);
                }
            }

            public final T c() {
                switch (this.d) {
                    case 200:
                        return (T) this.c.F6(b2l.a());
                    case 201:
                        return (T) this.c.G6(h2l.a());
                    case 202:
                        return (T) this.c.H6(v2l.a());
                    case 203:
                        return (T) this.c.I6(l3l.a());
                    case 204:
                        return (T) this.c.J6(u4l.a());
                    case 205:
                        return (T) new SZTReturnCardViewModel();
                    case 206:
                        return (T) this.c.K6(ndl.a());
                    case 207:
                        return (T) this.c.L6(kql.a());
                    case 208:
                        return (T) new SelectActiveWayViewModel();
                    case 209:
                        return (T) this.c.M6(k4m.a());
                    case 210:
                        return (T) this.c.N6(p9m.a());
                    case 211:
                        return (T) new SleepDiaryUpdateViewModel();
                    case 212:
                        return (T) new SleepInterfereReportViewModel(this.f11518a.E2.get());
                    case 213:
                        return (T) this.c.P6(pqm.a());
                    case 214:
                        return (T) new SleepRhythmDetailViewModel();
                    case 215:
                        return (T) new SleepRhythmMonitorViewModel();
                    case 216:
                        return (T) new SleepRhythmMonthItemViewModel();
                    case 217:
                        return (T) new SleepRhythmSupportDevicesViewModel();
                    case 218:
                        return (T) this.c.R6(cym.a());
                    case 219:
                        return (T) this.c.S6(jym.a());
                    case 220:
                        return (T) this.c.T6(l1n.a());
                    case 221:
                        return (T) new SplashViewModel();
                    case 222:
                        return (T) this.c.U6(z8n.a());
                    case SportReportBaseParser.ReportType.targetValueNumber /* 223 */:
                        return (T) this.c.V6(jqn.a());
                    case SportReportBaseParser.ReportType.avgFreq /* 224 */:
                        return (T) this.c.W6(iqn.a());
                    case SportReportBaseParser.ReportType.maxFreq /* 225 */:
                        return (T) new SportSortViewModel();
                    case 226:
                        return (T) this.c.X6(l4o.a());
                    case 227:
                        return (T) this.c.Z6(r5o.a());
                    case 228:
                        return (T) new StandDetectViewModel();
                    case 229:
                        return (T) this.c.a7(dbo.a());
                    case 230:
                        return (T) this.c.b7(wko.a());
                    case ErrorCode.ERROR_SP_NOTICE_NOT_READY /* 231 */:
                        return (T) new SyncEseViewModel();
                    case ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE /* 232 */:
                        return (T) new TempViewModel();
                    case 233:
                        return (T) new TemperatureSettingViewModel();
                    case 234:
                        return (T) this.c.c7(n4p.a());
                    case 235:
                        return (T) this.c.d7(w9p.a());
                    case 236:
                        return (T) this.c.e7(uap.a());
                    case 237:
                        return (T) this.c.f7(zap.a());
                    case 238:
                        return (T) this.c.g7(fdp.a());
                    case 239:
                        return (T) this.c.h7(ldp.a());
                    case 240:
                        return (T) this.c.j7(mmp.a());
                    case 241:
                        return (T) this.c.k7(vtp.a());
                    case 242:
                        return (T) this.c.m7(jwp.a());
                    case 243:
                        return (T) new TransferInViewModel();
                    case 244:
                        return (T) new TransferOutViewModel();
                    case 245:
                        return (T) new TransitViewModel();
                    case 246:
                        return (T) new TransitionCardRecordViewModel();
                    case 247:
                        return (T) new TsmResultViewModel();
                    case 248:
                        return (T) this.c.n7(lfq.a());
                    case 249:
                        return (T) this.c.p7(yfq.a());
                    case 250:
                        return (T) this.c.q7(shq.a());
                    case VibrateModeSetViewModel.DEFAULT_BBJI /* 251 */:
                        return (T) this.c.s7(dlq.a());
                    case 252:
                        return (T) this.c.t7(clq.a());
                    case 253:
                        return (T) new VerifyViewModel();
                    case 254:
                        return (T) new VideoViewModel();
                    case 255:
                        return (T) new VirtualMemberDayViewModel();
                    case 256:
                        return (T) this.c.u7(j2r.a());
                    case 257:
                        return (T) new WebViewVM();
                    case SportSummary.VERSION_102 /* 258 */:
                        return (T) this.c.v7(nhr.a());
                    case SportSummary.VERSION_103 /* 259 */:
                        return (T) new WidgetManagerV2ViewModel();
                    case 260:
                        return (T) new WidgetMangerViewModel();
                    case SportSummary.VERSION_105 /* 261 */:
                        return (T) new YoYoCardViewModel();
                    default:
                        throw new AssertionError(this.d);
                }
            }

            @Override // javax.inject.Provider
            public T get() {
                int i = this.d / 100;
                if (i == 0) {
                    return a();
                }
                if (i == 1) {
                    return b();
                }
                if (i == 2) {
                    return c();
                }
                throw new AssertionError(this.d);
            }
        }

        public n(j jVar, d dVar, ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.c = jVar;
            this.d = dVar;
            this.f11514a = contentItemModule;
            this.f11515b = featureItemModule;
            W2(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            Z2(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            a3(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            b3(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            c3(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            d3(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            e3(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            f3(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            g3(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            X2(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
            Y2(contentItemModule, featureItemModule, savedStateHandle, gvqVar);
        }

        public CommonSportModel A2() {
            return O3(d84.a());
        }

        public final com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalViewModel A3(com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalViewModel bindLocalViewModel) {
            yh7.a(bindLocalViewModel, this.c.u0.get());
            return bindLocalViewModel;
        }

        public final DimTotalVM A4(DimTotalVM dimTotalVM) {
            mw6.a(dimTotalVM, this.c.G.get());
            mw6.b(dimTotalVM, this.c.c2.get());
            return dimTotalVM;
        }

        public final HrmRViewModel A5(HrmRViewModel hrmRViewModel) {
            tg2.a(hrmRViewModel, this.c.H.get());
            return hrmRViewModel;
        }

        public final RegionSelectModel A6(RegionSelectModel regionSelectModel) {
            j92.a(regionSelectModel, this.c.s1.get());
            return regionSelectModel;
        }

        public MainModel A7() {
            return U5(v1f.a());
        }

        public com.xiaomi.fitness.sport_eco.model.CommonSportModel B2() {
            return P3(c84.a());
        }

        public final BindThirdPartyDeviceViewModel B3(BindThirdPartyDeviceViewModel bindThirdPartyDeviceViewModel) {
            wo2.a(bindThirdPartyDeviceViewModel, this.c.Z.get());
            return bindThirdPartyDeviceViewModel;
        }

        public final EcgViewModel B4(EcgViewModel ecgViewModel) {
            dg2.a(ecgViewModel, this.c.H.get());
            uc7.a(ecgViewModel, this.c.A2.get());
            return ecgViewModel;
        }

        public final HrmViewModel B5(HrmViewModel hrmViewModel) {
            dg2.a(hrmViewModel, this.c.H.get());
            return hrmViewModel;
        }

        public final RegionViewModel B6(RegionViewModel regionViewModel) {
            qf2.a(regionViewModel, K7());
            bdk.a(regionViewModel, new RegionByIpRequest());
            bdk.c(regionViewModel, new RegionRequest());
            bdk.b(regionViewModel, this.c.a1.get());
            return regionViewModel;
        }

        public MedalModel B7() {
            return Y5(pgf.a());
        }

        public Map<Integer, TabContentItem> C2() {
            return ImmutableMap.builderWithExpectedSize(69).g(144, com.mi.fitness.checkupdate.di.a.a()).g(172, kw4.a(this.c.f11502a)).g(171, a2b.a(this.c.i)).g(210, com.mi.fitness.lpamanagement.di.a.a()).g(200, com.xiaomi.fitness.notify.di.a.a()).g(110, com.xiaomi.fitness.notify.di.c.a()).g(111, com.xiaomi.fitness.notify.di.b.a()).g(101, zh4.a(this.f11514a)).g(99, yh4.a(this.f11514a)).g(116, jg9.a()).g(115, og9.a()).g(114, mg9.a()).g(113, bg9.a()).g(129, jf9.a()).g(117, kg9.a()).g(165, qg9.a()).g(126, pg9.a()).g(156, ng9.a()).g(157, uf9.a()).g(128, lf9.a()).g(112, cg9.a()).g(169, yf9.a()).g(152, ah9.a()).g(153, lg9.a()).g(118, xf9.a()).g(133, zf9.a()).g(141, eg9.a()).g(155, eh9.a()).g(127, sf9.a()).g(124, fh9.a()).g(139, zg9.a()).g(140, yg9.a()).g(131, bh9.a()).g(135, of9.a()).g(136, ag9.a()).g(173, ch9.a()).g(179, xg9.a()).g(177, ff9.a()).g(142, hh9.a()).g(161, ug9.a()).g(204, tg9.a()).g(205, wg9.a()).g(132, hg9.a()).g(163, if9.a()).g(145, gf9.a()).g(201, gg9.a()).g(216, mf9.a()).g(130, gh9.a()).g(123, rg9.a()).g(122, dh9.a()).g(164, rf9.a()).g(137, dg9.a()).g(166, ih9.a()).g(121, vf9.a()).g(212, ig9.a()).g(134, wf9.a()).g(120, hf9.a()).g(211, qf9.a()).g(138, fg9.a()).g(125, pf9.a()).g(174, sg9.a()).g(182, nf9.a()).g(181, tf9.a()).g(217, vg9.a()).g(154, kf9.a(this.f11515b)).g(102, qw8.a()).g(180, o59.a()).g(103, pmg.a()).g(213, qmg.a()).a();
        }

        public final BindViewModel C3(BindViewModel bindViewModel) {
            wo2.a(bindViewModel, this.c.Z.get());
            return bindViewModel;
        }

        public final EcoBindViewModel C4(EcoBindViewModel ecoBindViewModel) {
            yh7.a(ecoBindViewModel, this.c.u0.get());
            return ecoBindViewModel;
        }

        public final HuamiHrSettingViewModel C5(HuamiHrSettingViewModel huamiHrSettingViewModel) {
            h82.a(huamiHrSettingViewModel, new DefaultHuamiHealthModel());
            return huamiHrSettingViewModel;
        }

        public final com.xiaomi.fitness.relative.ui.RelativeCareViewModel C6(com.xiaomi.fitness.relative.ui.RelativeCareViewModel relativeCareViewModel) {
            pgk.a(relativeCareViewModel, this.c.A.get());
            return relativeCareViewModel;
        }

        public MedicalIdModel C7() {
            return b6(onf.a());
        }

        public CreateLoadingModel D2() {
            return c4(r05.a());
        }

        public final BleHeartRateModel D3(BleHeartRateModel bleHeartRateModel) {
            vq2.a(bleHeartRateModel, this.c.x.get());
            return bleHeartRateModel;
        }

        public final EcoCourseAudioVM D4(EcoCourseAudioVM ecoCourseAudioVM) {
            km7.a(ecoCourseAudioVM, this.c.G.get());
            km7.b(ecoCourseAudioVM, this.c.a0());
            return ecoCourseAudioVM;
        }

        public final HuamiPressureSettingViewModel D5(HuamiPressureSettingViewModel huamiPressureSettingViewModel) {
            h82.a(huamiPressureSettingViewModel, new PressureModel());
            return huamiPressureSettingViewModel;
        }

        public final RelativeHealthViewModel D6(RelativeHealthViewModel relativeHealthViewModel) {
            qf2.a(relativeHealthViewModel, T2());
            return relativeHealthViewModel;
        }

        public MineModel D7() {
            return e6(l2g.a());
        }

        public DataReportModel E2() {
            return q4(nn5.a());
        }

        public final BleHrSettingViewModel E3(BleHrSettingViewModel bleHrSettingViewModel) {
            a82.a(bleHrSettingViewModel, this.c.b0.get());
            lr2.b(bleHrSettingViewModel, x2());
            lr2.a(bleHrSettingViewModel, this.c.x.get());
            return bleHrSettingViewModel;
        }

        public final com.mi.health.course.eco.vm.EcoCourseAudioVM E4(com.mi.health.course.eco.vm.EcoCourseAudioVM ecoCourseAudioVM) {
            jm7.a(ecoCourseAudioVM, this.c.G.get());
            jm7.b(ecoCourseAudioVM, this.c.a0());
            return ecoCourseAudioVM;
        }

        public final HuamiSleepSettingViewModel E5(HuamiSleepSettingViewModel huamiSleepSettingViewModel) {
            h82.a(huamiSleepSettingViewModel, new SleepModel());
            return huamiSleepSettingViewModel;
        }

        public final RelativeViewModel E6(RelativeViewModel relativeViewModel) {
            qf2.a(relativeViewModel, T2());
            tik.a(relativeViewModel, this.c.H.get());
            return relativeViewModel;
        }

        public MyTrackLibraryModel E7() {
            return i6(ofg.a());
        }

        public DeviceDualAuthorizationModel F2() {
            return s4(w36.a());
        }

        public final BlePressureSettingViewModel F3(BlePressureSettingViewModel blePressureSettingViewModel) {
            a82.a(blePressureSettingViewModel, this.c.b0.get());
            gt2.a(blePressureSettingViewModel, new com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.PressureModel());
            return blePressureSettingViewModel;
        }

        public final EcoCourseInfoVM F4(EcoCourseInfoVM ecoCourseInfoVM) {
            xn7.a(ecoCourseInfoVM, this.c.a0());
            return ecoCourseInfoVM;
        }

        public final HuamiSpo2SettingViewModel F5(HuamiSpo2SettingViewModel huamiSpo2SettingViewModel) {
            h82.a(huamiSpo2SettingViewModel, new Spo2Model());
            return huamiSpo2SettingViewModel;
        }

        public final RunningIndicatorViewModel F6(RunningIndicatorViewModel runningIndicatorViewModel) {
            dg2.a(runningIndicatorViewModel, this.c.H.get());
            return runningIndicatorViewModel;
        }

        public OtherDeviceTabModel F7() {
            return k6(mdh.a());
        }

        public DeviceSettingListModel G2() {
            return u4(nc6.a());
        }

        public final BleSleepSettingViewModel G3(BleSleepSettingViewModel bleSleepSettingViewModel) {
            a82.a(bleSleepSettingViewModel, this.c.b0.get());
            return bleSleepSettingViewModel;
        }

        public final com.mi.health.course.eco.vm.EcoCourseInfoVM G4(com.mi.health.course.eco.vm.EcoCourseInfoVM ecoCourseInfoVM) {
            wn7.a(ecoCourseInfoVM, this.c.a0());
            return ecoCourseInfoVM;
        }

        public final IndoorRidingSportVM G5(IndoorRidingSportVM indoorRidingSportVM) {
            qf2.a(indoorRidingSportVM, B2());
            l8d.a(indoorRidingSportVM, this.c.G.get());
            return indoorRidingSportVM;
        }

        public final RunningPostureViewModel G6(RunningPostureViewModel runningPostureViewModel) {
            qf2.a(runningPostureViewModel, A2());
            return runningPostureViewModel;
        }

        public PayChannelModel G7() {
            return n6(wmh.a());
        }

        public DeviceTabModel H2() {
            return w4(bs6.a());
        }

        public final BleSpo2SettingViewModel H3(BleSpo2SettingViewModel bleSpo2SettingViewModel) {
            a82.a(bleSpo2SettingViewModel, this.c.b0.get());
            vu2.a(bleSpo2SettingViewModel, new BleSpo2Model());
            return bleSpo2SettingViewModel;
        }

        public final EcoCourseSmartHrVM H4(EcoCourseSmartHrVM ecoCourseSmartHrVM) {
            km7.a(ecoCourseSmartHrVM, this.c.G.get());
            km7.b(ecoCourseSmartHrVM, this.c.a0());
            return ecoCourseSmartHrVM;
        }

        public final IndoorRunningSportVM H5(IndoorRunningSportVM indoorRunningSportVM) {
            qf2.a(indoorRunningSportVM, B2());
            x9d.a(indoorRunningSportVM, this.c.G.get());
            return indoorRunningSportVM;
        }

        public final RunningRouteDetailViewModel H6(RunningRouteDetailViewModel runningRouteDetailViewModel) {
            z2l.a(runningRouteDetailViewModel, this.c.V1.get());
            return runningRouteDetailViewModel;
        }

        public PayResultModel H7() {
            return p6(moh.a());
        }

        public DeviceTabParentModel I2() {
            return x4(qs6.a());
        }

        public final BloodGlucoseViewModel I3(BloodGlucoseViewModel bloodGlucoseViewModel) {
            dg2.a(bloodGlucoseViewModel, this.c.H.get());
            return bloodGlucoseViewModel;
        }

        public final EcoCourseVideoVM I4(EcoCourseVideoVM ecoCourseVideoVM) {
            km7.a(ecoCourseVideoVM, this.c.G.get());
            km7.b(ecoCourseVideoVM, this.c.a0());
            return ecoCourseVideoVM;
        }

        public final IndoorSportVM I5(IndoorSportVM indoorSportVM) {
            qf2.a(indoorSportVM, A2());
            ead.a(indoorSportVM, this.c.G.get());
            return indoorSportVM;
        }

        public final RunningRouteHistoryViewModel I6(RunningRouteHistoryViewModel runningRouteHistoryViewModel) {
            p3l.a(runningRouteHistoryViewModel, this.c.V1.get());
            return runningRouteHistoryViewModel;
        }

        public PaymentOrderPageListModel I7() {
            return r6(rph.a());
        }

        public FaceDesignerModel J2() {
            return O4(fp8.a());
        }

        public final BloodPressureViewModel J3(BloodPressureViewModel bloodPressureViewModel) {
            dg2.a(bloodPressureViewModel, this.c.H.get());
            z03.a(bloodPressureViewModel, this.c.O0.get());
            return bloodPressureViewModel;
        }

        public final com.mi.health.course.eco.vm.EcoCourseVideoVM J4(com.mi.health.course.eco.vm.EcoCourseVideoVM ecoCourseVideoVM) {
            jm7.a(ecoCourseVideoVM, this.c.G.get());
            jm7.b(ecoCourseVideoVM, this.c.a0());
            return ecoCourseVideoVM;
        }

        public final JumpingSportVM J5(JumpingSportVM jumpingSportVM) {
            qf2.a(jumpingSportVM, B2());
            bwd.a(jumpingSportVM, this.c.G.get());
            return jumpingSportVM;
        }

        public final RunningRouteListVM J6(RunningRouteListVM runningRouteListVM) {
            y4l.a(runningRouteListVM, this.c.V1.get());
            return runningRouteListVM;
        }

        public PlanDetailModel J7() {
            return u6(nzh.a());
        }

        public FaceDetailModel K2() {
            return Q4(br8.a());
        }

        public final CallNotifyModel K3(CallNotifyModel callNotifyModel) {
            j92.a(callNotifyModel, this.c.s1.get());
            return callNotifyModel;
        }

        public final EcoRoutingActivityViewModel K4(EcoRoutingActivityViewModel ecoRoutingActivityViewModel) {
            ow7.a(ecoRoutingActivityViewModel, this.c.a0());
            return ecoRoutingActivityViewModel;
        }

        public final JustDanceControlModel K5(JustDanceControlModel justDanceControlModel) {
            j92.a(justDanceControlModel, this.c.s1.get());
            return justDanceControlModel;
        }

        public final ScanDeviceViewModel K6(ScanDeviceViewModel scanDeviceViewModel) {
            rdl.a(scanDeviceViewModel, this.c.g0.get());
            rdl.b(scanDeviceViewModel, this.c.D2.get());
            return scanDeviceViewModel;
        }

        public RegionSelectModel K7() {
            return A6(uck.a());
        }

        public FaceEditModel L2() {
            return S4(qt8.a());
        }

        public final CallNotifyViewModel L3(CallNotifyViewModel callNotifyViewModel) {
            qf2.a(callNotifyViewModel, y2());
            return callNotifyViewModel;
        }

        public final EnergyViewModel L4(EnergyViewModel energyViewModel) {
            dg2.a(energyViewModel, this.c.H.get());
            return energyViewModel;
        }

        public final JustDanceControlViewModel L5(JustDanceControlViewModel justDanceControlViewModel) {
            qf2.a(justDanceControlViewModel, w7());
            return justDanceControlViewModel;
        }

        public final Sedentary2ViewModel L6(Sedentary2ViewModel sedentary2ViewModel) {
            h82.a(sedentary2ViewModel, new DefaultHuamiHealthModel());
            oql.b(sedentary2ViewModel, new SedentaryModel());
            oql.a(sedentary2ViewModel, this.c.b0.get());
            return sedentary2ViewModel;
        }

        public SleepModelModel L7() {
            return O6(kqm.a());
        }

        public FaceEditPhotoPickerModel M2() {
            return T4(lu8.a());
        }

        public final ClaimRecordsViewModel M3(ClaimRecordsViewModel claimRecordsViewModel) {
            vz3.a(claimRecordsViewModel, new ScaleRequest());
            return claimRecordsViewModel;
        }

        public final FaceBleInfoViewModel M4(FaceBleInfoViewModel faceBleInfoViewModel) {
            qf2.a(faceBleInfoViewModel, z2());
            un8.a(faceBleInfoViewModel, new FaceApiRequestV2());
            return faceBleInfoViewModel;
        }

        public final JustDanceLaunchModel M5(JustDanceLaunchModel justDanceLaunchModel) {
            j92.a(justDanceLaunchModel, this.c.s1.get());
            return justDanceLaunchModel;
        }

        public final ShareCaloConsumViewModel M6(ShareCaloConsumViewModel shareCaloConsumViewModel) {
            o4m.a(shareCaloConsumViewModel, this.c.A.get());
            o4m.b(shareCaloConsumViewModel, this.c.H.get());
            return shareCaloConsumViewModel;
        }

        public SleepSettingModel M7() {
            return Q6(xxm.a());
        }

        public FacePaidListModel N2() {
            return Y4(r49.a());
        }

        public final CommonBaseModel N3(CommonBaseModel commonBaseModel) {
            j92.a(commonBaseModel, this.c.s1.get());
            return commonBaseModel;
        }

        public final FaceCategoryViewModel N4(FaceCategoryViewModel faceCategoryViewModel) {
            io8.a(faceCategoryViewModel, new FaceApiRequestV2());
            return faceCategoryViewModel;
        }

        public final JustDanceLaunchViewModel N5(JustDanceLaunchViewModel justDanceLaunchViewModel) {
            qf2.a(justDanceLaunchViewModel, x7());
            return justDanceLaunchViewModel;
        }

        public final ShareSportTagetViewModel N6(ShareSportTagetViewModel shareSportTagetViewModel) {
            t9m.a(shareSportTagetViewModel, this.c.A.get());
            t9m.b(shareSportTagetViewModel, this.c.H.get());
            return shareSportTagetViewModel;
        }

        public SportVideoModel N7() {
            return Y6(q5o.a());
        }

        public FallDetectionModel O2() {
            return b5(p99.a());
        }

        public final CommonSportModel O3(CommonSportModel commonSportModel) {
            j92.a(commonSportModel, this.c.s1.get());
            return commonSportModel;
        }

        public final FaceDesignerModel O4(FaceDesignerModel faceDesignerModel) {
            j92.a(faceDesignerModel, this.c.s1.get());
            return faceDesignerModel;
        }

        public final LaunchSportModel O5(LaunchSportModel launchSportModel) {
            j92.a(launchSportModel, this.c.s1.get());
            return launchSportModel;
        }

        public final SleepModelModel O6(SleepModelModel sleepModelModel) {
            j92.a(sleepModelModel, this.c.s1.get());
            return sleepModelModel;
        }

        public TrackDetailModel O7() {
            return i7(lmp.a());
        }

        public FeedbackModel P2() {
            return d5(fj9.a());
        }

        public final com.xiaomi.fitness.sport_eco.model.CommonSportModel P3(com.xiaomi.fitness.sport_eco.model.CommonSportModel commonSportModel) {
            j92.a(commonSportModel, this.c.s1.get());
            return commonSportModel;
        }

        public final FaceDesignerViewModel P4(FaceDesignerViewModel faceDesignerViewModel) {
            qf2.a(faceDesignerViewModel, J2());
            rp8.a(faceDesignerViewModel, new FaceApiRequestV2());
            return faceDesignerViewModel;
        }

        public final LaunchSportVM P5(LaunchSportVM launchSportVM) {
            s5e.a(launchSportVM, this.c.Z());
            return launchSportVM;
        }

        public final SleepModelViewModel P6(SleepModelViewModel sleepModelViewModel) {
            qf2.a(sleepModelViewModel, L7());
            return sleepModelViewModel;
        }

        public TrainingTypeListModel P7() {
            return l7(iwp.a());
        }

        public FeedbackQuestionModel Q2() {
            return e5(mj9.a());
        }

        public final CommonSportVM Q3(CommonSportVM commonSportVM) {
            qf2.a(commonSportVM, A2());
            i84.a(commonSportVM, this.c.V1.get());
            return commonSportVM;
        }

        public final FaceDetailModel Q4(FaceDetailModel faceDetailModel) {
            j92.a(faceDetailModel, this.c.s1.get());
            return faceDetailModel;
        }

        public final com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM Q5(com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM launchSportVM) {
            r5e.a(launchSportVM, this.c.Z());
            return launchSportVM;
        }

        public final SleepSettingModel Q6(SleepSettingModel sleepSettingModel) {
            j92.a(sleepSettingModel, this.c.s1.get());
            return sleepSettingModel;
        }

        public UserGuideModel Q7() {
            return o7(vfq.a());
        }

        public HabitModel R2() {
            return l5(rfb.a());
        }

        public final CourseAudioVM R3(CourseAudioVM courseAudioVM) {
            cp4.a(courseAudioVM, this.c.G.get());
            cp4.b(courseAudioVM, this.c.a0());
            return courseAudioVM;
        }

        public final FaceDetailViewModel R4(FaceDetailViewModel faceDetailViewModel) {
            qf2.a(faceDetailViewModel, K2());
            pr8.a(faceDetailViewModel, new FaceApiRequestV2());
            return faceDetailViewModel;
        }

        public final LaunchSportViewModel R5(LaunchSportViewModel launchSportViewModel) {
            qf2.a(launchSportViewModel, y7());
            z5e.b(launchSportViewModel, this.c.b0.get());
            z5e.c(launchSportViewModel, new WeatherRequest());
            z5e.a(launchSportViewModel, this.c.V1.get());
            return launchSportViewModel;
        }

        public final SleepSettingViewModel R6(SleepSettingViewModel sleepSettingViewModel) {
            qf2.a(sleepSettingViewModel, M7());
            gym.b(sleepSettingViewModel, this.c.A.get());
            gym.a(sleepSettingViewModel, new AccountRequest());
            return sleepSettingViewModel;
        }

        public UserinfoSelectModel R7() {
            return r7(rkq.a());
        }

        public HabitPlanSuggestModel S2() {
            return m5(ohb.a());
        }

        public final CourseCatalogAllVM S3(CourseCatalogAllVM courseCatalogAllVM) {
            up4.a(courseCatalogAllVM, this.c.b0());
            return courseCatalogAllVM;
        }

        public final FaceEditModel S4(FaceEditModel faceEditModel) {
            j92.a(faceEditModel, this.c.s1.get());
            return faceEditModel;
        }

        public final LoginModel S5(LoginModel loginModel) {
            j92.a(loginModel, this.c.s1.get());
            return loginModel;
        }

        public final SleepShareViewModel S6(SleepShareViewModel sleepShareViewModel) {
            dg2.a(sleepShareViewModel, this.c.H.get());
            return sleepShareViewModel;
        }

        public HealthModel T2() {
            return s5(e0c.a());
        }

        public final CourseCatalogVM T3(CourseCatalogVM courseCatalogVM) {
            fq4.a(courseCatalogVM, this.c.b0());
            return courseCatalogVM;
        }

        public final FaceEditPhotoPickerModel T4(FaceEditPhotoPickerModel faceEditPhotoPickerModel) {
            j92.a(faceEditPhotoPickerModel, this.c.s1.get());
            return faceEditPhotoPickerModel;
        }

        public final LoginViewModel T5(LoginViewModel loginViewModel) {
            qf2.a(loginViewModel, z7());
            return loginViewModel;
        }

        public final SleepViewModel T6(SleepViewModel sleepViewModel) {
            dg2.a(sleepViewModel, this.c.H.get());
            return sleepViewModel;
        }

        public HistoryDetailModel U2() {
            return w5(l8c.a());
        }

        public final CourseFeedVM U3(CourseFeedVM courseFeedVM) {
            dr4.a(courseFeedVM, this.c.a0());
            return courseFeedVM;
        }

        public final FaceEditPhotoPickerViewModel U4(FaceEditPhotoPickerViewModel faceEditPhotoPickerViewModel) {
            qf2.a(faceEditPhotoPickerViewModel, M2());
            return faceEditPhotoPickerViewModel;
        }

        public final MainModel U5(MainModel mainModel) {
            j92.a(mainModel, this.c.s1.get());
            return mainModel;
        }

        public final Spo2ViewModel U6(Spo2ViewModel spo2ViewModel) {
            dg2.a(spo2ViewModel, this.c.H.get());
            return spo2ViewModel;
        }

        public HistoryModel V2() {
            return y5(t8c.a());
        }

        public final CourseHeartRateVM V3(CourseHeartRateVM courseHeartRateVM) {
            cp4.a(courseHeartRateVM, this.c.G.get());
            cp4.b(courseHeartRateVM, this.c.a0());
            return courseHeartRateVM;
        }

        public final FaceEditViewModel V4(FaceEditViewModel faceEditViewModel) {
            qf2.a(faceEditViewModel, L2());
            return faceEditViewModel;
        }

        public final MainViewModel V5(MainViewModel mainViewModel) {
            qf2.a(mainViewModel, A7());
            return mainViewModel;
        }

        public final SportLockScreenViewModel V6(SportLockScreenViewModel sportLockScreenViewModel) {
            qf2.a(sportLockScreenViewModel, A2());
            return sportLockScreenViewModel;
        }

        public final void W2(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.f = new C0375a(this.c, this.d, this.e, 0);
            this.g = new C0375a(this.c, this.d, this.e, 1);
            this.h = new C0375a(this.c, this.d, this.e, 2);
            this.i = new C0375a(this.c, this.d, this.e, 3);
            this.j = new C0375a(this.c, this.d, this.e, 4);
            this.f11516k = new C0375a(this.c, this.d, this.e, 5);
            this.l = new C0375a(this.c, this.d, this.e, 6);
            this.m = new C0375a(this.c, this.d, this.e, 7);
            this.n = new C0375a(this.c, this.d, this.e, 8);
            this.o = new C0375a(this.c, this.d, this.e, 9);
            this.p = new C0375a(this.c, this.d, this.e, 10);
            this.q = new C0375a(this.c, this.d, this.e, 11);
            this.f11517r = new C0375a(this.c, this.d, this.e, 12);
            this.s = new C0375a(this.c, this.d, this.e, 13);
            this.t = new C0375a(this.c, this.d, this.e, 14);
            this.u = new C0375a(this.c, this.d, this.e, 15);
            this.v = new C0375a(this.c, this.d, this.e, 16);
            this.w = new C0375a(this.c, this.d, this.e, 17);
            this.x = new C0375a(this.c, this.d, this.e, 18);
            this.y = new C0375a(this.c, this.d, this.e, 19);
            this.z = new C0375a(this.c, this.d, this.e, 20);
            this.A = new C0375a(this.c, this.d, this.e, 21);
            this.B = new C0375a(this.c, this.d, this.e, 22);
            this.C = new C0375a(this.c, this.d, this.e, 23);
            this.D = new C0375a(this.c, this.d, this.e, 24);
        }

        public final CourseInfoVM W3(CourseInfoVM courseInfoVM) {
            xt4.b(courseInfoVM, this.c.b0());
            xt4.a(courseInfoVM, this.c.a0());
            return courseInfoVM;
        }

        public final FaceHMInfoViewModel W4(FaceHMInfoViewModel faceHMInfoViewModel) {
            qf2.a(faceHMInfoViewModel, z2());
            return faceHMInfoViewModel;
        }

        public final ManagerViewModel W5(ManagerViewModel managerViewModel) {
            w3f.a(managerViewModel, this.c.Z.get());
            return managerViewModel;
        }

        public final com.xiaomi.fitness.sport_eco.view.lockscreen.viewmodel.SportLockScreenViewModel W6(com.xiaomi.fitness.sport_eco.view.lockscreen.viewmodel.SportLockScreenViewModel sportLockScreenViewModel) {
            qf2.a(sportLockScreenViewModel, B2());
            return sportLockScreenViewModel;
        }

        public final void X2(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.w3 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.maxFreq);
            this.x3 = new C0375a(this.c, this.d, this.e, 226);
            this.y3 = new C0375a(this.c, this.d, this.e, 227);
            this.z3 = new C0375a(this.c, this.d, this.e, 228);
            this.A3 = new C0375a(this.c, this.d, this.e, 229);
            this.B3 = new C0375a(this.c, this.d, this.e, 230);
            this.C3 = new C0375a(this.c, this.d, this.e, ErrorCode.ERROR_SP_NOTICE_NOT_READY);
            this.D3 = new C0375a(this.c, this.d, this.e, ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE);
            this.E3 = new C0375a(this.c, this.d, this.e, 233);
            this.F3 = new C0375a(this.c, this.d, this.e, 234);
            this.G3 = new C0375a(this.c, this.d, this.e, 235);
            this.H3 = new C0375a(this.c, this.d, this.e, 236);
            this.I3 = new C0375a(this.c, this.d, this.e, 237);
            this.J3 = new C0375a(this.c, this.d, this.e, 238);
            this.K3 = new C0375a(this.c, this.d, this.e, 239);
            this.L3 = new C0375a(this.c, this.d, this.e, 240);
            this.M3 = new C0375a(this.c, this.d, this.e, 241);
            this.N3 = new C0375a(this.c, this.d, this.e, 242);
            this.O3 = new C0375a(this.c, this.d, this.e, 243);
            this.P3 = new C0375a(this.c, this.d, this.e, 244);
            this.Q3 = new C0375a(this.c, this.d, this.e, 245);
            this.R3 = new C0375a(this.c, this.d, this.e, 246);
            this.S3 = new C0375a(this.c, this.d, this.e, 247);
            this.T3 = new C0375a(this.c, this.d, this.e, 248);
            this.U3 = new C0375a(this.c, this.d, this.e, 249);
        }

        public final CourseMeVM X3(CourseMeVM courseMeVM) {
            gv4.a(courseMeVM, this.c.a0());
            return courseMeVM;
        }

        public final FaceMeViewModel X4(FaceMeViewModel faceMeViewModel) {
            qf2.a(faceMeViewModel, z2());
            l49.a(faceMeViewModel, new FaceApiRequestV2());
            return faceMeViewModel;
        }

        public final MedalDetailViewModel X5(MedalDetailViewModel medalDetailViewModel) {
            qf2.a(medalDetailViewModel, B7());
            zcf.a(medalDetailViewModel, new MedalRequest());
            zcf.b(medalDetailViewModel, new MedalV2Request());
            return medalDetailViewModel;
        }

        public final SportTabV4ViewModel X6(SportTabV4ViewModel sportTabV4ViewModel) {
            p4o.a(sportTabV4ViewModel, this.c.V1.get());
            return sportTabV4ViewModel;
        }

        public final void Y2(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.V3 = new C0375a(this.c, this.d, this.e, 250);
            this.W3 = new C0375a(this.c, this.d, this.e, VibrateModeSetViewModel.DEFAULT_BBJI);
            this.X3 = new C0375a(this.c, this.d, this.e, 252);
            this.Y3 = new C0375a(this.c, this.d, this.e, 253);
            this.Z3 = new C0375a(this.c, this.d, this.e, 254);
            this.a4 = new C0375a(this.c, this.d, this.e, 255);
            this.b4 = new C0375a(this.c, this.d, this.e, 256);
            this.c4 = new C0375a(this.c, this.d, this.e, 257);
            this.d4 = new C0375a(this.c, this.d, this.e, SportSummary.VERSION_102);
            this.e4 = new C0375a(this.c, this.d, this.e, SportSummary.VERSION_103);
            this.f4 = new C0375a(this.c, this.d, this.e, 260);
            this.g4 = new C0375a(this.c, this.d, this.e, SportSummary.VERSION_105);
        }

        public final CourseSearchVM Y3(CourseSearchVM courseSearchVM) {
            zw4.a(courseSearchVM, this.c.b0());
            return courseSearchVM;
        }

        public final FacePaidListModel Y4(FacePaidListModel facePaidListModel) {
            j92.a(facePaidListModel, this.c.s1.get());
            return facePaidListModel;
        }

        public final MedalModel Y5(MedalModel medalModel) {
            j92.a(medalModel, this.c.s1.get());
            return medalModel;
        }

        public final SportVideoModel Y6(SportVideoModel sportVideoModel) {
            j92.a(sportVideoModel, this.c.s1.get());
            return sportVideoModel;
        }

        public final void Z2(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.E = new C0375a(this.c, this.d, this.e, 25);
            this.F = new C0375a(this.c, this.d, this.e, 26);
            this.G = new C0375a(this.c, this.d, this.e, 27);
            this.H = new C0375a(this.c, this.d, this.e, 28);
            this.I = new C0375a(this.c, this.d, this.e, 29);
            this.J = new C0375a(this.c, this.d, this.e, 30);
            this.K = new C0375a(this.c, this.d, this.e, 31);
            this.L = new C0375a(this.c, this.d, this.e, 32);
            this.M = new C0375a(this.c, this.d, this.e, 33);
            this.N = new C0375a(this.c, this.d, this.e, 34);
            this.O = new C0375a(this.c, this.d, this.e, 35);
            this.P = new C0375a(this.c, this.d, this.e, 36);
            this.Q = new C0375a(this.c, this.d, this.e, 37);
            this.R = new C0375a(this.c, this.d, this.e, 38);
            this.S = new C0375a(this.c, this.d, this.e, 39);
            this.T = new C0375a(this.c, this.d, this.e, 40);
            this.U = new C0375a(this.c, this.d, this.e, 41);
            this.V = new C0375a(this.c, this.d, this.e, 42);
            this.W = new C0375a(this.c, this.d, this.e, 43);
            this.X = new C0375a(this.c, this.d, this.e, 44);
            this.Y = new C0375a(this.c, this.d, this.e, 45);
            this.Z = new C0375a(this.c, this.d, this.e, 46);
            this.a0 = new C0375a(this.c, this.d, this.e, 47);
            this.b0 = new C0375a(this.c, this.d, this.e, 48);
            this.c0 = new C0375a(this.c, this.d, this.e, 49);
        }

        public final CourseSeriesVM Z3(CourseSeriesVM courseSeriesVM) {
            kx4.a(courseSeriesVM, this.c.b0());
            return courseSeriesVM;
        }

        public final FacePaidListViewModel Z4(FacePaidListViewModel facePaidListViewModel) {
            qf2.a(facePaidListViewModel, N2());
            x49.a(facePaidListViewModel, new FaceApiRequestV2());
            return facePaidListViewModel;
        }

        public final MedalShareViewModel Z5(MedalShareViewModel medalShareViewModel) {
            qf2.a(medalShareViewModel, B7());
            vhf.a(medalShareViewModel, this.c.A.get());
            return medalShareViewModel;
        }

        public final SportVideoViewModel Z6(SportVideoViewModel sportVideoViewModel) {
            qf2.a(sportVideoViewModel, N7());
            return sportVideoViewModel;
        }

        @Override // s7c.c
        public Map<Class<?>, Provider<dvq>> a() {
            return hee.a(ImmutableMap.builderWithExpectedSize(262).g(kt.f24270a, this.f).g(az.f3595a, this.g).g(pz.f30919a, this.h).g(g30.f18535a, this.i).g(q40.f31063a, this.j).g(i70.f20846a, this.f11516k).g(nf0.f27874a, this.l).g(jg0.f22759a, this.m).g(yp0.f40388a, this.n).g(qq0.f31733a, this.o).g(tr0.f34952a, this.p).g(ys0.f40478a, this.q).g(vg1.f36861a, this.f11517r).g(kh1.f23838a, this.s).g(rs1.f32844a, this.t).g(dy1.f16045a, this.u).g(mz1.f27360a, this.v).g(y72.f39881a, this.w).g(bg2.f4171a, this.x).g(rg2.f32512a, this.y).g(ml2.f26973a, this.z).g(wl2.f38082a, this.A).g(nm2.f28060a, this.B).g(mm2.f26993a, this.C).g(ln2.f25234a, this.D).g(po2.f30578a, this.E).g(uo2.f35957a, this.F).g(jr2.f23045a, this.G).g(et2.f17038a, this.H).g(du2.f15930a, this.I).g(hu2.f20447a, this.J).g(tu2.f35045a, this.K).g(gy2.f19453a, this.L).g(x03.f38535a, this.M).g(ta3.f34492a, this.N).g(jl3.f22902a, this.O).g(un3.f35943a, this.P).g(oo3.f29332a, this.Q).g(np3.f28216a, this.R).g(cq3.f14610a, this.S).g(qq3.f31736a, this.T).g(kr3.f24206a, this.U).g(tz3.f35201a, this.V).g(m24.f25670a, this.W).g(g84.f18710a, this.X).g(fl4.f17884a, this.Y).g(mm4.f26994a, this.Z).g(qo4.f31690a, this.a0).g(sp4.f33850a, this.b0).g(dq4.f15802a, this.c0).g(br4.f4507a, this.d0).g(sr4.f33905a, this.e0).g(vt4.f37201a, this.f0).g(ev4.f17092a, this.g0).g(xw4.f39525a, this.h0).g(ix4.f22188a, this.i0).g(bz4.f4742a, this.j0).g(j05.f22278a, this.k0).g(u05.f35236a, this.l0).g(w25.f37471a, this.m0).g(e45.f16245a, this.n0).g(h65.f19734a, this.o0).g(t65.f34359a, this.p0).g(e75.f16342a, this.q0).g(p75.f30078a, this.r0).g(k85.f23580a, this.s0).g(w85.f37713a, this.t0).g(za5.f41065a, this.u0).g(bc5.f4050a, this.v0).g(gc5.f18824a, this.w0).g(of5.f29102a, this.x0).g(dm5.f15679a, this.y0).g(rn5.f32720a, this.z0).g(f46.f17383a, this.A0).g(e56.f16275a, this.B0).g(a76.f703a, this.C0).g(b96.f3941a, this.D0).g(vc6.f36736a, this.E0).g(lo6.f25259a, this.F0).g(hp6.f20308a, this.G0).g(ts6.f34985a, this.H0).g(bu6.f4608a, this.I0).g(kw6.f24362a, this.J0).g(q27.f31012a, this.K0).g(sc7.f33501a, this.L0).g(wh7.f37971a, this.M0).g(ml7.f26977a, this.N0).g(ll7.f25196a, this.O0).g(tn7.f34866a, this.P0).g(sn7.f33806a, this.Q0).g(ap7.f3319a, this.R0).g(oq7.f29383a, this.S0).g(nq7.f28249a, this.T0).g(mw7.f27279a, this.U0).g(f88.f17519a, this.V0).g(ib8.f20965a, this.W0).g(sn8.f33807a, this.X0).g(go8.f19180a, this.Y0).g(pp8.f30604a, this.Z0).g(nr8.f28285a, this.a1).g(wt8.f38334a, this.b1).g(ou8.f29684a, this.c1).g(cw8.f14798a, this.d1).g(ow8.f29757a, this.e1).g(gy8.f19457a, this.f1).g(j49.f22401a, this.g1).g(v49.f36462a, this.h1).g(m69.f25804a, this.i1).g(w99.f37743a, this.j1).g(uj9.f35814a, this.k1).g(jk9.f22887a, this.l1).g(tk9.f34786a, this.m1).g(uqa.f36025a, this.n1).g(gra.f19264a, this.o1).g(pra.f30676a, this.p1).g(bsa.f4558a, this.q1).g(gsa.f19295a, this.r1).g(pta.f30744a, this.s1).g(l1b.f24520a, this.t1).g(g2b.f18500a, this.u1).g(m2b.f25674a, this.v1).g(r6b.f32234a, this.w1).g(e7b.f16344a, this.x1).g(s9b.f33429a, this.y1).g(y9b.f39956a, this.z1).g(fab.f17595a, this.A1).g(rhb.f32544a, this.B1).g(tib.f34735a, this.C1).g(tjb.f34759a, this.D1).g(bkb.f4309a, this.E1).g(kpb.f24135a, this.F1).g(h1c.f19570a, this.G1).g(o3c.f28692a, this.H1).g(o4c.f28727a, this.I1).g(z5c.f40904a, this.J1).g(p8c.f30119a, this.K1).g(a9c.f798a, this.L1).g(uec.f35685a, this.M1).g(ifc.f21083a, this.N1).g(blc.f4335a, this.O1).g(mlc.f26978a, this.P1).g(ylc.f40296a, this.Q1).g(cmc.f5481a, this.R1).g(mmc.f27000a, this.S1).g(j8d.f22524a, this.T1).g(v9d.f36639a, this.U1).g(cad.f5122a, this.V1).g(gbd.f18804a, this.W1).g(lgd.f25039a, this.X1).g(vgd.f36869a, this.Y1).g(ygd.f40154a, this.Z1).g(iid.f21171a, this.a2).g(ekd.f16735a, this.b2).g(vmd.f37024a, this.c2).g(gnd.f19159a, this.d2).g(hvd.f20510a, this.e2).g(zvd.f41713a, this.f2).g(uxd.f36249a, this.g2).g(iyd.f22225a, this.h2).g(o5e.f28744a, this.i2).g(n5e.f27566a, this.j2).g(x5e.f38719a, this.k2).g(kre.f24222a, this.l2).g(s2f.f33207a, this.m2).g(a3f.f572a, this.n2).g(u3f.f35335a, this.o2).g(z6f.f40950a, this.p2).g(y7f.f39889a, this.q2).g(xcf.f38969a, this.r2).g(thf.f34706a, this.s2).g(pif.f30418a, this.t2).g(snf.f33816a, this.u2).g(jrf.f23059a, this.v2).g(rwf.f32969a, this.w2).g(w3g.f37512a, this.x2).g(k4g.f23422a, this.y2).g(seg.f33564a, this.z2).g(vfg.f36847a, this.A2).g(ilg.f21271a, this.B2).g(htg.f20436a, this.C2).g(aeh.f927a, this.D2).g(gjh.f19055a, this.E2).g(enh.f16843a, this.F2).g(soh.f33840a, this.G2).g(vph.f37110a, this.H2).g(svh.f34034a, this.I2).g(qzh.f32027a, this.J2).g(cai.f5127a, this.K2).g(shj.f33649a, this.L2).g(yij.f40216a, this.M2).g(w7k.f37689a, this.N2).g(j8k.f22529a, this.O2).g(rck.f32412a, this.P2).g(zck.f41126a, this.Q2).g(ldk.f24942a, this.R2).g(mgk.f26161a, this.S2).g(lgk.f25048a, this.T2).g(dik.f15568a, this.U2).g(rik.f32574a, this.V2).g(llk.f25203a, this.W2).g(d2l.f15000a, this.X2).g(j2l.f22358a, this.Y2).g(x2l.f38617a, this.Z2).g(n3l.f27510a, this.a3).g(w4l.f37618a, this.b3).g(v8l.f36624a, this.c3).g(pdl.f30299a, this.d3).g(mql.f27105a, this.e3).g(asl.f3417a, this.f3).g(m4m.f25748a, this.g3).g(r9m.f32335a, this.h3).g(olm.f29278a, this.i3).g(som.f33844a, this.j3).g(rqm.f32805a, this.k3).g(stm.f33979a, this.l3).g(qum.f31864a, this.m3).g(uum.f36160a, this.n3).g(yvm.f40617a, this.o3).g(eym.f17197a, this.p3).g(lym.f25562a, this.q3).g(n1n.f27448a, this.r3).g(b7n.f3897a, this.s3).g(b9n.f3957a, this.t3).g(nqn.f28267a, this.u3).g(mqn.f27107a, this.v3).g(o1o.f28650a, this.w3).g(n4o.f27547a, this.x3).g(t5o.f34349a, this.y3).g(cao.f5134a, this.z3).g(fbo.f17632a, this.A3).g(yko.f40274a, this.B3).g(eto.f17063a, this.C3).g(g2p.f18515a, this.D3).g(z3p.f40848a, this.E3).g(p4p.f30000a, this.F3).g(y9p.f39967a, this.G3).g(wap.f37781a, this.H3).g(bbp.f4029a, this.I3).g(hdp.f19963a, this.J3).g(ndp.f27822a, this.K3).g(omp.f29303a, this.L3).g(xtp.f39465a, this.M3).g(lwp.f25505a, this.N3).g(dxp.f16041a, this.O3).g(vxp.f37341a, this.P3).g(jzp.f23273a, this.Q3).g(vzp.f37402a, this.R3).g(w3q.f37519a, this.S3).g(nfq.f27891a, this.T3).g(agq.f1000a, this.U3).g(uhq.f35770a, this.V3).g(hlq.f20221a, this.W3).g(glq.f19121a, this.X3).g(yoq.f40384a, this.Y3).g(yrq.f40473a, this.Z3).g(c0r.f4810a, this.a4).g(l2r.f24579a, this.b4).g(fcr.f17660a, this.c4).g(phr.f30406a, this.d4).g(djr.f15599a, this.e4).g(gjr.f19066a, this.f4).g(szr.f34138a, this.g4).a());
        }

        public final void a3(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.d0 = new C0375a(this.c, this.d, this.e, 50);
            this.e0 = new C0375a(this.c, this.d, this.e, 51);
            this.f0 = new C0375a(this.c, this.d, this.e, 52);
            this.g0 = new C0375a(this.c, this.d, this.e, 53);
            this.h0 = new C0375a(this.c, this.d, this.e, 54);
            this.i0 = new C0375a(this.c, this.d, this.e, 55);
            this.j0 = new C0375a(this.c, this.d, this.e, 56);
            this.k0 = new C0375a(this.c, this.d, this.e, 57);
            this.l0 = new C0375a(this.c, this.d, this.e, 58);
            this.m0 = new C0375a(this.c, this.d, this.e, 59);
            this.n0 = new C0375a(this.c, this.d, this.e, 60);
            this.o0 = new C0375a(this.c, this.d, this.e, 61);
            this.p0 = new C0375a(this.c, this.d, this.e, 62);
            this.q0 = new C0375a(this.c, this.d, this.e, 63);
            this.r0 = new C0375a(this.c, this.d, this.e, 64);
            this.s0 = new C0375a(this.c, this.d, this.e, 65);
            this.t0 = new C0375a(this.c, this.d, this.e, 66);
            this.u0 = new C0375a(this.c, this.d, this.e, 67);
            this.v0 = new C0375a(this.c, this.d, this.e, 68);
            this.w0 = new C0375a(this.c, this.d, this.e, 69);
            this.x0 = new C0375a(this.c, this.d, this.e, 70);
            this.y0 = new C0375a(this.c, this.d, this.e, 71);
            this.z0 = new C0375a(this.c, this.d, this.e, 72);
            this.A0 = new C0375a(this.c, this.d, this.e, 73);
            this.B0 = new C0375a(this.c, this.d, this.e, 74);
        }

        public final CourseVideoVM a4(CourseVideoVM courseVideoVM) {
            cp4.a(courseVideoVM, this.c.G.get());
            cp4.b(courseVideoVM, this.c.a0());
            return courseVideoVM;
        }

        public final FaceTabListViewModel a5(FaceTabListViewModel faceTabListViewModel) {
            o69.a(faceTabListViewModel, new FaceApiRequestV2());
            return faceTabListViewModel;
        }

        public final MedalViewModel a6(MedalViewModel medalViewModel) {
            qf2.a(medalViewModel, B7());
            rif.a(medalViewModel, new AccountRequest());
            rif.b(medalViewModel, new MedalRequest());
            rif.c(medalViewModel, new MedalV2Request());
            return medalViewModel;
        }

        public final StandViewModel a7(StandViewModel standViewModel) {
            dg2.a(standViewModel, this.c.H.get());
            return standViewModel;
        }

        @Override // s7c.c
        public Map<Class<?>, Object> b() {
            return ImmutableMap.of();
        }

        public final void b3(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.C0 = new C0375a(this.c, this.d, this.e, 75);
            this.D0 = new C0375a(this.c, this.d, this.e, 76);
            this.E0 = new C0375a(this.c, this.d, this.e, 77);
            this.F0 = new C0375a(this.c, this.d, this.e, 78);
            this.G0 = new C0375a(this.c, this.d, this.e, 79);
            this.H0 = new C0375a(this.c, this.d, this.e, 80);
            this.I0 = new C0375a(this.c, this.d, this.e, 81);
            this.J0 = new C0375a(this.c, this.d, this.e, 82);
            this.K0 = new C0375a(this.c, this.d, this.e, 83);
            this.L0 = new C0375a(this.c, this.d, this.e, 84);
            this.M0 = new C0375a(this.c, this.d, this.e, 85);
            this.N0 = new C0375a(this.c, this.d, this.e, 86);
            this.O0 = new C0375a(this.c, this.d, this.e, 87);
            this.P0 = new C0375a(this.c, this.d, this.e, 88);
            this.Q0 = new C0375a(this.c, this.d, this.e, 89);
            this.R0 = new C0375a(this.c, this.d, this.e, 90);
            this.S0 = new C0375a(this.c, this.d, this.e, 91);
            this.T0 = new C0375a(this.c, this.d, this.e, 92);
            this.U0 = new C0375a(this.c, this.d, this.e, 93);
            this.V0 = new C0375a(this.c, this.d, this.e, 94);
            this.W0 = new C0375a(this.c, this.d, this.e, 95);
            this.X0 = new C0375a(this.c, this.d, this.e, 96);
            this.Y0 = new C0375a(this.c, this.d, this.e, 97);
            this.Z0 = new C0375a(this.c, this.d, this.e, 98);
            this.a1 = new C0375a(this.c, this.d, this.e, 99);
        }

        public final CourseVipVM b4(CourseVipVM courseVipVM) {
            l05.a(courseVipVM, this.c.d0());
            return courseVipVM;
        }

        public final FallDetectionModel b5(FallDetectionModel fallDetectionModel) {
            j92.a(fallDetectionModel, this.c.s1.get());
            return fallDetectionModel;
        }

        public final MedicalIdModel b6(MedicalIdModel medicalIdModel) {
            j92.a(medicalIdModel, this.c.s1.get());
            return medicalIdModel;
        }

        public final StressViewModel b7(StressViewModel stressViewModel) {
            dg2.a(stressViewModel, this.c.H.get());
            return stressViewModel;
        }

        public final void c3(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.b1 = new C0375a(this.c, this.d, this.e, 100);
            this.c1 = new C0375a(this.c, this.d, this.e, 101);
            this.d1 = new C0375a(this.c, this.d, this.e, 102);
            this.e1 = new C0375a(this.c, this.d, this.e, 103);
            this.f1 = new C0375a(this.c, this.d, this.e, 104);
            this.g1 = new C0375a(this.c, this.d, this.e, 105);
            this.h1 = new C0375a(this.c, this.d, this.e, 106);
            this.i1 = new C0375a(this.c, this.d, this.e, 107);
            this.j1 = new C0375a(this.c, this.d, this.e, 108);
            this.k1 = new C0375a(this.c, this.d, this.e, 109);
            this.l1 = new C0375a(this.c, this.d, this.e, 110);
            this.m1 = new C0375a(this.c, this.d, this.e, 111);
            this.n1 = new C0375a(this.c, this.d, this.e, 112);
            this.o1 = new C0375a(this.c, this.d, this.e, 113);
            this.p1 = new C0375a(this.c, this.d, this.e, 114);
            this.q1 = new C0375a(this.c, this.d, this.e, 115);
            this.r1 = new C0375a(this.c, this.d, this.e, 116);
            this.s1 = new C0375a(this.c, this.d, this.e, 117);
            this.t1 = new C0375a(this.c, this.d, this.e, 118);
            this.u1 = new C0375a(this.c, this.d, this.e, 119);
            this.v1 = new C0375a(this.c, this.d, this.e, 120);
            this.w1 = new C0375a(this.c, this.d, this.e, 121);
            this.x1 = new C0375a(this.c, this.d, this.e, 122);
            this.y1 = new C0375a(this.c, this.d, this.e, 123);
            this.z1 = new C0375a(this.c, this.d, this.e, 124);
        }

        public final CreateLoadingModel c4(CreateLoadingModel createLoadingModel) {
            j92.a(createLoadingModel, this.c.s1.get());
            return createLoadingModel;
        }

        public final FallDetectionViewModel c5(FallDetectionViewModel fallDetectionViewModel) {
            qf2.a(fallDetectionViewModel, O2());
            return fallDetectionViewModel;
        }

        public final MedicalIdViewModel c6(MedicalIdViewModel medicalIdViewModel) {
            qf2.a(medicalIdViewModel, C7());
            unf.b(medicalIdViewModel, this.c.l2.get());
            unf.a(medicalIdViewModel, new AccountRequest());
            return medicalIdViewModel;
        }

        public final TemperatureViewModel c7(TemperatureViewModel temperatureViewModel) {
            dg2.a(temperatureViewModel, this.c.H.get());
            return temperatureViewModel;
        }

        public final void d3(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.A1 = new C0375a(this.c, this.d, this.e, 125);
            this.B1 = new C0375a(this.c, this.d, this.e, 126);
            this.C1 = new C0375a(this.c, this.d, this.e, 127);
            this.D1 = new C0375a(this.c, this.d, this.e, 128);
            this.E1 = new C0375a(this.c, this.d, this.e, 129);
            this.F1 = new C0375a(this.c, this.d, this.e, 130);
            this.G1 = new C0375a(this.c, this.d, this.e, 131);
            this.H1 = new C0375a(this.c, this.d, this.e, 132);
            this.I1 = new C0375a(this.c, this.d, this.e, 133);
            this.J1 = new C0375a(this.c, this.d, this.e, 134);
            this.K1 = new C0375a(this.c, this.d, this.e, 135);
            this.L1 = new C0375a(this.c, this.d, this.e, 136);
            this.M1 = new C0375a(this.c, this.d, this.e, 137);
            this.N1 = new C0375a(this.c, this.d, this.e, 138);
            this.O1 = new C0375a(this.c, this.d, this.e, 139);
            this.P1 = new C0375a(this.c, this.d, this.e, 140);
            this.Q1 = new C0375a(this.c, this.d, this.e, 141);
            this.R1 = new C0375a(this.c, this.d, this.e, 142);
            this.S1 = new C0375a(this.c, this.d, this.e, 143);
            this.T1 = new C0375a(this.c, this.d, this.e, 144);
            this.U1 = new C0375a(this.c, this.d, this.e, 145);
            this.V1 = new C0375a(this.c, this.d, this.e, 146);
            this.W1 = new C0375a(this.c, this.d, this.e, 147);
            this.X1 = new C0375a(this.c, this.d, this.e, 148);
            this.Y1 = new C0375a(this.c, this.d, this.e, 149);
        }

        public final CreateLoadingViewModel d4(CreateLoadingViewModel createLoadingViewModel) {
            qf2.a(createLoadingViewModel, D2());
            return createLoadingViewModel;
        }

        public final FeedbackModel d5(FeedbackModel feedbackModel) {
            j92.a(feedbackModel, this.c.s1.get());
            gj9.a(feedbackModel, new FeedbackRequest());
            return feedbackModel;
        }

        public final MiSportViewModel d6(MiSportViewModel miSportViewModel) {
            qf2.a(miSportViewModel, v2());
            twf.a(miSportViewModel, new AccessRequest());
            return miSportViewModel;
        }

        public final ThirdAppDetailViewModel d7(ThirdAppDetailViewModel thirdAppDetailViewModel) {
            aap.a(thirdAppDetailViewModel, this.c.x.get());
            return thirdAppDetailViewModel;
        }

        public final void e3(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.Z1 = new C0375a(this.c, this.d, this.e, 150);
            this.a2 = new C0375a(this.c, this.d, this.e, 151);
            this.b2 = new C0375a(this.c, this.d, this.e, 152);
            this.c2 = new C0375a(this.c, this.d, this.e, 153);
            this.d2 = new C0375a(this.c, this.d, this.e, 154);
            this.e2 = new C0375a(this.c, this.d, this.e, 155);
            this.f2 = new C0375a(this.c, this.d, this.e, 156);
            this.g2 = new C0375a(this.c, this.d, this.e, 157);
            this.h2 = new C0375a(this.c, this.d, this.e, 158);
            this.i2 = new C0375a(this.c, this.d, this.e, 159);
            this.j2 = new C0375a(this.c, this.d, this.e, 160);
            this.k2 = new C0375a(this.c, this.d, this.e, 161);
            this.l2 = new C0375a(this.c, this.d, this.e, 162);
            this.m2 = new C0375a(this.c, this.d, this.e, 163);
            this.n2 = new C0375a(this.c, this.d, this.e, 164);
            this.o2 = new C0375a(this.c, this.d, this.e, 165);
            this.p2 = new C0375a(this.c, this.d, this.e, 166);
            this.q2 = new C0375a(this.c, this.d, this.e, 167);
            this.r2 = new C0375a(this.c, this.d, this.e, 168);
            this.s2 = new C0375a(this.c, this.d, this.e, 169);
            this.t2 = new C0375a(this.c, this.d, this.e, 170);
            this.u2 = new C0375a(this.c, this.d, this.e, 171);
            this.v2 = new C0375a(this.c, this.d, this.e, 172);
            this.w2 = new C0375a(this.c, this.d, this.e, 173);
            this.x2 = new C0375a(this.c, this.d, this.e, 174);
        }

        public final CreateRouteDetailViewModel e4(CreateRouteDetailViewModel createRouteDetailViewModel) {
            y25.a(createRouteDetailViewModel, this.c.V1.get());
            return createRouteDetailViewModel;
        }

        public final FeedbackQuestionModel e5(FeedbackQuestionModel feedbackQuestionModel) {
            j92.a(feedbackQuestionModel, this.c.s1.get());
            nj9.a(feedbackQuestionModel, new FeedbackRequest());
            return feedbackQuestionModel;
        }

        public final MineModel e6(MineModel mineModel) {
            j92.a(mineModel, this.c.s1.get());
            return mineModel;
        }

        public final ThirdAppLocalViewModel e7(ThirdAppLocalViewModel thirdAppLocalViewModel) {
            nap.a(thirdAppLocalViewModel, new ThirdAppLocalRequest());
            return thirdAppLocalViewModel;
        }

        public final void f3(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.y2 = new C0375a(this.c, this.d, this.e, 175);
            this.z2 = new C0375a(this.c, this.d, this.e, 176);
            this.A2 = new C0375a(this.c, this.d, this.e, 177);
            this.B2 = new C0375a(this.c, this.d, this.e, 178);
            this.C2 = new C0375a(this.c, this.d, this.e, 179);
            this.D2 = new C0375a(this.c, this.d, this.e, 180);
            this.E2 = new C0375a(this.c, this.d, this.e, 181);
            this.F2 = new C0375a(this.c, this.d, this.e, 182);
            this.G2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.entryTime);
            this.H2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.exitTime);
            this.I2 = new C0375a(this.c, this.d, this.e, 185);
            this.J2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.avgDivingDepth);
            this.K2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.avgAscentRate);
            this.L2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.avgDescentRate);
            this.M2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.descentCount);
            this.N2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.maxWaterTemperature);
            this.O2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.minWaterTemperature);
            this.P2 = new C0375a(this.c, this.d, this.e, 192);
            this.Q2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.divingOTU);
            this.R2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.divingCNS);
            this.S2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.oxygenPartialPressureThreshold);
            this.T2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.oxygenConcentration);
            this.U2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.noFlyDuration);
            this.V2 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.algorithmDataSource);
            this.W2 = new C0375a(this.c, this.d, this.e, 199);
        }

        public final CreateRouteViewModel f4(CreateRouteViewModel createRouteViewModel) {
            g45.a(createRouteViewModel, this.c.V1.get());
            return createRouteViewModel;
        }

        public final FeedbackQuestionViewModel f5(FeedbackQuestionViewModel feedbackQuestionViewModel) {
            qf2.a(feedbackQuestionViewModel, Q2());
            return feedbackQuestionViewModel;
        }

        public final MineV4ViewModel f6(MineV4ViewModel mineV4ViewModel) {
            qf2.a(mineV4ViewModel, D7());
            y3g.d(mineV4ViewModel, this.c.A.get());
            y3g.c(mineV4ViewModel, this.c.S.get());
            y3g.b(mineV4ViewModel, this.c.C2.get());
            y3g.a(mineV4ViewModel, this.c.y2.get());
            y3g.e(mineV4ViewModel, new WeekReportRequest());
            return mineV4ViewModel;
        }

        public final ThirdAppMarketListViewModel f7(ThirdAppMarketListViewModel thirdAppMarketListViewModel) {
            nap.a(thirdAppMarketListViewModel, new ThirdAppMarketRequest());
            return thirdAppMarketListViewModel;
        }

        public final void g3(ContentItemModule contentItemModule, FeatureItemModule featureItemModule, SavedStateHandle savedStateHandle, gvq gvqVar) {
            this.X2 = new C0375a(this.c, this.d, this.e, 200);
            this.Y2 = new C0375a(this.c, this.d, this.e, 201);
            this.Z2 = new C0375a(this.c, this.d, this.e, 202);
            this.a3 = new C0375a(this.c, this.d, this.e, 203);
            this.b3 = new C0375a(this.c, this.d, this.e, 204);
            this.c3 = new C0375a(this.c, this.d, this.e, 205);
            this.d3 = new C0375a(this.c, this.d, this.e, 206);
            this.e3 = new C0375a(this.c, this.d, this.e, 207);
            this.f3 = new C0375a(this.c, this.d, this.e, 208);
            this.g3 = new C0375a(this.c, this.d, this.e, 209);
            this.h3 = new C0375a(this.c, this.d, this.e, 210);
            this.i3 = new C0375a(this.c, this.d, this.e, 211);
            this.j3 = new C0375a(this.c, this.d, this.e, 212);
            this.k3 = new C0375a(this.c, this.d, this.e, 213);
            this.l3 = new C0375a(this.c, this.d, this.e, 214);
            this.m3 = new C0375a(this.c, this.d, this.e, 215);
            this.n3 = new C0375a(this.c, this.d, this.e, 216);
            this.o3 = new C0375a(this.c, this.d, this.e, 217);
            this.p3 = new C0375a(this.c, this.d, this.e, 218);
            this.q3 = new C0375a(this.c, this.d, this.e, 219);
            this.r3 = new C0375a(this.c, this.d, this.e, 220);
            this.s3 = new C0375a(this.c, this.d, this.e, 221);
            this.t3 = new C0375a(this.c, this.d, this.e, 222);
            this.u3 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.targetValueNumber);
            this.v3 = new C0375a(this.c, this.d, this.e, SportReportBaseParser.ReportType.avgFreq);
        }

        public final CurseEditVM g4(CurseEditVM curseEditVM) {
            j65.a(curseEditVM, this.c.K.get());
            return curseEditVM;
        }

        public final FeedbackTypesViewModel g5(FeedbackTypesViewModel feedbackTypesViewModel) {
            qf2.a(feedbackTypesViewModel, P2());
            return feedbackTypesViewModel;
        }

        public final MineViewModel g6(MineViewModel mineViewModel) {
            qf2.a(mineViewModel, D7());
            m4g.c(mineViewModel, this.c.A.get());
            m4g.a(mineViewModel, this.c.C2.get());
            m4g.b(mineViewModel, this.c.f1.get());
            return mineViewModel;
        }

        public final ThreeTargetRViewModel g7(ThreeTargetRViewModel threeTargetRViewModel) {
            dg2.a(threeTargetRViewModel, this.c.H.get());
            return threeTargetRViewModel;
        }

        public final AbilityQuestionModel h3(AbilityQuestionModel abilityQuestionModel) {
            j92.a(abilityQuestionModel, this.c.s1.get());
            return abilityQuestionModel;
        }

        public final CurseInfoVM h4(CurseInfoVM curseInfoVM) {
            v65.a(curseInfoVM, this.c.K.get());
            return curseInfoVM;
        }

        public final FeedbackViewModel h5(FeedbackViewModel feedbackViewModel) {
            qf2.a(feedbackViewModel, P2());
            return feedbackViewModel;
        }

        public final MyHabitListViewModel h6(MyHabitListViewModel myHabitListViewModel) {
            qf2.a(myHabitListViewModel, R2());
            ueg.a(myHabitListViewModel, new HabitRequest());
            return myHabitListViewModel;
        }

        public final ThreeTargetViewModel h7(ThreeTargetViewModel threeTargetViewModel) {
            dg2.a(threeTargetViewModel, this.c.H.get());
            return threeTargetViewModel;
        }

        public final AbilityQuestionViewModel i3(AbilityQuestionViewModel abilityQuestionViewModel) {
            qf2.a(abilityQuestionViewModel, t2());
            return abilityQuestionViewModel;
        }

        public final CurseLatestVM i4(CurseLatestVM curseLatestVM) {
            g75.a(curseLatestVM, this.c.K.get());
            return curseLatestVM;
        }

        public final FtpActivityViewModel i5(FtpActivityViewModel ftpActivityViewModel) {
            wqa.a(ftpActivityViewModel, this.c.G.get());
            return ftpActivityViewModel;
        }

        public final MyTrackLibraryModel i6(MyTrackLibraryModel myTrackLibraryModel) {
            j92.a(myTrackLibraryModel, this.c.s1.get());
            return myTrackLibraryModel;
        }

        public final TrackDetailModel i7(TrackDetailModel trackDetailModel) {
            j92.a(trackDetailModel, this.c.s1.get());
            return trackDetailModel;
        }

        public final AboutDeviceViewModel j3(AboutDeviceViewModel aboutDeviceViewModel) {
            cz.a(aboutDeviceViewModel, new ScaleRequest());
            return aboutDeviceViewModel;
        }

        public final CurseListVM j4(CurseListVM curseListVM) {
            r75.a(curseListVM, this.c.K.get());
            return curseListVM;
        }

        public final FtpV2ActivityViewModel j5(FtpV2ActivityViewModel ftpV2ActivityViewModel) {
            rta.a(ftpV2ActivityViewModel, this.c.G.get());
            return ftpV2ActivityViewModel;
        }

        public final MyTrackLibraryVM j6(MyTrackLibraryVM myTrackLibraryVM) {
            qf2.a(myTrackLibraryVM, E7());
            return myTrackLibraryVM;
        }

        public final TrackDetailVM j7(TrackDetailVM trackDetailVM) {
            qf2.a(trackDetailVM, O7());
            return trackDetailVM;
        }

        public final AboutModel k3(AboutModel aboutModel) {
            j92.a(aboutModel, this.c.s1.get());
            return aboutModel;
        }

        public final CurseMainVM k4(CurseMainVM curseMainVM) {
            dg2.a(curseMainVM, this.c.H.get());
            return curseMainVM;
        }

        public final GoalGuideViewModel k5(GoalGuideViewModel goalGuideViewModel) {
            qf2.a(goalGuideViewModel, Q7());
            n1b.b(goalGuideViewModel, this.c.A.get());
            n1b.a(goalGuideViewModel, new AccountRequest());
            return goalGuideViewModel;
        }

        public final OtherDeviceTabModel k6(OtherDeviceTabModel otherDeviceTabModel) {
            j92.a(otherDeviceTabModel, this.c.s1.get());
            return otherDeviceTabModel;
        }

        public final TrainingLoadViewModel k7(TrainingLoadViewModel trainingLoadViewModel) {
            dg2.a(trainingLoadViewModel, this.c.H.get());
            return trainingLoadViewModel;
        }

        public final AboutViewModel l3(AboutViewModel aboutViewModel) {
            qf2.a(aboutViewModel, u2());
            rz.b(aboutViewModel, this.c.S.get());
            rz.a(aboutViewModel, new AboutRequest());
            return aboutViewModel;
        }

        public final CurseMonthVM l4(CurseMonthVM curseMonthVM) {
            y85.a(curseMonthVM, this.c.K.get());
            return curseMonthVM;
        }

        public final HabitModel l5(HabitModel habitModel) {
            j92.a(habitModel, this.c.s1.get());
            return habitModel;
        }

        public final OtherDeviceTabV4ViewModel l6(OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel) {
            qf2.a(otherDeviceTabV4ViewModel, F7());
            ceh.a(otherDeviceTabV4ViewModel, this.c.u0.get());
            return otherDeviceTabV4ViewModel;
        }

        public final TrainingTypeListModel l7(TrainingTypeListModel trainingTypeListModel) {
            j92.a(trainingTypeListModel, this.c.s1.get());
            return trainingTypeListModel;
        }

        public final AccessDeviceManagerViewModel m3(AccessDeviceManagerViewModel accessDeviceManagerViewModel) {
            s40.a(accessDeviceManagerViewModel, new AccessRequest());
            return accessDeviceManagerViewModel;
        }

        public final CurseResetVM m4(CurseResetVM curseResetVM) {
            bb5.a(curseResetVM, this.c.K.get());
            return curseResetVM;
        }

        public final HabitPlanSuggestModel m5(HabitPlanSuggestModel habitPlanSuggestModel) {
            j92.a(habitPlanSuggestModel, this.c.s1.get());
            return habitPlanSuggestModel;
        }

        public final PaiViewModel m6(PaiViewModel paiViewModel) {
            dg2.a(paiViewModel, this.c.H.get());
            return paiViewModel;
        }

        public final TrainingTypeListVM m7(TrainingTypeListVM trainingTypeListVM) {
            qf2.a(trainingTypeListVM, P7());
            return trainingTypeListVM;
        }

        public final AccessModel n3(AccessModel accessModel) {
            j92.a(accessModel, this.c.s1.get());
            return accessModel;
        }

        public final CurseSetVM n4(CurseSetVM curseSetVM) {
            dc5.a(curseSetVM, this.c.K.get());
            return curseSetVM;
        }

        public final HabitPlanSuggestVM n5(HabitPlanSuggestVM habitPlanSuggestVM) {
            qf2.a(habitPlanSuggestVM, S2());
            thb.a(habitPlanSuggestVM, this.c.A.get());
            return habitPlanSuggestVM;
        }

        public final PayChannelModel n6(PayChannelModel payChannelModel) {
            j92.a(payChannelModel, this.c.s1.get());
            return payChannelModel;
        }

        public final UserDataViewModel n7(UserDataViewModel userDataViewModel) {
            pfq.a(userDataViewModel, new ScaleRequest());
            return userDataViewModel;
        }

        public final AccessViewModel o3(AccessViewModel accessViewModel) {
            qf2.a(accessViewModel, v2());
            k70.a(accessViewModel, new AccessRequest());
            return accessViewModel;
        }

        public final CurseSymVM o4(CurseSymVM curseSymVM) {
            ic5.a(curseSymVM, this.c.K.get());
            return curseSymVM;
        }

        public final HabitShareViewModel o5(HabitShareViewModel habitShareViewModel) {
            qf2.a(habitShareViewModel, R2());
            return habitShareViewModel;
        }

        public final PayChannelViewModel o6(PayChannelViewModel payChannelViewModel) {
            qf2.a(payChannelViewModel, G7());
            gnh.a(payChannelViewModel, new PaymentApiRequest());
            return payChannelViewModel;
        }

        public final UserGuideModel o7(UserGuideModel userGuideModel) {
            j92.a(userGuideModel, this.c.s1.get());
            return userGuideModel;
        }

        public final ActivePkViewModel p3(ActivePkViewModel activePkViewModel) {
            pf0.a(activePkViewModel, this.c.V.get());
            pf0.b(activePkViewModel, this.c.A.get());
            pf0.c(activePkViewModel, this.c.H.get());
            return activePkViewModel;
        }

        public final DataManagementViewModel p4(DataManagementViewModel dataManagementViewModel) {
            fm5.a(dataManagementViewModel, this.c.j1.get());
            return dataManagementViewModel;
        }

        public final HabitTodayViewModel p5(HabitTodayViewModel habitTodayViewModel) {
            qf2.a(habitTodayViewModel, R2());
            vjb.a(habitTodayViewModel, new HabitRequest());
            return habitTodayViewModel;
        }

        public final PayResultModel p6(PayResultModel payResultModel) {
            j92.a(payResultModel, this.c.s1.get());
            return payResultModel;
        }

        public final UserGuideViewModel p7(UserGuideViewModel userGuideViewModel) {
            qf2.a(userGuideViewModel, Q7());
            cgq.b(userGuideViewModel, this.c.A.get());
            cgq.a(userGuideViewModel, new AccountRequest());
            return userGuideViewModel;
        }

        public final AddDeviceModel q3(AddDeviceModel addDeviceModel) {
            j92.a(addDeviceModel, this.c.s1.get());
            jq0.a(addDeviceModel, this.c.g0.get());
            return addDeviceModel;
        }

        public final DataReportModel q4(DataReportModel dataReportModel) {
            j92.a(dataReportModel, this.c.s1.get());
            return dataReportModel;
        }

        public final HabitViewModel q5(HabitViewModel habitViewModel) {
            qf2.a(habitViewModel, R2());
            dkb.a(habitViewModel, new HabitRequest());
            return habitViewModel;
        }

        public final PayResultViewModel q6(PayResultViewModel payResultViewModel) {
            qf2.a(payResultViewModel, H7());
            uoh.a(payResultViewModel, new PaymentApiRequest());
            return payResultViewModel;
        }

        public final UserManageViewModel q7(UserManageViewModel userManageViewModel) {
            whq.a(userManageViewModel, new ScaleRequest());
            return userManageViewModel;
        }

        public final AddDeviceViewModel r3(AddDeviceViewModel addDeviceViewModel) {
            qf2.a(addDeviceViewModel, w2());
            return addDeviceViewModel;
        }

        public final DataReportViewModel r4(DataReportViewModel dataReportViewModel) {
            qf2.a(dataReportViewModel, E2());
            tn5.a(dataReportViewModel, this.c.A.get());
            return dataReportViewModel;
        }

        public final HealthCheckViewModel r5(HealthCheckViewModel healthCheckViewModel) {
            dg2.a(healthCheckViewModel, this.c.H.get());
            return healthCheckViewModel;
        }

        public final PaymentOrderPageListModel r6(PaymentOrderPageListModel paymentOrderPageListModel) {
            j92.a(paymentOrderPageListModel, this.c.s1.get());
            return paymentOrderPageListModel;
        }

        public final UserinfoSelectModel r7(UserinfoSelectModel userinfoSelectModel) {
            j92.a(userinfoSelectModel, this.c.s1.get());
            skq.a(userinfoSelectModel, this.c.A.get());
            return userinfoSelectModel;
        }

        public final AddHabitViewModel s3(AddHabitViewModel addHabitViewModel) {
            qf2.a(addHabitViewModel, R2());
            at0.a(addHabitViewModel, new HabitRequest());
            return addHabitViewModel;
        }

        public final DeviceDualAuthorizationModel s4(DeviceDualAuthorizationModel deviceDualAuthorizationModel) {
            j92.a(deviceDualAuthorizationModel, this.c.s1.get());
            return deviceDualAuthorizationModel;
        }

        public final HealthModel s5(HealthModel healthModel) {
            j92.a(healthModel, this.c.s1.get());
            return healthModel;
        }

        public final PaymentOrderPageListViewModel s6(PaymentOrderPageListViewModel paymentOrderPageListViewModel) {
            qf2.a(paymentOrderPageListViewModel, I7());
            xph.a(paymentOrderPageListViewModel, new PaymentApiRequest());
            return paymentOrderPageListViewModel;
        }

        public final UserinfoSelectViewModel s7(UserinfoSelectViewModel userinfoSelectViewModel) {
            llq.b(userinfoSelectViewModel, this.c.A.get());
            llq.a(userinfoSelectViewModel, new AccountRequest());
            return userinfoSelectViewModel;
        }

        public AbilityQuestionModel t2() {
            return h3(tr.a());
        }

        public final AutoSwitchCardViewModel t3(AutoSwitchCardViewModel autoSwitchCardViewModel) {
            ts1.a(autoSwitchCardViewModel, this.c.b0.get());
            return autoSwitchCardViewModel;
        }

        public final DeviceDualAuthorizationViewModel t4(DeviceDualAuthorizationViewModel deviceDualAuthorizationViewModel) {
            qf2.a(deviceDualAuthorizationViewModel, F2());
            return deviceDualAuthorizationViewModel;
        }

        public final HealthViewModel t5(HealthViewModel healthViewModel) {
            qf2.a(healthViewModel, T2());
            q3c.c(healthViewModel, this.c.H.get());
            q3c.a(healthViewModel, new AccountRequest());
            q3c.b(healthViewModel, this.c.f1.get());
            return healthViewModel;
        }

        public final PhysicalStatusViewModel t6(PhysicalStatusViewModel physicalStatusViewModel) {
            dg2.a(physicalStatusViewModel, this.c.H.get());
            return physicalStatusViewModel;
        }

        public final com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel t7(com.xiaomi.fitness.userinfo.information.UserinfoSelectViewModel userinfoSelectViewModel) {
            qf2.a(userinfoSelectViewModel, R7());
            klq.b(userinfoSelectViewModel, this.c.A.get());
            klq.a(userinfoSelectViewModel, new AccountRequest());
            klq.c(userinfoSelectViewModel, this.c.l2.get());
            return userinfoSelectViewModel;
        }

        public AboutModel u2() {
            return k3(ez.a());
        }

        public final BaseHealthMonitorViewModel u3(BaseHealthMonitorViewModel baseHealthMonitorViewModel) {
            a82.a(baseHealthMonitorViewModel, this.c.b0.get());
            return baseHealthMonitorViewModel;
        }

        public final DeviceSettingListModel u4(DeviceSettingListModel deviceSettingListModel) {
            j92.a(deviceSettingListModel, this.c.s1.get());
            oc6.a(deviceSettingListModel, C2());
            return deviceSettingListModel;
        }

        public final HearingEnvironmentalNoiseViewModel u5(HearingEnvironmentalNoiseViewModel hearingEnvironmentalNoiseViewModel) {
            dg2.a(hearingEnvironmentalNoiseViewModel, this.c.H.get());
            return hearingEnvironmentalNoiseViewModel;
        }

        public final PlanDetailModel u6(PlanDetailModel planDetailModel) {
            j92.a(planDetailModel, this.c.s1.get());
            return planDetailModel;
        }

        public final VitalityViewModel u7(VitalityViewModel vitalityViewModel) {
            dg2.a(vitalityViewModel, this.c.H.get());
            return vitalityViewModel;
        }

        public AccessModel v2() {
            return n3(f50.a());
        }

        public final BasicDataViewModel v3(BasicDataViewModel basicDataViewModel) {
            dg2.a(basicDataViewModel, this.c.H.get());
            return basicDataViewModel;
        }

        public final DeviceSettingListViewModel v4(DeviceSettingListViewModel deviceSettingListViewModel) {
            qf2.a(deviceSettingListViewModel, G2());
            return deviceSettingListViewModel;
        }

        public final HeartRateDetectViewModel v5(HeartRateDetectViewModel heartRateDetectViewModel) {
            b6c.a(heartRateDetectViewModel, this.c.H.get());
            b6c.b(heartRateDetectViewModel, this.c.Z.get());
            return heartRateDetectViewModel;
        }

        public final PlanDetailViewModel v6(PlanDetailViewModel planDetailViewModel) {
            qf2.a(planDetailViewModel, J7());
            return planDetailViewModel;
        }

        public final WeightViewModel v7(WeightViewModel weightViewModel) {
            dg2.a(weightViewModel, this.c.H.get());
            return weightViewModel;
        }

        public AddDeviceModel w2() {
            return q3(iq0.a());
        }

        public final BasicRelativeDataViewModel w3(BasicRelativeDataViewModel basicRelativeDataViewModel) {
            tg2.a(basicRelativeDataViewModel, this.c.H.get());
            return basicRelativeDataViewModel;
        }

        public final DeviceTabModel w4(DeviceTabModel deviceTabModel) {
            j92.a(deviceTabModel, this.c.s1.get());
            cs6.a(deviceTabModel, C2());
            return deviceTabModel;
        }

        public final HistoryDetailModel w5(HistoryDetailModel historyDetailModel) {
            j92.a(historyDetailModel, this.c.s1.get());
            return historyDetailModel;
        }

        public final PrivacyViewModel w6(PrivacyViewModel privacyViewModel) {
            qf2.a(privacyViewModel, z7());
            return privacyViewModel;
        }

        public JustDanceControlModel w7() {
            return K5(cxd.a());
        }

        public BleHeartRateModel x2() {
            return D3(uq2.a());
        }

        public final BindEcoViewModel x3(BindEcoViewModel bindEcoViewModel) {
            yh7.a(bindEcoViewModel, this.c.u0.get());
            return bindEcoViewModel;
        }

        public final DeviceTabParentModel x4(DeviceTabParentModel deviceTabParentModel) {
            j92.a(deviceTabParentModel, this.c.s1.get());
            return deviceTabParentModel;
        }

        public final HistoryDetailViewModel x5(HistoryDetailViewModel historyDetailViewModel) {
            qf2.a(historyDetailViewModel, U2());
            return historyDetailViewModel;
        }

        public final RecordListVM x6(RecordListVM recordListVM) {
            y7k.b(recordListVM, this.c.G.get());
            y7k.a(recordListVM, this.c.Z());
            return recordListVM;
        }

        public JustDanceLaunchModel x7() {
            return M5(fyd.a());
        }

        public CallNotifyModel y2() {
            return K3(qa3.a());
        }

        public final BindHuamiViewModel y3(BindHuamiViewModel bindHuamiViewModel) {
            wo2.a(bindHuamiViewModel, this.c.Z.get());
            return bindHuamiViewModel;
        }

        public final DeviceTabParentViewModel y4(DeviceTabParentViewModel deviceTabParentViewModel) {
            qf2.a(deviceTabParentViewModel, I2());
            return deviceTabParentViewModel;
        }

        public final HistoryModel y5(HistoryModel historyModel) {
            j92.a(historyModel, this.c.s1.get());
            u8c.a(historyModel, new FeedbackRequest());
            return historyModel;
        }

        public final RecordMainVM y6(RecordMainVM recordMainVM) {
            l8k.a(recordMainVM, this.c.L.get());
            return recordMainVM;
        }

        public LaunchSportModel y7() {
            return O5(y4e.a());
        }

        public CommonBaseModel z2() {
            return N3(o54.a());
        }

        public final BindLocalViewModel z3(BindLocalViewModel bindLocalViewModel) {
            wo2.a(bindLocalViewModel, this.c.Z.get());
            return bindLocalViewModel;
        }

        public final DeviceTabV4ViewModel z4(DeviceTabV4ViewModel deviceTabV4ViewModel) {
            qf2.a(deviceTabV4ViewModel, H2());
            du6.a(deviceTabV4ViewModel, this.c.f1.get());
            return deviceTabV4ViewModel;
        }

        public final HistoryViewModel z5(HistoryViewModel historyViewModel) {
            qf2.a(historyViewModel, V2());
            return historyViewModel;
        }

        public final RegionSelectListViewModel z6(RegionSelectListViewModel regionSelectListViewModel) {
            qf2.a(regionSelectListViewModel, K7());
            tck.b(regionSelectListViewModel, new RegionRequest());
            tck.a(regionSelectListViewModel, this.c.a1.get());
            return regionSelectListViewModel;
        }

        public LoginModel z7() {
            return S5(tqe.a());
        }
    }

    public static final class o implements uyq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11521b;
        public final b c;
        public final g d;
        public View e;

        @Override // defpackage.uyq
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public wo9 build() {
            f6i.a(this.e, View.class);
            return new p(this.f11520a, this.f11521b, this.c, this.d, this.e);
        }

        @Override // defpackage.uyq
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o a(View view) {
            this.e = (View) f6i.b(view);
            return this;
        }

        public o(j jVar, d dVar, b bVar, g gVar) {
            this.f11520a = jVar;
            this.f11521b = dVar;
            this.c = bVar;
            this.d = gVar;
        }
    }

    public static final class p extends wo9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f11522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11523b;
        public final b c;
        public final g d;
        public final p e = this;

        public p(j jVar, d dVar, b bVar, g gVar, View view) {
            this.f11522a = jVar;
            this.f11523b = dVar;
            this.c = bVar;
            this.d = gVar;
        }
    }

    public static e a() {
        return new e();
    }
}
