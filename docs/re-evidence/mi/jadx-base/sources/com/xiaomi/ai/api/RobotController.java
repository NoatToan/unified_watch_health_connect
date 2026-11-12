package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.nlp.Robot;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class RobotController {

    @NamespaceName(name = "ChangeSteelMesh", namespace = AIApiConstants.RobotController.NAME)
    public static class ChangeSteelMesh implements InstructionPayload {

        @Required
        private SteelMeshAction action;

        public ChangeSteelMesh() {
        }

        public ChangeSteelMesh(SteelMeshAction steelMeshAction) {
            this.action = steelMeshAction;
        }

        @Required
        public SteelMeshAction getAction() {
            return this.action;
        }

        @Required
        public ChangeSteelMesh setAction(SteelMeshAction steelMeshAction) {
            this.action = steelMeshAction;
            return this;
        }
    }

    @NamespaceName(name = "DeliveryStage", namespace = AIApiConstants.RobotController.NAME)
    public static class DeliveryStage implements EventPayload {
        private Optional<String> action = Optional.a();
        private Optional<Integer> sub_task_id = Optional.a();
        private Optional<Integer> task_id = Optional.a();

        public Optional<String> getAction() {
            return this.action;
        }

        public Optional<Integer> getSubTaskId() {
            return this.sub_task_id;
        }

        public Optional<Integer> getTaskId() {
            return this.task_id;
        }

        public DeliveryStage setAction(String str) {
            this.action = Optional.e(str);
            return this;
        }

        public DeliveryStage setSubTaskId(int i) {
            this.sub_task_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeliveryStage setTaskId(int i) {
            this.task_id = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "DeliverySubTask", namespace = AIApiConstants.RobotController.NAME)
    public static class DeliverySubTask implements InstructionPayload {
        private Optional<DeliverySubTaskType> sub_task_type = Optional.a();
        private Optional<Integer> sub_task_id = Optional.a();
        private Optional<Robot.Task> task = Optional.a();

        public Optional<Integer> getSubTaskId() {
            return this.sub_task_id;
        }

        public Optional<DeliverySubTaskType> getSubTaskType() {
            return this.sub_task_type;
        }

        public Optional<Robot.Task> getTask() {
            return this.task;
        }

        public DeliverySubTask setSubTaskId(int i) {
            this.sub_task_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeliverySubTask setSubTaskType(DeliverySubTaskType deliverySubTaskType) {
            this.sub_task_type = Optional.e(deliverySubTaskType);
            return this;
        }

        public DeliverySubTask setTask(Robot.Task task) {
            this.task = Optional.e(task);
            return this;
        }
    }

    public enum DeliverySubTaskType {
        f30(0),
        GO_TO_STORE(1),
        TAKE_PACK(2),
        DELIVER_TO_DEST(3),
        PUT_DOWN_PACK(4);

        private int id;

        DeliverySubTaskType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DetectGroundingBox {

        @Required
        private long height;

        @Required
        private long width;

        @Required
        private long x;

        @Required
        private long y;

        public DetectGroundingBox() {
        }

        public DetectGroundingBox(long j, long j2, long j3, long j4) {
            this.x = j;
            this.y = j2;
            this.height = j3;
            this.width = j4;
        }

        @Required
        public long getHeight() {
            return this.height;
        }

        @Required
        public long getWidth() {
            return this.width;
        }

        @Required
        public long getX() {
            return this.x;
        }

        @Required
        public long getY() {
            return this.y;
        }

        @Required
        public DetectGroundingBox setHeight(long j) {
            this.height = j;
            return this;
        }

        @Required
        public DetectGroundingBox setWidth(long j) {
            this.width = j;
            return this;
        }

        @Required
        public DetectGroundingBox setX(long j) {
            this.x = j;
            return this;
        }

        @Required
        public DetectGroundingBox setY(long j) {
            this.y = j;
            return this;
        }
    }

    @NamespaceName(name = "Emotion", namespace = AIApiConstants.RobotController.NAME)
    public static class Emotion implements InstructionPayload {

        @Required
        private Common.EmotionType emotion;

        public Emotion() {
        }

        public Emotion(Common.EmotionType emotionType) {
            this.emotion = emotionType;
        }

        @Required
        public Common.EmotionType getEmotion() {
            return this.emotion;
        }

        @Required
        public Emotion setEmotion(Common.EmotionType emotionType) {
            this.emotion = emotionType;
            return this;
        }
    }

    @NamespaceName(name = "NavOperation", namespace = AIApiConstants.RobotController.NAME)
    public static class NavOperation implements InstructionPayload {
        private Optional<Integer> navType = Optional.a();
        private Optional<String> map = Optional.a();
        private Optional<String> target = Optional.a();

        public Optional<String> getMap() {
            return this.map;
        }

        public Optional<Integer> getNavType() {
            return this.navType;
        }

        public Optional<String> getTarget() {
            return this.target;
        }

        public NavOperation setMap(String str) {
            this.map = Optional.e(str);
            return this;
        }

        public NavOperation setNavType(int i) {
            this.navType = Optional.e(Integer.valueOf(i));
            return this;
        }

        public NavOperation setTarget(String str) {
            this.target = Optional.e(str);
            return this;
        }
    }

    public enum ObjectDetectType {
        UNKNOWN(-1),
        FACE_RECOGNITION(0),
        OPEN_VOCABULARY_TARGET_RECOGNITION(1);

        private int id;

        ObjectDetectType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ObjectTracking", namespace = AIApiConstants.RobotController.NAME)
    public static class ObjectTracking implements InstructionPayload {

        @Required
        private DetectGroundingBox groundingBox;

        public ObjectTracking() {
        }

        public ObjectTracking(DetectGroundingBox detectGroundingBox) {
            this.groundingBox = detectGroundingBox;
        }

        @Required
        public DetectGroundingBox getGroundingBox() {
            return this.groundingBox;
        }

        @Required
        public ObjectTracking setGroundingBox(DetectGroundingBox detectGroundingBox) {
            this.groundingBox = detectGroundingBox;
            return this;
        }
    }

    @NamespaceName(name = "ReportRobotInfo", namespace = AIApiConstants.RobotController.NAME)
    public static class ReportRobotInfo implements EventPayload {
        private Optional<String> tts = Optional.a();
        private Optional<String> speaker = Optional.a();

        public Optional<String> getSpeaker() {
            return this.speaker;
        }

        public Optional<String> getTts() {
            return this.tts;
        }

        public ReportRobotInfo setSpeaker(String str) {
            this.speaker = Optional.e(str);
            return this;
        }

        public ReportRobotInfo setTts(String str) {
            this.tts = Optional.e(str);
            return this;
        }
    }

    public enum RobotAction {
        UNKNOWN(-1),
        STANDING(0),
        DOWN(1),
        COME(2),
        BACK(3),
        GO_ROUND(4),
        HIGH_FIVE(5),
        BACK_SOMERSAULT(6),
        DANCE(7),
        MOVE_FORWARD(8),
        FOLLOW_ME(9),
        CHANGE_HANDS(10),
        SIT_DOWN(11),
        JUMP(12),
        LOVE_BEHAVE(13),
        WAGGING_TAIL(14),
        SHAKE_HEAD(15),
        NOD(16),
        BOW(17),
        PLAY_DEAD(18),
        GO_SLEEP(19),
        BALLET(20),
        SPACE_WALK(21),
        HALF_SQUAT(22),
        RESET(23),
        TURN_LEFT(24),
        TURN_RIGHT(25),
        TURN_BACK(26),
        SHAKE_HAND(27),
        STOP(28),
        STOP_TASK(29),
        PAUSE(30),
        PAUSE_TASK(31),
        CONTINUE_TASK(32);

        private int id;

        RobotAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RobotState", namespace = AIApiConstants.RobotController.NAME)
    public static class RobotState implements ContextPayload {
        private Optional<String> map = Optional.a();

        public Optional<String> getMap() {
            return this.map;
        }

        public RobotState setMap(String str) {
            this.map = Optional.e(str);
            return this;
        }
    }

    public enum SteelMeshAction {
        UNKNOWN(-1),
        END_TO_END(0),
        NAVIGATE_TO_SMT(1),
        IDENTIFY_SMT(2),
        ADJUST_POSITION(3),
        OPEN_HATCH(4),
        IDENTIFY_STEELMESH(5),
        PICKUP_STEELMESH(6),
        PULL_STEELMESH(7),
        RECOGNIZE_QRCODE(8),
        ALIGNMENT_STEELMESH(9),
        PUSH_STEELMESH(10),
        CLOSE_HATCH(11),
        IDENTIFY_PLACEMENT_RACK(12),
        NAVIGATE_TO_PLACEMENT_RACK(13),
        PUT_DOWN_STEEL_MESH(14),
        NAVIGATE_TO_STEEL_MESH(15);

        private int id;

        SteelMeshAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "TaskCode", namespace = AIApiConstants.RobotController.NAME)
    public static class TaskCode implements InstructionPayload {

        @Required
        private String code;

        public TaskCode() {
        }

        public TaskCode(String str) {
            this.code = str;
        }

        @Required
        public String getCode() {
            return this.code;
        }

        @Required
        public TaskCode setCode(String str) {
            this.code = str;
            return this;
        }
    }

    @NamespaceName(name = "UploadSpeaker", namespace = AIApiConstants.RobotController.NAME)
    public static class UploadSpeaker implements InstructionPayload {
        private Optional<Long> timeout = Optional.a();

        public Optional<Long> getTimeout() {
            return this.timeout;
        }

        public UploadSpeaker setTimeout(long j) {
            this.timeout = Optional.e(Long.valueOf(j));
            return this;
        }
    }

    @NamespaceName(name = "ObjectDetection", namespace = AIApiConstants.RobotController.NAME)
    public static class ObjectDetection implements InstructionPayload {

        @Required
        private ObjectDetectType objectDetectType;
        private Optional<String> targetName = Optional.a();

        public ObjectDetection() {
        }

        @Required
        public ObjectDetectType getObjectDetectType() {
            return this.objectDetectType;
        }

        public Optional<String> getTargetName() {
            return this.targetName;
        }

        @Required
        public ObjectDetection setObjectDetectType(ObjectDetectType objectDetectType) {
            this.objectDetectType = objectDetectType;
            return this;
        }

        public ObjectDetection setTargetName(String str) {
            this.targetName = Optional.e(str);
            return this;
        }

        public ObjectDetection(ObjectDetectType objectDetectType) {
            this.objectDetectType = objectDetectType;
        }
    }

    @NamespaceName(name = "Operate", namespace = AIApiConstants.RobotController.NAME)
    public static class Operate implements InstructionPayload {

        @Required
        private RobotAction action;
        private Optional<Integer> count = Optional.a();

        public Operate() {
        }

        @Required
        public RobotAction getAction() {
            return this.action;
        }

        public Optional<Integer> getCount() {
            return this.count;
        }

        @Required
        public Operate setAction(RobotAction robotAction) {
            this.action = robotAction;
            return this;
        }

        public Operate setCount(int i) {
            this.count = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Operate(RobotAction robotAction) {
            this.action = robotAction;
        }
    }
}
