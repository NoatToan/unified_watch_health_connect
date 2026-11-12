package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;

/* JADX INFO: loaded from: classes18.dex */
public class RobotController {

    @NamespaceName(name = "Operate", namespace = AIApiConstants.RobotController.NAME)
    public static class Operate implements InstructionPayload {

        @Required
        private RobotAction action;

        public Operate() {
        }

        public Operate(RobotAction robotAction) {
            this.action = robotAction;
        }

        @Required
        public RobotAction getAction() {
            return this.action;
        }

        @Required
        public Operate setAction(RobotAction robotAction) {
            this.action = robotAction;
            return this;
        }
    }

    public enum RobotAction {
        STANDING(0),
        DOWN(1),
        COME(2),
        BACK(3),
        GO_ROUND(4),
        HIGH_FIVE(5),
        BACK_SOMERSAULT(6),
        DANCE(7);

        private int id;

        RobotAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }
}
