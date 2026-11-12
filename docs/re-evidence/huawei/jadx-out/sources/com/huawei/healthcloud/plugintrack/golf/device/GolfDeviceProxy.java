package com.huawei.healthcloud.plugintrack.golf.device;

import android.content.Context;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.healthcloud.plugintrack.golf.Utils;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseMapInfo;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseStateInfo;
import com.huawei.healthcloud.plugintrack.golf.cloud.GolfDownloadTaskUtils;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GolfClubListInfoDataRsp;
import com.huawei.healthcloud.plugintrack.golf.h5.GolfH5DownloadInterface;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.dfh;
import defpackage.ecu;
import defpackage.eeq;
import defpackage.eey;
import defpackage.ies;
import defpackage.xiu;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GolfDeviceProxy {
    private static final int BUFFER_SIZE = 256;
    private static final String COURSE_LIST_FILE_NAME = "CourseListFile.bin";
    private static final String COURSE_MAP_FILE_NAME = ".bin";
    private static final int DEFAULT_COURSE_ID = 0;
    private static final int DELAY_SECONDS = 1000;
    private static final int ERROR_CODE_COMM_SUCCESS = 207;
    private static final Object LOCK_SINGLETON = new Object();
    private static final int NUM_BYTES_LENGTH = 4;
    private static final int PING_SUCCESS = 202;
    private static final int SPORT_WATCH_TYPE = 0;
    private static final String TAG = "Track_GolfDeviceProxy";
    private static GolfDeviceProxy sInstance;
    private Context mCtx;
    private GolfDeviceEngineManager mGolfDeviceEngineMgr;
    private HashMap<Integer, String> sendingCourseMap = new HashMap<>();

    private GolfDeviceProxy(Context context) {
        LogUtil.a(TAG, "GolfDeviceProxy");
        this.mCtx = context;
        this.mGolfDeviceEngineMgr = GolfDeviceEngineManager.getInstance();
    }

    public static GolfDeviceProxy getInstance() {
        GolfDeviceProxy golfDeviceProxy;
        synchronized (LOCK_SINGLETON) {
            if (sInstance == null) {
                LogUtil.a(TAG, "getInstance");
                sInstance = new GolfDeviceProxy(BaseApplication.getContext());
            }
            golfDeviceProxy = sInstance;
        }
        return golfDeviceProxy;
    }

    public void sendCourseListFile(List<GolfCourseInfo> list, int i, int i2) throws dfh {
        if (list == null) {
            return;
        }
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_LIST_FILE.getTypeValue();
        builder.setBusinessType(typeValue).setVersion(1).setMessageId(i2).setResponseState(i);
        String str = i2 + COURSE_LIST_FILE_NAME;
        byte[] courseListByteArray = getCourseListByteArray(list);
        GolfNumberHeader golfNumberHeader = new GolfNumberHeader();
        golfNumberHeader.setCourseNum(list.size());
        byte[] bytes = golfNumberHeader.getBytes();
        builder.setDataLength(courseListByteArray.length);
        builder.setBusinessHeadLength(bytes.length);
        writeFileData(str, builder.builder().getBytes(), bytes, courseListByteArray);
        xiu.c cVar = new xiu.c();
        final File file = new File(getFilePath(str));
        cVar.a(file);
        LogUtil.a(TAG, "sendCourseListFile, type:[", Integer.valueOf(typeValue), "], msgId[", Integer.valueOf(i2), "]");
        this.mGolfDeviceEngineMgr.sendMsgToDevice(cVar.c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, i2), typeValue, new SendCallback(this) { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.1
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i3) {
                File file2 = file;
                if (file2 != null && file2.exists()) {
                    LogUtil.a(GolfDeviceProxy.TAG, "delete course list file ", file.delete() ? "success" : ParamConstants.CallbackMethod.ON_FAIL);
                }
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "sendCourseListFile, sendRst[", Integer.valueOf(i3), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendCourseListFile, sendPrgs[", Long.valueOf(j), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendCourseListFile，transferWay: ", str2);
            }
        });
    }

    public void sendCourseVersionCheckRst(GolfCourseStateInfo golfCourseStateInfo, int i) {
        if (golfCourseStateInfo == null) {
            return;
        }
        LogUtil.a(TAG, "sendCourseVersionCheckRst: stateInfo id is: ", Integer.valueOf(golfCourseStateInfo.getCourseId()), " state is: ", Integer.valueOf(golfCourseStateInfo.getState()));
        byte[] bytes = golfCourseStateInfo.toBytes();
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_VERSION_RESPON.getTypeValue();
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        builder.setBusinessType(typeValue).setDataLength(bytes.length).setVersion(1).setMessageId(i).setResponseState(golfCourseStateInfo.getRspState());
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        this.mGolfDeviceEngineMgr.sendMsgToDevice(cVar.c());
    }

    public void sendCourseMap(GolfCourseMapInfo golfCourseMapInfo, final int i) throws Throwable {
        boolean zIsMapAvailable = isMapAvailable(golfCourseMapInfo);
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_FILE.getTypeValue();
        final int courseId = golfCourseMapInfo.getCourseId();
        builder.setBusinessType(typeValue).setVersion(1).setMessageId(i);
        StringBuilder sb = new StringBuilder();
        sb.append(zIsMapAvailable ? courseId : 0);
        sb.append(".bin");
        String string = sb.toString();
        writeMapToFile(zIsMapAvailable, golfCourseMapInfo, builder, string);
        golfCourseMapInfo.deleteMapFile(TAG);
        xiu.c cVar = new xiu.c();
        final File file = new File(getFilePath(string));
        cVar.a(file);
        if (zIsMapAvailable) {
            this.sendingCourseMap.put(Integer.valueOf(courseId), getFilePath(string));
        }
        this.mGolfDeviceEngineMgr.sendMsgToDevice(cVar.c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, i, getInvoker(courseId), golfCourseMapInfo), typeValue, new SendCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.2
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "sendCourseMap, sendRst[", Integer.valueOf(i2), "]", "msgId is:", Integer.valueOf(i));
                File file2 = file;
                if (file2 != null && file2.exists()) {
                    LogUtil.a(GolfDeviceProxy.TAG, "assembleFile delete ", file.delete() ? "success" : ParamConstants.CallbackMethod.ON_FAIL);
                }
                GolfH5DownloadInterface.InvokerBundle invoker = GolfDeviceProxy.this.getInvoker(courseId);
                if (i2 != 207 && invoker != null) {
                    invoker.onComplete(1, "", courseId);
                }
                GolfDownloadTaskUtils.getInstance().removeCourseId(courseId);
                GolfDeviceProxy.this.sendingCourseMap.remove(Integer.valueOf(courseId));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                GolfH5DownloadInterface.InvokerBundle invoker = GolfDeviceProxy.this.getInvoker(courseId);
                if (j % 2 == 0 && invoker != null) {
                    invoker.onSuccess(Float.toString((j * 0.5f) + 50.0f), courseId, 1);
                }
                LogUtil.a(GolfDeviceProxy.TAG, "sendCourseMap, sendProgress[", Long.valueOf(j), "]", "msgId is:", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendCourseMap，transferWay: ", str);
            }
        });
    }

    private boolean isMapAvailable(GolfCourseMapInfo golfCourseMapInfo) {
        if (golfCourseMapInfo == null) {
            ReleaseLogUtil.e(TAG, "mapInfo is null in sendCourseMap");
            return false;
        }
        if (golfCourseMapInfo.getMapFile() == null) {
            ReleaseLogUtil.e(TAG, "mapInfo.getMapFile() is null in sendCourseMap");
            return false;
        }
        LogUtil.a(TAG, golfCourseMapInfo.toString());
        return golfCourseMapInfo.getMapFile().exists();
    }

    private void writeMapToFile(boolean z, GolfCourseMapInfo golfCourseMapInfo, GolfMsgHeader.Builder builder, String str) throws Throwable {
        if (z) {
            byte[] bytes = golfCourseMapInfo.toBytes();
            byte[] bytesByFile = getBytesByFile(golfCourseMapInfo.getMapFile());
            if (bytesByFile == null) {
                return;
            }
            builder.setDataLength(bytesByFile.length).setResponseState(0).setBusinessHeadLength(bytes.length).setMapStyle(golfCourseMapInfo.getMapStyle());
            try {
                writeFileData(str, builder.builder().getBytes(), bytes, getBytesByFile(golfCourseMapInfo.getMapFile()));
                return;
            } catch (dfh e) {
                ReleaseLogUtil.a(TAG, e.getMessage());
                return;
            }
        }
        builder.setDataLength(0).setResponseState(1);
        try {
            writeFileData(str, builder.builder().getBytes());
        } catch (dfh e2) {
            ReleaseLogUtil.a(TAG, e2.getMessage());
        }
    }

    public void sendPushCourseMapHandShake(final GolfCourseMapInfo golfCourseMapInfo, final int i, final int i2) {
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_PUSH_SHAKE.getTypeValue();
        int iNewMsgId = GolfMsgHeader.newMsgId();
        final int courseId = golfCourseMapInfo.getCourseId();
        xiu.c cVarCreateHandShakeReq = createHandShakeReq(i, typeValue, iNewMsgId, courseId);
        long j = courseId;
        if (GolfDownloadTaskUtils.getInstance().isCourseNeedCancel(j)) {
            LogUtil.a(TAG, "Course is cancel with ", Integer.valueOf(courseId));
            GolfDownloadTaskUtils.getInstance().removeCourseId(j);
            golfCourseMapInfo.deleteMapFile(TAG);
        } else {
            LogUtil.a(TAG, "sendPushCourseMapHandShake, type:[", Integer.valueOf(typeValue), "], msgId[", Integer.valueOf(iNewMsgId), "]");
            this.mGolfDeviceEngineMgr.sendMsgToDevice(cVarCreateHandShakeReq.c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, iNewMsgId, getInvoker(j), golfCourseMapInfo), typeValue, new SendCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.3
                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendResult(int i3) {
                    GolfH5DownloadInterface.InvokerBundle invoker;
                    ReleaseLogUtil.d(GolfDeviceProxy.TAG, "sendPushCourseMapHandShake, sendRst[", Integer.valueOf(i3), "]");
                    if (i3 == 207 || (invoker = GolfDeviceProxy.this.getInvoker(courseId)) == null) {
                        return;
                    }
                    if (i2 > 0) {
                        HandlerExecutor.c(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                GolfDeviceProxy.this.sendPushCourseMapHandShake(golfCourseMapInfo, i, i2 - 1);
                            }
                        }, 1000L);
                        ReleaseLogUtil.d(GolfDeviceProxy.TAG, "RetryTimes of sendPushCourseMapHandShake is ", Integer.valueOf(i2));
                    } else {
                        ReleaseLogUtil.a(GolfDeviceProxy.TAG, "sendPushCourseMapHandShake failed, RetryTimes is more than 3");
                        invoker.onComplete(1, "", courseId);
                    }
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendProgress(long j2) {
                    LogUtil.a(GolfDeviceProxy.TAG, "sendPushCourseMapHandShake, sendProgress[", Long.valueOf(j2), "]");
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onFileTransferReport(String str) {
                    LogUtil.a(GolfDeviceProxy.TAG, "sendPushCourseMapHandShake，transferWay: ", str);
                }
            });
        }
    }

    private xiu.c createHandShakeReq(int i, int i2, int i3, int i4) {
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        builder.setBusinessType(i2).setDataLength(8).setVersion(1).setMessageId(i3).setResponseState(0);
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        byte[] bArr = new byte[8];
        System.arraycopy(Utils.int2Bytes(i4), 0, bArr, 0, 4);
        System.arraycopy(Utils.int2Bytes(i), 0, bArr, 4, 4);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        return cVar;
    }

    public void sendCancelCourseMap(final int i) {
        if (!this.sendingCourseMap.containsKey(Integer.valueOf(i))) {
            LogUtil.j(TAG, "course ", Integer.valueOf(i), " is not sending !");
            return;
        }
        LogUtil.j(TAG, "start cancel: ", Integer.valueOf(i));
        String str = this.sendingCourseMap.get(Integer.valueOf(i));
        final File file = new File(str);
        this.mGolfDeviceEngineMgr.sendCancelCommand(str, new SendCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.4
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
                ReleaseLogUtil.e(GolfDeviceProxy.TAG, "receive cancel result ", Integer.valueOf(i2));
                GolfDeviceProxy.this.sendingCourseMap.remove(Integer.valueOf(i));
                GolfDownloadTaskUtils.getInstance().removeCourseId(i);
                File file2 = file;
                if (file2 == null || !file2.exists()) {
                    return;
                }
                LogUtil.a(GolfDeviceProxy.TAG, "mapFile delete ", file.delete() ? "success" : ParamConstants.CallbackMethod.ON_FAIL);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.j(GolfDeviceProxy.TAG, "receive cancel progress ", Long.valueOf(j));
            }
        });
    }

    public void sendDelCourses(final Long[] lArr, final int i, final GolfH5DownloadInterface.InvokerBundle invokerBundle) {
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_DELETE.getTypeValue();
        int iNewMsgId = GolfMsgHeader.newMsgId();
        xiu.c cVarCreateDelCoursesReq = createDelCoursesReq(lArr, typeValue, iNewMsgId);
        LogUtil.a(TAG, "sendDelCourses, type:[", Integer.valueOf(typeValue), "], msgId[", Integer.valueOf(iNewMsgId), "]");
        this.mGolfDeviceEngineMgr.sendMsgToDevice(cVarCreateDelCoursesReq.c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, iNewMsgId, invokerBundle, null), typeValue, new SendCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.5
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "sendDelCourses, sendRst[", Integer.valueOf(i2), "]");
                if (i2 == 207 || invokerBundle == null) {
                    return;
                }
                if (i > 0) {
                    HandlerExecutor.c(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            GolfDeviceProxy.this.sendDelCourses(lArr, i - 1, invokerBundle);
                        }
                    }, 1000L);
                    ReleaseLogUtil.d(GolfDeviceProxy.TAG, "RetryTimes of sendDelCourses is ", Integer.valueOf(i));
                } else {
                    ReleaseLogUtil.a(GolfDeviceProxy.TAG, "sendDelCourses failed, RetryTimes is more than 3");
                    invokerBundle.getInvoker().onComplete(1, "", invokerBundle.getCallbackId());
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendDelCourses, sendProgress[", Long.valueOf(j), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendDelCourses，transferWay: ", str);
            }
        });
    }

    private xiu.c createDelCoursesReq(Long[] lArr, int i, int i2) {
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        builder.setBusinessType(i).setVersion(1).setMessageId(i2).setResponseState(0);
        GolfNumberHeader golfNumberHeader = new GolfNumberHeader();
        golfNumberHeader.setCourseNum(lArr.length);
        byte[] bytes = golfNumberHeader.getBytes();
        builder.setDataLength(lArr.length * 4).setBusinessHeadLength(bytes.length);
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.put(bytes);
        for (Long l : lArr) {
            byte[] bArr = new byte[4];
            System.arraycopy(Utils.int2Bytes((int) l.longValue()), 0, bArr, 0, 4);
            byteBufferAllocate.put(bArr);
        }
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        return cVar;
    }

    public void getDeviceDownloadedCourses(final int i, final GolfH5DownloadInterface.InvokerBundle invokerBundle) {
        int typeValue = GolfHiWearBusinessType.GOLF_LOCAL_COURSE_LIST.getTypeValue();
        int iNewMsgId = GolfMsgHeader.newMsgId();
        this.mGolfDeviceEngineMgr.sendMsgToDevice(createDeviceCourseListReq(typeValue, iNewMsgId).c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, iNewMsgId, invokerBundle, null), typeValue, new SendCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.6
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "getDeviceDownloadedCourses, sendRst[", Integer.valueOf(i2), "]");
                if (i2 == 207 || invokerBundle == null) {
                    return;
                }
                if (i > 0) {
                    HandlerExecutor.c(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            GolfDeviceProxy.this.getDeviceDownloadedCourses(i - 1, invokerBundle);
                        }
                    }, 1000L);
                    ReleaseLogUtil.d(GolfDeviceProxy.TAG, "RetryTimes of getDeviceDownloadedCourses is ", Integer.valueOf(i));
                } else {
                    ReleaseLogUtil.a(GolfDeviceProxy.TAG, "getDeviceDownloadedCourses failed, RetryTimes is more than 3");
                    invokerBundle.getInvoker().onComplete(1, "", invokerBundle.getCallbackId());
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(GolfDeviceProxy.TAG, "getDeviceDownloadedCourses, sendProgress[", Long.valueOf(j), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a(GolfDeviceProxy.TAG, "getDeviceDownloadedCourses，transferWay: ", str);
            }
        });
    }

    public void getDeviceDownloadedCoursesForNative(GolfDataCallback golfDataCallback) {
        int typeValue = GolfHiWearBusinessType.GOLF_LOCAL_COURSE_LIST.getTypeValue();
        int iNewMsgId = GolfMsgHeader.newMsgId();
        this.mGolfDeviceEngineMgr.sendMsgToDevice(createDeviceCourseListReq(typeValue, iNewMsgId).c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, iNewMsgId, golfDataCallback), typeValue, new SendCallback(this) { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.7
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "getDeviceDownloadedCourses, sendRst[", Integer.valueOf(i), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(GolfDeviceProxy.TAG, "getDeviceDownloadedCourses, sendProgress[", Long.valueOf(j), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a(GolfDeviceProxy.TAG, "getDeviceDownloadedCoursesForNative，transferWay: ", str);
            }
        });
    }

    private xiu.c createDeviceCourseListReq(int i, int i2) {
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        builder.setBusinessType(i).setVersion(1).setDataLength(4).setMessageId(i2).setResponseState(0);
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.put(new byte[]{1, 0, 0, 0});
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        LogUtil.a(TAG, "getDeviceDownloadedCourses, type:[", Integer.valueOf(i), "], msgId[", Integer.valueOf(i2), "]");
        return cVar;
    }

    public boolean isDeviceConnected() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }

    public void isDevicesPinged(final CommonSingleCallback<Boolean> commonSingleCallback) {
        this.mGolfDeviceEngineMgr.sendPingToDevices(new PingCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.8
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public void onPingResult(int i) {
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "isDevicesPinged pkg == ", GolfDeviceProxy.this.mGolfDeviceEngineMgr.getWearPkgName(), " code = ", Integer.valueOf(i));
                CommonSingleCallback commonSingleCallback2 = commonSingleCallback;
                if (commonSingleCallback2 != null) {
                    commonSingleCallback2.callback(Boolean.valueOf(i == 202));
                }
            }
        }, this.mGolfDeviceEngineMgr.getWearPkgName());
    }

    public boolean isSupportGolf() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            return false;
        }
        return eey.d(deviceInfo, 105);
    }

    public boolean isSupportGolfV2() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            return false;
        }
        return eey.d(deviceInfo, 203);
    }

    public boolean isSupportGolfV3() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            return false;
        }
        return eey.d(deviceInfo, 222);
    }

    public boolean isSupportGolfAutoDownload() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            return false;
        }
        return eey.d(deviceInfo, 285);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0026 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void writeFileData(String str, byte[]... bArr) throws dfh {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = this.mCtx.openFileOutput(str, 0);
            for (byte[] bArr2 : bArr) {
                fileOutputStreamOpenFileOutput.write(bArr2);
            }
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused) {
                    ReleaseLogUtil.a(TAG, "writefile finally failed IOException");
                }
            }
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG, "write file failed: ", ExceptionUtils.c(e));
            throw new dfh(-102, "write file failed");
        }
    }

    private byte[] getCourseListByteArray(List<GolfCourseInfo> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(list.size() * 92);
        for (int i = 0; i < list.size(); i++) {
            byteBufferAllocate.put(list.get(i).toBytes());
        }
        return byteBufferAllocate.array();
    }

    private String getFilePath(String str) {
        return this.mCtx.getFilesDir() + File.separator + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0053: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:26:0x0053 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static byte[] getBytesByFile(File file) throws Throwable {
        ?? r0;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[256];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i != -1) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                closeQuietly(fileInputStream);
                                closeQuietly(byteArrayOutputStream);
                                return byteArray;
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        ReleaseLogUtil.e(TAG, "readFile, FileNotFoundException:");
                        closeQuietly(fileInputStream);
                        closeQuietly(byteArrayOutputStream);
                        return null;
                    } catch (IOException unused2) {
                        ReleaseLogUtil.e(TAG, "readFile, IOException:");
                        closeQuietly(fileInputStream);
                        closeQuietly(byteArrayOutputStream);
                        return null;
                    }
                } catch (FileNotFoundException unused3) {
                    byteArrayOutputStream = null;
                } catch (IOException unused4) {
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r0 = 0;
                    fileInputStream3 = fileInputStream;
                    closeQuietly(fileInputStream3);
                    closeQuietly(r0);
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream3 = fileInputStream2;
                r0 = file;
                th = th2;
            }
        } catch (FileNotFoundException unused5) {
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (IOException unused6) {
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ReleaseLogUtil.a(TAG, "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    public void sendDevicePullSuccessMsg() {
        if (!isDeviceConnected()) {
            LogUtil.e(TAG, "sendDevicePullSuccessMsg, device is not connected!");
            return;
        }
        int typeValue = GolfHiWearBusinessType.GOLF_DEVICE_PULL_SUCESS.getTypeValue();
        int iNewMsgId = GolfMsgHeader.newMsgId();
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        builder.setBusinessType(typeValue).setVersion(1).setMessageId(iNewMsgId).setResponseState(0);
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        LogUtil.a(TAG, "sendDevicePullSuccessMsg, type:[", Integer.valueOf(typeValue), "], msgId[", Integer.valueOf(iNewMsgId), "]");
        this.mGolfDeviceEngineMgr.sendMsgToDevice(cVar.c(), null, typeValue, new SendCallback(this) { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.9
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "sendDevicePullSuccessMsg, sendRst[", Integer.valueOf(i), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendDevicePullSuccessMsg, sendProgress[", Long.valueOf(j), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendDevicePullSuccessMsg，transferWay: ", str);
            }
        });
    }

    public int getWatchType() {
        return this.mGolfDeviceEngineMgr.getWatchType();
    }

    public void sendCourseMapKey(GolfCourseMapInfo golfCourseMapInfo, int i) {
        LogUtil.a(TAG, "sendCourseMapKey");
        if (golfCourseMapInfo == null) {
            ReleaseLogUtil.a(TAG, " mapInfo is null");
            return;
        }
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_MAP_KEY.getTypeValue();
        LogUtil.a(TAG, golfCourseMapInfo.toString());
        byte[] bArrKeyInfoToBytes = golfCourseMapInfo.keyInfoToBytes();
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        builder.setBusinessType(typeValue).setDataLength(bArrKeyInfoToBytes.length).setVersion(1).setMessageId(i);
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.put(bArrKeyInfoToBytes);
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        this.mGolfDeviceEngineMgr.sendMsgToDevice(cVar.c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, i, getInvoker(golfCourseMapInfo.getCourseId()), golfCourseMapInfo), typeValue, new SendCallback(this) { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.10
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
            }
        });
    }

    public GolfH5DownloadInterface.InvokerBundle getInvoker(long j) {
        return GolfDownloadTaskUtils.getInstance().getInvoker(j);
    }

    public void sendMap(GolfCourseMapInfo golfCourseMapInfo, int i) throws Throwable {
        if (getWatchType() == 0 || golfCourseMapInfo.getMapStyle() == 1) {
            sendCourseMap(golfCourseMapInfo, i);
        } else {
            sendCourseMapKey(golfCourseMapInfo, i);
        }
    }

    public boolean isSupportGolfClub() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isSupportGolfClub deviceInfo == null");
            return false;
        }
        boolean zD = eey.d(deviceInfo, a.C);
        ReleaseLogUtil.d(TAG, "isSupportGolfClub:", Boolean.valueOf(zD));
        return zD;
    }

    public void sendGolfClubInfo(GolfClubListInfoDataRsp golfClubListInfoDataRsp, final GolfH5DownloadInterface.InvokerBundle invokerBundle) {
        ReleaseLogUtil.d(TAG, "sendGolfClubInfo data: ", ies.c(golfClubListInfoDataRsp));
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_CLUB_INFO.getTypeValue();
        int iNewMsgId = GolfMsgHeader.newMsgId();
        this.mGolfDeviceEngineMgr.sendMsgToDevice(createGolfClubHandShakeReq(typeValue, iNewMsgId, golfClubListInfoDataRsp).c(), GolfDataReceiverFactory.createGolfDataReceiver(typeValue, iNewMsgId, invokerBundle, null), typeValue, new SendCallback(this) { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.11
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                GolfH5DownloadInterface.InvokerBundle invokerBundle2;
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "sendCourseListFile, sendRst[", Integer.valueOf(i), "]");
                if (i == 207 || (invokerBundle2 = invokerBundle) == null) {
                    return;
                }
                invokerBundle2.getInvoker().onFailure(i, "onSendResult", invokerBundle.getCallbackId());
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendGolfClubInfo, sendPrgs[", Long.valueOf(j), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendGolfClubInfo，transferWay: ", str);
            }
        });
    }

    public boolean isSupportNewGolfClub() {
        boolean zD = eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG), 300);
        ReleaseLogUtil.d(TAG, "isSupportNewGolfClub:", Boolean.valueOf(zD));
        return zD;
    }

    private xiu.c createGolfClubHandShakeReq(int i, int i2, GolfClubListInfoDataRsp golfClubListInfoDataRsp) {
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        String strD = golfClubListInfoDataRsp == null ? HiJsonUtil.d((Object) null) : golfClubListInfoDataRsp.getGolfStrikeRangeDouble2IntJson();
        LogUtil.a(TAG, "createGolfClubHandShakeReq，json: ", strD);
        byte[] bArrC = eeq.c(eeq.a(strD));
        builder.setBusinessType(i).setDataLength(bArrC.length).setVersion(1).setMessageId(i2).setResponseState(0);
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.put(bArrC);
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        return cVar;
    }

    public void sendGolfManualDownloadMsg() {
        ReleaseLogUtil.d(TAG, "sendGolfManualDownloadMsg");
        int typeValue = GolfHiWearBusinessType.GOLF_COURSE_TOUCH_DOWNLOAD.getTypeValue();
        int iNewMsgId = GolfMsgHeader.newMsgId();
        GolfMsgHeader.Builder builder = new GolfMsgHeader.Builder();
        builder.setBusinessType(typeValue).setVersion(1).setMessageId(iNewMsgId).setResponseState(0);
        GolfMsgHeader golfMsgHeaderBuilder = builder.builder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(golfMsgHeaderBuilder.getTotalLength());
        byteBufferAllocate.put(golfMsgHeaderBuilder.getBytes());
        byteBufferAllocate.flip();
        xiu.c cVar = new xiu.c();
        cVar.a(byteBufferAllocate.array());
        LogUtil.a(TAG, "sendGolfManualDownloadMsg, type:[", Integer.valueOf(typeValue), "], msgId[", Integer.valueOf(iNewMsgId), "]");
        this.mGolfDeviceEngineMgr.sendMsgToDevice(cVar.c(), null, typeValue, new SendCallback(this) { // from class: com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy.12
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                ReleaseLogUtil.d(GolfDeviceProxy.TAG, "sendGolfManualDownloadMsg, sendRst[", Integer.valueOf(i), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendGolfManualDownloadMsg, sendProgress[", Long.valueOf(j), "]");
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a(GolfDeviceProxy.TAG, "sendGolfManualDownloadMsg，transferWay: ", str);
            }
        });
    }
}
