package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.suggestion.protobuf.CourseProto;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fkm {
    public static final Map<Integer, String> d = Collections.unmodifiableMap(new HashMap<Integer, String>() { // from class: fkm.3
        private static final long serialVersionUID = -2469811930284704720L;

        {
            put(5, "010101");
            put(6, "010102");
            put(7, "010103");
        }
    });

    public static void d(CourseProto.CourseStorageInfo courseStorageInfo, DeviceInfo deviceInfo) {
        edc.e().sendSampleConfigCommand(deviceInfo, c(courseStorageInfo), "CourseLinkageUtils");
    }

    public static void d(CourseStateProto.CourseState courseState, DeviceInfo deviceInfo) {
        edc.e().sendSampleConfigCommand(deviceInfo, b(courseState), "CourseLinkageUtils");
    }

    public static void a(CourseStateProto.CourseState courseState, int i, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("CourseLinkageUtils", "device info null");
        } else {
            edc.e().sendSampleConfigCommand(deviceInfo, d(courseState, i), "CourseLinkageUtils");
        }
    }

    public static boolean d(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE);
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageUtils", "isSupportReverseControlCourse is ", Boolean.valueOf(zD));
        return zD;
    }

    private static eef c(CourseProto.CourseStorageInfo courseStorageInfo) {
        byte[] bArrA = a(courseStorageInfo.toByteArray(), (byte) 2);
        LogUtil.a("CourseLinkageUtils", "createCourseSampleConfig courseTlv: ", eeq.e(bArrA));
        return b(bArrA);
    }

    private static eef b(CourseStateProto.CourseState courseState) {
        byte[] bArrA = a(courseState.toByteArray(), (byte) 3);
        LogUtil.a("CourseLinkageUtils", "createCourseStateSampleConfig courseStateTlv: ", eeq.e(bArrA));
        return b(bArrA);
    }

    private static eef d(CourseStateProto.CourseState courseState, int i) {
        String str;
        Map<Integer, String> map = d;
        if (!map.containsKey(Integer.valueOf(i))) {
            str = "";
        } else {
            str = map.get(Integer.valueOf(i));
        }
        String str2 = str + eeq.e(a(courseState.toByteArray(), (byte) 3));
        LogUtil.d("CourseLinkageUtils", "createCourseStateSampleConfig configData: ", str2);
        return b(eeq.c(str2));
    }

    private static byte[] a(byte[] bArr, byte b2) {
        int length = bArr.length;
        int length2 = eeq.b(length).length() / 2;
        byte[] bArrC = eeq.c(eeq.b(length));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 + 1 + length);
        byteBufferAllocate.put(b2).put(bArrC).put(bArr);
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageUtils", "valueCapacity: ", Integer.valueOf(length), ", lenCapacity: ", Integer.valueOf(length2), ", len: ", Integer.valueOf(bArrC.length));
        return byteBufferAllocate.array();
    }

    private static eef b(byte[] bArr) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.course.linkage");
        eefVar.setWearPkgName("hw.course.linkage");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900200005L);
        eegVar.b(1);
        eegVar.d(bArr);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }
}
