package com.xiaomi.ai.api.intent;

import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import com.xiaomi.common.Pair;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class actions {

    public static class AdjustMaxAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public AdjustMaxAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static AdjustMaxAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new AdjustMaxAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(AdjustMaxAction adjustMaxAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustMaxAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public AdjustMaxAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class AdjustMinAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public AdjustMinAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static AdjustMinAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new AdjustMinAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(AdjustMinAction adjustMinAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustMinAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public AdjustMinAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class AnswerAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public AnswerAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static AnswerAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new AnswerAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(AnswerAction answerAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(answerAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public AnswerAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ApplyAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2<A, B> {

        @Required
        private A object;

        @Required
        private B to;

        public ApplyAction(A a2, B b2) {
            super(a2);
            this.object = a2;
            this.to = b2;
        }

        public static ApplyAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            Pair<String, action.EntityName> next2 = it.next();
            return new ApplyAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()), IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
        }

        public static zsd write(ApplyAction applyAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(applyAction.object), "object"));
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(applyAction.to), "to"));
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2
        public Pair<String, B> __2() {
            return Pair.of("to", this.to);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public B getTo() {
            return this.to;
        }

        @Required
        public ApplyAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        @Required
        public ApplyAction setTo(B b2) {
            this.to = b2;
            return this;
        }
    }

    public static class BlockAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public BlockAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static BlockAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new BlockAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(BlockAction blockAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(blockAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public BlockAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CancelAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CancelAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CancelAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CancelAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CancelAction cancelAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CancelAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CancelCloseAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CancelCloseAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CancelCloseAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CancelCloseAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CancelCloseAction cancelCloseAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelCloseAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CancelCloseAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CancelCollectAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CancelCollectAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CancelCollectAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CancelCollectAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CancelCollectAction cancelCollectAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelCollectAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CancelCollectAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CancelCreateAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CancelCreateAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CancelCreateAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CancelCreateAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CancelCreateAction cancelCreateAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelCreateAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CancelCreateAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CancelOpenAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CancelOpenAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CancelOpenAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CancelOpenAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CancelOpenAction cancelOpenAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelOpenAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CancelOpenAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CancelSendingAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2<A, B> {

        @Required
        private A object;

        @Required
        private B to;

        public CancelSendingAction(A a2, B b2) {
            super(a2);
            this.object = a2;
            this.to = b2;
        }

        public static CancelSendingAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            Pair<String, action.EntityName> next2 = it.next();
            return new CancelSendingAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()), IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
        }

        public static zsd write(CancelSendingAction cancelSendingAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelSendingAction.object), "object"));
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelSendingAction.to), "to"));
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2
        public Pair<String, B> __2() {
            return Pair.of("to", this.to);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public B getTo() {
            return this.to;
        }

        @Required
        public CancelSendingAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        @Required
        public CancelSendingAction setTo(B b2) {
            this.to = b2;
            return this;
        }
    }

    public static class CleanAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CleanAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CleanAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CleanAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CleanAction cleanAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cleanAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CleanAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CloseAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CloseAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CloseAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CloseAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CloseAction closeAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(closeAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CloseAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CollectAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CollectAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CollectAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CollectAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CollectAction collectAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(collectAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CollectAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CompareAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CompareAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CompareAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CompareAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CompareAction compareAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(compareAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CompareAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ConfirmAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ConfirmAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ConfirmAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ConfirmAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ConfirmAction confirmAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(confirmAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ConfirmAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ConnectAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ConnectAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ConnectAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ConnectAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ConnectAction connectAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(connectAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ConnectAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ContinueAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ContinueAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ContinueAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ContinueAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ContinueAction continueAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(continueAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ContinueAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ContinuePlayAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ContinuePlayAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ContinuePlayAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ContinuePlayAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ContinuePlayAction continuePlayAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(continuePlayAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ContinuePlayAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class CreateAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public CreateAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static CreateAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new CreateAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(CreateAction createAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(createAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public CreateAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class DisconnectAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public DisconnectAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static DisconnectAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new DisconnectAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(DisconnectAction disconnectAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(disconnectAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public DisconnectAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class DowndipAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public DowndipAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static DowndipAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new DowndipAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(DowndipAction downdipAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(downdipAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public DowndipAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class DownloadAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public DownloadAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static DownloadAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new DownloadAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(DownloadAction downloadAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(downloadAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public DownloadAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ExitAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ExitAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ExitAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ExitAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ExitAction exitAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(exitAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ExitAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class FullScreenAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public FullScreenAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static FullScreenAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new FullScreenAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(FullScreenAction fullScreenAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(fullScreenAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public FullScreenAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class HangUpAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public HangUpAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static HangUpAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new HangUpAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(HangUpAction hangUpAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(hangUpAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public HangUpAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class InformAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public InformAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static InformAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new InformAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(InformAction informAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(informAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public InformAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class InstallAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public InstallAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static InstallAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new InstallAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(InstallAction installAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(installAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public InstallAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class JumpAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A to;

        public JumpAction(A a2) {
            super(a2);
            this.to = a2;
        }

        public static JumpAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new JumpAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(JumpAction jumpAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(jumpAction.to), "to"));
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction1
        public Pair<String, A> __1() {
            return Pair.of("to", this.to);
        }

        @Required
        public A getTo() {
            return this.to;
        }

        @Required
        public JumpAction setTo(A a2) {
            this.to = a2;
            return this;
        }
    }

    public static class LiftUpAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public LiftUpAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static LiftUpAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new LiftUpAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(LiftUpAction liftUpAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(liftUpAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public LiftUpAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ListenAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ListenAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ListenAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ListenAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ListenAction listenAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(listenAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ListenAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class LockAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public LockAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static LockAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new LockAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(LockAction lockAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(lockAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public LockAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class LoginAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public LoginAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static LoginAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new LoginAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(LoginAction loginAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(loginAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public LoginAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class MeasureAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public MeasureAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static MeasureAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new MeasureAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(MeasureAction measureAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(measureAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public MeasureAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class OpenAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public OpenAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static OpenAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new OpenAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(OpenAction openAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(openAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public OpenAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class OptimizeAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public OptimizeAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static OptimizeAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new OptimizeAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(OptimizeAction optimizeAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(optimizeAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public OptimizeAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class PauseAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public PauseAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static PauseAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new PauseAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(PauseAction pauseAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(pauseAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public PauseAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class PayAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A to;

        public PayAction(A a2) {
            super(a2);
            this.to = a2;
        }

        public static PayAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new PayAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(PayAction payAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(payAction.to), "to"));
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction1
        public Pair<String, A> __1() {
            return Pair.of("to", this.to);
        }

        @Required
        public A getTo() {
            return this.to;
        }

        @Required
        public PayAction setTo(A a2) {
            this.to = a2;
            return this;
        }
    }

    public static class PinAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public PinAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static PinAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new PinAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(PinAction pinAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(pinAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public PinAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class PlayAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public PlayAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static PlayAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new PlayAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(PlayAction playAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(playAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public PlayAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class PostAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public PostAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static PostAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new PostAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(PostAction postAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(postAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public PostAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ProjectAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ProjectAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ProjectAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ProjectAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ProjectAction projectAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(projectAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ProjectAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ReInputAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ReInputAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ReInputAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ReInputAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ReInputAction reInputAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(reInputAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ReInputAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ReadAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ReadAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ReadAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ReadAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ReadAction readAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(readAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ReadAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RecommendAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RecommendAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RecommendAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RecommendAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RecommendAction recommendAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(recommendAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RecommendAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RecoverAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RecoverAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RecoverAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RecoverAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RecoverAction recoverAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(recoverAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RecoverAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RefreshAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RefreshAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RefreshAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RefreshAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RefreshAction refreshAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(refreshAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RefreshAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RegisterAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RegisterAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RegisterAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RegisterAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RegisterAction registerAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(registerAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RegisterAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RepostAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RepostAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RepostAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RepostAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RepostAction repostAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(repostAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RepostAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RequireAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RequireAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RequireAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RequireAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RequireAction requireAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(requireAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RequireAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RestoreAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RestoreAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RestoreAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RestoreAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RestoreAction restoreAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(restoreAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RestoreAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RotateAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RotateAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RotateAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RotateAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RotateAction rotateAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(rotateAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RotateAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class RunAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public RunAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static RunAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new RunAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(RunAction runAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(runAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public RunAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class SearchAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public SearchAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static SearchAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new SearchAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(SearchAction searchAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(searchAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public SearchAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class SingAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public SingAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static SingAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new SingAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(SingAction singAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(singAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public SingAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class StartAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public StartAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static StartAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new StartAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(StartAction startAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(startAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public StartAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class StopAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public StopAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static StopAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new StopAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(StopAction stopAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(stopAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public StopAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class StopReadAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public StopReadAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static StopReadAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new StopReadAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(StopReadAction stopReadAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(stopReadAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public StopReadAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class SubscribeAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public SubscribeAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static SubscribeAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new SubscribeAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(SubscribeAction subscribeAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(subscribeAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public SubscribeAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class SwitchAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public SwitchAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static SwitchAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new SwitchAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(SwitchAction switchAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(switchAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public SwitchAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class UninstallAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public UninstallAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static UninstallAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new UninstallAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(UninstallAction uninstallAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(uninstallAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public UninstallAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class UnlockAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public UnlockAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static UnlockAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new UnlockAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(UnlockAction unlockAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(unlockAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public UnlockAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class UpgradeAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public UpgradeAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static UpgradeAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new UpgradeAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(UpgradeAction upgradeAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(upgradeAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public UpgradeAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class WatchAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public WatchAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static WatchAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new WatchAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(WatchAction watchAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(watchAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public WatchAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ZoomInAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ZoomInAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ZoomInAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ZoomInAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ZoomInAction zoomInAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(zoomInAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ZoomInAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ZoomInMaxAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ZoomInMaxAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ZoomInMaxAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ZoomInMaxAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ZoomInMaxAction zoomInMaxAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(zoomInMaxAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ZoomInMaxAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ZoomOutAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ZoomOutAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ZoomOutAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ZoomOutAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ZoomOutAction zoomOutAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(zoomOutAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ZoomOutAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ZoomOutMinAction<A extends IntentionEntity<?, ?>> extends IntentionAction1<A> {

        @Required
        private A object;

        public ZoomOutMinAction(A a2) {
            super(a2);
            this.object = a2;
        }

        public static ZoomOutMinAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Pair<String, action.EntityName> next = actionName.getEntities().iterator().next();
            return new ZoomOutMinAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
        }

        public static zsd write(ZoomOutMinAction zoomOutMinAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(zoomOutMinAction.object), "object"));
            return c4hVarCreateObjectNode;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        @Required
        public ZoomOutMinAction setObject(A a2) {
            this.object = a2;
            return this;
        }
    }

    public static class ActivateAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public ActivateAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ActivateAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            ActivateAction activateAction = new ActivateAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                activateAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return activateAction;
        }

        public static zsd write(ActivateAction activateAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(activateAction.object), "object"));
            if (activateAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(activateAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public ActivateAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public ActivateAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public ActivateAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AddAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {
        private Optional<B> collection;

        @Required
        private A object;

        public AddAction(A a2) {
            super(a2);
            this.collection = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AddAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AddAction addAction = new AddAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                addAction.setCollection(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return addAction;
        }

        public static zsd write(AddAction addAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(addAction.object), "object"));
            if (addAction.collection.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(addAction.collection.b()), "collection"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("collection", this.collection);
        }

        public Optional<B> getCollection() {
            return this.collection;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public AddAction setCollection(B b2) {
            this.collection = Optional.e(b2);
            return this;
        }

        @Required
        public AddAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AddAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.collection = optional;
        }
    }

    public static class AdjustBackwardAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustBackwardAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustBackwardAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustBackwardAction adjustBackwardAction = new AdjustBackwardAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustBackwardAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustBackwardAction;
        }

        public static zsd write(AdjustBackwardAction adjustBackwardAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustBackwardAction.object), "object"));
            if (adjustBackwardAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustBackwardAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustBackwardAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustBackwardAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustBackwardAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AdjustDownAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustDownAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustDownAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustDownAction adjustDownAction = new AdjustDownAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustDownAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustDownAction;
        }

        public static zsd write(AdjustDownAction adjustDownAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustDownAction.object), "object"));
            if (adjustDownAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustDownAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustDownAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustDownAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustDownAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AdjustForwardAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustForwardAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustForwardAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustForwardAction adjustForwardAction = new AdjustForwardAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustForwardAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustForwardAction;
        }

        public static zsd write(AdjustForwardAction adjustForwardAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustForwardAction.object), "object"));
            if (adjustForwardAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustForwardAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustForwardAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustForwardAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustForwardAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AdjustInwardAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustInwardAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustInwardAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustInwardAction adjustInwardAction = new AdjustInwardAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustInwardAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustInwardAction;
        }

        public static zsd write(AdjustInwardAction adjustInwardAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustInwardAction.object), "object"));
            if (adjustInwardAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustInwardAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustInwardAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustInwardAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustInwardAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AdjustLeftAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustLeftAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustLeftAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustLeftAction adjustLeftAction = new AdjustLeftAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustLeftAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustLeftAction;
        }

        public static zsd write(AdjustLeftAction adjustLeftAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustLeftAction.object), "object"));
            if (adjustLeftAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustLeftAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustLeftAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustLeftAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustLeftAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AdjustOutwardAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustOutwardAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustOutwardAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustOutwardAction adjustOutwardAction = new AdjustOutwardAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustOutwardAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustOutwardAction;
        }

        public static zsd write(AdjustOutwardAction adjustOutwardAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustOutwardAction.object), "object"));
            if (adjustOutwardAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustOutwardAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustOutwardAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustOutwardAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustOutwardAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AdjustRightAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustRightAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustRightAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustRightAction adjustRightAction = new AdjustRightAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustRightAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustRightAction;
        }

        public static zsd write(AdjustRightAction adjustRightAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustRightAction.object), "object"));
            if (adjustRightAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustRightAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustRightAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustRightAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustRightAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AdjustUpAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public AdjustUpAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AdjustUpAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AdjustUpAction adjustUpAction = new AdjustUpAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                adjustUpAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return adjustUpAction;
        }

        public static zsd write(AdjustUpAction adjustUpAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustUpAction.object), "object"));
            if (adjustUpAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(adjustUpAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AdjustUpAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public AdjustUpAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AdjustUpAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class AskAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A about;
        private Optional<B> source;

        public AskAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.about = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AskAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            AskAction askAction = new AskAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                askAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return askAction;
        }

        public static zsd write(AskAction askAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(askAction.about), "about"));
            if (askAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(askAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction1
        public Pair<String, A> __1() {
            return Pair.of("about", this.about);
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getAbout() {
            return this.about;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public AskAction setAbout(A a2) {
            this.about = a2;
            return this;
        }

        public AskAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public AskAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.about = a2;
            this.source = optional;
        }
    }

    public static class BootAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> when;

        public BootAction(A a2) {
            super(a2);
            this.when = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static BootAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            BootAction bootAction = new BootAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                bootAction.setWhen(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return bootAction;
        }

        public static zsd write(BootAction bootAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(bootAction.object), "object"));
            if (bootAction.when.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(bootAction.when.b()), "when"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("when", this.when);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getWhen() {
            return this.when;
        }

        @Required
        public BootAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public BootAction setWhen(B b2) {
            this.when = Optional.e(b2);
            return this;
        }

        public BootAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.when = optional;
        }
    }

    public static class CancelDeleteAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public CancelDeleteAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CancelDeleteAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            CancelDeleteAction cancelDeleteAction = new CancelDeleteAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                cancelDeleteAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return cancelDeleteAction;
        }

        public static zsd write(CancelDeleteAction cancelDeleteAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelDeleteAction.object), "object"));
            if (cancelDeleteAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(cancelDeleteAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public CancelDeleteAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public CancelDeleteAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public CancelDeleteAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class CheckAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> sourceCollection;

        public CheckAction(A a2) {
            super(a2);
            this.sourceCollection = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static CheckAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            CheckAction checkAction = new CheckAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                checkAction.setSourceCollection(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return checkAction;
        }

        public static zsd write(CheckAction checkAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(checkAction.object), "object"));
            if (checkAction.sourceCollection.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(checkAction.sourceCollection.b()), "sourceCollection"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("sourceCollection", this.sourceCollection);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSourceCollection() {
            return this.sourceCollection;
        }

        @Required
        public CheckAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public CheckAction setSourceCollection(B b2) {
            this.sourceCollection = Optional.e(b2);
            return this;
        }

        public CheckAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.sourceCollection = optional;
        }
    }

    public static class DeactivateAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public DeactivateAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static DeactivateAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            DeactivateAction deactivateAction = new DeactivateAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                deactivateAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return deactivateAction;
        }

        public static zsd write(DeactivateAction deactivateAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(deactivateAction.object), "object"));
            if (deactivateAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(deactivateAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public DeactivateAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public DeactivateAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public DeactivateAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class DeleteAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public DeleteAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static DeleteAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            DeleteAction deleteAction = new DeleteAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                deleteAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return deleteAction;
        }

        public static zsd write(DeleteAction deleteAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(deleteAction.object), "object"));
            if (deleteAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(deleteAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public DeleteAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public DeleteAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public DeleteAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class DislikeAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {
        private Optional<B> about;

        @Required
        private A object;

        public DislikeAction(A a2) {
            super(a2);
            this.about = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static DislikeAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            DislikeAction dislikeAction = new DislikeAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                dislikeAction.setAbout(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return dislikeAction;
        }

        public static zsd write(DislikeAction dislikeAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(dislikeAction.object), "object"));
            if (dislikeAction.about.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(dislikeAction.about.b()), "about"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("about", this.about);
        }

        public Optional<B> getAbout() {
            return this.about;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public DislikeAction setAbout(B b2) {
            this.about = Optional.e(b2);
            return this;
        }

        @Required
        public DislikeAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public DislikeAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.about = optional;
        }
    }

    public static class EditAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> targetCollection;

        public EditAction(A a2) {
            super(a2);
            this.targetCollection = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static EditAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            EditAction editAction = new EditAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                editAction.setTargetCollection(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return editAction;
        }

        public static zsd write(EditAction editAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(editAction.object), "object"));
            if (editAction.targetCollection.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(editAction.targetCollection.b()), "targetCollection"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("targetCollection", this.targetCollection);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getTargetCollection() {
            return this.targetCollection;
        }

        @Required
        public EditAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public EditAction setTargetCollection(B b2) {
            this.targetCollection = Optional.e(b2);
            return this;
        }

        public EditAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.targetCollection = optional;
        }
    }

    public static class LikeAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {
        private Optional<B> about;

        @Required
        private A object;

        public LikeAction(A a2) {
            super(a2);
            this.about = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static LikeAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            LikeAction likeAction = new LikeAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                likeAction.setAbout(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return likeAction;
        }

        public static zsd write(LikeAction likeAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(likeAction.object), "object"));
            if (likeAction.about.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(likeAction.about.b()), "about"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("about", this.about);
        }

        public Optional<B> getAbout() {
            return this.about;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public LikeAction setAbout(B b2) {
            this.about = Optional.e(b2);
            return this;
        }

        @Required
        public LikeAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public LikeAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.about = optional;
        }
    }

    public static class ModifyAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public ModifyAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ModifyAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            ModifyAction modifyAction = new ModifyAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                modifyAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return modifyAction;
        }

        public static zsd write(ModifyAction modifyAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(modifyAction.object), "object"));
            if (modifyAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(modifyAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public ModifyAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public ModifyAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public ModifyAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class OrderAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A content;
        private Optional<B> from;

        public OrderAction(A a2) {
            super(a2);
            this.from = Optional.a();
            this.content = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static OrderAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            OrderAction orderAction = new OrderAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                orderAction.setFrom(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return orderAction;
        }

        public static zsd write(OrderAction orderAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(orderAction.content), MiuiCursorConstants.CONTENT));
            if (orderAction.from.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(orderAction.from.b()), "from"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction1
        public Pair<String, A> __1() {
            return Pair.of(MiuiCursorConstants.CONTENT, this.content);
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("from", this.from);
        }

        @Required
        public A getContent() {
            return this.content;
        }

        public Optional<B> getFrom() {
            return this.from;
        }

        @Required
        public OrderAction setContent(A a2) {
            this.content = a2;
            return this;
        }

        public OrderAction setFrom(B b2) {
            this.from = Optional.e(b2);
            return this;
        }

        public OrderAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.content = a2;
            this.from = optional;
        }
    }

    public static class RebootAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> when;

        public RebootAction(A a2) {
            super(a2);
            this.when = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static RebootAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            RebootAction rebootAction = new RebootAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                rebootAction.setWhen(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return rebootAction;
        }

        public static zsd write(RebootAction rebootAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(rebootAction.object), "object"));
            if (rebootAction.when.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(rebootAction.when.b()), "when"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("when", this.when);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getWhen() {
            return this.when;
        }

        @Required
        public RebootAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public RebootAction setWhen(B b2) {
            this.when = Optional.e(b2);
            return this;
        }

        public RebootAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.when = optional;
        }
    }

    public static class ReceiveAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {
        private Optional<B> from;

        @Required
        private A object;

        public ReceiveAction(A a2) {
            super(a2);
            this.from = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ReceiveAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            ReceiveAction receiveAction = new ReceiveAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                receiveAction.setFrom(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return receiveAction;
        }

        public static zsd write(ReceiveAction receiveAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(receiveAction.object), "object"));
            if (receiveAction.from.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(receiveAction.from.b()), "from"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("from", this.from);
        }

        public Optional<B> getFrom() {
            return this.from;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public ReceiveAction setFrom(B b2) {
            this.from = Optional.e(b2);
            return this;
        }

        @Required
        public ReceiveAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public ReceiveAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.from = optional;
        }
    }

    public static class ReplyAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> to;

        public ReplyAction(A a2) {
            super(a2);
            this.to = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ReplyAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            ReplyAction replyAction = new ReplyAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                replyAction.setTo(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return replyAction;
        }

        public static zsd write(ReplyAction replyAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(replyAction.object), "object"));
            if (replyAction.to.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(replyAction.to.b()), "to"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("to", this.to);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getTo() {
            return this.to;
        }

        @Required
        public ReplyAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public ReplyAction setTo(B b2) {
            this.to = Optional.e(b2);
            return this;
        }

        public ReplyAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.to = optional;
        }
    }

    public static class ScanAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> with;

        public ScanAction(A a2) {
            super(a2);
            this.with = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ScanAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            ScanAction scanAction = new ScanAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                scanAction.setWith(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return scanAction;
        }

        public static zsd write(ScanAction scanAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(scanAction.object), "object"));
            if (scanAction.with.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(scanAction.with.b()), "with"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("with", this.with);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getWith() {
            return this.with;
        }

        @Required
        public ScanAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public ScanAction setWith(B b2) {
            this.with = Optional.e(b2);
            return this;
        }

        public ScanAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.with = optional;
        }
    }

    public static class SendAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> to;

        public SendAction(A a2) {
            super(a2);
            this.to = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SendAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            SendAction sendAction = new SendAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                sendAction.setTo(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return sendAction;
        }

        public static zsd write(SendAction sendAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(sendAction.object), "object"));
            if (sendAction.to.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(sendAction.to.b()), "to"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("to", this.to);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getTo() {
            return this.to;
        }

        @Required
        public SendAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public SendAction setTo(B b2) {
            this.to = Optional.e(b2);
            return this;
        }

        public SendAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.to = optional;
        }
    }

    public static class SetAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public SetAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SetAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            SetAction setAction = new SetAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                setAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return setAction;
        }

        public static zsd write(SetAction setAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(setAction.object), "object"));
            if (setAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(setAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public SetAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public SetAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public SetAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class SetUpAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> target;

        public SetUpAction(A a2) {
            super(a2);
            this.target = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SetUpAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            SetUpAction setUpAction = new SetUpAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                setUpAction.setTarget(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return setUpAction;
        }

        public static zsd write(SetUpAction setUpAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(setUpAction.object), "object"));
            if (setUpAction.target.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(setUpAction.target.b()), "target"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("target", this.target);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getTarget() {
            return this.target;
        }

        @Required
        public SetUpAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public SetUpAction setTarget(B b2) {
            this.target = Optional.e(b2);
            return this;
        }

        public SetUpAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.target = optional;
        }
    }

    public static class ShutdownAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> when;

        public ShutdownAction(A a2) {
            super(a2);
            this.when = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ShutdownAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            ShutdownAction shutdownAction = new ShutdownAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                shutdownAction.setWhen(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return shutdownAction;
        }

        public static zsd write(ShutdownAction shutdownAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(shutdownAction.object), "object"));
            if (shutdownAction.when.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(shutdownAction.when.b()), "when"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("when", this.when);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getWhen() {
            return this.when;
        }

        @Required
        public ShutdownAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public ShutdownAction setWhen(B b2) {
            this.when = Optional.e(b2);
            return this;
        }

        public ShutdownAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.when = optional;
        }
    }

    public static class SleepAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> when;

        public SleepAction(A a2) {
            super(a2);
            this.when = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SleepAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            SleepAction sleepAction = new SleepAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                sleepAction.setWhen(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return sleepAction;
        }

        public static zsd write(SleepAction sleepAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(sleepAction.object), "object"));
            if (sleepAction.when.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(sleepAction.when.b()), "when"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("when", this.when);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getWhen() {
            return this.when;
        }

        @Required
        public SleepAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public SleepAction setWhen(B b2) {
            this.when = Optional.e(b2);
            return this;
        }

        public SleepAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.when = optional;
        }
    }

    public static class TurnDownAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> target;

        public TurnDownAction(A a2) {
            super(a2);
            this.target = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TurnDownAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            TurnDownAction turnDownAction = new TurnDownAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                turnDownAction.setTarget(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return turnDownAction;
        }

        public static zsd write(TurnDownAction turnDownAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnDownAction.object), "object"));
            if (turnDownAction.target.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnDownAction.target.b()), "target"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("target", this.target);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getTarget() {
            return this.target;
        }

        @Required
        public TurnDownAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public TurnDownAction setTarget(B b2) {
            this.target = Optional.e(b2);
            return this;
        }

        public TurnDownAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.target = optional;
        }
    }

    public static class TurnOffAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public TurnOffAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TurnOffAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            TurnOffAction turnOffAction = new TurnOffAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                turnOffAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return turnOffAction;
        }

        public static zsd write(TurnOffAction turnOffAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnOffAction.object), "object"));
            if (turnOffAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnOffAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public TurnOffAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public TurnOffAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public TurnOffAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class TurnOnAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> source;

        public TurnOnAction(A a2) {
            super(a2);
            this.source = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TurnOnAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            TurnOnAction turnOnAction = new TurnOnAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                turnOnAction.setSource(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return turnOnAction;
        }

        public static zsd write(TurnOnAction turnOnAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnOnAction.object), "object"));
            if (turnOnAction.source.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnOnAction.source.b()), "source"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("source", this.source);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getSource() {
            return this.source;
        }

        @Required
        public TurnOnAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public TurnOnAction setSource(B b2) {
            this.source = Optional.e(b2);
            return this;
        }

        public TurnOnAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.source = optional;
        }
    }

    public static class TurnUpAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>> extends IntentionAction2Option<A, B> {

        @Required
        private A object;
        private Optional<B> target;

        public TurnUpAction(A a2) {
            super(a2);
            this.target = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TurnUpAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            TurnUpAction turnUpAction = new TurnUpAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                turnUpAction.setTarget(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            return turnUpAction;
        }

        public static zsd write(TurnUpAction turnUpAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnUpAction.object), "object"));
            if (turnUpAction.target.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(turnUpAction.target.b()), "target"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction2Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("target", this.target);
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getTarget() {
            return this.target;
        }

        @Required
        public TurnUpAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public TurnUpAction setTarget(B b2) {
            this.target = Optional.e(b2);
            return this;
        }

        public TurnUpAction(A a2, Optional<B> optional) {
            super(a2);
            Optional.a();
            this.object = a2;
            this.target = optional;
        }
    }

    public static class TransferAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>, C extends IntentionEntity<?, ?>> extends IntentionAction3Option<A, B, C> {
        private Optional<C> from;

        @Required
        private A object;
        private Optional<B> to;

        public TransferAction(A a2) {
            super(a2);
            this.to = Optional.a();
            this.from = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TransferAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            TransferAction transferAction = new TransferAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                transferAction.setTo(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            if (it.hasNext()) {
                Pair<String, action.EntityName> next3 = it.next();
                transferAction.setFrom(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next3.getKey()), next3.getValue()));
            }
            return transferAction;
        }

        public static zsd write(TransferAction transferAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(transferAction.object), "object"));
            if (transferAction.to.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(transferAction.to.b()), "to"));
            }
            if (transferAction.from.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(transferAction.from.b()), "from"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction3Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("to", this.to);
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction3Option
        public Pair<String, Optional<C>> __3() {
            return Pair.of("from", this.from);
        }

        public Optional<C> getFrom() {
            return this.from;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<B> getTo() {
            return this.to;
        }

        public TransferAction setFrom(C c) {
            this.from = Optional.e(c);
            return this;
        }

        @Required
        public TransferAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public TransferAction setTo(B b2) {
            this.to = Optional.e(b2);
            return this;
        }

        public TransferAction(A a2, Optional<B> optional, Optional<C> optional2) {
            super(a2);
            this.to = Optional.a();
            Optional.a();
            this.object = a2;
            this.to = optional;
            this.from = optional2;
        }
    }

    public static class TakeAction<A extends IntentionEntity<?, ?>, B extends IntentionEntity<?, ?>, C extends IntentionEntity<?, ?>, D extends IntentionEntity<?, ?>> extends IntentionAction4Option<A, B, C, D> {
        private Optional<B> from;

        @Required
        private A object;
        private Optional<C> to;
        private Optional<D> with;

        public TakeAction(A a2) {
            super(a2);
            this.from = Optional.a();
            this.to = Optional.a();
            this.with = Optional.a();
            this.object = a2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TakeAction read(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Iterator<Pair<String, action.EntityName>> it = actionName.getEntities().iterator();
            Pair<String, action.EntityName> next = it.next();
            TakeAction takeAction = new TakeAction(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next.getKey()), next.getValue()));
            if (it.hasNext()) {
                Pair<String, action.EntityName> next2 = it.next();
                takeAction.setFrom(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next2.getKey()), next2.getValue()));
            }
            if (it.hasNext()) {
                Pair<String, action.EntityName> next3 = it.next();
                takeAction.setTo(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next3.getKey()), next3.getValue()));
            }
            if (it.hasNext()) {
                Pair<String, action.EntityName> next4 = it.next();
                takeAction.setWith(IntentUtils.readIntentionEntity(IntentUtils.readWrapName(zsdVar, next4.getKey()), next4.getValue()));
            }
            return takeAction;
        }

        public static zsd write(TakeAction takeAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(takeAction.object), "object"));
            if (takeAction.from.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(takeAction.from.b()), "from"));
            }
            if (takeAction.to.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(takeAction.to.b()), "to"));
            }
            if (takeAction.with.c()) {
                c4hVarCreateObjectNode.l0((c4h) IntentUtils.writeWrapName(IntentUtils.writeIntentionEntity(takeAction.with.b()), "with"));
            }
            return c4hVarCreateObjectNode;
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction4Option
        public Pair<String, Optional<B>> __2() {
            return Pair.of("from", this.from);
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction4Option
        public Pair<String, Optional<C>> __3() {
            return Pair.of("to", this.to);
        }

        @Override // com.xiaomi.ai.api.intent.IntentionAction4Option
        public Pair<String, Optional<D>> __4() {
            return Pair.of("with", this.with);
        }

        public Optional<B> getFrom() {
            return this.from;
        }

        @Required
        public A getObject() {
            return this.object;
        }

        public Optional<C> getTo() {
            return this.to;
        }

        public Optional<D> getWith() {
            return this.with;
        }

        public TakeAction setFrom(B b2) {
            this.from = Optional.e(b2);
            return this;
        }

        @Required
        public TakeAction setObject(A a2) {
            this.object = a2;
            return this;
        }

        public TakeAction setTo(C c) {
            this.to = Optional.e(c);
            return this;
        }

        public TakeAction setWith(D d) {
            this.with = Optional.e(d);
            return this;
        }

        public TakeAction(A a2, Optional<B> optional, Optional<C> optional2, Optional<D> optional3) {
            super(a2);
            this.from = Optional.a();
            this.to = Optional.a();
            Optional.a();
            this.object = a2;
            this.from = optional;
            this.to = optional2;
            this.with = optional3;
        }
    }
}
