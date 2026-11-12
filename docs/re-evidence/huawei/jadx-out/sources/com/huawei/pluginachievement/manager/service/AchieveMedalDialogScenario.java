package com.huawei.pluginachievement.manager.service;

import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RUNNING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes13.dex */
public final class AchieveMedalDialogScenario {
    private static final /* synthetic */ AchieveMedalDialogScenario[] $VALUES;
    public static final AchieveMedalDialogScenario CYCLING;
    public static final AchieveMedalDialogScenario RUNNING;
    public static final AchieveMedalDialogScenario SKIPPING;
    public static final int SUB_SCENARIO_FITNESS = 0;
    public static final int SUB_SCENARIO_STEPS = 1;
    public final HashMap<String, Integer> medalPriority;
    public final List<Integer> subScenario;
    public static final AchieveMedalDialogScenario STEPS = new AchieveMedalDialogScenario("STEPS", 0, new HashMap<String, Integer>() { // from class: com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario.1
        {
            put("D", 0);
            put(TypeParams.SEARCH_CODE, 1);
            put("B", 2);
        }
    }, Collections.singletonList(1));
    public static final AchieveMedalDialogScenario FITNESS = new AchieveMedalDialogScenario("FITNESS", 1, new HashMap<String, Integer>() { // from class: com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario.4
        {
            put("B5", 1);
            put("C3", 2);
        }
    }, Collections.singletonList(0));
    public static final AchieveMedalDialogScenario WALKING = new AchieveMedalDialogScenario("WALKING", 2, new HashMap<String, Integer>() { // from class: com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario.3
        {
            put("B2", 1);
        }
    }, Arrays.asList(257, 281, 282, 282));

    private static /* synthetic */ AchieveMedalDialogScenario[] $values() {
        return new AchieveMedalDialogScenario[]{STEPS, FITNESS, WALKING, RUNNING, CYCLING, SKIPPING};
    }

    public static AchieveMedalDialogScenario valueOf(String str) {
        return (AchieveMedalDialogScenario) Enum.valueOf(AchieveMedalDialogScenario.class, str);
    }

    public static AchieveMedalDialogScenario[] values() {
        return (AchieveMedalDialogScenario[]) $VALUES.clone();
    }

    static {
        HashMap<String, Integer> map = new HashMap<String, Integer>() { // from class: com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario.5
            {
                put("A", 1);
                put("C1", 2);
                put("B1", 3);
            }
        };
        Integer numValueOf = Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE);
        RUNNING = new AchieveMedalDialogScenario("RUNNING", 3, map, Arrays.asList(258, 264, numValueOf));
        CYCLING = new AchieveMedalDialogScenario("CYCLING", 4, new HashMap<String, Integer>() { // from class: com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario.2
            {
                put("A2", 1);
                put("C2", 1);
                put("B3", 2);
            }
        }, Arrays.asList(259, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE), numValueOf));
        SKIPPING = new AchieveMedalDialogScenario("SKIPPING", 5, new HashMap<String, Integer>() { // from class: com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario.9
            {
                put("A5", 1);
                put("C5", 1);
                put("B7", 2);
            }
        }, Collections.singletonList(283));
        $VALUES = $values();
    }

    private AchieveMedalDialogScenario(String str, int i, HashMap map, List list) {
        super(str, i);
        this.medalPriority = map;
        this.subScenario = list;
    }

    public static AchieveMedalDialogScenario getMedalDialogScenario(int i) {
        for (AchieveMedalDialogScenario achieveMedalDialogScenario : values()) {
            List<Integer> list = achieveMedalDialogScenario.subScenario;
            if (list != null && list.contains(Integer.valueOf(i))) {
                return achieveMedalDialogScenario;
            }
        }
        return null;
    }

    public static AchieveMedalDialogScenario getMedalDialogScenario(String str) {
        for (AchieveMedalDialogScenario achieveMedalDialogScenario : values()) {
            HashMap<String, Integer> map = achieveMedalDialogScenario.medalPriority;
            if (map != null && map.containsKey(str)) {
                return achieveMedalDialogScenario;
            }
        }
        return null;
    }
}
