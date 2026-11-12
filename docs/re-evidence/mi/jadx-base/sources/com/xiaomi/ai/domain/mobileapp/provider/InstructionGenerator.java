package com.xiaomi.ai.domain.mobileapp.provider;

import com.google.gson.Gson;
import com.xiaomi.ai.api.Application;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.Template;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.common.Prompt;
import com.xiaomi.ai.domain.mobileapp.util.InstructionUtil;
import com.xiaomi.ai.domain.mobileapp.util.Tool;
import defpackage.j4b;
import defpackage.mlo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class InstructionGenerator {
    public static final String EMPTY_STR = "";
    public static final String cameraPackage = "com.android.camera";
    private static final Gson gson = j4b.b();
    public static final Map<String, String> controlTypeAndNameMap = new a();
    public static final Map<String, Integer> unlockAppAndVersion = new b();

    public static class a extends HashMap<String, String> {
        public a() {
            put("OPEN", "打开");
            put("DOWNLOAD", "下载");
        }
    }

    public static class b extends HashMap<String, Integer> {
        public b() {
            put(InstructionGenerator.cameraPackage, 0);
        }
    }

    private static Template.Image getImage(String str, String str2) {
        Template.ImageSource imageSource = new Template.ImageSource(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageSource);
        return new Template.Image(str2, arrayList);
    }

    public static Pair<List<Instruction>, String> getInstructionCommon(String str, String str2, MobileAppIntention mobileAppIntention, Prompt prompt, Pair<String, Integer> pair, List<Template.AppEntity> list) {
        ArrayList arrayList;
        String orDefault;
        String orDefault2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        String str3 = controlTypeAndNameMap.get("OPEN");
        for (int i = 0; i < mobileAppIntention.getApps().size(); i++) {
            MobileAppIntention.ShowApp showApp = mobileAppIntention.getApps().get(i);
            Template.AndroidApp androidApp = new Template.AndroidApp(showApp.getDisplayName(), showApp.getPackageName(), getImage(showApp.getIconUrl(), ""));
            arrayList2.add(androidApp);
            arrayList3.add(new Application.CheckAppItem(showApp.getPackageName(), 0));
            arrayList4.add(new Application.CheckAppItem(showApp.getPackageName(), 0).setLaunched(true));
            Template.AppControl appControl = new Template.AppControl("OPEN", str3);
            arrayList5.add(new Template.AppEntity(androidApp, appControl));
            arrayList6.add(new Application.AppExtra(showApp.getPackageName()).setControl(appControl));
            hashSet.add(showApp.getPackageName());
        }
        Application.ApplicationOp intentionAction = PromptGenerator.parseIntentionAction(mobileAppIntention.getAction());
        boolean zEquals = "CLOSE_CURRENT".equals(mobileAppIntention.getAction());
        Application.CheckApps checkApps = new Application.CheckApps(arrayList4);
        Application.CheckApps checkApps2 = new Application.CheckApps(arrayList3);
        Sys.CheckScreenUnlocked checkScreenUnlocked = new Sys.CheckScreenUnlocked();
        Template.SetDisplayProperty durationInMs = new Template.SetDisplayProperty().setDurationInMs(0);
        SpeechRecognizer.ExpectSpeech expectSpeech = new SpeechRecognizer.ExpectSpeech();
        Pair<List<Application.Hint>, Map<String, String>> pairGenHints = PromptGenerator.genHints(prompt);
        List<Application.Hint> left = pairGenHints.getLeft();
        Map<String, String> right = pairGenHints.getRight();
        Application.Operate operate = new Application.Operate(intentionAction, arrayList2, mobileAppIntention.getKeyword(), mobileAppIntention.isUseLocalApp(), left);
        Template.Image image = getImage("", "");
        Instruction instructionBuildInstruction = InstructionUtil.buildInstruction(checkApps2);
        List<MobileAppIntention.ShowApp> apps = mobileAppIntention.getApps();
        ArrayList arrayList7 = new ArrayList();
        Application.ApplicationOp applicationOp = Application.ApplicationOp.OPEN;
        if (intentionAction == applicationOp || intentionAction == Application.ApplicationOp.INSTALL) {
            arrayList = arrayList7;
            Application.Operate operate2 = new Application.Operate(applicationOp, arrayList2, mobileAppIntention.getKeyword(), mobileAppIntention.isUseLocalApp(), left);
            Template.Application skillIcon = new Template.Application().setSkillIcon(image);
            if (list == null) {
                operate2.setAppExtras(arrayList6);
                skillIcon.setApps(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Template.AppEntity appEntity = list.get(i2);
                    arrayList8.add(new Application.AppExtra(appEntity.getApp().getPkgName()).setControl(appEntity.getControl()));
                }
                operate2.setAppExtras(arrayList8);
                skillIcon.setApps(list);
            }
            if (apps.size() == 1) {
                orDefault = Tool.getOrDefault(right, Application.HintTag.EXECUTE.toString(), "");
                arrayList.add(instructionBuildInstruction);
                Instruction instructionAppendInstructionWithDepend = !mlo.a(apps.get(0).getPackageName(), cameraPackage) ? InstructionUtil.appendInstructionWithDepend(arrayList, checkScreenUnlocked, instructionBuildInstruction) : null;
                InstructionUtil.appendInstructionWithDepend(arrayList, durationInMs, instructionAppendInstructionWithDepend);
                InstructionUtil.appendSpeakAndToastWithDepend(arrayList, orDefault, orDefault, str2, instructionAppendInstructionWithDepend).getLeft();
                InstructionUtil.appendInstructionWithDepend(arrayList, operate2, instructionAppendInstructionWithDepend);
            } else if (apps.size() > 1) {
                orDefault = Tool.getOrDefault(right, Application.HintTag.TOO_MANY.toString(), "");
                arrayList.add(instructionBuildInstruction);
                Instruction left2 = InstructionUtil.appendSpeakAndToastWithDepend(arrayList, orDefault, orDefault, str2, instructionBuildInstruction).getLeft();
                InstructionUtil.appendInstructionWithDepend(arrayList, skillIcon, instructionBuildInstruction);
                InstructionUtil.appendInstructionWithDepend(arrayList, expectSpeech, left2);
            } else {
                orDefault = Tool.getOrDefault(right, Application.HintTag.NOT_SUPPORTED.toString(), "");
                InstructionUtil.appendSpeakAndToastWithDepend(arrayList, orDefault, orDefault, str2);
            }
            orDefault2 = orDefault;
        } else {
            Application.ApplicationOp applicationOp2 = Application.ApplicationOp.CLOSE;
            if (intentionAction != applicationOp2) {
                orDefault2 = Tool.getOrDefault(right, Application.HintTag.EXECUTE.toString(), "");
                InstructionUtil.appendInstructionWithDepend(arrayList7, durationInMs, (Instruction) null);
                InstructionUtil.appendSpeakAndToastWithDepend(arrayList7, orDefault2, orDefault2, str2);
            } else if (zEquals && pair != null) {
                orDefault2 = Tool.getOrDefault(right, Application.HintTag.EXECUTE.toString(), "");
                InstructionUtil.appendSpeakAndToastWithDepend(arrayList7, orDefault2, orDefault2, str2);
                Template.AndroidApp androidApp2 = new Template.AndroidApp("", pair.getKey(), image);
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(androidApp2);
                arrayList7.add(InstructionUtil.buildInstruction(new Application.Operate(applicationOp2, arrayList9, mobileAppIntention.getKeyword(), mobileAppIntention.isUseLocalApp(), left)));
            } else if (pair != null && hashSet.contains(pair.getKey())) {
                orDefault2 = Tool.getOrDefault(right, Application.HintTag.EXECUTE.toString(), "");
                InstructionUtil.appendSpeakAndToastWithDepend(arrayList7, orDefault2, orDefault2, str2);
                arrayList7.add(InstructionUtil.buildInstruction(operate));
            } else if (apps.size() >= 1) {
                orDefault2 = Tool.getOrDefault(right, Application.HintTag.EXECUTE.toString(), "");
                Instruction instructionAppendInstructionWithDepend2 = InstructionUtil.appendInstructionWithDepend(arrayList7, checkApps);
                InstructionUtil.appendSpeakAndToastWithDepend(arrayList7, orDefault2, orDefault2, str2, instructionAppendInstructionWithDepend2);
                InstructionUtil.appendInstructionWithDepend(arrayList7, operate, instructionAppendInstructionWithDepend2);
            } else {
                orDefault2 = Tool.getOrDefault(right, Application.HintTag.NOT_INSTALLED.toString(), "");
                InstructionUtil.appendSpeakAndToastWithDepend(arrayList7, orDefault2, orDefault2, str2);
            }
            arrayList = arrayList7;
        }
        InstructionUtil.setDialogForInstructions(arrayList, str);
        return Pair.of(arrayList, orDefault2);
    }
}
