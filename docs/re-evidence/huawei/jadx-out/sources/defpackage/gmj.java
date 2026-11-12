package defpackage;

import com.huawei.basefitnessadvice.model.Data;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.health.plan.model.model.BasicPackage;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Audio;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes29.dex */
public class gmj {
    public static List<Data> c(String str) {
        LogUtil.a("Suggestion_ParserHelper", "parseXml start");
        ArrayList arrayList = new ArrayList(10);
        BasicPackage basicPackage = new BasicPackage();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        StringBuilder sb = new StringBuilder(16);
                        sb.append(a(inputStreamReader));
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(new StringReader(sb.toString()));
                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                            if (eventType == 2) {
                                d(arrayList, xmlPullParserNewPullParser, basicPackage);
                            }
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException | NumberFormatException | XmlPullParserException e) {
            LogUtil.e("Suggestion_ParserHelper", "close failed：", LogAnonymous.b(e));
            LogUtil.e("Suggestion_ParserHelper", "XmlPullParser failed:", LogAnonymous.b(e));
        }
        LogUtil.a("Suggestion_ParserHelper", "parseXml end");
        return arrayList;
    }

    private static void d(List<Data> list, XmlPullParser xmlPullParser, BasicPackage basicPackage) {
        if (xmlPullParser == null || "".equals(xmlPullParser.getName()) || xmlPullParser.getName() == null) {
            return;
        }
        if ("basic_package".equals(xmlPullParser.getName())) {
            basicPackage.saveLanguage(xmlPullParser.getAttributeValue(null, "language"));
            basicPackage.saveType(xmlPullParser.getAttributeValue(null, "type"));
            basicPackage.savePostFix(xmlPullParser.getAttributeValue(null, "postfix"));
            basicPackage.saveProvider(xmlPullParser.getAttributeValue(null, "providor"));
            basicPackage.saveVersion(xmlPullParser.getAttributeValue(null, "version"));
            basicPackage.saveSize(CommonUtil.j(xmlPullParser.getAttributeValue(null, "size")));
            basicPackage.saveGender(xmlPullParser.getAttributeValue(null, CommonConstant.KEY_GENDER));
            return;
        }
        if ("data".equals(xmlPullParser.getName())) {
            Data data = new Data();
            data.setContent(xmlPullParser.getAttributeValue(null, "content"));
            data.setId(xmlPullParser.getAttributeValue(null, "id"));
            data.saveUrl(xmlPullParser.getAttributeValue(null, "url"));
            try {
                data.setSize(Integer.parseInt(xmlPullParser.getAttributeValue(null, "size")));
            } catch (NumberFormatException e) {
                LogUtil.e("Suggestion_ParserHelper", "setParserEventData size:", LogAnonymous.b(e));
            }
            data.saveMd5(xmlPullParser.getAttributeValue(null, "md5"));
            data.setFileName(data.acquireId() + "." + basicPackage.acquirePostFix());
            list.add(data);
        }
    }

    public static int c(WorkoutAction workoutAction, Map<String, Object> map, List<Media> list, glu.d dVar) {
        if (workoutAction == null) {
            ReleaseLogUtil.a("Suggestion_ParserHelper", "parseVideoFilesLength workoutAction == null");
            return 0;
        }
        AtomicAction action = workoutAction.getAction();
        if (action == null) {
            ReleaseLogUtil.a("Suggestion_ParserHelper", "parseVideoFilesLength workoutAction.getAction() == null");
            return 0;
        }
        return a(map, list, action, dVar) + d(map, list, action, dVar);
    }

    private static int d(Map<String, Object> map, List<Media> list, AtomicAction atomicAction, glu.d dVar) {
        List<Audio> extendPropertyList = atomicAction.getExtendPropertyList("audios", Audio[].class);
        int length = 0;
        if (njy.e(extendPropertyList)) {
            ReleaseLogUtil.a("Suggestion_ParserHelper", "parseVideoFilesLength action.getAudios() == null");
            return 0;
        }
        for (Audio audio : extendPropertyList) {
            if (audio != null) {
                long jE = glu.e(audio.getUrl());
                if (!map.containsKey(audio.getName()) && (!glu.a(dVar) || !xkf.d(audio.getUrl(), jE))) {
                    map.put(audio.getUrl(), null);
                    length += audio.getLength();
                    if (list != null) {
                        Media media = new Media();
                        media.setUrl(audio.getName());
                        media.setPath(xkf.b(media.getUrl()));
                        media.setLength(audio.getLength());
                        media.setType(2);
                        list.add(media);
                    }
                }
            }
        }
        return length;
    }

    private static int a(Map<String, Object> map, List<Media> list, AtomicAction atomicAction, glu.d dVar) {
        int length = 0;
        boolean z = ("hotbody".equals(gzq.d(atomicAction.getActionSportType())) || dVar == null) ? false : true;
        if (z) {
            z = z && dVar.e();
        }
        List<Video> extendPropertyList = atomicAction.getExtendPropertyList("actionVideo", Video[].class);
        if (njy.e(extendPropertyList)) {
            ReleaseLogUtil.a("Suggestion_ParserHelper", "parseVideoFilesLength action.getVideos() == null");
            return 0;
        }
        for (Video video : extendPropertyList) {
            if (video != null && (!z || !dVar.d() || video.getGender() == dVar.a())) {
                long jE = glu.e(video.getUrl());
                if (!map.containsKey(video.getUrl()) && (!glu.a(dVar) || !xkf.b(video.getUrl(), jE))) {
                    map.put(video.getUrl(), null);
                    length += video.getLength();
                    if (list != null) {
                        Media media = new Media();
                        media.setUrl(video.getUrl());
                        media.setPath(xkf.o(media.getUrl()));
                        media.setLength(video.getLength());
                        media.setType(1);
                        list.add(media);
                    }
                }
            }
        }
        return length;
    }

    public static int d(WorkoutAction workoutAction, Map<String, Object> map, List<Media> list, glu.d dVar) {
        if (workoutAction == null) {
            ReleaseLogUtil.a("Suggestion_ParserHelper", "parseMediaLength workoutAction == null");
            return 0;
        }
        AtomicAction action = workoutAction.getAction();
        if (action == null) {
            ReleaseLogUtil.a("Suggestion_ParserHelper", "parseMediaLength workoutAction.getAction() == null");
            return 0;
        }
        return a(map, list, action, dVar);
    }

    private static String a(InputStreamReader inputStreamReader) {
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder(16);
        while (true) {
            try {
                int i = inputStreamReader.read(cArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                sb.append(cArr, 0, i);
            } catch (IOException e) {
                LogUtil.e("Suggestion_ParserHelper", "read Line Result exception:", LogAnonymous.b(e));
            }
        }
        return sb.toString();
    }
}
