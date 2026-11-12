package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.onetrack.OneTrack;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Robot<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum BowWays {
        Forward(0, "forward"),
        Newyear(1, "newyear");

        private int id;
        private String name;

        BowWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static BowWays find(String str) {
            for (BowWays bowWays : values()) {
                if (bowWays.name.equals(str)) {
                    return bowWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static BowWays read(String str) {
            return find(str);
        }

        public static String write(BowWays bowWays) {
            return bowWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DanceWays {
        Default(0, "Default"),
        Ballet(1, "Ballet"),
        Skywalk(2, "Skywalk");

        private int id;
        private String name;

        DanceWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DanceWays find(String str) {
            for (DanceWays danceWays : values()) {
                if (danceWays.name.equals(str)) {
                    return danceWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DanceWays read(String str) {
            return find(str);
        }

        public static String write(DanceWays danceWays) {
            return danceWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum GoRoundWays {
        InPlace(0, "inPlace");

        private int id;
        private String name;

        GoRoundWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static GoRoundWays find(String str) {
            for (GoRoundWays goRoundWays : values()) {
                if (goRoundWays.name.equals(str)) {
                    return goRoundWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static GoRoundWays read(String str) {
            return find(str);
        }

        public static String write(GoRoundWays goRoundWays) {
            return goRoundWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum JumpWays {
        Forward(0, "forward"),
        InPlace(1, "inPlace"),
        Normal(2, "normal");

        private int id;
        private String name;

        JumpWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static JumpWays find(String str) {
            for (JumpWays jumpWays : values()) {
                if (jumpWays.name.equals(str)) {
                    return jumpWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static JumpWays read(String str) {
            return find(str);
        }

        public static String write(JumpWays jumpWays) {
            return jumpWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum NickName {
        Doubao(0, "doubao");

        private int id;
        private String name;

        NickName(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static NickName find(String str) {
            for (NickName nickName : values()) {
                if (nickName.name.equals(str)) {
                    return nickName;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static NickName read(String str) {
            return find(str);
        }

        public static String write(NickName nickName) {
            return nickName.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum RollWays {
        BackSomersault(0, "backSomersault");

        private int id;
        private String name;

        RollWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static RollWays find(String str) {
            for (RollWays rollWays : values()) {
                if (rollWays.name.equals(str)) {
                    return rollWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static RollWays read(String str) {
            return find(str);
        }

        public static String write(RollWays rollWays) {
            return rollWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SitWays {
        BowBehindBody(0, "bowBehindBody"),
        Normal(1, "normal");

        private int id;
        private String name;

        SitWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SitWays find(String str) {
            for (SitWays sitWays : values()) {
                if (sitWays.name.equals(str)) {
                    return sitWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SitWays read(String str) {
            return find(str);
        }

        public static String write(SitWays sitWays) {
            return sitWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum StandWays {
        StayStill(0, "stayStill"),
        RaiseOneLeg(1, "raiseOneLeg"),
        OnFeet(2, "onFeet"),
        Welcome(3, "welcome");

        private int id;
        private String name;

        StandWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static StandWays find(String str) {
            for (StandWays standWays : values()) {
                if (standWays.name.equals(str)) {
                    return standWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static StandWays read(String str) {
            return find(str);
        }

        public static String write(StandWays standWays) {
            return standWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SteelMeshActions {
        EndToEnd(0, "EndToEnd"),
        NavigateToSMT(1, "NavigateToSMT"),
        IdentifySMT(2, "IdentifySMT"),
        AdjustPosition(3, "AdjustPosition"),
        OpenHatch(4, "OpenHatch"),
        IdentifySteelMesh(5, "IdentifySteelMesh"),
        PickUpSteelMesh(6, "PickUpSteelMesh"),
        PullSteelMesh(7, "PullSteelMesh"),
        RecognizeQRcode(8, "RecognizeQRcode"),
        AlignmentSteelMesh(9, "AlignmentSteelMesh"),
        PushSteelMesh(10, "PushSteelMesh"),
        CloseHatch(11, "CloseHatch"),
        IdentifyPlacementRack(12, "IdentifyPlacementRack"),
        NavigateToPlacementRack(13, "NavigateToPlacementRack"),
        PutDownSteelMesh(14, "PutDownSteelMesh"),
        NavigateToSteelMeshCollectionSite(15, "NavigateToSteelMeshCollectionSite");

        private int id;
        private String name;

        SteelMeshActions(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SteelMeshActions find(String str) {
            for (SteelMeshActions steelMeshActions : values()) {
                if (steelMeshActions.name.equals(str)) {
                    return steelMeshActions;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SteelMeshActions read(String str) {
            return find(str);
        }

        public static String write(SteelMeshActions steelMeshActions) {
            return steelMeshActions.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum WagPart {
        Head(0, "head"),
        Tail(1, "tail");

        private int id;
        private String name;

        WagPart(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WagPart find(String str) {
            for (WagPart wagPart : values()) {
                if (wagPart.name.equals(str)) {
                    return wagPart;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WagPart read(String str) {
            return find(str);
        }

        public static String write(WagPart wagPart) {
            return wagPart.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum WalkWays {
        DownWalking(0, "downWalking"),
        OneLegFastWalk(1, "oneLegFastWalk"),
        BodyTwisting(2, "bodyTwisting"),
        Lightly(3, "lightly"),
        Follow(4, OneTrack.Event.FOLLOW);

        private int id;
        private String name;

        WalkWays(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WalkWays find(String str) {
            for (WalkWays walkWays : values()) {
                if (walkWays.name.equals(str)) {
                    return walkWays;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WalkWays read(String str) {
            return find(str);
        }

        public static String write(WalkWays walkWays) {
            return walkWays.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum WhichDirec {
        Forward(0, "forward"),
        Left(1, "left"),
        Right(2, TSMAuthContants.PARAM_KEY_RIGHT),
        Backward(3, "backward");

        private int id;
        private String name;

        WhichDirec(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WhichDirec find(String str) {
            for (WhichDirec whichDirec : values()) {
                if (whichDirec.name.equals(str)) {
                    return whichDirec;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WhichDirec read(String str) {
            return find(str);
        }

        public static String write(WhichDirec whichDirec) {
            return whichDirec.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class back implements EntityType {
        private Optional<Slot<Integer>> step = Optional.a();

        public static back read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            back backVar = new back();
            if (zsdVar.z("step")) {
                backVar.setStep(IntentUtils.readSlot(zsdVar.w("step"), Integer.class));
            }
            return backVar;
        }

        public static c4h write(back backVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (backVar.step.c()) {
                c4hVarCreateObjectNode.f0("step", IntentUtils.writeSlot(backVar.step.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getStep() {
            return this.step;
        }

        public back setStep(Slot<Integer> slot) {
            this.step = Optional.e(slot);
            return this;
        }
    }

    public static class bow implements EntityType {
        private Optional<Slot<BowWays>> ways = Optional.a();

        public static bow read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            bow bowVar = new bow();
            if (zsdVar.z("ways")) {
                bowVar.setWays(IntentUtils.readSlot(zsdVar.w("ways"), BowWays.class));
            }
            return bowVar;
        }

        public static c4h write(bow bowVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (bowVar.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(bowVar.ways.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<BowWays>> getWays() {
            return this.ways;
        }

        public bow setWays(Slot<BowWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public static class changeHand implements EntityType {
        public static changeHand read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new changeHand();
        }

        public static c4h write(changeHand changehand) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class changeSteelMesh implements EntityType {

        @Required
        private Slot<SteelMeshActions> actions;

        public changeSteelMesh() {
        }

        public changeSteelMesh(Slot<SteelMeshActions> slot) {
            this.actions = slot;
        }

        public static changeSteelMesh read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            changeSteelMesh changesteelmesh = new changeSteelMesh();
            changesteelmesh.setActions(IntentUtils.readSlot(zsdVar.w("actions"), SteelMeshActions.class));
            return changesteelmesh;
        }

        public static c4h write(changeSteelMesh changesteelmesh) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("actions", IntentUtils.writeSlot(changesteelmesh.actions));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<SteelMeshActions> getActions() {
            return this.actions;
        }

        @Required
        public changeSteelMesh setActions(Slot<SteelMeshActions> slot) {
            this.actions = slot;
            return this;
        }
    }

    public static class come implements EntityType {
        public static come read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new come();
        }

        public static c4h write(come comeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dance implements EntityType {
        private Optional<Slot<DanceWays>> ways = Optional.a();

        public static dance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            dance danceVar = new dance();
            if (zsdVar.z("ways")) {
                danceVar.setWays(IntentUtils.readSlot(zsdVar.w("ways"), DanceWays.class));
            }
            return danceVar;
        }

        public static c4h write(dance danceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (danceVar.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(danceVar.ways.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<DanceWays>> getWays() {
            return this.ways;
        }

        public dance setWays(Slot<DanceWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public static class doTask implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<String>> code = Optional.a();

        public static doTask read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            doTask dotask = new doTask();
            if (zsdVar.z("name")) {
                dotask.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z("code")) {
                dotask.setCode(IntentUtils.readSlot(zsdVar.w("code"), String.class));
            }
            return dotask;
        }

        public static c4h write(doTask dotask) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (dotask.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(dotask.name.b()));
            }
            if (dotask.code.c()) {
                c4hVarCreateObjectNode.f0("code", IntentUtils.writeSlot(dotask.code.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCode() {
            return this.code;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public doTask setCode(Slot<String> slot) {
            this.code = Optional.e(slot);
            return this;
        }

        public doTask setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class goDie implements EntityType {
        public static goDie read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new goDie();
        }

        public static c4h write(goDie godie) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class goRound implements EntityType {
        private Optional<Slot<Integer>> times = Optional.a();
        private Optional<Slot<GoRoundWays>> ways = Optional.a();

        public static goRound read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            goRound goround = new goRound();
            if (zsdVar.z("times")) {
                goround.setTimes(IntentUtils.readSlot(zsdVar.w("times"), Integer.class));
            }
            if (zsdVar.z("ways")) {
                goround.setWays(IntentUtils.readSlot(zsdVar.w("ways"), GoRoundWays.class));
            }
            return goround;
        }

        public static c4h write(goRound goround) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (goround.times.c()) {
                c4hVarCreateObjectNode.f0("times", IntentUtils.writeSlot(goround.times.b()));
            }
            if (goround.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(goround.ways.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getTimes() {
            return this.times;
        }

        public Optional<Slot<GoRoundWays>> getWays() {
            return this.ways;
        }

        public goRound setTimes(Slot<Integer> slot) {
            this.times = Optional.e(slot);
            return this;
        }

        public goRound setWays(Slot<GoRoundWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public static class goSleep implements EntityType {
        public static goSleep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new goSleep();
        }

        public static c4h write(goSleep gosleep) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class halfSquat implements EntityType {
        public static halfSquat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new halfSquat();
        }

        public static c4h write(halfSquat halfsquat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class highFive implements EntityType {
        public static highFive read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new highFive();
        }

        public static c4h write(highFive highfive) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class jump implements EntityType {
        private Optional<Slot<JumpWays>> ways = Optional.a();

        public static jump read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            jump jumpVar = new jump();
            if (zsdVar.z("ways")) {
                jumpVar.setWays(IntentUtils.readSlot(zsdVar.w("ways"), JumpWays.class));
            }
            return jumpVar;
        }

        public static c4h write(jump jumpVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (jumpVar.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(jumpVar.ways.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<JumpWays>> getWays() {
            return this.ways;
        }

        public jump setWays(Slot<JumpWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public static class lyingDown implements EntityType {
        public static lyingDown read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new lyingDown();
        }

        public static c4h write(lyingDown lyingdown) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class nod implements EntityType {
        public static nod read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new nod();
        }

        public static c4h write(nod nodVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class reset implements EntityType {
        public static reset read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new reset();
        }

        public static c4h write(reset resetVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class robotName implements EntityType {
        private Optional<Slot<NickName>> name = Optional.a();

        public static robotName read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            robotName robotname = new robotName();
            if (zsdVar.z("name")) {
                robotname.setName(IntentUtils.readSlot(zsdVar.w("name"), NickName.class));
            }
            return robotname;
        }

        public static c4h write(robotName robotname) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (robotname.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(robotname.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<NickName>> getName() {
            return this.name;
        }

        public robotName setName(Slot<NickName> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class roll implements EntityType {
        private Optional<Slot<Integer>> times = Optional.a();
        private Optional<Slot<RollWays>> ways = Optional.a();

        public static roll read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            roll rollVar = new roll();
            if (zsdVar.z("times")) {
                rollVar.setTimes(IntentUtils.readSlot(zsdVar.w("times"), Integer.class));
            }
            if (zsdVar.z("ways")) {
                rollVar.setWays(IntentUtils.readSlot(zsdVar.w("ways"), RollWays.class));
            }
            return rollVar;
        }

        public static c4h write(roll rollVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (rollVar.times.c()) {
                c4hVarCreateObjectNode.f0("times", IntentUtils.writeSlot(rollVar.times.b()));
            }
            if (rollVar.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(rollVar.ways.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getTimes() {
            return this.times;
        }

        public Optional<Slot<RollWays>> getWays() {
            return this.ways;
        }

        public roll setTimes(Slot<Integer> slot) {
            this.times = Optional.e(slot);
            return this;
        }

        public roll setWays(Slot<RollWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public static class shakeHand implements EntityType {
        private Optional<Slot<Integer>> times = Optional.a();

        public static shakeHand read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            shakeHand shakehand = new shakeHand();
            if (zsdVar.z("times")) {
                shakehand.setTimes(IntentUtils.readSlot(zsdVar.w("times"), Integer.class));
            }
            return shakehand;
        }

        public static c4h write(shakeHand shakehand) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (shakehand.times.c()) {
                c4hVarCreateObjectNode.f0("times", IntentUtils.writeSlot(shakehand.times.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getTimes() {
            return this.times;
        }

        public shakeHand setTimes(Slot<Integer> slot) {
            this.times = Optional.e(slot);
            return this;
        }
    }

    public static class sit implements EntityType {
        private Optional<Slot<SitWays>> ways = Optional.a();

        public static sit read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sit sitVar = new sit();
            if (zsdVar.z("ways")) {
                sitVar.setWays(IntentUtils.readSlot(zsdVar.w("ways"), SitWays.class));
            }
            return sitVar;
        }

        public static c4h write(sit sitVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (sitVar.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(sitVar.ways.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<SitWays>> getWays() {
            return this.ways;
        }

        public sit setWays(Slot<SitWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public static class stand implements EntityType {
        private Optional<Slot<StandWays>> ways = Optional.a();

        public static stand read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            stand standVar = new stand();
            if (zsdVar.z("ways")) {
                standVar.setWays(IntentUtils.readSlot(zsdVar.w("ways"), StandWays.class));
            }
            return standVar;
        }

        public static c4h write(stand standVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (standVar.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(standVar.ways.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<StandWays>> getWays() {
            return this.ways;
        }

        public stand setWays(Slot<StandWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public static class standUp implements EntityType {
        public static standUp read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new standUp();
        }

        public static c4h write(standUp standup) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class touch implements EntityType {
        public static touch read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new touch();
        }

        public static c4h write(touch touchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class turnDirection implements EntityType {
        private Optional<Slot<WhichDirec>> direction = Optional.a();

        public static turnDirection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            turnDirection turndirection = new turnDirection();
            if (zsdVar.z("direction")) {
                turndirection.setDirection(IntentUtils.readSlot(zsdVar.w("direction"), WhichDirec.class));
            }
            return turndirection;
        }

        public static c4h write(turnDirection turndirection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (turndirection.direction.c()) {
                c4hVarCreateObjectNode.f0("direction", IntentUtils.writeSlot(turndirection.direction.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WhichDirec>> getDirection() {
            return this.direction;
        }

        public turnDirection setDirection(Slot<WhichDirec> slot) {
            this.direction = Optional.e(slot);
            return this;
        }
    }

    public static class wag implements EntityType {
        private Optional<Slot<WagPart>> WagPart = Optional.a();

        public static wag read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            wag wagVar = new wag();
            if (zsdVar.z("WagPart")) {
                wagVar.setWagPart(IntentUtils.readSlot(zsdVar.w("WagPart"), WagPart.class));
            }
            return wagVar;
        }

        public static c4h write(wag wagVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (wagVar.WagPart.c()) {
                c4hVarCreateObjectNode.f0("WagPart", IntentUtils.writeSlot(wagVar.WagPart.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WagPart>> getWagPart() {
            return this.WagPart;
        }

        public wag setWagPart(Slot<WagPart> slot) {
            this.WagPart = Optional.e(slot);
            return this;
        }
    }

    public static class walk implements EntityType {
        private Optional<Slot<WalkWays>> ways = Optional.a();
        private Optional<Slot<WhichDirec>> direction = Optional.a();
        private Optional<Slot<Integer>> step = Optional.a();

        public static walk read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            walk walkVar = new walk();
            if (zsdVar.z("ways")) {
                walkVar.setWays(IntentUtils.readSlot(zsdVar.w("ways"), WalkWays.class));
            }
            if (zsdVar.z("direction")) {
                walkVar.setDirection(IntentUtils.readSlot(zsdVar.w("direction"), WhichDirec.class));
            }
            if (zsdVar.z("step")) {
                walkVar.setStep(IntentUtils.readSlot(zsdVar.w("step"), Integer.class));
            }
            return walkVar;
        }

        public static c4h write(walk walkVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (walkVar.ways.c()) {
                c4hVarCreateObjectNode.f0("ways", IntentUtils.writeSlot(walkVar.ways.b()));
            }
            if (walkVar.direction.c()) {
                c4hVarCreateObjectNode.f0("direction", IntentUtils.writeSlot(walkVar.direction.b()));
            }
            if (walkVar.step.c()) {
                c4hVarCreateObjectNode.f0("step", IntentUtils.writeSlot(walkVar.step.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WhichDirec>> getDirection() {
            return this.direction;
        }

        public Optional<Slot<Integer>> getStep() {
            return this.step;
        }

        public Optional<Slot<WalkWays>> getWays() {
            return this.ways;
        }

        public walk setDirection(Slot<WhichDirec> slot) {
            this.direction = Optional.e(slot);
            return this;
        }

        public walk setStep(Slot<Integer> slot) {
            this.step = Optional.e(slot);
            return this;
        }

        public walk setWays(Slot<WalkWays> slot) {
            this.ways = Optional.e(slot);
            return this;
        }
    }

    public Robot() {
    }

    public static Robot read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new Robot(IntentUtils.readEntityType(zsdVar, AIApiConstants.Robot.NAME, optional));
    }

    public static zsd write(Robot robot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(robot.entity_type);
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Robot setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Robot(T t) {
        this.entity_type = t;
    }
}
