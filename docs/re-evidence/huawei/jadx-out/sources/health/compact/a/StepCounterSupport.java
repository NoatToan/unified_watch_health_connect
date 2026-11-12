package health.compact.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.SensorManager;
import android.os.Build;
import com.huawei.health.manager.util.HwCfgFilePolicy;
import com.huawei.hms.network.embedded.k;
import com.huawei.motiondetection.MotionTypeApps;
import defpackage.ipa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class StepCounterSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f36640a = "/system/etc/xml/hw_motion_config.xml";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f36641b = -1;
    private static int d = -1;
    private static String e = "/data/cust/xml/hw_motion_config.xml";

    private StepCounterSupport() {
    }

    private static int h(Context context) {
        boolean zE = e();
        boolean zI = i(context);
        ReleaseLogUtil.c("Step_CounterSupport", "supportPrivateStandStepcounter = ", Boolean.valueOf(zE), " isSupportStandStepCounter = ", Boolean.valueOf(zI));
        if (zE && zI) {
            return 1;
        }
        return zI ? 2 : 3;
    }

    public static int b(Context context) {
        if (context == null) {
            LogUtil.d("Step_CounterSupport", "getDeviceSupportClass context is null");
            return 0;
        }
        int i = f36641b;
        if (i != -1) {
            return i;
        }
        int iH = h(context);
        f36641b = iH;
        d = iH;
        SharedPerferenceUtils.b(context, iH);
        return f36641b;
    }

    public static int c(Context context) {
        if (context == null) {
            LogUtil.d("Step_CounterSupport", "getDeviceOriginalSupportClass context is null");
            return 0;
        }
        int i = d;
        if (i != -1) {
            return i;
        }
        int iH = h(context);
        d = iH;
        return iH;
    }

    public static void e(Context context, int i) {
        if (context == null) {
            LogUtil.d("Step_CounterSupport", "setDeviceSupportClass context is null");
        } else {
            f36641b = i;
            SharedPerferenceUtils.b(context, i);
        }
    }

    public static void b(Context context, int i) {
        if (context == null) {
            LogUtil.d("Step_CounterSupport", "setDeviceSupportClassForce context is null");
        } else {
            d = i;
            e(context, i);
        }
    }

    public static boolean e() {
        LogUtil.b("Step_CounterSupport", "readXmlIfSupportEX");
        File fileC = null;
        boolean zE = false;
        try {
            fileC = HwCfgFilePolicy.c("xml/hw_motion_config.xml", 0);
            if (MagicBuild.f36615a && MagicBuild.f36616b >= 33) {
                fileC = HwCfgFilePolicy.c("xml/hn_motion_config.xml", 0);
            }
            if (fileC != null && fileC.exists()) {
                zE = e(fileC);
            } else {
                LogUtil.b("Step_CounterSupport", "HwCfgFilePolicy file not exists.");
            }
        } catch (NoClassDefFoundError unused) {
            LogUtil.d("Step_CounterSupport", "class HwCfgFilePolicy not found error");
        }
        if (fileC == null || !fileC.exists()) {
            if (MagicBuild.f36615a && MagicBuild.f36616b >= 33) {
                f36640a = "/system/etc/xml/hn_motion_config.xml";
            }
            File file = new File(f36640a);
            if (file.exists()) {
                zE = e(file);
            } else {
                LogUtil.b("HwXmlParse", "sysFile not exists.");
            }
            if (MagicBuild.f36615a && MagicBuild.f36616b >= 33) {
                e = "/data/cust/xml/hn_motion_config.xml";
            }
            File file2 = new File(e);
            if (file2.exists()) {
                zE = e(file2);
            } else {
                LogUtil.b("HwXmlParse", "sysFile not exists.");
            }
        }
        LogUtil.b("Step_CounterSupport", "readXmlIfSupportEX result = ", Boolean.valueOf(zE));
        return zE;
    }

    private static boolean e(File file) {
        if (file == null || !file.exists()) {
            LogUtil.b("Step_CounterSupport", "configFile is null or not exists.");
            return false;
        }
        try {
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getDocumentElement();
            if (documentElement == null) {
                LogUtil.b("Step_CounterSupport", "root == null");
                return false;
            }
            NodeList childNodes = documentElement.getChildNodes();
            if (childNodes == null) {
                LogUtil.b("Step_CounterSupport", "motions == null");
                return false;
            }
            return d(childNodes);
        } catch (FileNotFoundException unused) {
            LogUtil.d("Step_CounterSupport", "isParseMyXmlSuccess fileNotFoundException");
            return false;
        } catch (IOException e2) {
            LogUtil.d("Step_CounterSupport", "isParseMyXmlSuccess Exception", e2.getMessage());
            return false;
        } catch (ParserConfigurationException e3) {
            LogUtil.d("Step_CounterSupport", "isParseMyXmlSuccess Exception", e3.getMessage());
            return false;
        } catch (SAXException e4) {
            LogUtil.d("Step_CounterSupport", "isParseMyXmlSuccess sAXException", e4.getMessage());
            return false;
        }
    }

    private static boolean d(NodeList nodeList) throws ParserConfigurationException, SAXException, IOException {
        boolean z = false;
        for (int i = 0; i < nodeList.getLength(); i++) {
            try {
                Node nodeItem = nodeList.item(i);
                if (nodeItem != null && nodeItem.getNodeType() == 1) {
                    String nodeValue = nodeItem.getAttributes().getNamedItem("name").getNodeValue();
                    int i2 = Integer.parseInt(nodeItem.getAttributes().getNamedItem(k.g).getNodeValue());
                    if ((MotionTypeApps.KEY_HW_STEP_COUNTER.equals(nodeValue) || "motion_hn_step_counter".equals(nodeValue)) && i2 == 1) {
                        z = true;
                    }
                    if (e(nodeItem.getChildNodes(), z)) {
                        return true;
                    }
                }
            } catch (NumberFormatException e2) {
                LogUtil.e("Step_CounterSupport", "pareData numberFormatException = ", e2.getMessage());
            }
        }
        return false;
    }

    private static boolean e(NodeList nodeList, boolean z) {
        if (nodeList == null) {
            return false;
        }
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodeItem = nodeList.item(i);
            if (nodeItem != null && nodeItem.getNodeType() == 1) {
                String nodeValue = nodeItem.getAttributes().getNamedItem("name").getNodeValue();
                try {
                    boolean z2 = Integer.parseInt(nodeItem.getAttributes().getNamedItem(k.g).getNodeValue()) == 1 && z;
                    if ((MotionTypeApps.KEY_HW_STEP_COUNTER_HEALTH.equals(nodeValue) || "motion_hn_step_counter_health".equals(nodeValue)) && z2) {
                        LogUtil.b("Step_CounterSupport", "support extend step counter!,return true");
                        return true;
                    }
                } catch (NumberFormatException e2) {
                    LogUtil.d("Step_CounterSupport", "NumberFormatException = ", LogAnonymous.b(e2));
                }
            }
        }
        return false;
    }

    public static boolean j(Context context) {
        if (context != null) {
            return b(context) == 1;
        }
        LogUtil.d("Step_CounterSupport", "isSupportExtendStepCounter context is null");
        return false;
    }

    public static boolean i(Context context) {
        if (context == null) {
            ReleaseLogUtil.d("Step_CounterSupport", "isSupportStandStepCounter context is null ");
            return false;
        }
        if (!d(context)) {
            ReleaseLogUtil.d("Step_CounterSupport", "isSupportStandStepCounter authorization not admitted");
            return true;
        }
        if (!(context.getSystemService("sensor") instanceof SensorManager)) {
            ReleaseLogUtil.d("Step_CounterSupport", "isSupportStandStepCounter object is not instanceof SensorManager");
            return false;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (sensorManager != null && sensorManager.getDefaultSensor(19) != null) {
            return true;
        }
        ReleaseLogUtil.c("isSupportStandStepCounter", "isSupportStandStepCounter false");
        return false;
    }

    public static boolean f(Context context) {
        if (context != null) {
            return b(context) == 1 && e(context) != null;
        }
        LogUtil.d("Step_CounterSupport", "isSupportMidWareStepCounter context is null");
        return false;
    }

    public static Intent e(Context context) {
        if (context == null) {
            LogUtil.d("Step_CounterSupport", "getMidWareStepCountService context is null");
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.huawei.ihealth.action.StepCountService");
        if ("HONOR".equalsIgnoreCase(Build.BRAND) && MagicBuild.f36615a && MagicBuild.f36616b >= 33) {
            intent = new Intent("com.hihonor.ihealth.action.StepCountService");
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
            LogUtil.d("Step_CounterSupport", "getMidWareStepCountService: listInfo is empty");
            return null;
        }
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            if (resolveInfo != null && resolveInfo.serviceInfo != null) {
                int i = resolveInfo.serviceInfo.applicationInfo == null ? 0 : resolveInfo.serviceInfo.applicationInfo.flags;
                LogUtil.b("Step_CounterSupport", "getMidWareStepCountService: pkgName = ", resolveInfo.serviceInfo.packageName, " service = ", resolveInfo.serviceInfo.name, " flags = ", Integer.valueOf(i));
                boolean z = (i & 1) != 0;
                LogUtil.b("Step_CounterSupport", "getMidWareStepCountService: isSystemApp = ", Boolean.valueOf(z));
                if (!z) {
                    LogUtil.d("Step_CounterSupport", "getMidWareStepCountService: not system app");
                } else {
                    intent.setComponent(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
                    return intent;
                }
            }
        }
        return null;
    }

    public static boolean a(Context context) {
        return !CommonUtil.bu() || StepCounterSupportUtils.d(context, CommonUtil.bu() ? "remove_reduce_class_config" : "remove_reduce_class_config_beta");
    }

    public static boolean d(Context context) {
        if (!StepCounterSupportUtils.d(context) || ipa.a(context)) {
            return true;
        }
        return AuthorizationUtils.c(context);
    }
}
