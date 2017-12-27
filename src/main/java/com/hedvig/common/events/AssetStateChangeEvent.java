package com.hedvig.common.events;

import com.hedvig.common.constant.AssetState;
import lombok.Value;
import org.axonframework.commandhandling.model.AggregateIdentifier;

import java.io.Serializable;

@Value
public class AssetStateChangeEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    @AggregateIdentifier
    private String id;

    private String assetId;

    private AssetState state;

}
