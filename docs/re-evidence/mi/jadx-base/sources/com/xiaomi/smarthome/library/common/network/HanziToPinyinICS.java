package com.xiaomi.smarthome.library.common.network;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.CardConstants;
import com.xiaomi.fitness.common.utils.NetworkStateUtil;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class HanziToPinyinICS {
    private static final String FIRST_PINYIN_UNIHAN = "阿";
    private static final char FIRST_UNIHAN = 13312;
    private static final String LAST_PINYIN_UNIHAN = "蓙";
    private static final String TAG = "HanziToPinyin";
    private static HanziToPinyinICS sInstance;
    private static final char[] sT9Map;
    private final boolean mHasChinaCollator;
    public static final char[] UNIHANS = {21621, 21710, 23433, 32942, 20985, 20843, 25344, 25203, 37030, 21253, 21329, 22868, 20283, 23620, 36793, 26631, 24971, 37024, 27103, 30326, 23788, 22163, 23111, 39137, 20179, 25805, 20874, 23934, 22092, 21449, 38039, 36799, 20261, 25220, 36710, 25275, 26621, 21507, 20805, 25277, 20986, 27451, 25571, 24029, 30126, 21561, 26486, 36916, 30133, 21254, 20945, 31895, 27718, 23828, 37032, 25619, 21649, 22823, 30136, 24403, 20992, 28098, 24471, 25189, 28783, 27664, 22002, 30008, 20993, 29241, 20163, 19999, 19996, 21783, 22047, 20595, 22534, 37907, 22810, 23104, 35830, 22848, 38821, 32780, 21457, 24070, 26041, 39134, 20998, 20016, 35205, 20175, 32017, 20245, 26094, 35813, 29976, 20872, 30347, 25096, 32102, 26681, 24218, 24037, 21246, 20272, 29916, 32619, 20851, 20809, 24402, 34926, 21593, 21704, 21683, 39032, 33472, 33983, 35779, 40658, 25323, 20136, 22135, 21565, 40769, 21282, 33457, 24576, 29375, 24031, 28784, 26127, 21529, 19980, 21152, 25099, 27743, 33405, 38454, 24062, 21156, 20866, 21244, 21258, 23071, 22104, 20891, 21652, 24320, 21002, 38390, 23611, 21308, 21067, 32943, 38444, 31354, 25248, 21043, 22840, 33967, 23485, 21281, 20111, 22372, 25193, 22403, 26469, 20848, 21879, 25438, 20162, 21202, 22596, 21013, 20486, 22849, 33391, 25769, 21015, 25294, 12295, 28316, 40857, 30620, 22108, 23048, 30055, 25249, 32599, 21603, 22920, 38718, 23258, 37017, 29483, 40636, 27794, 38376, 30015, 21674, 30496, 21941, 21673, 27665, 21517, 35884, 25720, 21726, 27626, 25295, 23419, 22241, 22218, 23404, 35767, 39297, 24641, 33021, 22958, 25288, 23330, 40479, 25423, 24744, 23425, 22942, 20892, 32698, 22900, 22907, 34384, 25386, 21908, 35764, 36276, 25293, 30469, 20051, 25243, 21624, 21943, 21257, 19989, 20559, 21117, 27669, 23000, 20050, 38027, 21078, 20166, 19971, 25488, 21315, 21595, 24708, 30335, 20405, 38737, 37019, 19992, 26354, 24366, 32570, 22795, 21605, 31331, 23046, 24825, 20154, 25172, 26085, 33592, 21433, 22914, 22567, 26741, 38384, 33509, 20200, 27618, 19977, 26706, 25531, 33394, 26862, 20711, 26432, 31579, 23665, 20260, 24368, 22882, 30003, 21319, 23608, 21454, 20070, 21047, 25684, 38377, 21452, 35841, 21550, 22913, 21430, 24554, 25436, 33487, 29435, 22794, 23385, 21766, 20182, 33492, 22349, 38132, 22834, 24529, 29093, 21076, 22825, 20347, 24086, 21381, 22258, 20599, 37568, 28237, 25512, 21534, 25176, 25366, 27498, 24367, 23594, 21361, 22637, 32705, 25373, 20800, 22805, 34430, 20186, 20065, 28785, 20123, 24515, 26143, 20982, 20241, 26100, 36713, 30134, 21195, 20011, 24697, 22830, 24186, 32822, 19968, 27437, 24212, 21727, 20323, 20248, 25180, 40482, 26352, 26197, 21277, 28797, 31948, 29250, 20654, 21017, 36156, 24590, 22679, 21522, 25434, 27838, 24352, 38026, 34567, 36126, 20105, 20043, 20013, 24030, 26417, 25235, 36329, 19987, 22918, 38585, 23442, 21331, 23388, 23447, 37049, 31199, 38075, 21404, 23562, 26152};
    public static final byte[][] PINYINS = {new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0, 0}, new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0, 0}, new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0, 0}, new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0, 0}, new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0, 0}, new byte[]{66, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{66, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{66, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{66, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{66, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{66, 69, 73, 0, 0, 0}, new byte[]{66, 69, 78, 0, 0, 0}, new byte[]{66, 69, 78, 71, 0, 0}, new byte[]{66, 73, 0, 0, 0, 0}, new byte[]{66, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{66, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{66, 73, 69, 0, 0, 0}, new byte[]{66, 73, 78, 0, 0, 0}, new byte[]{66, 73, 78, 71, 0, 0}, new byte[]{66, 79, 0, 0, 0, 0}, new byte[]{66, 85, 0, 0, 0, 0}, new byte[]{67, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{67, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{67, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{67, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{67, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{67, 69, 0, 0, 0, 0}, new byte[]{67, 69, 78, 0, 0, 0}, new byte[]{67, 69, 78, 71, 0, 0}, new byte[]{67, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{67, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0}, new byte[]{67, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{67, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{67, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{67, 72, 69, 0, 0, 0}, new byte[]{67, 72, 69, 78, 0, 0}, new byte[]{67, 72, 69, 78, 71, 0}, new byte[]{67, 72, 73, 0, 0, 0}, new byte[]{67, 72, 79, 78, 71, 0}, new byte[]{67, 72, 79, 85, 0, 0}, new byte[]{67, 72, 85, 0, 0, 0}, new byte[]{67, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0}, new byte[]{67, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0}, new byte[]{67, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0}, new byte[]{67, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71}, new byte[]{67, 72, 85, 73, 0, 0}, new byte[]{67, 72, 85, 78, 0, 0}, new byte[]{67, 72, 85, 79, 0, 0}, new byte[]{67, 73, 0, 0, 0, 0}, new byte[]{67, 79, 78, 71, 0, 0}, new byte[]{67, 79, 85, 0, 0, 0}, new byte[]{67, 85, 0, 0, 0, 0}, new byte[]{67, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{67, 85, 73, 0, 0, 0}, new byte[]{67, 85, 78, 0, 0, 0}, new byte[]{67, 85, 79, 0, 0, 0}, new byte[]{68, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{68, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{68, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{68, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{68, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{68, 69, 0, 0, 0, 0}, new byte[]{68, 69, 73, 0, 0, 0}, new byte[]{68, 69, 78, 0, 0, 0}, new byte[]{68, 69, 78, 71, 0, 0}, new byte[]{68, 73, 0, 0, 0, 0}, new byte[]{68, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{68, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{68, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{68, 73, 69, 0, 0, 0}, new byte[]{68, 73, 78, 71, 0, 0}, new byte[]{68, 73, 85, 0, 0, 0}, new byte[]{68, 79, 78, 71, 0, 0}, new byte[]{68, 79, 85, 0, 0, 0}, new byte[]{68, 85, 0, 0, 0, 0}, new byte[]{68, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{68, 85, 73, 0, 0, 0}, new byte[]{68, 85, 78, 0, 0, 0}, new byte[]{68, 85, 79, 0, 0, 0}, new byte[]{69, 0, 0, 0, 0, 0}, new byte[]{69, 73, 0, 0, 0, 0}, new byte[]{69, 78, 0, 0, 0, 0}, new byte[]{69, 78, 71, 0, 0, 0}, new byte[]{69, 82, 0, 0, 0, 0}, new byte[]{70, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{70, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{70, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{70, 69, 73, 0, 0, 0}, new byte[]{70, 69, 78, 0, 0, 0}, new byte[]{70, 69, 78, 71, 0, 0}, new byte[]{70, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{70, 79, 0, 0, 0, 0}, new byte[]{70, 79, 85, 0, 0, 0}, new byte[]{70, 85, 0, 0, 0, 0}, new byte[]{71, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{71, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{71, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{71, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{71, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{71, 69, 0, 0, 0, 0}, new byte[]{71, 69, 73, 0, 0, 0}, new byte[]{71, 69, 78, 0, 0, 0}, new byte[]{71, 69, 78, 71, 0, 0}, new byte[]{71, 79, 78, 71, 0, 0}, new byte[]{71, 79, 85, 0, 0, 0}, new byte[]{71, 85, 0, 0, 0, 0}, new byte[]{71, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{71, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0}, new byte[]{71, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{71, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{71, 85, 73, 0, 0, 0}, new byte[]{71, 85, 78, 0, 0, 0}, new byte[]{71, 85, 79, 0, 0, 0}, new byte[]{72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{72, 69, 0, 0, 0, 0}, new byte[]{72, 69, 73, 0, 0, 0}, new byte[]{72, 69, 78, 0, 0, 0}, new byte[]{72, 69, 78, 71, 0, 0}, new byte[]{72, 77, 0, 0, 0, 0}, new byte[]{72, 79, 78, 71, 0, 0}, new byte[]{72, 79, 85, 0, 0, 0}, new byte[]{72, 85, 0, 0, 0, 0}, new byte[]{72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0}, new byte[]{72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{72, 85, 73, 0, 0, 0}, new byte[]{72, 85, 78, 0, 0, 0}, new byte[]{72, 85, 79, 0, 0, 0}, new byte[]{74, 73, 0, 0, 0, 0}, new byte[]{74, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{74, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{74, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{74, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{74, 73, 69, 0, 0, 0}, new byte[]{74, 73, 78, 0, 0, 0}, new byte[]{74, 73, 78, 71, 0, 0}, new byte[]{74, 73, 79, 78, 71, 0}, new byte[]{74, 73, 85, 0, 0, 0}, new byte[]{74, 85, 0, 0, 0, 0}, new byte[]{74, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{74, 85, 69, 0, 0, 0}, new byte[]{74, 85, 78, 0, 0, 0}, new byte[]{75, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{75, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{75, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{75, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{75, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{75, 69, 0, 0, 0, 0}, new byte[]{75, 69, 73, 0, 0, 0}, new byte[]{75, 69, 78, 0, 0, 0}, new byte[]{75, 69, 78, 71, 0, 0}, new byte[]{75, 79, 78, 71, 0, 0}, new byte[]{75, 79, 85, 0, 0, 0}, new byte[]{75, 85, 0, 0, 0, 0}, new byte[]{75, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{75, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0}, new byte[]{75, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{75, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{75, 85, 73, 0, 0, 0}, new byte[]{75, 85, 78, 0, 0, 0}, new byte[]{75, 85, 79, 0, 0, 0}, new byte[]{76, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{76, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{76, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{76, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{76, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{76, 69, 0, 0, 0, 0}, new byte[]{76, 69, 73, 0, 0, 0}, new byte[]{76, 69, 78, 71, 0, 0}, new byte[]{76, 73, 0, 0, 0, 0}, new byte[]{76, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{76, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{76, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{76, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{76, 73, 69, 0, 0, 0}, new byte[]{76, 73, 78, 0, 0, 0}, new byte[]{76, 73, 78, 71, 0, 0}, new byte[]{76, 73, 85, 0, 0, 0}, new byte[]{76, 79, 78, 71, 0, 0}, new byte[]{76, 79, 85, 0, 0, 0}, new byte[]{76, 85, 0, 0, 0, 0}, new byte[]{76, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{76, 85, 69, 0, 0, 0}, new byte[]{76, 85, 78, 0, 0, 0}, new byte[]{76, 85, 79, 0, 0, 0}, new byte[]{77, 0, 0, 0, 0, 0}, new byte[]{77, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{77, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{77, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{77, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{77, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{77, 69, 0, 0, 0, 0}, new byte[]{77, 69, 73, 0, 0, 0}, new byte[]{77, 69, 78, 0, 0, 0}, new byte[]{77, 69, 78, 71, 0, 0}, new byte[]{77, 73, 0, 0, 0, 0}, new byte[]{77, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{77, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{77, 73, 69, 0, 0, 0}, new byte[]{77, 73, 78, 0, 0, 0}, new byte[]{77, 73, 78, 71, 0, 0}, new byte[]{77, 73, 85, 0, 0, 0}, new byte[]{77, 79, 0, 0, 0, 0}, new byte[]{77, 79, 85, 0, 0, 0}, new byte[]{77, 85, 0, 0, 0, 0}, new byte[]{78, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{78, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{78, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{78, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{78, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{78, 69, 0, 0, 0, 0}, new byte[]{78, 69, 73, 0, 0, 0}, new byte[]{78, 69, 78, 0, 0, 0}, new byte[]{78, 69, 78, 71, 0, 0}, new byte[]{78, 73, 0, 0, 0, 0}, new byte[]{78, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{78, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{78, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{78, 73, 69, 0, 0, 0}, new byte[]{78, 73, 78, 0, 0, 0}, new byte[]{78, 73, 78, 71, 0, 0}, new byte[]{78, 73, 85, 0, 0, 0}, new byte[]{78, 79, 78, 71, 0, 0}, new byte[]{78, 79, 85, 0, 0, 0}, new byte[]{78, 85, 0, 0, 0, 0}, new byte[]{78, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{78, 85, 69, 0, 0, 0}, new byte[]{78, 85, 79, 0, 0, 0}, new byte[]{79, 0, 0, 0, 0, 0}, new byte[]{79, 85, 0, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 69, 73, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 69, 78, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 69, 78, 71, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 73, 0, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 73, 69, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 73, 78, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 73, 78, 71, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 79, 0, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 79, 85, 0, 0, 0}, new byte[]{SettingsModule.VALUE_TYPE_FLAG, 85, 0, 0, 0, 0}, new byte[]{81, 73, 0, 0, 0, 0}, new byte[]{81, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{81, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{81, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{81, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{81, 73, 69, 0, 0, 0}, new byte[]{81, 73, 78, 0, 0, 0}, new byte[]{81, 73, 78, 71, 0, 0}, new byte[]{81, 73, 79, 78, 71, 0}, new byte[]{81, 73, 85, 0, 0, 0}, new byte[]{81, 85, 0, 0, 0, 0}, new byte[]{81, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{81, 85, 69, 0, 0, 0}, new byte[]{81, 85, 78, 0, 0, 0}, new byte[]{82, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{82, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{82, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{82, 69, 0, 0, 0, 0}, new byte[]{82, 69, 78, 0, 0, 0}, new byte[]{82, 69, 78, 71, 0, 0}, new byte[]{82, 73, 0, 0, 0, 0}, new byte[]{82, 79, 78, 71, 0, 0}, new byte[]{82, 79, 85, 0, 0, 0}, new byte[]{82, 85, 0, 0, 0, 0}, new byte[]{82, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{82, 85, 73, 0, 0, 0}, new byte[]{82, 85, 78, 0, 0, 0}, new byte[]{82, 85, 79, 0, 0, 0}, new byte[]{83, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{83, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{83, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{83, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{83, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{83, 69, 0, 0, 0, 0}, new byte[]{83, 69, 78, 0, 0, 0}, new byte[]{83, 69, 78, 71, 0, 0}, new byte[]{83, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{83, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0}, new byte[]{83, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{83, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{83, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{83, 72, 69, 0, 0, 0}, new byte[]{83, 72, 69, 78, 0, 0}, new byte[]{83, 72, 69, 78, 71, 0}, new byte[]{83, 72, 73, 0, 0, 0}, new byte[]{83, 72, 79, 85, 0, 0}, new byte[]{83, 72, 85, 0, 0, 0}, new byte[]{83, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0}, new byte[]{83, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0}, new byte[]{83, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0}, new byte[]{83, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71}, new byte[]{83, 72, 85, 73, 0, 0}, new byte[]{83, 72, 85, 78, 0, 0}, new byte[]{83, 72, 85, 79, 0, 0}, new byte[]{83, 73, 0, 0, 0, 0}, new byte[]{83, 79, 78, 71, 0, 0}, new byte[]{83, 79, 85, 0, 0, 0}, new byte[]{83, 85, 0, 0, 0, 0}, new byte[]{83, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{83, 85, 73, 0, 0, 0}, new byte[]{83, 85, 78, 0, 0, 0}, new byte[]{83, 85, 79, 0, 0, 0}, new byte[]{84, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{84, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{84, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{84, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{84, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{84, 69, 0, 0, 0, 0}, new byte[]{84, 69, 78, 71, 0, 0}, new byte[]{84, 73, 0, 0, 0, 0}, new byte[]{84, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{84, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{84, 73, 69, 0, 0, 0}, new byte[]{84, 73, 78, 71, 0, 0}, new byte[]{84, 79, 78, 71, 0, 0}, new byte[]{84, 79, 85, 0, 0, 0}, new byte[]{84, 85, 0, 0, 0, 0}, new byte[]{84, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{84, 85, 73, 0, 0, 0}, new byte[]{84, 85, 78, 0, 0, 0}, new byte[]{84, 85, 79, 0, 0, 0}, new byte[]{87, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{87, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{87, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{87, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{87, 69, 73, 0, 0, 0}, new byte[]{87, 69, 78, 0, 0, 0}, new byte[]{87, 69, 78, 71, 0, 0}, new byte[]{87, 79, 0, 0, 0, 0}, new byte[]{87, 85, 0, 0, 0, 0}, new byte[]{88, 73, 0, 0, 0, 0}, new byte[]{88, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{88, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{88, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{88, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{88, 73, 69, 0, 0, 0}, new byte[]{88, 73, 78, 0, 0, 0}, new byte[]{88, 73, 78, 71, 0, 0}, new byte[]{88, 73, 79, 78, 71, 0}, new byte[]{88, 73, 85, 0, 0, 0}, new byte[]{88, 85, 0, 0, 0, 0}, new byte[]{88, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{88, 85, 69, 0, 0, 0}, new byte[]{88, 85, 78, 0, 0, 0}, new byte[]{89, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{89, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{89, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{89, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{89, 69, 0, 0, 0, 0}, new byte[]{89, 73, 0, 0, 0, 0}, new byte[]{89, 73, 78, 0, 0, 0}, new byte[]{89, 73, 78, 71, 0, 0}, new byte[]{89, 79, 0, 0, 0, 0}, new byte[]{89, 79, 78, 71, 0, 0}, new byte[]{89, 79, 85, 0, 0, 0}, new byte[]{89, 85, 0, 0, 0, 0}, new byte[]{89, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{89, 85, 69, 0, 0, 0}, new byte[]{89, 85, 78, 0, 0, 0}, new byte[]{90, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0, 0}, new byte[]{90, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0, 0}, new byte[]{90, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0, 0}, new byte[]{90, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0, 0}, new byte[]{90, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0, 0}, new byte[]{90, 69, 0, 0, 0, 0}, new byte[]{90, 69, 73, 0, 0, 0}, new byte[]{90, 69, 78, 0, 0, 0}, new byte[]{90, 69, 78, 71, 0, 0}, new byte[]{90, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0}, new byte[]{90, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0, 0}, new byte[]{90, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{90, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71, 0}, new byte[]{90, 72, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 79, 0, 0}, new byte[]{90, 72, 69, 0, 0, 0}, new byte[]{90, 72, 69, 78, 0, 0}, new byte[]{90, 72, 69, 78, 71, 0}, new byte[]{90, 72, 73, 0, 0, 0}, new byte[]{90, 72, 79, 78, 71, 0}, new byte[]{90, 72, 79, 85, 0, 0}, new byte[]{90, 72, 85, 0, 0, 0}, new byte[]{90, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0}, new byte[]{90, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 73, 0}, new byte[]{90, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0}, new byte[]{90, 72, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 71}, new byte[]{90, 72, 85, 73, 0, 0}, new byte[]{90, 72, 85, 78, 0, 0}, new byte[]{90, 72, 85, 79, 0, 0}, new byte[]{90, 73, 0, 0, 0, 0}, new byte[]{90, 79, 78, 71, 0, 0}, new byte[]{90, 79, 85, 0, 0, 0}, new byte[]{90, 85, 0, 0, 0, 0}, new byte[]{90, 85, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 78, 0, 0}, new byte[]{90, 85, 73, 0, 0, 0}, new byte[]{90, 85, 78, 0, 0, 0}, new byte[]{90, 85, 79, 0, 0, 0}};
    private static HashMap<Character, String[]> sPolyPhoneMap = new HashMap<>();
    private static HashMap<String, String[]> sHyphenatedNamePolyPhoneMap = new HashMap<>();
    private static HashMap<Character, String> sLastNamePolyPhoneMap = new HashMap<>();
    private static final Collator COLLATOR = Collator.getInstance(Locale.CHINA);

    static {
        sPolyPhoneMap.put((char) 38463, new String[]{"A", "E"});
        sPolyPhoneMap.put((char) 33100, new String[]{"YAN", "A"});
        sPolyPhoneMap.put((char) 25303, new String[]{"AO", "O", "NIU"});
        sPolyPhoneMap.put((char) 25170, new String[]{"PA", "BA"});
        sPolyPhoneMap.put((char) 34444, new String[]{"BANG", "BENG"});
        sPolyPhoneMap.put((char) 34180, new String[]{"BAO", "BO"});
        sPolyPhoneMap.put((char) 22561, new String[]{"BAO", "BU", "PU"});
        sPolyPhoneMap.put((char) 26292, new String[]{"BAO", "PU"});
        sPolyPhoneMap.put((char) 36146, new String[]{"BEN", "FEI", "BI"});
        sPolyPhoneMap.put((char) 36153, new String[]{"FEI", "BI"});
        sPolyPhoneMap.put((char) 33218, new String[]{"BI", "BEI"});
        sPolyPhoneMap.put((char) 36767, new String[]{"PI", "BI"});
        sPolyPhoneMap.put((char) 33536, new String[]{"FU", "BI"});
        sPolyPhoneMap.put((char) 25153, new String[]{"BIAN", "PIAN"});
        sPolyPhoneMap.put((char) 20415, new String[]{"BIAN", "PIAN"});
        sPolyPhoneMap.put((char) 33152, new String[]{"PANG", "BANG"});
        sPolyPhoneMap.put((char) 30917, new String[]{"PANG", "BANG"});
        sPolyPhoneMap.put((char) 39584, new String[]{"BIAO", "PIAO"});
        sPolyPhoneMap.put((char) 30058, new String[]{"FAN", "PAN", "BO"});
        sPolyPhoneMap.put((char) 23387, new String[]{"BEI", "BO"});
        sPolyPhoneMap.put((char) 24223, new String[]{"FEI", "BO"});
        sPolyPhoneMap.put((char) 21093, new String[]{"BO", "BAO", "XUE"});
        sPolyPhoneMap.put((char) 27850, new String[]{"BO", "PO", "BAN"});
        sPolyPhoneMap.put((char) 20271, new String[]{"BO", "BAI"});
        sPolyPhoneMap.put((char) 21340, new String[]{"BO", "BU"});
        sPolyPhoneMap.put((char) 20263, new String[]{"CANG", "CHEN"});
        sPolyPhoneMap.put((char) 34255, new String[]{"CANG", "ZANG"});
        sPolyPhoneMap.put((char) 21442, new String[]{"CAN", "SHEN", "CEN"});
        sPolyPhoneMap.put((char) 26366, new String[]{"CENG", "ZENG"});
        sPolyPhoneMap.put((char) 22092, new String[]{"CENG", "CHENG"});
        sPolyPhoneMap.put((char) 24046, new String[]{"CHA", "CHAI"});
        sPolyPhoneMap.put((char) 26597, new String[]{"CHA", "ZHA"});
        sPolyPhoneMap.put((char) 31109, new String[]{"CHAN", "SHAN"});
        sPolyPhoneMap.put((char) 39076, new String[]{"CHAN", "ZHAN"});
        sPolyPhoneMap.put((char) 23409, new String[]{"CHAN", "CAN"});
        sPolyPhoneMap.put((char) 35059, new String[]{"SHANG", "CHANG"});
        sPolyPhoneMap.put((char) 22330, new String[]{"CHANG", "CHANG"});
        sPolyPhoneMap.put((char) 26216, new String[]{"CHEN", "CHANG", "ZE"});
        sPolyPhoneMap.put((char) 38271, new String[]{"CHANG", "ZHANG"});
        sPolyPhoneMap.put((char) 21378, new String[]{"CHANG", "AN", "HAN"});
        sPolyPhoneMap.put((char) 22066, new String[]{"CHAO", "ZHAO", "ZHA"});
        sPolyPhoneMap.put((char) 36710, new String[]{"CHE", "JU"});
        sPolyPhoneMap.put((char) 31216, new String[]{"CHENG", "CHEN"});
        sPolyPhoneMap.put((char) 28548, new String[]{"CHENG", "DENG"});
        sPolyPhoneMap.put((char) 38107, new String[]{"DANG", "CHENG"});
        sPolyPhoneMap.put((char) 20056, new String[]{"CHENG", "SHENG"});
        sPolyPhoneMap.put((char) 26397, new String[]{"CHAO", "ZHAO"});
        sPolyPhoneMap.put((char) 38241, new String[]{"XIN", "CHAN", "TAN"});
        sPolyPhoneMap.put((char) 21273, new String[]{"SHI", "CHI"});
        sPolyPhoneMap.put((char) 37079, new String[]{"XI", "CHI"});
        sPolyPhoneMap.put((char) 27835, new String[]{"ZHI", "CHI"});
        sPolyPhoneMap.put((char) 30259, new String[]{"CHOU", "LU"});
        sPolyPhoneMap.put((char) 19985, new String[]{"CHOU", "NIU"});
        sPolyPhoneMap.put((char) 33261, new String[]{"CHOU", "XIU"});
        sPolyPhoneMap.put((char) 37325, new String[]{"ZHONG", "CHONG"});
        sPolyPhoneMap.put((char) 31181, new String[]{"ZHONG", "CHONG"});
        sPolyPhoneMap.put((char) 30044, new String[]{"CHU", "XU"});
        sPolyPhoneMap.put((char) 38500, new String[]{"CHU", "XU"});
        sPolyPhoneMap.put((char) 20256, new String[]{"CHUAN", "ZHUAN"});
        sPolyPhoneMap.put((char) 21852, new String[]{"CHUO", "CHUAI"});
        sPolyPhoneMap.put((char) 32496, new String[]{"CHUO", "CHAO"});
        sPolyPhoneMap.put((char) 35098, new String[]{"ZHU", "CHU", "ZHE"});
        sPolyPhoneMap.put((char) 26894, new String[]{"ZHUI", "CHUI"});
        sPolyPhoneMap.put((char) 27425, new String[]{"CI", "CHI", "QI"});
        sPolyPhoneMap.put((char) 20282, new String[]{"CI", "SI"});
        sPolyPhoneMap.put((char) 20857, new String[]{"ZI", "CI"});
        sPolyPhoneMap.put((char) 26526, new String[]{"CONG", "ZONG"});
        sPolyPhoneMap.put((char) 25874, new String[]{"CUAN", "ZAN"});
        sPolyPhoneMap.put((char) 21330, new String[]{"ZU", "CU"});
        sPolyPhoneMap.put((char) 34928, new String[]{"SHUAI", "CUI"});
        sPolyPhoneMap.put((char) 25774, new String[]{"CUO", "ZUO"});
        sPolyPhoneMap.put((char) 22823, new String[]{"DA", "DAI"});
        sPolyPhoneMap.put((char) 27795, new String[]{"TA", "DA"});
        sPolyPhoneMap.put((char) 21333, new String[]{"DAN", "CHAN", "SHAN"});
        sPolyPhoneMap.put((char) 21480, new String[]{"DAO", "TAO"});
        sPolyPhoneMap.put((char) 25552, new String[]{"TI", "DI"});
        sPolyPhoneMap.put((char) 36934, new String[]{"DI", "TI"});
        sPolyPhoneMap.put((char) 32735, new String[]{"DI", "ZHAI"});
        sPolyPhoneMap.put((char) 24471, new String[]{ServerConstants.NEW_DE_COUNTRY_CODE, "DEI"});
        sPolyPhoneMap.put((char) 38079, new String[]{"DIAN", "TIAN"});
        sPolyPhoneMap.put((char) 20291, new String[]{"DIAN", "TIAN"});
        sPolyPhoneMap.put((char) 20992, new String[]{"DAO", "DIAO"});
        sPolyPhoneMap.put((char) 35843, new String[]{"DIAO", "TIAO"});
        sPolyPhoneMap.put((char) 37117, new String[]{"DOU", "DU"});
        sPolyPhoneMap.put((char) 24230, new String[]{"DU", "DUO"});
        sPolyPhoneMap.put((char) 22244, new String[]{"TUN", "DUN"});
        sPolyPhoneMap.put((char) 21542, new String[]{"FOU", "PI"});
        sPolyPhoneMap.put((char) 33071, new String[]{"PU", "FU"});
        sPolyPhoneMap.put((char) 36711, new String[]{"YA", "ZHA", "GA"});
        sPolyPhoneMap.put((char) 25179, new String[]{"KANG", "GANG"});
        sPolyPhoneMap.put((char) 30422, new String[]{"GAI", "GE"});
        sPolyPhoneMap.put((char) 21679, new String[]{"GE", "KA", "LO"});
        sPolyPhoneMap.put((char) 38761, new String[]{"GE", "JI"});
        sPolyPhoneMap.put((char) 21512, new String[]{"HE", "GE"});
        sPolyPhoneMap.put((char) 32473, new String[]{"GEI", "JI"});
        sPolyPhoneMap.put((char) 39048, new String[]{"JING", "GENG"});
        sPolyPhoneMap.put((char) 32418, new String[]{"HONG", "GONG"});
        sPolyPhoneMap.put((char) 26552, new String[]{"GOU", "JU"});
        sPolyPhoneMap.put((char) 21617, new String[]{"GUA", "GU"});
        sPolyPhoneMap.put((char) 35895, new String[]{"GU", "YU"});
        sPolyPhoneMap.put((char) 34411, new String[]{"CHONG", "GU"});
        sPolyPhoneMap.put((char) 40516, new String[]{"HU", "GU"});
        sPolyPhoneMap.put((char) 25324, new String[]{"KUO", "GUA"});
        sPolyPhoneMap.put((char) 33694, new String[]{"GUAN", "WAN"});
        sPolyPhoneMap.put((char) 32438, new String[]{"LUN", "GUAN"});
        sPolyPhoneMap.put((char) 28805, new String[]{"JIONG", "GUI"});
        sPolyPhoneMap.put((char) 26727, new String[]{"GUI", "HUI"});
        sPolyPhoneMap.put((char) 28820, new String[]{"QUE", "GUI"});
        sPolyPhoneMap.put((char) 26123, new String[]{"GUI", "JIONG"});
        sPolyPhoneMap.put((char) 20250, new String[]{"HUI", "KUAI", "GUI"});
        sPolyPhoneMap.put((char) 33445, new String[]{"JIE", "GAI"});
        sPolyPhoneMap.put((char) 34430, new String[]{"XIA", "HA"});
        sPolyPhoneMap.put((char) 36713, new String[]{"XUAN", "HAN"});
        sPolyPhoneMap.put((char) 25750, new String[]{"KAN", "HAN"});
        sPolyPhoneMap.put((char) 21683, new String[]{"KE", "HAI"});
        sPolyPhoneMap.put((char) 24055, new String[]{"XIANG", "HANG"});
        sPolyPhoneMap.put((char) 21549, new String[]{"KENG", "HANG"});
        sPolyPhoneMap.put((char) 40664, new String[]{"MO", "HE", "MEI"});
        sPolyPhoneMap.put((char) 21644, new String[]{"HE", "HU", "HUO"});
        sPolyPhoneMap.put((char) 35977, new String[]{"HE", "HAO"});
        sPolyPhoneMap.put((char) 40657, new String[]{"HEI", "HE"});
        sPolyPhoneMap.put((char) 34425, new String[]{"HONG", "JIANG"});
        sPolyPhoneMap.put((char) 37063, new String[]{"XUN", "HUAN"});
        sPolyPhoneMap.put((char) 23536, new String[]{"HUAN", CardConstants.XIAN});
        sPolyPhoneMap.put((char) 22855, new String[]{"QI", "JI"});
        sPolyPhoneMap.put((char) 32521, new String[]{"JI", "QI"});
        sPolyPhoneMap.put((char) 20552, new String[]{"JIE", "JI"});
        sPolyPhoneMap.put((char) 31995, new String[]{"XI", "JI"});
        sPolyPhoneMap.put((char) 31293, new String[]{"JI", "QI"});
        sPolyPhoneMap.put((char) 20127, new String[]{"JI", "QI"});
        sPolyPhoneMap.put((char) 35800, new String[]{"JIE", "JI"});
        sPolyPhoneMap.put((char) 35760, new String[]{"JI", "JIE"});
        sPolyPhoneMap.put((char) 21095, new String[]{"JU", "JI"});
        sPolyPhoneMap.put((char) 31085, new String[]{"JI", "ZHA", "ZHAI"});
        sPolyPhoneMap.put((char) 33540, new String[]{"QIE", "JIA"});
        sPolyPhoneMap.put((char) 22204, new String[]{"JIAO", "JUE"});
        sPolyPhoneMap.put((char) 20389, new String[]{"JIAO", "YAO"});
        sPolyPhoneMap.put((char) 35282, new String[]{"JIAO", "JUE"});
        sPolyPhoneMap.put((char) 33050, new String[]{"JIAO", "JUE"});
        sPolyPhoneMap.put((char) 21119, new String[]{"JIAO", "CHAO"});
        sPolyPhoneMap.put((char) 26657, new String[]{"XIAO", "JIAO"});
        sPolyPhoneMap.put((char) 32564, new String[]{"JIAO", "ZHUO"});
        sPolyPhoneMap.put((char) 35265, new String[]{"JIAN", CardConstants.XIAN});
        sPolyPhoneMap.put((char) 38477, new String[]{"XIANG", "LONG", "JIANG"});
        sPolyPhoneMap.put((char) 35299, new String[]{"JIE", "XIE"});
        sPolyPhoneMap.put((char) 34249, new String[]{"JIE", "JI"});
        sPolyPhoneMap.put((char) 30684, new String[]{"JIN", "QIN"});
        sPolyPhoneMap.put((char) 21170, new String[]{"JIN", "JING"});
        sPolyPhoneMap.put((char) 40863, new String[]{"GUI", "QIU", "CI", "JUN"});
        sPolyPhoneMap.put((char) 21632, new String[]{"JU", "ZUI"});
        sPolyPhoneMap.put((char) 29722, new String[]{"JU", "QU"});
        sPolyPhoneMap.put((char) 33740, new String[]{"JUN", "XUN"});
        sPolyPhoneMap.put((char) 38589, new String[]{"JUN", "JUAN"});
        sPolyPhoneMap.put((char) 21345, new String[]{"KA", "QIA"});
        sPolyPhoneMap.put((char) 30475, new String[]{"KAN", "KAN"});
        sPolyPhoneMap.put((char) 25000, new String[]{"HAN", "KAN"});
        sPolyPhoneMap.put((char) 22391, new String[]{"KE", "KE"});
        sPolyPhoneMap.put((char) 22771, new String[]{"KE", "QIA"});
        sPolyPhoneMap.put((char) 20811, new String[]{"KE", "KEI"});
        sPolyPhoneMap.put((char) 38752, new String[]{"KAO", "KU"});
        sPolyPhoneMap.put((char) 38551, new String[]{"WEI", "KUI"});
        sPolyPhoneMap.put((char) 39740, new String[]{"GUI", "WEI", "KUI"});
        sPolyPhoneMap.put((char) 33554, new String[]{"KUANG", "GUAN", "YUAN"});
        sPolyPhoneMap.put((char) 21895, new String[]{"LA", "YAO"});
        sPolyPhoneMap.put((char) 34013, new String[]{"LAN", "PIE"});
        sPolyPhoneMap.put((char) 28889, new String[]{"LAO", "LUO", "PAO"});
        sPolyPhoneMap.put((char) 38610, new String[]{"LUO", "LAO"});
        sPolyPhoneMap.put((char) 32907, new String[]{"LE", "LEI"});
        sPolyPhoneMap.put((char) 20048, new String[]{"LE", "YUE"});
        sPolyPhoneMap.put((char) 20102, new String[]{"LE", "LIAO"});
        sPolyPhoneMap.put((char) 20457, new String[]{"LIANG", "LIA"});
        sPolyPhoneMap.put((char) 28518, new String[]{"LIAO", "LAO"});
        sPolyPhoneMap.put((char) 30860, new String[]{"LU", "ZHOU", "LIU"});
        sPolyPhoneMap.put((char) 20603, new String[]{"LOU", "LU"});
        sPolyPhoneMap.put((char) 38706, new String[]{"LU", "LOU"});
        sPolyPhoneMap.put((char) 25419, new String[]{"LU", "LUO"});
        sPolyPhoneMap.put((char) 32511, new String[]{"LV", "LU"});
        sPolyPhoneMap.put((char) 20845, new String[]{"LIU", "LU"});
        sPolyPhoneMap.put((char) 32476, new String[]{"LUO", "LAO"});
        sPolyPhoneMap.put((char) 33853, new String[]{"LUO", "LAO", "LA"});
        sPolyPhoneMap.put((char) 25273, new String[]{"MA", "MO"});
        sPolyPhoneMap.put((char) 33033, new String[]{"MAI", "MO"});
        sPolyPhoneMap.put((char) 22475, new String[]{"MAI", "MAN"});
        sPolyPhoneMap.put((char) 34067, new String[]{"MAN", "WAN"});
        sPolyPhoneMap.put((char) 27667, new String[]{"MANG", "MENG"});
        sPolyPhoneMap.put((char) 27809, new String[]{"MEI", "MO"});
        sPolyPhoneMap.put((char) 31192, new String[]{"MI", "BI"});
        sPolyPhoneMap.put((char) 27852, new String[]{"MI", "BI"});
        sPolyPhoneMap.put((char) 20340, new String[]{"MI", "NAI", "NI"});
        sPolyPhoneMap.put((char) 35884, new String[]{"MIAO", "MIU"});
        sPolyPhoneMap.put((char) 27169, new String[]{"MO", "MU"});
        sPolyPhoneMap.put((char) 25705, new String[]{"MO", "MA", "SA"});
        sPolyPhoneMap.put((char) 27597, new String[]{"MU", "WU"});
        sPolyPhoneMap.put((char) 32554, new String[]{"MIU", "MIAO", "MOU"});
        sPolyPhoneMap.put((char) 24324, new String[]{"NONG", "LONG"});
        sPolyPhoneMap.put((char) 38590, new String[]{"NAN", "NING"});
        sPolyPhoneMap.put((char) 30111, new String[]{"NUE", "YAO"});
        sPolyPhoneMap.put((char) 20060, new String[]{"MIE", "NIE"});
        sPolyPhoneMap.put((char) 23068, new String[]{NetworkStateUtil.NO_NETWORK, "NUO"});
        sPolyPhoneMap.put((char) 21306, new String[]{"QU", "OU"});
        sPolyPhoneMap.put((char) 32321, new String[]{"FAN", "PO"});
        sPolyPhoneMap.put((char) 36843, new String[]{"PO", "PAI"});
        sPolyPhoneMap.put((char) 32982, new String[]{"PANG", "PAN"});
        sPolyPhoneMap.put((char) 21032, new String[]{"PAO", "BAO"});
        sPolyPhoneMap.put((char) 28846, new String[]{"PAO", "BAO"});
        sPolyPhoneMap.put((char) 36898, new String[]{"FENG", "PANG"});
        sPolyPhoneMap.put((char) 34028, new String[]{"PENG", "PANG"});
        sPolyPhoneMap.put((char) 26420, new String[]{"PU", "PO", "PIAO"});
        sPolyPhoneMap.put((char) 28689, new String[]{"PU", "BAO"});
        sPolyPhoneMap.put((char) 26333, new String[]{"BAO", "PU"});
        sPolyPhoneMap.put((char) 26646, new String[]{"XI", "QI"});
        sPolyPhoneMap.put((char) 36426, new String[]{"XI", "QI"});
        sPolyPhoneMap.put((char) 31293, new String[]{"JI", "QI"});
        sPolyPhoneMap.put((char) 33640, new String[]{"XUN", "QIAN"});
        sPolyPhoneMap.put((char) 31140, new String[]{"QIAN", "XUAN"});
        sPolyPhoneMap.put((char) 24378, new String[]{"QIANG", "JIANG"});
        sPolyPhoneMap.put((char) 36228, new String[]{"QIE", "JU"});
        sPolyPhoneMap.put((char) 20146, new String[]{"QIN", "QING"});
        sPolyPhoneMap.put((char) 38592, new String[]{"QUE", "QIAO"});
        sPolyPhoneMap.put((char) 20167, new String[]{"CHOU", "QIU"});
        sPolyPhoneMap.put((char) 22280, new String[]{"QUAN", "JUAN"});
        sPolyPhoneMap.put((char) 33394, new String[]{"SE", "SHAI"});
        sPolyPhoneMap.put((char) 22622, new String[]{"SAI", "SE"});
        sPolyPhoneMap.put((char) 21414, new String[]{"XIA", Coder.KEY_SHA});
        sPolyPhoneMap.put((char) 21484, new String[]{"ZHAO", "SHAO"});
        sPolyPhoneMap.put((char) 26441, new String[]{"SHAN", Coder.KEY_SHA});
        sPolyPhoneMap.put((char) 27748, new String[]{"TANG", "SHANG"});
        sPolyPhoneMap.put((char) 25342, new String[]{"SHI", "SHE"});
        sPolyPhoneMap.put((char) 25240, new String[]{"ZHE", "SHE"});
        sPolyPhoneMap.put((char) 20160, new String[]{"SHEN", "SHI"});
        sPolyPhoneMap.put((char) 33882, new String[]{"SHEN", "REN"});
        sPolyPhoneMap.put((char) 35782, new String[]{"SHI", "ZHI"});
        sPolyPhoneMap.put((char) 20284, new String[]{"SI", "SHI"});
        sPolyPhoneMap.put((char) 23646, new String[]{"SHU", "ZHU"});
        sPolyPhoneMap.put((char) 29087, new String[]{"SHU", "SHOU"});
        sPolyPhoneMap.put((char) 35828, new String[]{"SHUO", "SHUI"});
        sPolyPhoneMap.put((char) 25968, new String[]{"SHU", "SHUO"});
        sPolyPhoneMap.put((char) 24554, new String[]{"SONG", "ZHONG"});
        sPolyPhoneMap.put((char) 23487, new String[]{"SU", "XIU"});
        sPolyPhoneMap.put((char) 30509, new String[]{"GUI", "XU", "SUI"});
        sPolyPhoneMap.put((char) 28601, new String[]{"DAN", "TAN"});
        sPolyPhoneMap.put((char) 27795, new String[]{"TA", "DA"});
        sPolyPhoneMap.put((char) 35203, new String[]{"TAN", "QIN"});
        sPolyPhoneMap.put((char) 35843, new String[]{"DIAO", "TIAO"});
        sPolyPhoneMap.put((char) 35114, new String[]{"TUI", "TUN"});
        sPolyPhoneMap.put((char) 25299, new String[]{"TUO", "TA"});
        sPolyPhoneMap.put((char) 22313, new String[]{"WEI", "XU"});
        sPolyPhoneMap.put((char) 22996, new String[]{"WEI", "QU"});
        sPolyPhoneMap.put((char) 23614, new String[]{"WEI", "YI"});
        sPolyPhoneMap.put((char) 23561, new String[]{"WEI", "YU"});
        sPolyPhoneMap.put((char) 36951, new String[]{"YI", "WEI"});
        sPolyPhoneMap.put((char) 20044, new String[]{"WU", "LA"});
        sPolyPhoneMap.put((char) 21523, new String[]{"XIA", "HE"});
        sPolyPhoneMap.put((char) 32420, new String[]{CardConstants.XIAN, "QIAN"});
        sPolyPhoneMap.put((char) 34892, new String[]{"XING", "HANG", "HENG"});
        sPolyPhoneMap.put((char) 30465, new String[]{"SHENG", "XING"});
        sPolyPhoneMap.put((char) 21066, new String[]{"XIAO", "XUE"});
        sPolyPhoneMap.put((char) 34880, new String[]{"XUE", "XIE"});
        sPolyPhoneMap.put((char) 27575, new String[]{"YIN", "YAN"});
        sPolyPhoneMap.put((char) 21693, new String[]{"YAN", "YE"});
        sPolyPhoneMap.put((char) 32422, new String[]{"YUE", "YAO"});
        sPolyPhoneMap.put((char) 38053, new String[]{"YAO", "YUE"});
        sPolyPhoneMap.put((char) 21494, new String[]{"YE", "XIE"});
        sPolyPhoneMap.put((char) 33406, new String[]{"AI", "YI"});
        sPolyPhoneMap.put((char) 29096, new String[]{"YUN", "YU"});
        sPolyPhoneMap.put((char) 21505, new String[]{"YU", "XU"});
        sPolyPhoneMap.put((char) 21592, new String[]{"YUAN", "YUN"});
        sPolyPhoneMap.put((char) 36128, new String[]{"YUAN", "YUN"});
        sPolyPhoneMap.put((char) 21643, new String[]{"ZA", "ZE", "ZHA"});
        sPolyPhoneMap.put((char) 25321, new String[]{"ZE", "ZHAI"});
        sPolyPhoneMap.put((char) 25166, new String[]{"ZHA", "ZA"});
        sPolyPhoneMap.put((char) 36711, new String[]{"YA", "ZHA"});
        sPolyPhoneMap.put((char) 31896, new String[]{"NIAN", "ZHAN"});
        sPolyPhoneMap.put((char) 29226, new String[]{"ZHUA", "ZHAO"});
        sPolyPhoneMap.put((char) 30528, new String[]{"ZHAO", "ZHUO"});
        sPolyPhoneMap.put((char) 27542, new String[]{"ZHI", "SHI"});
        sPolyPhoneMap.put((char) 33879, new String[]{"ZHU", "ZHE", "ZHUO"});
        sPolyPhoneMap.put((char) 24162, new String[]{"ZHUANG", "CHUANG"});
        sPolyPhoneMap.put((char) 32508, new String[]{"ZONG", "ZENG"});
        sPolyPhoneMap.put((char) 26590, new String[]{"ZUO", "ZHA"});
        sPolyPhoneMap.put((char) 20180, new String[]{"ZI", "ZAI"});
        sPolyPhoneMap.put((char) 20869, new String[]{"NEI"});
        sPolyPhoneMap.put((char) 30655, new String[]{"QU"});
        sPolyPhoneMap.put((char) 26469, new String[]{"LAI"});
        sPolyPhoneMap.put((char) 21449, new String[]{"CHA"});
        sPolyPhoneMap.put((char) 22905, new String[]{"TA"});
        sPolyPhoneMap.put((char) 20799, new String[]{"ER"});
        sPolyPhoneMap.put((char) 27784, new String[]{"SHEN"});
        sPolyPhoneMap.put((char) 36158, new String[]{"JIA"});
        sHyphenatedNamePolyPhoneMap.put("单于", new String[]{"CHAN", "YU"});
        sHyphenatedNamePolyPhoneMap.put("长孙", new String[]{"ZHANG", "SUN"});
        sHyphenatedNamePolyPhoneMap.put("子车", new String[]{"ZI", "JU"});
        sHyphenatedNamePolyPhoneMap.put("万俟", new String[]{"MO", "QI"});
        sHyphenatedNamePolyPhoneMap.put("澹台", new String[]{"TAN", "TAI"});
        sHyphenatedNamePolyPhoneMap.put("尉迟", new String[]{"YU", "CHI"});
        sLastNamePolyPhoneMap.put((char) 36158, "JIA");
        sLastNamePolyPhoneMap.put((char) 27784, "SHEN");
        sLastNamePolyPhoneMap.put((char) 21340, "BU");
        sLastNamePolyPhoneMap.put((char) 34180, "BO");
        sLastNamePolyPhoneMap.put((char) 23387, "BO");
        sLastNamePolyPhoneMap.put((char) 36146, "BEN");
        sLastNamePolyPhoneMap.put((char) 36153, "FEI");
        sLastNamePolyPhoneMap.put((char) 27850, "BAN");
        sLastNamePolyPhoneMap.put((char) 33536, "BI");
        sLastNamePolyPhoneMap.put((char) 24223, "BO");
        sLastNamePolyPhoneMap.put((char) 30058, "BO");
        sLastNamePolyPhoneMap.put((char) 35098, "CHU");
        sLastNamePolyPhoneMap.put((char) 37325, "CHONG");
        sLastNamePolyPhoneMap.put((char) 21378, "HAN");
        sLastNamePolyPhoneMap.put((char) 20256, "CHUAN");
        sLastNamePolyPhoneMap.put((char) 21442, "CAN");
        sLastNamePolyPhoneMap.put((char) 31181, "CHONG");
        sLastNamePolyPhoneMap.put((char) 37079, "CHI");
        sLastNamePolyPhoneMap.put((char) 38241, "CHAN");
        sLastNamePolyPhoneMap.put((char) 26397, "CHAO");
        sLastNamePolyPhoneMap.put((char) 27835, "CHI");
        sLastNamePolyPhoneMap.put((char) 21852, "CHUAI");
        sLastNamePolyPhoneMap.put((char) 34928, "CUI");
        sLastNamePolyPhoneMap.put((char) 26216, "CHANG");
        sLastNamePolyPhoneMap.put((char) 19985, "CHOU");
        sLastNamePolyPhoneMap.put((char) 30259, "CHOU");
        sLastNamePolyPhoneMap.put((char) 38271, "CHANG");
        sLastNamePolyPhoneMap.put((char) 27425, "QI");
        sLastNamePolyPhoneMap.put((char) 36710, "CHE");
        sLastNamePolyPhoneMap.put((char) 32735, "ZHAI");
        sLastNamePolyPhoneMap.put((char) 20291, "DIAN");
        sLastNamePolyPhoneMap.put((char) 20992, "DIAO");
        sLastNamePolyPhoneMap.put((char) 35843, "DIAO");
        sLastNamePolyPhoneMap.put((char) 36934, "DI");
        sLastNamePolyPhoneMap.put((char) 30422, "GE");
        sLastNamePolyPhoneMap.put((char) 28805, "GUI");
        sLastNamePolyPhoneMap.put((char) 34411, "GU");
        sLastNamePolyPhoneMap.put((char) 28820, "GUI");
        sLastNamePolyPhoneMap.put((char) 26123, "GUI");
        sLastNamePolyPhoneMap.put((char) 20250, "GUI");
        sLastNamePolyPhoneMap.put((char) 33445, "GAI");
        sLastNamePolyPhoneMap.put((char) 33554, "KUANG");
        sLastNamePolyPhoneMap.put((char) 37063, "HUAN");
        sLastNamePolyPhoneMap.put((char) 24055, "XIANG");
        sLastNamePolyPhoneMap.put((char) 40657, "HE");
        sLastNamePolyPhoneMap.put((char) 36713, "HAN");
        sLastNamePolyPhoneMap.put((char) 25750, "HAN");
        sLastNamePolyPhoneMap.put((char) 40664, "HE");
        sLastNamePolyPhoneMap.put((char) 35265, "JIAN");
        sLastNamePolyPhoneMap.put((char) 38477, "JIANG");
        sLastNamePolyPhoneMap.put((char) 35282, "JIAO");
        sLastNamePolyPhoneMap.put((char) 32564, "JIAO");
        sLastNamePolyPhoneMap.put((char) 35760, "JI");
        sLastNamePolyPhoneMap.put((char) 29722, "JU");
        sLastNamePolyPhoneMap.put((char) 21095, "JI");
        sLastNamePolyPhoneMap.put((char) 38589, "JUAN");
        sLastNamePolyPhoneMap.put((char) 38551, "KUI");
        sLastNamePolyPhoneMap.put((char) 39740, "KUI");
        sLastNamePolyPhoneMap.put((char) 25000, "KAN");
        sLastNamePolyPhoneMap.put((char) 38752, "KU");
        sLastNamePolyPhoneMap.put((char) 20048, "YUE");
        sLastNamePolyPhoneMap.put((char) 20845, "LU");
        sLastNamePolyPhoneMap.put((char) 21895, "LA");
        sLastNamePolyPhoneMap.put((char) 38610, "LUO");
        sLastNamePolyPhoneMap.put((char) 20102, "LIAO");
        sLastNamePolyPhoneMap.put((char) 32554, "MIAO");
        sLastNamePolyPhoneMap.put((char) 20340, "MI");
        sLastNamePolyPhoneMap.put((char) 35884, "MIAO");
        sLastNamePolyPhoneMap.put((char) 20060, "NIE");
        sLastNamePolyPhoneMap.put((char) 38590, "NING");
        sLastNamePolyPhoneMap.put((char) 21306, "OU");
        sLastNamePolyPhoneMap.put((char) 36898, "PANG");
        sLastNamePolyPhoneMap.put((char) 34028, "PENG");
        sLastNamePolyPhoneMap.put((char) 26420, "PIAO");
        sLastNamePolyPhoneMap.put((char) 32321, "PO");
        sLastNamePolyPhoneMap.put((char) 20415, "PIAN");
        sLastNamePolyPhoneMap.put((char) 20167, "QIU");
        sLastNamePolyPhoneMap.put((char) 21345, "QIA");
        sLastNamePolyPhoneMap.put((char) 35203, "TAN");
        sLastNamePolyPhoneMap.put((char) 31140, "QIAN");
        sLastNamePolyPhoneMap.put((char) 21484, "SHAO");
        sLastNamePolyPhoneMap.put((char) 20160, "SHI");
        sLastNamePolyPhoneMap.put((char) 25240, "SHE");
        sLastNamePolyPhoneMap.put((char) 30509, "SUI");
        sLastNamePolyPhoneMap.put((char) 35299, "XIE");
        sLastNamePolyPhoneMap.put((char) 31995, "XI");
        sLastNamePolyPhoneMap.put((char) 24055, "XIANG");
        sLastNamePolyPhoneMap.put((char) 38500, "XU");
        sLastNamePolyPhoneMap.put((char) 23536, CardConstants.XIAN);
        sLastNamePolyPhoneMap.put((char) 21592, "YUAN");
        sLastNamePolyPhoneMap.put((char) 36128, "YUAN");
        sLastNamePolyPhoneMap.put((char) 26366, "ZENG");
        sLastNamePolyPhoneMap.put((char) 26597, "ZHA");
        sLastNamePolyPhoneMap.put((char) 20256, "CHUAN");
        sLastNamePolyPhoneMap.put((char) 21484, "SHAO");
        sLastNamePolyPhoneMap.put((char) 31085, "ZHAI");
        sT9Map = new char[]{'2', '2', '2', '3', '3', '3', '4', '4', '4', '5', '5', '5', '6', '6', '6', '7', '7', '7', '7', '8', '8', '8', '9', '9', '9', '9'};
    }

    public HanziToPinyinICS(boolean z) {
        this.mHasChinaCollator = z;
    }

    private void addToken(StringBuilder sb, ArrayList<HanziToPinyin.Token> arrayList, int i) {
        String string = sb.toString();
        arrayList.add(new HanziToPinyin.Token(i, string, string));
        sb.setLength(0);
    }

    public static String formatCharToT9(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                sb.append(sT9Map[cCharAt - 'A']);
            } else if (cCharAt >= 'a' && cCharAt <= 'z') {
                sb.append(sT9Map[cCharAt - 'a']);
            } else if (cCharAt >= '0' && cCharAt <= '9') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static HanziToPinyinICS getInstance() {
        synchronized (HanziToPinyinICS.class) {
            try {
                HanziToPinyinICS hanziToPinyinICS = sInstance;
                if (hanziToPinyinICS != null) {
                    return hanziToPinyinICS;
                }
                HanziToPinyinICS hanziToPinyinICS2 = new HanziToPinyinICS(true);
                sInstance = hanziToPinyinICS2;
                return hanziToPinyinICS2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ArrayList<HanziToPinyin.Token> getPolyPhoneLastNameTokens(String str) {
        String strSubstring;
        String[] strArr;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<HanziToPinyin.Token> arrayList = new ArrayList<>();
        if (str.length() >= 2 && (strArr = sHyphenatedNamePolyPhoneMap.get((strSubstring = str.substring(0, 2)))) != null) {
            for (int i = 0; i < strArr.length; i++) {
                HanziToPinyin.Token token = new HanziToPinyin.Token();
                token.type = 2;
                token.source = String.valueOf(strSubstring.charAt(i));
                token.target = strArr[i];
                arrayList.add(token);
            }
            return arrayList;
        }
        Character chValueOf = Character.valueOf(str.charAt(0));
        String str2 = sLastNamePolyPhoneMap.get(chValueOf);
        if (str2 == null) {
            return null;
        }
        HanziToPinyin.Token token2 = new HanziToPinyin.Token();
        token2.type = 2;
        token2.source = chValueOf.toString();
        token2.target = str2;
        arrayList.add(token2);
        return arrayList;
    }

    private HanziToPinyin.Token getToken(char c) {
        int length;
        byte b2;
        HanziToPinyin.Token token = new HanziToPinyin.Token();
        String string = Character.toString(c);
        token.source = string;
        if (c < 256) {
            token.type = 1;
            token.target = string;
            return token;
        }
        if (c < 13312) {
            token.type = 3;
            token.target = string;
            return token;
        }
        String[] strArr = sPolyPhoneMap.get(Character.valueOf(c));
        int i = 0;
        if (strArr != null) {
            token.type = 2;
            token.polyPhones = strArr;
            token.target = strArr[0];
            return token;
        }
        Collator collator = COLLATOR;
        int iCompare = collator.compare(string, FIRST_PINYIN_UNIHAN);
        if (iCompare < 0) {
            token.type = 3;
            token.target = string;
            return token;
        }
        if (iCompare == 0) {
            token.type = 2;
            length = 0;
        } else {
            iCompare = collator.compare(string, LAST_PINYIN_UNIHAN);
            if (iCompare > 0) {
                token.type = 3;
                token.target = string;
                return token;
            }
            if (iCompare == 0) {
                token.type = 2;
                length = UNIHANS.length - 1;
            } else {
                length = -1;
            }
        }
        token.type = 2;
        if (length < 0) {
            int length2 = UNIHANS.length - 1;
            int i2 = 0;
            while (i2 <= length2) {
                length = (i2 + length2) / 2;
                iCompare = COLLATOR.compare(string, Character.toString(UNIHANS[length]));
                if (iCompare == 0) {
                    break;
                }
                if (iCompare > 0) {
                    i2 = length + 1;
                } else {
                    length2 = length - 1;
                }
            }
        }
        if (iCompare < 0) {
            length--;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte[] bArr = PINYINS[length];
            if (i >= bArr.length || (b2 = bArr[i]) == 0) {
                break;
            }
            sb.append((char) b2);
            i++;
        }
        token.target = sb.toString();
        return token;
    }

    public ArrayList<HanziToPinyin.Token> get(String str) {
        return get(str, true, true);
    }

    public ArrayList<HanziToPinyin.Token> get(String str, boolean z, boolean z2) {
        int size;
        ArrayList<HanziToPinyin.Token> polyPhoneLastNameTokens;
        ArrayList<HanziToPinyin.Token> arrayList = new ArrayList<>();
        if (this.mHasChinaCollator && !TextUtils.isEmpty(str)) {
            if (z2 || (polyPhoneLastNameTokens = getPolyPhoneLastNameTokens(str)) == null || polyPhoneLastNameTokens.size() <= 0) {
                size = 0;
            } else {
                arrayList.addAll(polyPhoneLastNameTokens);
                size = polyPhoneLastNameTokens.size();
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            int i = 1;
            while (size < length) {
                char cCharAt = str.charAt(size);
                if (cCharAt == ' ') {
                    if (sb.length() > 0) {
                        addToken(sb, arrayList, i);
                    }
                    if (!z) {
                        String strValueOf = String.valueOf(' ');
                        arrayList.add(new HanziToPinyin.Token(3, strValueOf, strValueOf));
                    }
                } else {
                    if (cCharAt < 256) {
                        if (i != 1 && sb.length() > 0) {
                            addToken(sb, arrayList, i);
                        }
                        sb.append(cCharAt);
                        i = 1;
                    } else if (cCharAt < 13312) {
                        if (i != 3 && sb.length() > 0) {
                            addToken(sb, arrayList, i);
                        }
                        sb.append(cCharAt);
                    } else {
                        HanziToPinyin.Token token = getToken(cCharAt);
                        int i2 = token.type;
                        if (i2 == 2) {
                            if (sb.length() > 0) {
                                addToken(sb, arrayList, i);
                            }
                            arrayList.add(token);
                            i = 2;
                        } else {
                            if (i != i2 && sb.length() > 0) {
                                addToken(sb, arrayList, i);
                            }
                            i = token.type;
                            sb.append(cCharAt);
                        }
                    }
                    size++;
                }
                i = 3;
                size++;
            }
            if (sb.length() > 0) {
                addToken(sb, arrayList, i);
            }
        }
        return arrayList;
    }

    public static char formatCharToT9(char c) {
        if (c >= 'A' && c <= 'Z') {
            return sT9Map[c - 'A'];
        }
        if (c >= 'a' && c <= 'z') {
            return sT9Map[c - 'a'];
        }
        if (c < '0' || c > '9') {
            return (char) 0;
        }
        return c;
    }
}
