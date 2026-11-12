package androidx.health.connect.client.impl.platform.records;

import defpackage.yyu;
import defpackage.yyz;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zdm;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0003\b\u008a\u0001\u001a\f\u0010K\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010_\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010b\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010c\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010d\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010e\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010f\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010g\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010h\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010i\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010j\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010k\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010l\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010m\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010n\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010o\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010p\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010q\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010r\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010s\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010t\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010u\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010v\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010w\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010x\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010y\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010z\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010{\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010|\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010}\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010~\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\f\u0010\u007f\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0080\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0081\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0082\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0083\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0084\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0085\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0086\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u0087\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a%\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\r\u0010\u0089\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u008a\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\r\u0010\u008b\u0001\u001a\u00020\u0002*\u00020\u0002H\u0000\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\" \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004\" \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0004\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0004\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0004\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0004\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0004\" \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0004\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0004\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0004\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0004\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0004\" \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0004\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0004\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0004\" \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0004\" \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0004\" \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0004\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0004\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0004\" \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0004\" \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0004\" \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0004\" \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0004\" \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0004\" \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0004\" \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0004\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0004\" \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0004\" \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0004\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0004\" \u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0004\"&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0004\"&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010I\u001a\u0004\bN\u0010\u0004\" \u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0004\"&\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010I\u001a\u0004\bS\u0010\u0004\" \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0004\"&\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010I\u001a\u0004\bX\u0010\u0004\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0004\" \u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0004\" \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010\u0004\" \u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0004¨\u0006\u008c\u0001"}, d2 = {"SDK_TO_PLATFORM_CERVICAL_MUCUS_APPEARANCE", "", "", "getSDK_TO_PLATFORM_CERVICAL_MUCUS_APPEARANCE", "()Ljava/util/Map;", "PLATFORM_TO_SDK_CERVICAL_MUCUS_APPEARANCE", "getPLATFORM_TO_SDK_CERVICAL_MUCUS_APPEARANCE", "SDK_TO_PLATFORM_BLOOD_PRESSURE_BODY_POSITION", "getSDK_TO_PLATFORM_BLOOD_PRESSURE_BODY_POSITION", "PLATFORM_TO_SDK_BLOOD_PRESSURE_BODY_POSITION", "getPLATFORM_TO_SDK_BLOOD_PRESSURE_BODY_POSITION", "SDK_TO_PLATFORM_EXERCISE_SESSION_TYPE", "getSDK_TO_PLATFORM_EXERCISE_SESSION_TYPE", "PLATFORM_TO_SDK_EXERCISE_SESSION_TYPE", "getPLATFORM_TO_SDK_EXERCISE_SESSION_TYPE", "SDK_TO_PLATFORM_MEAL_TYPE", "getSDK_TO_PLATFORM_MEAL_TYPE", "PLATFORM_TO_SDK_MEAL_TYPE", "getPLATFORM_TO_SDK_MEAL_TYPE", "SDK_TO_PLATFORM_VO2_MAX_MEASUREMENT_METHOD", "getSDK_TO_PLATFORM_VO2_MAX_MEASUREMENT_METHOD", "PLATFORM_TO_SDK_VO2_MAX_MEASUREMENT_METHOD", "getPLATFORM_TO_SDK_VO2_MAX_MEASUREMENT_METHOD", "SDK_TO_PLATFORM_MENSTRUATION_FLOW_TYPE", "getSDK_TO_PLATFORM_MENSTRUATION_FLOW_TYPE", "PLATFORM_TO_SDK_MENSTRUATION_FLOW_TYPE", "getPLATFORM_TO_SDK_MENSTRUATION_FLOW_TYPE", "SDK_TO_PLATFORM_BODY_TEMPERATURE_MEASUREMENT_LOCATION", "getSDK_TO_PLATFORM_BODY_TEMPERATURE_MEASUREMENT_LOCATION", "PLATFORM_TO_SDK_BODY_TEMPERATURE_MEASUREMENT_LOCATION", "getPLATFORM_TO_SDK_BODY_TEMPERATURE_MEASUREMENT_LOCATION", "SDK_TO_PLATFORM_BLOOD_PRESSURE_MEASUREMENT_LOCATION", "getSDK_TO_PLATFORM_BLOOD_PRESSURE_MEASUREMENT_LOCATION", "PLATFORM_TO_SDK_BLOOD_PRESSURE_MEASUREMENT_LOCATION", "getPLATFORM_TO_SDK_BLOOD_PRESSURE_MEASUREMENT_LOCATION", "SDK_TO_PLATFORM_OVULATION_TEST_RESULT", "getSDK_TO_PLATFORM_OVULATION_TEST_RESULT", "PLATFORM_TO_SDK_OVULATION_TEST_RESULT", "getPLATFORM_TO_SDK_OVULATION_TEST_RESULT", "SDK_TO_PLATFORM_CERVICAL_MUCUS_SENSATION", "getSDK_TO_PLATFORM_CERVICAL_MUCUS_SENSATION", "PLATFORM_TO_SDK_CERVICAL_MUCUS_SENSATION", "getPLATFORM_TO_SDK_CERVICAL_MUCUS_SENSATION", "SDK_TO_PLATFORM_SEXUAL_ACTIVITY_PROTECTION_USED", "getSDK_TO_PLATFORM_SEXUAL_ACTIVITY_PROTECTION_USED", "PLATFORM_TO_SDK_SEXUAL_ACTIVITY_PROTECTION_USED", "getPLATFORM_TO_SDK_SEXUAL_ACTIVITY_PROTECTION_USED", "SDK_TO_PLATFORM_SKIN_TEMPERATURE_MEASUREMENT_LOCATION", "getSDK_TO_PLATFORM_SKIN_TEMPERATURE_MEASUREMENT_LOCATION", "PLATFORM_TO_SDK_SKIN_TEMPERATURE_MEASUREMENT_LOCATION", "getPLATFORM_TO_SDK_SKIN_TEMPERATURE_MEASUREMENT_LOCATION", "SDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE", "getSDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE", "PLATFORM_TO_SDK_GLUCOSE_SPECIMEN_SOURCE", "getPLATFORM_TO_SDK_GLUCOSE_SPECIMEN_SOURCE", "SDK_TO_PLATFORM_BLOOD_GLUCOSE_RELATION_TO_MEAL", "getSDK_TO_PLATFORM_BLOOD_GLUCOSE_RELATION_TO_MEAL", "PLATFORM_TO_SDK_BLOOD_GLUCOSE_RELATION_TO_MEAL", "getPLATFORM_TO_SDK_BLOOD_GLUCOSE_RELATION_TO_MEAL", "SDK_TO_PLATFORM_EXERCISE_CATEGORY", "getSDK_TO_PLATFORM_EXERCISE_CATEGORY", "PLATFORM_TO_SDK_EXERCISE_CATEGORY", "getPLATFORM_TO_SDK_EXERCISE_CATEGORY", "SDK_TO_PLATFORM_SLEEP_STAGE_TYPE", "getSDK_TO_PLATFORM_SLEEP_STAGE_TYPE", "PLATFORM_TO_SDK_SLEEP_STAGE_TYPE", "getPLATFORM_TO_SDK_SLEEP_STAGE_TYPE", "SDK_TO_PLATFORM_EXERCISE_SEGMENT_TYPE", "getSDK_TO_PLATFORM_EXERCISE_SEGMENT_TYPE", "PLATFORM_TO_SDK_EXERCISE_SEGMENT_TYPE", "getPLATFORM_TO_SDK_EXERCISE_SEGMENT_TYPE", "SDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE", "getSDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE$annotations", "()V", "getSDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE", "toPlatformMindfulnessSessionType", "PLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE", "getPLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE$annotations", "getPLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE", "SDK_TO_PLATFORM_RECORDING_METHOD", "getSDK_TO_PLATFORM_RECORDING_METHOD", "SDK_TO_PLATFORM_FHIR_RESOURCE_TYPE", "getSDK_TO_PLATFORM_FHIR_RESOURCE_TYPE$annotations", "getSDK_TO_PLATFORM_FHIR_RESOURCE_TYPE", "PLATFORM_TO_SDK_FHIR_RESOURCE_TYPE", "getPLATFORM_TO_SDK_FHIR_RESOURCE_TYPE", "SDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE", "getSDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE$annotations", "getSDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE", "SDK_TO_PLATFORM_DEVICE_TYPE", "getSDK_TO_PLATFORM_DEVICE_TYPE", "PLATFORM_TO_SDK_DEVICE_TYPE", "getPLATFORM_TO_SDK_DEVICE_TYPE", "PLATFORM_TO_SDK_MEDICAL_RESOURCE_TYPE", "getPLATFORM_TO_SDK_MEDICAL_RESOURCE_TYPE", "toPlatformExerciseCategory", "PLATFORM_TO_SDK_RECORDING_METHOD", "getPLATFORM_TO_SDK_RECORDING_METHOD", "toPlatformCervicalMucusAppearance", "toPlatformBloodPressureBodyPosition", "toPlatformExerciseSessionType", "toPlatformExerciseSegmentType", "toPlatformMealType", "toPlatformVo2MaxMeasurementMethod", "toPlatformMenstruationFlow", "toPlatformBodyTemperatureMeasurementLocation", "toPlatformBloodPressureMeasurementLocation", "toPlatformOvulationTestResult", "toPlatformCervicalMucusSensation", "toPlatformSexualActivityProtectionUsed", "toPlatformSkinTemperatureMeasurementLocation", "toPlatformBloodGlucoseSpecimenSource", "toPlatformBloodGlucoseRelationToMeal", "toPlatformSleepStageType", "toPlatformRecordingMethod", "toPlatformFhirResourceType", "toPlatformMedicalResourceType", "toSdkBloodPressureBodyPosition", "toSdkBloodPressureMeasurementLocation", "toSdkExerciseSessionType", "toSdkExerciseSegmentType", "toSdkExerciseCategory", "toSdkVo2MaxMeasurementMethod", "toSdkMenstruationFlow", "toSdkMindfulnessSessionType", "toSdkProtectionUsed", "toSdkCervicalMucusSensation", "toSdkBloodGlucoseSpecimenSource", "toSdkMealType", "toSdkOvulationTestResult", "toSdkRelationToMeal", "toSdkBodyTemperatureMeasurementLocation", "toSdkCervicalMucusAppearance", "toSdkSleepStageType", "toSdkSkinTemperatureMeasurementLocation", "toSdkRecordingMethod", "reversed", "toSdkFhirResourceType", "toSdkMedicalResourceType", "toSdkDevice", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntDefMappingsKt {
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_BLOOD_GLUCOSE_RELATION_TO_MEAL;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_BLOOD_PRESSURE_BODY_POSITION;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_BLOOD_PRESSURE_MEASUREMENT_LOCATION;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_BODY_TEMPERATURE_MEASUREMENT_LOCATION;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_CERVICAL_MUCUS_APPEARANCE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_CERVICAL_MUCUS_SENSATION;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_DEVICE_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_EXERCISE_CATEGORY;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_EXERCISE_SEGMENT_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_EXERCISE_SESSION_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_FHIR_RESOURCE_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_GLUCOSE_SPECIMEN_SOURCE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_MEAL_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_MEDICAL_RESOURCE_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_MENSTRUATION_FLOW_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_OVULATION_TEST_RESULT;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_RECORDING_METHOD;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_SEXUAL_ACTIVITY_PROTECTION_USED;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_SKIN_TEMPERATURE_MEASUREMENT_LOCATION;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_SLEEP_STAGE_TYPE;
    private static final Map<Integer, Integer> PLATFORM_TO_SDK_VO2_MAX_MEASUREMENT_METHOD;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_BLOOD_GLUCOSE_RELATION_TO_MEAL;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_BLOOD_PRESSURE_BODY_POSITION;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_BLOOD_PRESSURE_MEASUREMENT_LOCATION;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_BODY_TEMPERATURE_MEASUREMENT_LOCATION;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_CERVICAL_MUCUS_APPEARANCE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_CERVICAL_MUCUS_SENSATION;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_DEVICE_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_EXERCISE_CATEGORY;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_EXERCISE_SEGMENT_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_EXERCISE_SESSION_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_FHIR_RESOURCE_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_MEAL_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_MENSTRUATION_FLOW_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_OVULATION_TEST_RESULT;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_RECORDING_METHOD;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_SEXUAL_ACTIVITY_PROTECTION_USED;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_SKIN_TEMPERATURE_MEASUREMENT_LOCATION;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_SLEEP_STAGE_TYPE;
    private static final Map<Integer, Integer> SDK_TO_PLATFORM_VO2_MAX_MEASUREMENT_METHOD;

    public static /* synthetic */ void getPLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE$annotations() {
    }

    public static /* synthetic */ void getSDK_TO_PLATFORM_FHIR_RESOURCE_TYPE$annotations() {
    }

    public static /* synthetic */ void getSDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE$annotations() {
    }

    public static /* synthetic */ void getSDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE$annotations() {
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_CERVICAL_MUCUS_APPEARANCE() {
        return SDK_TO_PLATFORM_CERVICAL_MUCUS_APPEARANCE;
    }

    static {
        Map<Integer, Integer> mapE = zae.e(yyz.c(5, 5), yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(6, 6));
        SDK_TO_PLATFORM_CERVICAL_MUCUS_APPEARANCE = mapE;
        PLATFORM_TO_SDK_CERVICAL_MUCUS_APPEARANCE = reversed(mapE);
        Map<Integer, Integer> mapE2 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4));
        SDK_TO_PLATFORM_BLOOD_PRESSURE_BODY_POSITION = mapE2;
        PLATFORM_TO_SDK_BLOOD_PRESSURE_BODY_POSITION = reversed(mapE2);
        Map<Integer, Integer> mapE3 = zae.e(yyz.c(0, 58), yyz.c(2, 1), yyz.c(4, 2), yyz.c(5, 3), yyz.c(8, 4), yyz.c(9, 5), yyz.c(10, 6), yyz.c(11, 7), yyz.c(13, 8), yyz.c(14, 9), yyz.c(16, 10), yyz.c(25, 60), yyz.c(26, 11), yyz.c(27, 12), yyz.c(28, 13), yyz.c(29, 14), yyz.c(31, 15), yyz.c(32, 16), yyz.c(33, 17), yyz.c(34, 18), yyz.c(35, 19), yyz.c(36, 20), yyz.c(37, 21), yyz.c(38, 22), yyz.c(39, 23), yyz.c(44, 24), yyz.c(46, 25), yyz.c(47, 26), yyz.c(48, 27), yyz.c(50, 28), yyz.c(51, 29), yyz.c(52, 30), yyz.c(53, 31), yyz.c(54, 61), yyz.c(55, 32), yyz.c(56, 33), yyz.c(57, 34), yyz.c(58, 35), yyz.c(59, 36), yyz.c(60, 37), yyz.c(61, 38), yyz.c(62, 39), yyz.c(63, 40), yyz.c(64, 41), yyz.c(65, 42), yyz.c(66, 43), yyz.c(68, 44), yyz.c(69, 59), yyz.c(70, 45), yyz.c(71, 46), yyz.c(72, 47), yyz.c(73, 48), yyz.c(74, 49), yyz.c(75, 50), yyz.c(76, 51), yyz.c(78, 52), yyz.c(79, 53), yyz.c(80, 54), yyz.c(81, 55), yyz.c(82, 56), yyz.c(83, 57));
        SDK_TO_PLATFORM_EXERCISE_SESSION_TYPE = mapE3;
        PLATFORM_TO_SDK_EXERCISE_SESSION_TYPE = reversed(mapE3);
        Map<Integer, Integer> mapE4 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4));
        SDK_TO_PLATFORM_MEAL_TYPE = mapE4;
        PLATFORM_TO_SDK_MEAL_TYPE = reversed(mapE4);
        Map<Integer, Integer> mapE5 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(5, 5));
        SDK_TO_PLATFORM_VO2_MAX_MEASUREMENT_METHOD = mapE5;
        PLATFORM_TO_SDK_VO2_MAX_MEASUREMENT_METHOD = reversed(mapE5);
        Map<Integer, Integer> mapE6 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3));
        SDK_TO_PLATFORM_MENSTRUATION_FLOW_TYPE = mapE6;
        PLATFORM_TO_SDK_MENSTRUATION_FLOW_TYPE = reversed(mapE6);
        Map<Integer, Integer> mapE7 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(5, 5), yyz.c(6, 6), yyz.c(7, 7), yyz.c(8, 8), yyz.c(9, 9), yyz.c(10, 10));
        SDK_TO_PLATFORM_BODY_TEMPERATURE_MEASUREMENT_LOCATION = mapE7;
        PLATFORM_TO_SDK_BODY_TEMPERATURE_MEASUREMENT_LOCATION = reversed(mapE7);
        Map<Integer, Integer> mapE8 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4));
        SDK_TO_PLATFORM_BLOOD_PRESSURE_MEASUREMENT_LOCATION = mapE8;
        PLATFORM_TO_SDK_BLOOD_PRESSURE_MEASUREMENT_LOCATION = reversed(mapE8);
        Map<Integer, Integer> mapE9 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(0, 0));
        SDK_TO_PLATFORM_OVULATION_TEST_RESULT = mapE9;
        PLATFORM_TO_SDK_OVULATION_TEST_RESULT = reversed(mapE9);
        Map<Integer, Integer> mapE10 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3));
        SDK_TO_PLATFORM_CERVICAL_MUCUS_SENSATION = mapE10;
        PLATFORM_TO_SDK_CERVICAL_MUCUS_SENSATION = reversed(mapE10);
        Map<Integer, Integer> mapE11 = zae.e(yyz.c(1, 1), yyz.c(2, 2));
        SDK_TO_PLATFORM_SEXUAL_ACTIVITY_PROTECTION_USED = mapE11;
        PLATFORM_TO_SDK_SEXUAL_ACTIVITY_PROTECTION_USED = reversed(mapE11);
        Map<Integer, Integer> mapE12 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3));
        SDK_TO_PLATFORM_SKIN_TEMPERATURE_MEASUREMENT_LOCATION = mapE12;
        PLATFORM_TO_SDK_SKIN_TEMPERATURE_MEASUREMENT_LOCATION = reversed(mapE12);
        Map<Integer, Integer> mapE13 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(5, 5), yyz.c(6, 6));
        SDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE = mapE13;
        PLATFORM_TO_SDK_GLUCOSE_SPECIMEN_SOURCE = reversed(mapE13);
        Map<Integer, Integer> mapE14 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4));
        SDK_TO_PLATFORM_BLOOD_GLUCOSE_RELATION_TO_MEAL = mapE14;
        PLATFORM_TO_SDK_BLOOD_GLUCOSE_RELATION_TO_MEAL = reversed(mapE14);
        Map<Integer, Integer> mapE15 = zae.e(yyz.c(0, 0), yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(5, 5));
        SDK_TO_PLATFORM_EXERCISE_CATEGORY = mapE15;
        PLATFORM_TO_SDK_EXERCISE_CATEGORY = reversed(mapE15);
        Map<Integer, Integer> mapE16 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(5, 5), yyz.c(6, 6), yyz.c(7, 7));
        SDK_TO_PLATFORM_SLEEP_STAGE_TYPE = mapE16;
        PLATFORM_TO_SDK_SLEEP_STAGE_TYPE = reversed(mapE16);
        Map<Integer, Integer> mapE17 = zae.e(yyz.c(1, 26), yyz.c(2, 27), yyz.c(3, 28), yyz.c(4, 1), yyz.c(5, 29), yyz.c(6, 2), yyz.c(7, 3), yyz.c(8, 4), yyz.c(9, 30), yyz.c(10, 31), yyz.c(11, 32), yyz.c(12, 33), yyz.c(13, 5), yyz.c(14, 6), yyz.c(15, 7), yyz.c(16, 8), yyz.c(17, 34), yyz.c(18, 9), yyz.c(19, 10), yyz.c(20, 11), yyz.c(21, 12), yyz.c(22, 13), yyz.c(23, 35), yyz.c(24, 62), yyz.c(25, 36), yyz.c(26, 37), yyz.c(27, 38), yyz.c(28, 39), yyz.c(29, 40), yyz.c(30, 41), yyz.c(31, 42), yyz.c(32, 43), yyz.c(33, 44), yyz.c(34, 45), yyz.c(35, 46), yyz.c(36, 47), yyz.c(37, 48), yyz.c(38, 64), yyz.c(39, 67), yyz.c(40, 14), yyz.c(41, 49), yyz.c(42, 50), yyz.c(43, 51), yyz.c(44, 66), yyz.c(45, 15), yyz.c(46, 16), yyz.c(47, 17), yyz.c(48, 52), yyz.c(49, 53), yyz.c(50, 54), yyz.c(51, 55), yyz.c(52, 18), yyz.c(53, 19), yyz.c(54, 20), yyz.c(55, 57), yyz.c(56, 58), yyz.c(57, 59), yyz.c(58, 56), yyz.c(59, 60), yyz.c(60, 21), yyz.c(61, 61), yyz.c(62, 22), yyz.c(63, 23), yyz.c(64, 24), yyz.c(65, 63), yyz.c(66, 25), yyz.c(67, 65));
        SDK_TO_PLATFORM_EXERCISE_SEGMENT_TYPE = mapE17;
        PLATFORM_TO_SDK_EXERCISE_SEGMENT_TYPE = reversed(mapE17);
        Map<Integer, Integer> mapE18 = zae.e(yyz.c(2, 3), yyz.c(1, 1), yyz.c(4, 5), yyz.c(3, 4), yyz.c(5, 6));
        SDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE = mapE18;
        PLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE = reversed(mapE18);
        Map<Integer, Integer> mapE19 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3));
        SDK_TO_PLATFORM_RECORDING_METHOD = mapE19;
        Map<Integer, Integer> mapE20 = zae.e(yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(5, 5), yyz.c(6, 6), yyz.c(7, 7), yyz.c(8, 8), yyz.c(9, 9), yyz.c(10, 10), yyz.c(11, 11), yyz.c(12, 12), yyz.c(13, 13), yyz.c(14, 14));
        SDK_TO_PLATFORM_FHIR_RESOURCE_TYPE = mapE20;
        PLATFORM_TO_SDK_FHIR_RESOURCE_TYPE = reversed(mapE20);
        Map<Integer, Integer> mapE21 = zae.e(yyz.c(2, 2), yyz.c(7, 7), yyz.c(6, 6), yyz.c(9, 9), yyz.c(10, 10), yyz.c(11, 11), yyz.c(3, 3), yyz.c(8, 8), yyz.c(4, 4), yyz.c(1, 1), yyz.c(12, 12), yyz.c(5, 5));
        SDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE = mapE21;
        Map<Integer, Integer> mapE22 = zae.e(yyz.c(0, 0), yyz.c(1, 1), yyz.c(2, 2), yyz.c(3, 3), yyz.c(4, 4), yyz.c(5, 5), yyz.c(6, 6), yyz.c(7, 7), yyz.c(8, 8));
        SDK_TO_PLATFORM_DEVICE_TYPE = mapE22;
        PLATFORM_TO_SDK_DEVICE_TYPE = reversed(mapE22);
        PLATFORM_TO_SDK_MEDICAL_RESOURCE_TYPE = reversed(mapE21);
        PLATFORM_TO_SDK_RECORDING_METHOD = reversed(mapE19);
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_CERVICAL_MUCUS_APPEARANCE() {
        return PLATFORM_TO_SDK_CERVICAL_MUCUS_APPEARANCE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_BLOOD_PRESSURE_BODY_POSITION() {
        return SDK_TO_PLATFORM_BLOOD_PRESSURE_BODY_POSITION;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_BLOOD_PRESSURE_BODY_POSITION() {
        return PLATFORM_TO_SDK_BLOOD_PRESSURE_BODY_POSITION;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_EXERCISE_SESSION_TYPE() {
        return SDK_TO_PLATFORM_EXERCISE_SESSION_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_EXERCISE_SESSION_TYPE() {
        return PLATFORM_TO_SDK_EXERCISE_SESSION_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_MEAL_TYPE() {
        return SDK_TO_PLATFORM_MEAL_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_MEAL_TYPE() {
        return PLATFORM_TO_SDK_MEAL_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_VO2_MAX_MEASUREMENT_METHOD() {
        return SDK_TO_PLATFORM_VO2_MAX_MEASUREMENT_METHOD;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_VO2_MAX_MEASUREMENT_METHOD() {
        return PLATFORM_TO_SDK_VO2_MAX_MEASUREMENT_METHOD;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_MENSTRUATION_FLOW_TYPE() {
        return SDK_TO_PLATFORM_MENSTRUATION_FLOW_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_MENSTRUATION_FLOW_TYPE() {
        return PLATFORM_TO_SDK_MENSTRUATION_FLOW_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_BODY_TEMPERATURE_MEASUREMENT_LOCATION() {
        return SDK_TO_PLATFORM_BODY_TEMPERATURE_MEASUREMENT_LOCATION;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_BODY_TEMPERATURE_MEASUREMENT_LOCATION() {
        return PLATFORM_TO_SDK_BODY_TEMPERATURE_MEASUREMENT_LOCATION;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_BLOOD_PRESSURE_MEASUREMENT_LOCATION() {
        return SDK_TO_PLATFORM_BLOOD_PRESSURE_MEASUREMENT_LOCATION;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_BLOOD_PRESSURE_MEASUREMENT_LOCATION() {
        return PLATFORM_TO_SDK_BLOOD_PRESSURE_MEASUREMENT_LOCATION;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_OVULATION_TEST_RESULT() {
        return SDK_TO_PLATFORM_OVULATION_TEST_RESULT;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_OVULATION_TEST_RESULT() {
        return PLATFORM_TO_SDK_OVULATION_TEST_RESULT;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_CERVICAL_MUCUS_SENSATION() {
        return SDK_TO_PLATFORM_CERVICAL_MUCUS_SENSATION;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_CERVICAL_MUCUS_SENSATION() {
        return PLATFORM_TO_SDK_CERVICAL_MUCUS_SENSATION;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_SEXUAL_ACTIVITY_PROTECTION_USED() {
        return SDK_TO_PLATFORM_SEXUAL_ACTIVITY_PROTECTION_USED;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_SEXUAL_ACTIVITY_PROTECTION_USED() {
        return PLATFORM_TO_SDK_SEXUAL_ACTIVITY_PROTECTION_USED;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_SKIN_TEMPERATURE_MEASUREMENT_LOCATION() {
        return SDK_TO_PLATFORM_SKIN_TEMPERATURE_MEASUREMENT_LOCATION;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_SKIN_TEMPERATURE_MEASUREMENT_LOCATION() {
        return PLATFORM_TO_SDK_SKIN_TEMPERATURE_MEASUREMENT_LOCATION;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE() {
        return SDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_GLUCOSE_SPECIMEN_SOURCE() {
        return PLATFORM_TO_SDK_GLUCOSE_SPECIMEN_SOURCE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_BLOOD_GLUCOSE_RELATION_TO_MEAL() {
        return SDK_TO_PLATFORM_BLOOD_GLUCOSE_RELATION_TO_MEAL;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_BLOOD_GLUCOSE_RELATION_TO_MEAL() {
        return PLATFORM_TO_SDK_BLOOD_GLUCOSE_RELATION_TO_MEAL;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_EXERCISE_CATEGORY() {
        return SDK_TO_PLATFORM_EXERCISE_CATEGORY;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_EXERCISE_CATEGORY() {
        return PLATFORM_TO_SDK_EXERCISE_CATEGORY;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_SLEEP_STAGE_TYPE() {
        return SDK_TO_PLATFORM_SLEEP_STAGE_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_SLEEP_STAGE_TYPE() {
        return PLATFORM_TO_SDK_SLEEP_STAGE_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_EXERCISE_SEGMENT_TYPE() {
        return SDK_TO_PLATFORM_EXERCISE_SEGMENT_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_EXERCISE_SEGMENT_TYPE() {
        return PLATFORM_TO_SDK_EXERCISE_SEGMENT_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE() {
        return SDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE;
    }

    public static final int toPlatformMindfulnessSessionType(int i) {
        Integer num = SDK_TO_PLATFORM_MINDFULNESS_SESSION_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE() {
        return PLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_RECORDING_METHOD() {
        return SDK_TO_PLATFORM_RECORDING_METHOD;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_FHIR_RESOURCE_TYPE() {
        return SDK_TO_PLATFORM_FHIR_RESOURCE_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_FHIR_RESOURCE_TYPE() {
        return PLATFORM_TO_SDK_FHIR_RESOURCE_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE() {
        return SDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE;
    }

    public static final Map<Integer, Integer> getSDK_TO_PLATFORM_DEVICE_TYPE() {
        return SDK_TO_PLATFORM_DEVICE_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_DEVICE_TYPE() {
        return PLATFORM_TO_SDK_DEVICE_TYPE;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_MEDICAL_RESOURCE_TYPE() {
        return PLATFORM_TO_SDK_MEDICAL_RESOURCE_TYPE;
    }

    public static final int toPlatformExerciseCategory(int i) {
        Integer num = SDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final Map<Integer, Integer> getPLATFORM_TO_SDK_RECORDING_METHOD() {
        return PLATFORM_TO_SDK_RECORDING_METHOD;
    }

    public static final int toPlatformCervicalMucusAppearance(int i) {
        Integer num = SDK_TO_PLATFORM_CERVICAL_MUCUS_APPEARANCE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformBloodPressureBodyPosition(int i) {
        Integer num = SDK_TO_PLATFORM_BLOOD_PRESSURE_BODY_POSITION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformExerciseSessionType(int i) {
        Integer num = SDK_TO_PLATFORM_EXERCISE_SESSION_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformExerciseSegmentType(int i) {
        Integer num = SDK_TO_PLATFORM_EXERCISE_SEGMENT_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformMealType(int i) {
        Integer num = SDK_TO_PLATFORM_MEAL_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformVo2MaxMeasurementMethod(int i) {
        Integer num = SDK_TO_PLATFORM_VO2_MAX_MEASUREMENT_METHOD.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformMenstruationFlow(int i) {
        Integer num = SDK_TO_PLATFORM_MENSTRUATION_FLOW_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformBodyTemperatureMeasurementLocation(int i) {
        Integer num = SDK_TO_PLATFORM_BODY_TEMPERATURE_MEASUREMENT_LOCATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformBloodPressureMeasurementLocation(int i) {
        Integer num = SDK_TO_PLATFORM_BLOOD_PRESSURE_MEASUREMENT_LOCATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformOvulationTestResult(int i) {
        Integer num = SDK_TO_PLATFORM_OVULATION_TEST_RESULT.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformCervicalMucusSensation(int i) {
        Integer num = SDK_TO_PLATFORM_CERVICAL_MUCUS_SENSATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformSexualActivityProtectionUsed(int i) {
        Integer num = SDK_TO_PLATFORM_SEXUAL_ACTIVITY_PROTECTION_USED.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformSkinTemperatureMeasurementLocation(int i) {
        Integer num = SDK_TO_PLATFORM_SKIN_TEMPERATURE_MEASUREMENT_LOCATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformBloodGlucoseSpecimenSource(int i) {
        Integer num = SDK_TO_PLATFORM_BLOOD_GLUCOSE_SPECIMEN_SOURCE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformBloodGlucoseRelationToMeal(int i) {
        Integer num = SDK_TO_PLATFORM_BLOOD_GLUCOSE_RELATION_TO_MEAL.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformSleepStageType(int i) {
        Integer num = SDK_TO_PLATFORM_SLEEP_STAGE_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformRecordingMethod(int i) {
        Integer num = SDK_TO_PLATFORM_RECORDING_METHOD.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toPlatformFhirResourceType(int i) {
        Integer num = SDK_TO_PLATFORM_FHIR_RESOURCE_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("SDK => Platform: Invalid FHIR resource type.");
    }

    public static final int toPlatformMedicalResourceType(int i) {
        Integer num = SDK_TO_PLATFORM_MEDICAL_RESOURCE_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("SDK => Platform: Invalid medical resource type.");
    }

    public static final int toSdkBloodPressureBodyPosition(int i) {
        Integer num = PLATFORM_TO_SDK_BLOOD_PRESSURE_BODY_POSITION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkBloodPressureMeasurementLocation(int i) {
        Integer num = PLATFORM_TO_SDK_BLOOD_PRESSURE_MEASUREMENT_LOCATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkExerciseSessionType(int i) {
        Integer num = PLATFORM_TO_SDK_EXERCISE_SESSION_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkExerciseSegmentType(int i) {
        Integer num = PLATFORM_TO_SDK_EXERCISE_SEGMENT_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkExerciseCategory(int i) {
        Integer num = PLATFORM_TO_SDK_EXERCISE_CATEGORY.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkVo2MaxMeasurementMethod(int i) {
        Integer num = PLATFORM_TO_SDK_VO2_MAX_MEASUREMENT_METHOD.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkMenstruationFlow(int i) {
        Integer num = PLATFORM_TO_SDK_MENSTRUATION_FLOW_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkMindfulnessSessionType(int i) {
        Integer num = PLATFORM_TO_SDK_MINDFULNESS_SESSION_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkProtectionUsed(int i) {
        Integer num = PLATFORM_TO_SDK_SEXUAL_ACTIVITY_PROTECTION_USED.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkCervicalMucusSensation(int i) {
        Integer num = PLATFORM_TO_SDK_CERVICAL_MUCUS_SENSATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkBloodGlucoseSpecimenSource(int i) {
        Integer num = PLATFORM_TO_SDK_GLUCOSE_SPECIMEN_SOURCE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkMealType(int i) {
        Integer num = PLATFORM_TO_SDK_MEAL_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkOvulationTestResult(int i) {
        Integer num = PLATFORM_TO_SDK_OVULATION_TEST_RESULT.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkRelationToMeal(int i) {
        Integer num = PLATFORM_TO_SDK_BLOOD_GLUCOSE_RELATION_TO_MEAL.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkBodyTemperatureMeasurementLocation(int i) {
        Integer num = PLATFORM_TO_SDK_BODY_TEMPERATURE_MEASUREMENT_LOCATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkCervicalMucusAppearance(int i) {
        Integer num = PLATFORM_TO_SDK_CERVICAL_MUCUS_APPEARANCE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkSleepStageType(int i) {
        Integer num = PLATFORM_TO_SDK_SLEEP_STAGE_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkSkinTemperatureMeasurementLocation(int i) {
        Integer num = PLATFORM_TO_SDK_SKIN_TEMPERATURE_MEASUREMENT_LOCATION.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int toSdkRecordingMethod(int i) {
        Integer num = PLATFORM_TO_SDK_RECORDING_METHOD.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private static final Map<Integer, Integer> reversed(Map<Integer, Integer> map) {
        Set<Map.Entry<Integer, Integer>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            yyu yyuVarC = yyz.c(Integer.valueOf(((Number) entry.getValue()).intValue()), Integer.valueOf(((Number) entry.getKey()).intValue()));
            linkedHashMap.put(yyuVarC.c(), yyuVarC.d());
        }
        return linkedHashMap;
    }

    public static final int toSdkFhirResourceType(int i) {
        Integer num = PLATFORM_TO_SDK_FHIR_RESOURCE_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Platform => SDK: Invalid FHIR resource type.");
    }

    public static final int toSdkMedicalResourceType(int i) {
        Integer num = PLATFORM_TO_SDK_MEDICAL_RESOURCE_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Platform => SDK: Invalid medical resource type.");
    }

    public static final int toSdkDevice(int i) {
        Integer num = PLATFORM_TO_SDK_DEVICE_TYPE.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
