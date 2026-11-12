package defpackage;

import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.devicelink.bean.CloverProgress;
import com.huawei.basichealthmodel.devicelink.bean.NoticesBean;
import com.huawei.basichealthmodel.devicelink.bean.ResponseMsgBody;
import com.huawei.basichealthmodel.devicelink.bean.TaskBean;
import com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelNoticeBody;
import com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelReportMessage;
import com.huawei.basichealthmodel.devicelink.pbjava.report.HealthModelTaskBody;
import com.huawei.health.healthlife.constant.WearTaskEnum;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cch {
    public static ResponseMsgBody e(int i, int i2, String str) {
        LogUtil.a("HL_DeviceTaskUtils", "getResponseBean resultCode = ", Integer.valueOf(i2));
        ResponseMsgBody responseMsgBody = new ResponseMsgBody();
        responseMsgBody.setResultCode(i2);
        responseMsgBody.setResultDes(str);
        responseMsgBody.setMsgType(i);
        return responseMsgBody;
    }

    public static HealthModelReportMessage.Report c(ResponseMsgBody responseMsgBody) {
        HealthModelReportMessage.Report.Builder builderNewBuilder = HealthModelReportMessage.Report.newBuilder();
        if (responseMsgBody == null) {
            return builderNewBuilder.build();
        }
        builderNewBuilder.setMsgVer((float) responseMsgBody.getMsgVer());
        int msgType = responseMsgBody.getMsgType();
        builderNewBuilder.setMsgType(msgType);
        int i = 0;
        if (msgType == 2001) {
            HealthModelTaskBody.TaskBody.b bVarJ = HealthModelTaskBody.TaskBody.j();
            List<TaskBean> tasks = responseMsgBody.getTasks();
            if (njy.b(tasks)) {
                while (i < tasks.size()) {
                    bVarJ.e(i, d(HealthModelTaskBody.TaskBody.c.b(), tasks.get(i)));
                    i++;
                }
            }
            bVarJ.b(responseMsgBody.getResultCode());
            bVarJ.a(responseMsgBody.getResultDes());
            bVarJ.a(responseMsgBody.getRecordDay());
            bVarJ.b(responseMsgBody.getAllTasks());
            bVarJ.c(responseMsgBody.getCompletedTasks());
            CloverProgress cloverProgress = responseMsgBody.getCloverProgress();
            if (cloverProgress == null) {
                LogUtil.j("HL_DeviceTaskUtils", "cloverProgress is null");
            } else {
                bVarJ.a(ByteString.copyFrom(e(cloverProgress)));
            }
            builderNewBuilder.setMsgBody(ByteString.copyFrom(bVarJ.build().toByteArray()));
        } else if (msgType != 2002 && msgType != 2003) {
            LogUtil.j("HL_DeviceTaskUtils", "covertResponse msgType is undefined");
        } else {
            HealthModelNoticeBody.NoticeBody.d dVarI = HealthModelNoticeBody.NoticeBody.i();
            List<NoticesBean> noticesBean = responseMsgBody.getNoticesBean();
            if (!njy.b(noticesBean)) {
                LogUtil.j("HL_DeviceTaskUtils", "noticesBean is null");
            } else {
                while (i < noticesBean.size()) {
                    dVarI.b(i, a(HealthModelNoticeBody.NoticeBody.c.d(), noticesBean.get(i)));
                    i++;
                }
            }
            builderNewBuilder.setMsgBody(ByteString.copyFrom(dVarI.build().toByteArray()));
        }
        return builderNewBuilder.build();
    }

    public static HealthModelReportMessage.Report a(ResponseMsgBody responseMsgBody, int i, List<TaskBean> list) {
        HealthModelReportMessage.Report.Builder builderNewBuilder = HealthModelReportMessage.Report.newBuilder();
        if (responseMsgBody == null) {
            return builderNewBuilder.build();
        }
        builderNewBuilder.setMsgVer((float) responseMsgBody.getMsgVer());
        builderNewBuilder.setMsgType(responseMsgBody.getMsgType());
        HealthModelTaskBody.TaskBody.b bVarJ = HealthModelTaskBody.TaskBody.j();
        bVarJ.b(responseMsgBody.getResultCode());
        bVarJ.a(responseMsgBody.getResultDes());
        bVarJ.a(responseMsgBody.getRecordDay());
        bVarJ.b(responseMsgBody.getAllTasks());
        bVarJ.c(responseMsgBody.getCompletedTasks());
        CloverProgress cloverProgress = responseMsgBody.getCloverProgress();
        if (cloverProgress != null) {
            bVarJ.a(ByteString.copyFrom(e(cloverProgress)));
        } else {
            LogUtil.j("HL_DeviceTaskUtils", "cloverProgress is null");
        }
        b(list, i, bVarJ, c(builderNewBuilder.build().toByteArray()));
        builderNewBuilder.setMsgBody(ByteString.copyFrom(bVarJ.build().toByteArray()));
        return builderNewBuilder.build();
    }

    private static void b(List<TaskBean> list, int i, HealthModelTaskBody.TaskBody.b bVar, int i2) {
        if (njy.e(list)) {
            LogUtil.j("HL_DeviceTaskUtils", "buildReportTask unPackingTaskList is empty");
            return;
        }
        LogUtil.a("HL_DeviceTaskUtils", "buildReportTask unPackingTaskList size=", Integer.valueOf(list.size()));
        Iterator<TaskBean> it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            HealthModelTaskBody.TaskBody.c cVarD = d(HealthModelTaskBody.TaskBody.c.b(), it.next());
            if (i <= 0) {
                bVar.e(i3, cVarD);
                i3++;
                it.remove();
            } else {
                int iC = c(bVar.build().toByteArray()) + i2;
                if (iC >= i || iC + c(cVarD.toByteArray()) >= i) {
                    return;
                }
                bVar.e(i3, cVarD);
                i3++;
                it.remove();
            }
        }
    }

    private static byte[] e(CloverProgress cloverProgress) {
        HealthModelTaskBody.TaskBody.d.C0064d c0064dB = HealthModelTaskBody.TaskBody.d.b();
        c0064dB.b(cloverProgress.getTop());
        c0064dB.c(cloverProgress.getRight());
        c0064dB.a(cloverProgress.getLeft());
        c0064dB.e(cloverProgress.getBottom());
        return c0064dB.build().toByteArray();
    }

    private static HealthModelTaskBody.TaskBody.c d(HealthModelTaskBody.TaskBody.c.C0063c c0063c, TaskBean taskBean) {
        if (taskBean == null) {
            return c0063c.build();
        }
        c0063c.b(taskBean.getTaskId());
        c0063c.c(taskBean.getTaskTarget());
        c0063c.b(taskBean.getTargetDes());
        c0063c.a(taskBean.getTaskValue());
        c0063c.c(taskBean.getStatus());
        c0063c.e(taskBean.getRestStatus());
        c0063c.d(taskBean.getTimestamp());
        c0063c.a(taskBean.getTaskType());
        if (cbg.b(taskBean.getTaskId()) || WearTaskEnum.isHasTaskId(taskBean.getTaskId())) {
            c0063c.d(taskBean.getTaskName());
            c0063c.f(taskBean.getUnit());
            c0063c.e((float) taskBean.getProgress());
            c0063c.e(taskBean.getStatusDes());
        } else {
            c0063c.d(qre.f(R.string.IDS_not_support));
            c0063c.e("--/--");
        }
        return c0063c.build();
    }

    private static HealthModelNoticeBody.NoticeBody.c a(HealthModelNoticeBody.NoticeBody.c.a aVar, NoticesBean noticesBean) {
        if (noticesBean == null) {
            return aVar.build();
        }
        aVar.a(noticesBean.getRecordDay());
        aVar.c(noticesBean.getTaskId());
        aVar.d(noticesBean.getTaskName());
        aVar.e(noticesBean.getMsg());
        return aVar.build();
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString(b2 & 255));
        }
        return sb.toString();
    }

    public static int c(byte[] bArr) {
        String strA = a(bArr);
        if (TextUtils.isEmpty(strA)) {
            return 0;
        }
        return strA.length();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    public static NoticesBean b(String str, int i, int i2) {
        byte b2;
        String strF;
        LogUtil.a("HL_DeviceTaskUtils", "getCelebratingNoticesBean scenario ", str, " recordDay ", Integer.valueOf(i), " id ", Integer.valueOf(i2));
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("HL_DeviceTaskUtils", "getCelebratingNoticesBean scenario ", str);
            return null;
        }
        str.hashCode();
        switch (str) {
            case "celebrating_messages_yesterday_perfect":
                b2 = 0;
                break;
            case "celebrating_messages_today_energy":
                b2 = 1;
                break;
            case "celebrating_messages_today_perfect":
                b2 = 2;
                break;
            case "celebrating_messages_yesterday_energy":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            strF = qre.f(R.string.IDS_celebrating_1_2);
        } else if (b2 == 1) {
            strF = qre.f(R.string.IDS_celebrating_2_1);
        } else if (b2 == 2) {
            strF = qre.f(R.string.IDS_celebrating_3_5);
        } else {
            if (b2 != 3) {
                return null;
            }
            strF = qre.f(R.string.IDS_celebrating_0_2);
        }
        if (TextUtils.isEmpty(strF)) {
            ReleaseLogUtil.d("HL_DeviceTaskUtils", "getCelebratingNoticesBean content ", strF);
            return null;
        }
        NoticesBean noticesBean = new NoticesBean();
        noticesBean.setRecordDay(i);
        noticesBean.setMsg(strF);
        noticesBean.setTaskId(i2);
        if (i2 != 1 && i2 != 100001) {
            return noticesBean;
        }
        noticesBean.setTaskName(cbg.f());
        return noticesBean;
    }

    public static NoticesBean c(int i) {
        NoticesBean noticesBean = new NoticesBean();
        noticesBean.setTaskId(5000);
        noticesBean.setRecordDay(i);
        noticesBean.setTaskName(cbg.f());
        noticesBean.setMsg(qre.f(R.string.IDS_health_week_report_wear_remind_new));
        return noticesBean;
    }

    public static NoticesBean c() {
        NoticesBean noticesBean = new NoticesBean();
        noticesBean.setTaskId(5001);
        noticesBean.setTaskName(cbg.f());
        noticesBean.setRecordDay(DateFormatUtil.a(System.currentTimeMillis()));
        noticesBean.setMsg(qre.f(R.string.IDS_weekly_report_reviewed_new));
        return noticesBean;
    }

    public static void b(NoticesBean noticesBean, int i, int i2, ResponseCallback<ResponseMsgBody> responseCallback) {
        LogUtil.a("HL_DeviceTaskUtils", "activeSendMsgToDevice noticesBean ", noticesBean, " type ", Integer.valueOf(i), " action ", Integer.valueOf(i2), " callback ", responseCallback);
        if (noticesBean == null) {
            ReleaseLogUtil.d("HL_DeviceTaskUtils", "activeSendMsgToDevice noticesBean is null");
            return;
        }
        ResponseMsgBody responseMsgBody = new ResponseMsgBody();
        responseMsgBody.setMsgType(i);
        responseMsgBody.setNoticesBean(Collections.singletonList(noticesBean));
        bxp.b().c(i2, responseMsgBody, responseCallback);
    }
}
